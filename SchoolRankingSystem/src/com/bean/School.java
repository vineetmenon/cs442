package com.bean;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class School{

	private int id;
	private String name;
	private String district;
	private String county;
	private String schoolType;
	private Integer totalEnrollment;
	private Integer averageTeacherSalary;
	private Float averageAct;
	private Float percentPassingOverall;
	private Float percentPassingIsat;
	private Float percentPassingPsae;
	private Float percentPassingIaa;
	private Float graduationRateOverall;
	private Float graduationRateMale;
	private Float graduationRateFemale;
	private Float graduationRateWhite;
	private Float graduationRateBlack;
	private Float graduationRateHispanic;
	private Float graduationRateAsian;
	private Float graduationRateHawaiian;
	private Float graduationRateIndian;
	private Float graduationRateMultiracial;
	private Float graduationRateLep;
	private Float graduationRateMigrant;
	private Float graduationRateDisabled;
	private Float graduationRateLowIncome;
	private Float percentWhite;
	private Float percentBlack;
	private Float percentHispanic;
	private Float percentAsian;
	private Float percentHawaiian;
	private Float percentIndian;
	private Float percentMultiracial;
	private Float percentLowIncome;
	private Float percentLep;
	private Float percentIep;
	private Float percentHsDropout;
	private Float percentChronicTruancy;
	private Float percentLowMobility;
	private Float attendanceRate;

	public Float getAttendanceRate() {
		return attendanceRate;
	}

	public Float getAverageAct() {
		return averageAct;
	}

	public Integer getAverageTeacherSalary() {
		return averageTeacherSalary;
	}

	public String getCounty() {
		return county;
	}

	public String getDistrict() {
		return district;
	}

	public Float getGraduationRateAsian() {
		return graduationRateAsian;
	}

	public Float getGraduationRateBlack() {
		return graduationRateBlack;
	}

	public Float getGraduationRateDisabled() {
		return graduationRateDisabled;
	}

	public Float getGraduationRateFemale() {
		return graduationRateFemale;
	}

	public Float getGraduationRateHawaiian() {
		return graduationRateHawaiian;
	}

	public Float getGraduationRateHispanic() {
		return graduationRateHispanic;
	}

	public Float getGraduationRateIndian() {
		return graduationRateIndian;
	}

	public Float getGraduationRateLep() {
		return graduationRateLep;
	}

	public Float getGraduationRateLowIncome() {
		return graduationRateLowIncome;
	}

	public Float getGraduationRateMale() {
		return graduationRateMale;
	}

	public Float getGraduationRateMigrant() {
		return graduationRateMigrant;
	}

	public Float getGraduationRateMultiracial() {
		return graduationRateMultiracial;
	}

	public Float getGraduationRateOverall() {
		return graduationRateOverall;
	}

	public Float getGraduationRateWhite() {
		return graduationRateWhite;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Float getPercentAsian() {
		return percentAsian;
	}

	public Float getPercentBlack() {
		return percentBlack;
	}

	public Float getPercentChronicTruancy() {
		return percentChronicTruancy;
	}

	public Float getPercentHawaiian() {
		return percentHawaiian;
	}

	public Float getPercentHispanic() {
		return percentHispanic;
	}

	public Float getPercentHsDropout() {
		return percentHsDropout;
	}

	public Float getPercentIep() {
		return percentIep;
	}

	public Float getPercentIndian() {
		return percentIndian;
	}

	public Float getPercentLep() {
		return percentLep;
	}

	public Float getPercentLowIncome() {
		return percentLowIncome;
	}

	public Float getPercentLowMobility() {
		return percentLowMobility;
	}

	public Float getPercentMultiracial() {
		return percentMultiracial;
	}

	public Float getPercentPassingIaa() {
		return percentPassingIaa;
	}

	public Float getPercentPassingIsat() {
		return percentPassingIsat;
	}

	public Float getPercentPassingOverall() {
		return percentPassingOverall;
	}

	public Float getPercentPassingPsae() {
		return percentPassingPsae;
	}

	public Float getPercentWhite() {
		return percentWhite;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public Integer getTotalEnrollment() {
		return totalEnrollment;
	}

	public void setAttendanceRate(Float attendanceRate) {
		this.attendanceRate = attendanceRate;
	}

	public void setAverageAct(Float averageAct) {
		this.averageAct = averageAct;
	}

	public void setAverageTeacherSalary(Integer averageTeacherSalary) {
		this.averageTeacherSalary = averageTeacherSalary;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setGraduationRateAsian(Float graduationRateAsian) {
		this.graduationRateAsian = graduationRateAsian;
	}

	public void setGraduationRateBlack(Float graduationRateBlack) {
		this.graduationRateBlack = graduationRateBlack;
	}

	public void setGraduationRateDisabled(Float graduationRateDisabled) {
		this.graduationRateDisabled = graduationRateDisabled;
	}

	public void setGraduationRateFemale(Float graduationRateFemale) {
		this.graduationRateFemale = graduationRateFemale;
	}

	public void setGraduationRateHawaiian(Float graduationRateHawaiian) {
		this.graduationRateHawaiian = graduationRateHawaiian;
	}

	public void setGraduationRateHispanic(Float graduationRateHispanic) {
		this.graduationRateHispanic = graduationRateHispanic;
	}

	public void setGraduationRateIndian(Float graduationRateIndian) {
		this.graduationRateIndian = graduationRateIndian;
	}

	public void setGraduationRateLep(Float graduationRateLep) {
		this.graduationRateLep = graduationRateLep;
	}

	public void setGraduationRateLowIncome(Float graduationRateLowIncome) {
		this.graduationRateLowIncome = graduationRateLowIncome;
	}

	public void setGraduationRateMale(Float graduationRateMale) {
		this.graduationRateMale = graduationRateMale;
	}

	public void setGraduationRateMigrant(Float graduationRateMigrant) {
		this.graduationRateMigrant = graduationRateMigrant;
	}

	public void setGraduationRateMultiracial(Float graduationRateMultiracial) {
		this.graduationRateMultiracial = graduationRateMultiracial;
	}

	public void setGraduationRateOverall(Float graduationRateOverall) {
		this.graduationRateOverall = graduationRateOverall;
	}

	public void setGraduationRateWhite(Float graduationRateWhite) {
		this.graduationRateWhite = graduationRateWhite;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPercentAsian(Float percentAsian) {
		this.percentAsian = percentAsian;
	}

	public void setPercentBlack(Float percentBlack) {
		this.percentBlack = percentBlack;
	}

	public void setPercentChronicTruancy(Float percentChronicTruancy) {
		this.percentChronicTruancy = percentChronicTruancy;
	}

	public void setPercentHawaiian(Float percentHawaiian) {
		this.percentHawaiian = percentHawaiian;
	}

	public void setPercentHispanic(Float percentHispanic) {
		this.percentHispanic = percentHispanic;
	}

	public void setPercentHsDropout(Float percentHsDropout) {
		this.percentHsDropout = percentHsDropout;
	}

	public void setPercentIep(Float percentIep) {
		this.percentIep = percentIep;
	}

	public void setPercentIndian(Float percentIndian) {
		this.percentIndian = percentIndian;
	}

	public void setPercentLep(Float percentLep) {
		this.percentLep = percentLep;
	}

	public void setPercentLowIncome(Float percentLowIncome) {
		this.percentLowIncome = percentLowIncome;
	}

	public void setPercentLowMobility(Float percentLowMobility) {
		this.percentLowMobility = percentLowMobility;
	}

	public void setPercentMultiracial(Float percentMultiracial) {
		this.percentMultiracial = percentMultiracial;
	}

	public void setPercentPassingIaa(Float percentPassingIaa) {
		this.percentPassingIaa = percentPassingIaa;
	}

	public void setPercentPassingIsat(Float percentPassingIsat) {
		this.percentPassingIsat = percentPassingIsat;
	}

	public void setPercentPassingOverall(Float percentPassingOverall) {
		this.percentPassingOverall = percentPassingOverall;
	}

	public void setPercentPassingPsae(Float percentPassingPsae) {
		this.percentPassingPsae = percentPassingPsae;
	}

	public void setPercentWhite(Float percentWhite) {
		this.percentWhite = percentWhite;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public void setTotalEnrollment(Integer totalEnrollment) {
		this.totalEnrollment = totalEnrollment;
	}

	public void save(Connection conn) throws Exception {

		Statement statement;
		try {
			statement = conn.createStatement();


			String buildStatement = "INSERT INTO CS442.dbo.School(name,district,county,schoolType,"+
					"totalEnrollment,averageTeacherSalary,averageAct,percentPassingOverall,"+
					"percentPassingIsat,percentPassingPsae,percentPassingIaa,graduationRateOverall,graduationRateMale,"+
					"graduationRateFemale,graduationRateWhite,graduationRateBlack,graduationRateHispanic,graduationRateAsian,"+
					"graduationRateHawaiian,graduationRateIndian,graduationRateMultiracial,graduationRateLep,graduationRateMigrant,"+
					"graduationRateDisabled,graduationRateLowIncome,percentWhite,percentBlack,percentHispanic,percentAsian,"+
					"percentHawaiian,percentIndian,percentMultiracial,percentLowIncome,percentLep,percentIep,percentHsDropout,"+
					"percentChronicTruancy,percentLowMobility,attendanceRate)"+
					"VALUES ( '"+getName().replace("'", "+char(39)+")+"',"
					+ "'" +getDistrict().replace("'", "+char(39)+")+ "', '" +getCounty().replace("'", "+char(39)+")+ "', '" +getSchoolType().replace("'", "+char(39)+")+ "',"+getTotalEnrollment()+","
					+getAverageTeacherSalary()+","+getAverageAct()+","+getPercentPassingOverall()+","
					+getPercentPassingIsat()+","+getPercentPassingPsae()+","+getPercentPassingIaa()+","+getGraduationRateOverall()+","
					+getGraduationRateMale()+","+getGraduationRateFemale()+","+getGraduationRateWhite()+","
					+getGraduationRateBlack()+","+getGraduationRateHispanic()+","+getGraduationRateAsian()+","
					+getGraduationRateHawaiian()+","+getGraduationRateIndian()+","+getGraduationRateMultiracial()+","
					+getGraduationRateLep()+","+getGraduationRateMigrant()+","+getGraduationRateDisabled()+","
					+getGraduationRateLowIncome()+","+getPercentWhite()+","+getPercentBlack()+","+getPercentHispanic()+","
					+getPercentAsian()+","+getPercentHawaiian()+","+getPercentIndian()+","+getPercentMultiracial()+","
					+getPercentLowIncome()+","+getPercentLep()+","+getPercentIep()+","+getPercentHsDropout()+","
					+getPercentChronicTruancy()+","+getPercentLowMobility()+","+getAttendanceRate()+")";;

					//System.out.println(buildStatement);
					try {
						statement.executeUpdate(buildStatement);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static HashMap<String, String> getMap() {
		HashMap<String, String> schoolMap = new HashMap<String, String>();
		
		schoolMap.put("totalEnrollment", "Total Enrollment");
		schoolMap.put("averageTeacherSalary", " Average Teacher Salary");
		schoolMap.put("averageAct","Average ACT");
		schoolMap.put("percentPassingOverall","Overall Passing Percentage");
		schoolMap.put("percentPassingIsat","ISAT Passing Percentage");
		schoolMap.put("percentPassingPsae","PSAE Passing Percentage");
		schoolMap.put("percentPassingIaa","IAA Passing Percentage");
		schoolMap.put("graduationRateOverall","Overall Graduation Rate");
		schoolMap.put("graduationRateMale","Graduation Rate: Male");
		schoolMap.put("graduationRateFemale","Graduation Rate: Female");
		schoolMap.put("graduationRateWhite","Graduation Rate: White");
		schoolMap.put("graduationRateBlack","Graduation Rate: Black");
		schoolMap.put("graduationRateHispanic","Graduation Rate: Hispanic");
		schoolMap.put("graduationRateAsian","Graduation Rate: Asian");
		schoolMap.put("graduationRateHawaiian","Graduation Rate: Hawaiian");
		schoolMap.put("graduationRateIndian","Graduation Rate: Indian");
		schoolMap.put("graduationRateMultiracial","Graduation Rate: Multi Racial");
		schoolMap.put("graduationRateLep","Graduation Rate: LEP");
		schoolMap.put("graduationRateMigrant","Graduation Rate: Migrant");
		schoolMap.put("graduationRateDisabled","Graduation Rate: Disabled");
		schoolMap.put("graduationRateLowIncome","Graduation Rate: Low Income");
		schoolMap.put("percentWhite","Percent: White");
		schoolMap.put("percentBlack","Percent: Black");
		schoolMap.put("percentHispanic","Percent: Hispanic");
		schoolMap.put("percentAsian","Percent: Asian");
		schoolMap.put("percentHawaiian","Percent: Hawaiian");
		schoolMap.put("percentIndian","Percent: Indian");
		schoolMap.put("percentMultiracial","Percent: Multi Racial");
		schoolMap.put("percentLowIncome","Percent: Low Income");
		schoolMap.put("percentLep","Percent: LEP");
		schoolMap.put("percentIep","Percent:  IEP");
		schoolMap.put("percentHsDropout","Percent: HS Dropouts");
		schoolMap.put("percentChronicTruancy","Percent: Chronic Truancy");
		schoolMap.put("percentLowMobility","Percent: Low Mobility");
		schoolMap.put("attendanceRate","Attendance Rate");
		
		return schoolMap;
	}
	
}
