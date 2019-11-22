package com.hmz.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SearchPanel extends Panel {

	private static final long serialVersionUID = 1L;

	public SearchPanel(String desc) {
		JLabel l = new JLabel(desc);
		l.setHorizontalAlignment(JTextField.CENTER);
		l.setFont(new Font("Calibri Light", Font.BOLD, 30));
		l.setForeground(Color.white);
		l.setPreferredSize(new Dimension(500, l.getPreferredSize().height));
		TextField t = new TextField(30);
		ButtonsPanel b = new ButtonsPanel(FlowLayout.CENTER, "Search", "Back");
		add(l);
		add(t);
		add(b);
	}
	
	public TextField getTextF() {
		TextField ret = null;
		ret = (TextField)this.getComponent(1);
		return ret;
	}
	
	public JButton getButton(int index) {
		JButton ret = null;
		ButtonsPanel b = (ButtonsPanel)this.getComponent(2);
		ret = (JButton)b.getButton(index);
		return ret;
	}

}
