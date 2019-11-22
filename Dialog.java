package com.hmz.gui;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class Dialog extends JDialog {

	private static final long serialVersionUID = 1L;

	public Dialog() {
		super();
	}
	
	public Dialog(JFrame parent, boolean modal) {
		super(parent, modal);
	}
	
	public void config() {
		setTitle("HMZ Dialog");
		pack();
		setResizable(false);
		setLocationRelativeTo(getParent());
	}

}
