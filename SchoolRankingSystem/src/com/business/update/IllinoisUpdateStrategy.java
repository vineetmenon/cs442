package com.business.update;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.bean.*;
import com.database.DatabaseConnection;

public class IllinoisUpdateStrategy implements UpdateStrategy {

	public static Connection conn;

	private BufferedReader copy(InputStream in) throws IOException {
		byte[] bytes = new byte[1024 * 1024];
		int length = 0, r;

		while (true) {
			if ((r = in.read(bytes, length, bytes.length - length)) >= 0) {
				length += r;
				if (bytes.length - length <= 1024)
					bytes = Arrays.copyOf(bytes, length * 2);
			} else {
				break;
			}
		}

		return new BufferedReader(new InputStreamReader(
				new ByteArrayInputStream(bytes, 0, length)));
	}

	@Override
	public Iterator<School> getData() throws IOException {
		BufferedReader p1 = null, p2 = null, p4 = null, p9 = null;
		ZipInputStream zis = null;
		try {
			zis = new ZipInputStream(new BufferedInputStream(new URL(
					"http://www.isbe.net/assessment/zip/"
							+ "2012_rc_separated.zip").openStream()));
			ZipEntry ze;
			while ((ze = zis.getNextEntry()) != null) {
				if (ze.getName().endsWith("p1.txt")) {
					p1 = copy(zis);
				} else if (ze.getName().endsWith("p2.txt")) {
					p2 = copy(zis);
				} else if (ze.getName().endsWith("p4.txt")) {
					p4 = copy(zis);
				} else if (ze.getName().endsWith("p9.txt")) {
					p9 = copy(zis);
				}
			}
		} finally {
			if (zis != null)
				zis.close();
		}

		try {
			conn=DatabaseConnection.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Iter(p1, p2, p4, p9);
	}

	private static class Iter implements Iterator<School> {
		private static final Pattern DELIM = Pattern.compile(" *+; *+");

		private final BufferedReader p1, p2, p4, p9;
		private School next;

		Iter(BufferedReader p1, BufferedReader p2, BufferedReader p4,
				BufferedReader p9) throws IOException {
			this.p1 = p1;
			this.p2 = p2;
			this.p4 = p4;
			this.p9 = p9;

			getNext();
		}

		private Float average(String s1, String s2) {
			if (s1.length() == 0) {
				if (s2.length() == 0)
					return null;
				else
					return Float.valueOf(s2);
			} else {
				if (s2.length() == 0)
					return Float.valueOf(s1);
				else
					return (Float.valueOf(s1) + Float.valueOf(s2)) / 2;
			}
		}

		private void getNext() throws IOException {
			String[] a;
			{
				String line = p1.readLine();
				if (line == null) {
					next = null;
					p1.close();
					p2.close();
					p4.close();
					p9.close();
					return;
				}
				a = DELIM.split(line, -1);
			}
			next = new School();

			next.setName(a[3]);
			next.setDistrict(a[4]);
			next.setCounty(a[6]);
			next.setSchoolType(a[11]);
			next.setPercentWhite(parseFloat(a[13]));
			next.setPercentBlack(parseFloat(a[14]));
			next.setPercentHispanic(parseFloat(a[15]));
			next.setPercentAsian(parseFloat(a[16]));
			next.setPercentHawaiian(parseFloat(a[17]));
			next.setPercentIndian(parseFloat(a[18]));
			next.setPercentMultiracial(parseFloat(a[19]));
			next.setTotalEnrollment(parseInteger(a[20]));
			next.setPercentLep(parseFloat(a[45]));
			next.setPercentIep(parseFloat(a[49]));
			next.setPercentLowIncome(parseFloat(a[53]));
			next.setAttendanceRate(parseFloat(a[61]));
			next.setPercentLowMobility(parseFloat(a[117]));
			next.setPercentChronicTruancy(parseFloat(a[125]));
			next.setPercentHsDropout(parseFloat(a[129]));
			next.setGraduationRateOverall(average(a[133], a[189]));
			next.setGraduationRateMale(average(a[137], a[193]));
			next.setGraduationRateFemale(average(a[141], a[197]));
			next.setGraduationRateWhite(average(a[145], a[201]));
			next.setGraduationRateBlack(average(a[149], a[205]));
			next.setGraduationRateHispanic(average(a[153], a[209]));
			next.setGraduationRateAsian(average(a[157], a[213]));
			next.setGraduationRateHawaiian(average(a[161], a[217]));
			next.setGraduationRateIndian(average(a[165], a[221]));
			next.setGraduationRateMultiracial(average(a[169], a[225]));
			next.setGraduationRateLep(average(a[173], a[229]));
			next.setGraduationRateMigrant(average(a[177], a[233]));
			next.setGraduationRateDisabled(average(a[181], a[237]));
			next.setGraduationRateLowIncome(average(a[185], a[241]));

			a = DELIM.split(p2.readLine(), -1);
			next.setAverageAct(parseFloat(a[1]));

			a = DELIM.split(p4.readLine(), -1);
			next.setAverageTeacherSalary(parseInteger(a[63]));

			a = DELIM.split(p9.readLine(), -1);
			next.setPercentPassingOverall(parseFloat(a[5]));
			next.setPercentPassingIsat(parseFloat(a[13]));
			next.setPercentPassingPsae(parseFloat(a[21]));
			next.setPercentPassingIaa(parseFloat(a[29]));


		}

		@Override
		public boolean hasNext() {
			return next != null;
		}

		@Override
		public School next() {
			School s = next;
			try {
				getNext();
			} catch (IOException e) {
				next = null;
			}
			return s;
		}

		private Float parseFloat(String s) {
			if (s.length() == 0)
				return null;
			else
				return Float.valueOf(s);
		}

		private Integer parseInteger(String s) {
			if (s.length() == 0) {
				return null;
			} else {
				if (s.charAt(0) == '$')
					s = s.substring(1);
				return Integer.valueOf(s.replace(",", ""));
			}
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

	}
}
