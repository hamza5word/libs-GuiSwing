package com.hmz.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DataPrinter extends Panel {

	private static final long serialVersionUID = 1L;
	
	public DataPrinter(String dataTitle, String[] titles, Object ...values) {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		JLabel lt = new JLabel(dataTitle);
		lt.setForeground(Color.YELLOW);
		lt.setFont(new Font("Calibri Light", Font.BOLD, 50));
		lt.setPreferredSize(new Dimension(500, lt.getPreferredSize().height));
		add(lt);
		if(titles.length == values.length) {
			for (int i = 0; i<titles.length; i++) {
				Panel p = new Panel();
				p.setLayout(new FlowLayout(FlowLayout.CENTER));
				JLabel l1 = new JLabel(titles[i]+ " : " + values[i]);
				l1.setFont(new Font("Calibri Light", Font.BOLD, 18));
				l1.setForeground(Color.white);
				l1.setPreferredSize(new Dimension(300, l1.getPreferredSize().height));
				l1.setHorizontalAlignment(JTextField.LEFT);
				p.add(l1);
				add(p);
			}
		}
	}

	
	
}
