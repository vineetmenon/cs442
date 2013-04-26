package com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.business.ReportModel;
import com.business.report.GenerateReport;
import com.gui.ReportGUI;

public class SchoolController {

	private ReportModel theModel;
	private ReportGUI theView;

	public SchoolController(ReportGUI theView, ReportModel theModel) {
		this.theModel = theModel;
		this.theView = theView;

		theView.setReportParameters(theModel.getParameterList());
		theView.setSchoolNameMap(theModel.getSchoolList());
		theView.initComponents();

		theView.AddParameterComboBoxListener(new ParamterComboBoxListener());
		theView.AddGenerateReportListener(new GenerateReportListener());
		theView.AddUpdateDataListener(new UpdateDataListener());
		theView.AddExitButtonListener(new ExitButtonListerner());
		theView.AddClearButtonListener(new ClearButtonListener());

		GenerateReport.setReportServerVariables();

	}

	private String selectedSchools;
	private String selectedFields;
	private String reportType;

	public String getSelectedSchools() {
		return selectedSchools;
	}

	public void setSelectedSchools(String selectedSchools) {
		this.selectedSchools = selectedSchools;
	}

	public String getSelectedFields() {
		return selectedFields;
	}

	public void setSelectedFields(String selectedFields) {
		this.selectedFields = selectedFields;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	class UpdateDataListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			theModel.getNewData();
			theView.setSchoolNameMap(theModel.getSchoolList());
			theView.refreshSchoolList();
		}
	}

	class ParamterComboBoxListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	class ClearButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			theView.reset();

		}

	}

	class ExitButtonListerner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Exiting App...");
			System.exit(0);

		}

	}

	class GenerateReportListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// validate the form
			if (theView.validateForm()) {
				// generate the report only if form is valid
				boolean output = theModel.generateNewReport(
						theView.getReportType(), theView.getSchoolList(),
						theView.getParameterList());
				if (!output) {
					System.out.println("Report not generated");
				}
				theView.reset();
			}
		}

	}

}
