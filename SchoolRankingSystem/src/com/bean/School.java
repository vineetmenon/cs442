package com.bean;

import com.database.*;

public class School extends DatabaseObject{

	private int id ;
	private String name  ;
	private String district ;
	private String county;
	private Float studentsPerTeacher ;
	private int averageTeacherSalary  ;
	private int fundingPerStudent  ;
	private Float averageAct ;
	private Float percentPassingOverall ;
	private Float percentPassingIsat ;
	private Float percentPassingPsae ;
	private Float graduationRateOverall ;
	private Float graduationRateMale ;
	private Float graduationRateFemale ;
	private Float graduationRateWhite ;
	private Float graduationRateBlack ;
	private Float graduationRateHispanic ;
	private Float graduationRateAsian ;
	private Float graduationRateHawaiian ;
	private Float graduationRateIndian ;
	private Float graduationRateMultiracial ;
	private Float graduationRateLep ;
	private Float graduationRateMigrant ;
	private Float graduationRateDisabled ;
	private Float graduationRateLowIncome ;
	private Float percentWhite ;
	private Float percentBlack ;
	private Float percentHispanic ;
	private Float percentAsian ;
	private Float percentHawaiian ;
	private Float percentIndian ;
	private Float percentMultiracial ;
	private Float percentLowIncome ;
	private Float percentLep ;
	private Float percentIep ;
	private Float percentHsDropout ;
	private Float percentChronicTruancy ;
	private Float percentLowMobility ;
	private Float attendanceRate ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public Float getStudentsPerTeacher() {
		return studentsPerTeacher;
	}
	public void setStudentsPerTeacher(Float studentsPerTeacher) {
		this.studentsPerTeacher = studentsPerTeacher;
	}
	public int getAverageTeacherSalary() {
		return averageTeacherSalary;
	}
	public void setAverageTeacherSalary(int averageTeacherSalary) {
		this.averageTeacherSalary = averageTeacherSalary;
	}
	public int getFundingPerStudent() {
		return fundingPerStudent;
	}
	public void setFundingPerStudent(int fundingPerStudent) {
		this.fundingPerStudent = fundingPerStudent;
	}
	public Float getAverageAct() {
		return averageAct;
	}
	public void setAverageAct(Float averageAct) {
		this.averageAct = averageAct;
	}
	public Float getPercentPassingOverall() {
		return percentPassingOverall;
	}
	public void setPercentPassingOverall(Float percentPassingOverall) {
		this.percentPassingOverall = percentPassingOverall;
	}
	public Float getPercentPassingIsat() {
		return percentPassingIsat;
	}
	public void setPercentPassingIsat(Float percentPassingIsat) {
		this.percentPassingIsat = percentPassingIsat;
	}
	public Float getPercentPassingPsae() {
		return percentPassingPsae;
	}
	public void setPercentPassingPsae(Float percentPassingPsae) {
		this.percentPassingPsae = percentPassingPsae;
	}
	public Float getGraduationRateOverall() {
		return graduationRateOverall;
	}
	public void setGraduationRateOverall(Float graduationRateOverall) {
		this.graduationRateOverall = graduationRateOverall;
	}
	public Float getGraduationRateMale() {
		return graduationRateMale;
	}
	public void setGraduationRateMale(Float graduationRateMale) {
		this.graduationRateMale = graduationRateMale;
	}
	public Float getGraduationRateFemale() {
		return graduationRateFemale;
	}
	public void setGraduationRateFemale(Float graduationRateFemale) {
		this.graduationRateFemale = graduationRateFemale;
	}
	public Float getGraduationRateWhite() {
		return graduationRateWhite;
	}
	public void setGraduationRateWhite(Float graduationRateWhite) {
		this.graduationRateWhite = graduationRateWhite;
	}
	public Float getGraduationRateBlack() {
		return graduationRateBlack;
	}
	public void setGraduationRateBlack(Float graduationRateBlack) {
		this.graduationRateBlack = graduationRateBlack;
	}
	public Float getGraduationRateHispanic() {
		return graduationRateHispanic;
	}
	public void setGraduationRateHispanic(Float graduationRateHispanic) {
		this.graduationRateHispanic = graduationRateHispanic;
	}
	public Float getGraduationRateAsian() {
		return graduationRateAsian;
	}
	public void setGraduationRateAsian(Float graduationRateAsian) {
		this.graduationRateAsian = graduationRateAsian;
	}
	public Float getGraduationRateHawaiian() {
		return graduationRateHawaiian;
	}
	public void setGraduationRateHawaiian(Float graduationRateHawaiian) {
		this.graduationRateHawaiian = graduationRateHawaiian;
	}
	public Float getGraduationRateIndian() {
		return graduationRateIndian;
	}
	public void setGraduationRateIndian(Float graduationRateIndian) {
		this.graduationRateIndian = graduationRateIndian;
	}
	public Float getGraduationRateMultiracial() {
		return graduationRateMultiracial;
	}
	public void setGraduationRateMultiracial(Float graduationRateMultiracial) {
		this.graduationRateMultiracial = graduationRateMultiracial;
	}
	public Float getGraduationRateLep() {
		return graduationRateLep;
	}
	public void setGraduationRateLep(Float graduationRateLep) {
		this.graduationRateLep = graduationRateLep;
	}
	public Float getGraduationRateMigrant() {
		return graduationRateMigrant;
	}
	public void setGraduationRateMigrant(Float graduationRateMigrant) {
		this.graduationRateMigrant = graduationRateMigrant;
	}
	public Float getGraduationRateDisabled() {
		return graduationRateDisabled;
	}
	public void setGraduationRateDisabled(Float graduationRateDisabled) {
		this.graduationRateDisabled = graduationRateDisabled;
	}
	public Float getGraduationRateLowIncome() {
		return graduationRateLowIncome;
	}
	public void setGraduationRateLowIncome(Float graduationRateLowIncome) {
		this.graduationRateLowIncome = graduationRateLowIncome;
	}
	public Float getPercentWhite() {
		return percentWhite;
	}
	public void setPercentWhite(Float percentWhite) {
		this.percentWhite = percentWhite;
	}
	public Float getPercentBlack() {
		return percentBlack;
	}
	public void setPercentBlack(Float percentBlack) {
		this.percentBlack = percentBlack;
	}
	public Float getPercentHispanic() {
		return percentHispanic;
	}
	public void setPercentHispanic(Float percentHispanic) {
		this.percentHispanic = percentHispanic;
	}
	public Float getPercentAsian() {
		return percentAsian;
	}
	public void setPercentAsian(Float percentAsian) {
		this.percentAsian = percentAsian;
	}
	public Float getPercentHawaiian() {
		return percentHawaiian;
	}
	public void setPercentHawaiian(Float percentHawaiian) {
		this.percentHawaiian = percentHawaiian;
	}
	public Float getPercentIndian() {
		return percentIndian;
	}
	public void setPercentIndian(Float percentIndian) {
		this.percentIndian = percentIndian;
	}
	public Float getPercentMultiracial() {
		return percentMultiracial;
	}
	public void setPercentMultiracial(Float percentMultiracial) {
		this.percentMultiracial = percentMultiracial;
	}
	public Float getPercentLowIncome() {
		return percentLowIncome;
	}
	public void setPercentLowIncome(Float percentLowIncome) {
		this.percentLowIncome = percentLowIncome;
	}
	public Float getPercentLep() {
		return percentLep;
	}
	public void setPercentLep(Float percentLep) {
		this.percentLep = percentLep;
	}
	public Float getPercentIep() {
		return percentIep;
	}
	public void setPercentIep(Float percentIep) {
		this.percentIep = percentIep;
	}
	public Float getPercentHsDropout() {
		return percentHsDropout;
	}
	public void setPercentHsDropout(Float percentHsDropout) {
		this.percentHsDropout = percentHsDropout;
	}
	public Float getPercentChronicTruancy() {
		return percentChronicTruancy;
	}
	public void setPercentChronicTruancy(Float percentChronicTruancy) {
		this.percentChronicTruancy = percentChronicTruancy;
	}
	public Float getPercentLowMobility() {
		return percentLowMobility;
	}
	public void setPercentLowMobility(Float percentLowMobility) {
		this.percentLowMobility = percentLowMobility;
	}
	public Float getAttendanceRate() {
		return attendanceRate;
	}
	public void setAttendanceRate(Float attendanceRate) {
		this.attendanceRate = attendanceRate;
	}
	
	 protected void initialize() {
	        this.dbToBeanMapping.put("id", "id");
	        this.dbToBeanMapping.put("name", "name");
	        this.dbToBeanMapping.put("district", "district");
	        this.dbToBeanMapping.put("county", "county");
	        this.dbToBeanMapping.put("studentsPerTeacher", "studentsPerTeacher");
	        this.dbToBeanMapping.put("averageTeacherSalary", "averageTeacherSalary");
	        this.dbToBeanMapping.put("fundingPerStudent", "fundingPerStudent");
	        this.dbToBeanMapping.put("averageAct", "averageAct");
	        this.dbToBeanMapping.put("percentPassingOverall", "percentPassingOverall");
	        this.dbToBeanMapping.put("percentPassingIsat", "percentPassingIsat");
	        this.dbToBeanMapping.put("percentPassingPsae", "percentPassingPsae");
	        this.dbToBeanMapping.put("graduationRateOverall", "graduationRateOverall");
	        this.dbToBeanMapping.put("graduationRateMale", "graduationRateMale");
	        this.dbToBeanMapping.put("graduationRateFemale", "graduationRateFemale");
	        this.dbToBeanMapping.put("graduationRateWhite", "graduationRateWhite");
	        this.dbToBeanMapping.put("graduationRateBlack", "graduationRateBlack");
	        this.dbToBeanMapping.put("graduationRateHispanic", "graduationRateHispanic");
	        this.dbToBeanMapping.put("graduationRateAsian", "graduationRateAsian");
	        this.dbToBeanMapping.put("graduationRateHawaiian", "graduationRateHawaiian");
	        this.dbToBeanMapping.put("graduationRateIndian", "graduationRateIndian");
	        this.dbToBeanMapping.put("graduationRateMultiracial", "graduationRateMultiracial");
	        this.dbToBeanMapping.put("graduationRateLep", "graduationRateLep");
	        this.dbToBeanMapping.put("graduationRateMigrant", "graduationRateMigrant");
	        this.dbToBeanMapping.put("graduationRateDisabled", "graduationRateDisabled");
	        this.dbToBeanMapping.put("graduationRateLowIncome", "graduationRateLowIncome");
	        this.dbToBeanMapping.put("percentWhite", "percentWhite");
	        this.dbToBeanMapping.put("percentBlack", "percentBlack");
	        this.dbToBeanMapping.put("percentHispanic", "percentHispanic");
	        this.dbToBeanMapping.put("percentAsian", "percentAsian");
	        this.dbToBeanMapping.put("percentHawaiian", "percentHawaiian");
	        this.dbToBeanMapping.put("percentIndian", "percentIndian");
	        this.dbToBeanMapping.put("percentMultiracial", "percentMultiracial");
	        this.dbToBeanMapping.put("percentLowIncome", "percentLowIncome");
	        this.dbToBeanMapping.put("percentLep", "percentLep");
	        this.dbToBeanMapping.put("percentIep", "percentIep");
	        this.dbToBeanMapping.put("percentHsDropout", "percentHsDropout");
	        this.dbToBeanMapping.put("percentChronicTruancy", "percentChronicTruancy");
	        this.dbToBeanMapping.put("percentLowMobility", "percentLowMobility");
	        this.dbToBeanMapping.put("attendanceRate", "attendanceRate");
	    }

}
