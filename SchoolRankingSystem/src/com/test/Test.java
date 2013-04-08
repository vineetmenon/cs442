
package com.test;

/*import java.io.IOException;
import java.util.Iterator;
import com.bean.School;
import com.business.update.IllinoisUpdateStrategy;*/
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
		  
/*		IllinoisUpdateStrategy st = new IllinoisUpdateStrategy();
		try {
			Iterator<School> temp = st.getData();
			
			while(temp.hasNext()) {
				temp.next();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
	}

}
