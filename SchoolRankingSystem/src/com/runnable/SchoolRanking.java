package com.runnable;

import com.business.ReportModel;
import com.controller.SchoolController;
import com.gui.ReportGUI;

public class SchoolRanking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReportGUI theView = new ReportGUI();
		ReportModel theModel = new ReportModel();
		@SuppressWarnings("unused")
		SchoolController theController = new SchoolController(theView, theModel);
		theView.setVisible(true);

	}

}
