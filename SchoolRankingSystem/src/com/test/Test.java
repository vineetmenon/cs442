
package com.test;

import java.io.IOException;
import java.sql.Connection;
import java.util.Iterator;
import com.bean.School;
import com.business.update.IllinoisUpdateStrategy;
import com.database.DatabaseConnection;
import com.gui.ReportGUI;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		  java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new ReportGUI().setVisible(true);
	            }
	        });
		  
		/*IllinoisUpdateStrategy st = new IllinoisUpdateStrategy();
		try {
			Iterator<School> temp = st.getData();
			
			Connection conn;
			try {
				conn = DatabaseConnection.getConnection();
				while(temp.hasNext()) {
					School S = temp.next();
					try {
						S.save(conn);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
