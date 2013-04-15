package com.gui;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ReportGUI.java
 *
 * Created on 15-Apr-13, PM 11:53
 */

/**
 *
 * @author vineet menon
 */

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;
import javax.swing.ListSelectionModel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class ReportGUI extends javax.swing.JFrame {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	private String reportType;
	private String parameterList;
	private String schoolList;

	private Map<String, String> reportParametersMap;
	private Map<String, String> schoolNameMap;

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getParameterList() {
		return parameterList;
	}

	public void setParameterList(String parameterList) {
		this.parameterList = parameterList;
	}

	public String getSchoolList() {
		return schoolList;
	}

	public void setSchoolList(String schoolList) {
		this.schoolList = schoolList;
	}

	public Map<String, String> getReportParameters() {
		return reportParametersMap;
	}

	public void setReportParameters(Map<String, String> reportParameters) {
		this.reportParametersMap = reportParameters;
	}

	public Map<String, String> getSchoolNameMap() {
		return schoolNameMap;
	}

	public void setSchoolNameMap(Map<String, String> schoolNameMap) {
		this.schoolNameMap = schoolNameMap;
	}

	/** Creates new form ReportGUI */
	public ReportGUI() {
		// initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// @SuppressWarnings("unchecked")

	public void initComponents() {

		bannerLabel = new javax.swing.JLabel();
		schoolLabel = new javax.swing.JLabel();
		schoolNameListPane = new javax.swing.JScrollPane();

		// Populate Report Parameters
		Vector<String> reportParameters = new Vector<String>();
		Vector<String> schoolName = new Vector<String>();

		ArrayList<String> reportParametersValuesList = new ArrayList<String>(
				reportParametersMap.values());
		ArrayList<String> schoolNameValuesList = new ArrayList<String>(
				schoolNameMap.values());

		for (int i = 0; i < reportParametersValuesList.size(); i++) {
			reportParameters.add(reportParametersValuesList.get(i));
		}

		for (int i = 0; i < schoolNameValuesList.size(); i++) {
			schoolName.add(schoolNameValuesList.get(i));
		}

		schoolNamesList = new javax.swing.JList(schoolName);
		schoolNamesList
				.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		reportParametersList = new javax.swing.JList(reportParameters);
		reportParametersList
				.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		// Populate Graph Type Box
		parameterComboBox = new javax.swing.JComboBox();
		parameterComboBox.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Choose Type", "Bar Graph", "Pie Chart",
						"Scatter Plot" }));

		reportTypeLabel = new javax.swing.JLabel();
		parameterLabel = new javax.swing.JLabel();
		reportTypeListPane = new javax.swing.JScrollPane();
		generateReportButton = new javax.swing.JButton();
		updateDataButton = new javax.swing.JButton();
		clearButton = new javax.swing.JButton();
		exitButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		bannerLabel.setText("WELCOME TO SCHOOL STATISTICS");
		schoolLabel.setText("Select Schools to Generate Reports: ");
		schoolNameListPane.setViewportView(schoolNamesList);
		reportTypeLabel.setText("Choose Graphical Report Type:");
		parameterLabel.setText("Select Other Parameters in Report:");

		reportTypeListPane.setViewportView(reportParametersList);

		generateReportButton.setText("Generate Report");

		updateDataButton.setText("Update Data");

		clearButton.setText("Reset");

		exitButton.setText("Exit");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup().addGap(162, 162, 162)
								.addComponent(bannerLabel)
								.addContainerGap(206, Short.MAX_VALUE))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						reportTypeLabel)
																				.addComponent(
																						parameterLabel))
																.addGap(61, 61,
																		61))
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(
																		layout.createSequentialGroup()
																				.addContainerGap()
																				.addComponent(
																						schoolLabel)
																				.addGap(21,
																						21,
																						21))
																.addGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		layout.createSequentialGroup()
																				.addContainerGap(
																						62,
																						Short.MAX_VALUE)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																								.addComponent(
																										clearButton,
																										javax.swing.GroupLayout.Alignment.LEADING,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addComponent(
																										generateReportButton,
																										javax.swing.GroupLayout.Alignment.LEADING,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										172,
																										Short.MAX_VALUE))
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						layout.createSequentialGroup()
																								.addGap(90,
																										90,
																										90)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												false)
																												.addComponent(
																														exitButton,
																														javax.swing.GroupLayout.Alignment.LEADING,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														Short.MAX_VALUE)
																												.addComponent(
																														updateDataButton,
																														javax.swing.GroupLayout.Alignment.LEADING,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														159,
																														Short.MAX_VALUE))
																								.addGap(20,
																										20,
																										20))
																				.addComponent(
																						reportTypeListPane,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						269,
																						Short.MAX_VALUE)
																				.addComponent(
																						parameterComboBox,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						0,
																						269,
																						Short.MAX_VALUE))
																.addGap(31, 31,
																		31))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		schoolNameListPane,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		290,
																		Short.MAX_VALUE)
																.addContainerGap()))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(25, 25, 25)
								.addComponent(bannerLabel)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(88, 88,
																		88)
																.addComponent(
																		schoolLabel))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(40, 40,
																		40)
																.addComponent(
																		schoolNameListPane,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(51, 51, 51)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														parameterComboBox,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(reportTypeLabel))
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(96, 96,
																		96)
																.addComponent(
																		parameterLabel))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(39, 39,
																		39)
																.addComponent(
																		reportTypeListPane,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(71, 71, 71)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														generateReportButton)
												.addComponent(updateDataButton))
								.addGap(27, 27, 27)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(clearButton)
												.addComponent(exitButton))
								.addGap(94, 94, 94)));

		// Make Entire App Screen Viewable
		pack();
		setLocationRelativeTo(null);

	}// </editor-fold>//GEN-END:initComponents

	public void AddParameterComboBoxListener(ActionListener listenForComboBox) {
		parameterComboBox.addActionListener(listenForComboBox);
	}

	public void AddGenerateReportListener(
			ActionListener listenForGenerateReportEvent) {
		generateReportButton.addActionListener(listenForGenerateReportEvent);
	}

	public void AddUpdateDataListener(ActionListener listenForUpdateDataEvent) {
		updateDataButton.addActionListener(listenForUpdateDataEvent);
	}

	public void AddExitButtonListener(ActionListener listenForExitEvent) {
		exitButton.addActionListener(listenForExitEvent);
	}

	public void AddClearButtonListener(ActionListener listenForClearButtonEvent) {
		clearButton.addActionListener(listenForClearButtonEvent);
	}

	public boolean validateForm() {

		Object graphChosen = parameterComboBox.getSelectedItem();
		if (!graphChosen.equals("Choose Type")) {
			System.out.println("The Chosen Graph is: " + graphChosen);
			reportType = graphChosen.toString();
		} else {
			JOptionPane.showMessageDialog(this,
					"You must pick a report type before generating a report.",
					"Generate Report Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		Object[] chosenSchoolsList = null;
		chosenSchoolsList = schoolNamesList.getSelectedValues(); // get list of

		for (int x = 0; x < chosenSchoolsList.length; x++) {

			String key = getKeyByValue(schoolNameMap,
					chosenSchoolsList[x].toString());
			if (key != null) {
				if (schoolList == null) {
					schoolList = key + ",";
				} else {
					schoolList = schoolList + key + ",";
				}
			}
		}
		schoolList = schoolList.substring(0, schoolList.length() - 1);
		System.out.println("id list " + schoolList);
		if (chosenSchoolsList.length == 0) {
			JOptionPane
					.showMessageDialog(
							this,
							"You must pick at least 1 school before generating a report.",
							"Generate Report Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		// Handle Chosen Parameters Here
		Object[] chosenParametersList = null;
		chosenParametersList = reportParametersList.getSelectedValues();

		if (((reportType == "Bar Graph") && (chosenParametersList.length != 0))
				|| ((reportType == "Pie Chart") && (chosenParametersList.length == 1))
				|| ((reportType == "Scatter Plot") && (chosenParametersList.length == 2))) {
			for (int x = 0; x < chosenParametersList.length; x++) {
				String key = getKeyByValue(reportParametersMap,
						chosenParametersList[x].toString());
				if (key != null) {
					if (parameterList == null) {
						parameterList = key + ",";
					} else {
						parameterList = parameterList + key + ",";

					}
				}
			}
			parameterList = parameterList.substring(0,
					parameterList.length() - 1);
			System.out.println("parameterlist is: " + parameterList);
		} else {
			if ((reportType == "Bar Graph")) {
				JOptionPane
						.showMessageDialog(
								this,
								"You must pick at least 1 parameter before generating a Bar Graph report.",
								"Generate Report Error",
								JOptionPane.ERROR_MESSAGE);
			} else if (reportType == "Pie Chart") {
				JOptionPane
						.showMessageDialog(
								this,
								"You must pick only 1 parameter before generating a Pie Chart report.",
								"Generate Report Error",
								JOptionPane.ERROR_MESSAGE);
			} else if (reportType == "Scatter Plot") {
				JOptionPane
						.showMessageDialog(
								this,
								"You must pick only 2 parameter before generating a Scatter Plot report.",
								"Generate Report Error",
								JOptionPane.ERROR_MESSAGE);
			}

			return false;
		}

		return true;
	}

	public void reset() {
		schoolNamesList.clearSelection();
		parameterComboBox.setSelectedIndex(0);
		reportParametersList.clearSelection();
		reportType = null;
		schoolList = null;
		parameterList = null;
	}

	public void refreshSchoolList() {
		schoolNamesList.setListData(schoolNameMap.values().toArray());
		schoolNamesList.repaint();
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton generateReportButton;
	private javax.swing.JButton updateDataButton;
	private javax.swing.JButton clearButton;
	private javax.swing.JButton exitButton;
	private javax.swing.JComboBox parameterComboBox;
	private javax.swing.JLabel bannerLabel;
	private javax.swing.JLabel schoolLabel;
	private javax.swing.JLabel reportTypeLabel;
	private javax.swing.JLabel parameterLabel;
	private javax.swing.JList schoolNamesList;
	private javax.swing.JList reportParametersList;
	private javax.swing.JScrollPane schoolNameListPane;
	private javax.swing.JScrollPane reportTypeListPane;

	// End of variables declaration//GEN-END:variables

	public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
		for (Entry<T, E> entry : map.entrySet()) {
			if (value.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}

}
