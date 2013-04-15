package com.business;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import com.bean.School;
import com.business.report.GenerateReport;
import com.business.update.IllinoisUpdateStrategy;
import com.database.DatabaseConnection;

public class ReportModel {
	public Connection dbconnect= null;

	public ReportModel() {
		super();
		setDBConn();

	}

	public void setDBConn() {
		try {
			dbconnect= DatabaseConnection.getConnection();  //establish connection
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public Vector<String> getSchoolList() {
		Vector<String> schoolNamesAndID= new Vector<String>();

		String QueryString= "SELECT * from School";

		try{
			Statement statement= dbconnect.createStatement();
			ResultSet rs= statement.executeQuery(QueryString);
			while(rs.next()){
				String tempCounty= rs.getString(4); //check for cook county district
				String tempSchoolType = rs.getString(5);
				if((tempCounty.equals("Cook")) && ( tempSchoolType.equals("HIGH SCHOOL"))){
					schoolNamesAndID.add(rs.getString(2) + " (ID#"+ (new Integer(rs.getInt(1))).toString() +")");
				}
			}

			Collections.sort(schoolNamesAndID);

			return schoolNamesAndID;

		} catch (SQLException e){
			System.out.println("Couldn't retrieve database values...");
			return null;
		}
	}
	
	public Map<String,String> getParameterList() {
		Map<String,String> reportParametersMap = new HashMap<String, String>();
		reportParametersMap=School.getMap();
		return reportParametersMap;
	}
	
	public void getNewData() {
		
		clearExistingData();
		IllinoisUpdateStrategy st = new IllinoisUpdateStrategy();
		try {
			Iterator<School> temp = st.getData();
			//System.out.println("Iterator done");
			//int count=1;
			while(temp.hasNext()) {
				//System.out.println(count + ": " + temp.next().getName());
				//count++;
				School S = temp.next();
				try {
					S.save(dbconnect);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			System.out.println("Update Schools event failed");
			e.printStackTrace();
		}
	}

	public void clearExistingData() {


		String QueryString= "truncate table CS442.dbo.School";

		try{
			Statement statement= dbconnect.createStatement();
			statement.execute(QueryString);
		} catch (SQLException e){
			System.out.println("Couldn't clear database values...");
		}
	}
	
	public boolean generateNewReport(String reportType, String ids, String field) {
		return GenerateReport.generate(reportType, ids, field);
	}

}
