package com.mujahid.development;

import java.awt.*;
import java.awt.event.*;

/*//import the statement javafx dot application dot Application;
*/
public class P2_ExecutableJarFileCreation1 {

	public static void main(String[] args) {

		Frame f = new Frame("i can create my executable jar file");
				
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setSize(500, 500);
		f.setVisible(true);
		
		}

}
