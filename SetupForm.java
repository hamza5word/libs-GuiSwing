package com.hmz.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SetupForm extends Panel {

	private static final long serialVersionUID = 1L;

	public SetupForm(String title, int labelWidh, String ...labels) {
		this(title, labelWidh, true, labels);
	}
	
	public SetupForm(String title, int labelWidh, boolean buttons, String ...labels) {
		setLayout(new BorderLayout());
		Panel c = new Panel();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lt = new JLabel(title);
		lt.setForeground(Color.YELLOW);
		lt.setFont(new Font("Calibri Light", Font.BOLD, 50));
		c.add(lt);
		Panel c1 = new Panel();
		c1.setLayout(new BoxLayout(c1, BoxLayout.PAGE_AXIS));
		for (String string : labels) {
			if(!string.contains(":")) string += " : ";
			Panel c2 = new Panel();
			c2.setLayout(new FlowLayout(FlowLayout.CENTER));
			JLabel l = new JLabel(string);
			l.setForeground(Color.WHITE);
			l.setPreferredSize(new Dimension(labelWidh, l.getPreferredSize().height));
			l.setFont(new Font("Calibri Light", Font.BOLD, 20));
			TextField t = new TextField(10);
			t.setPreferredSize(new Dimension(l.getPreferredSize().width, 35));
			t.setFont(new Font("Calibri Light", Font.BOLD, 30));
			c2.add(l);
			c2.add(t);
			c1.add(c2);
		}
		if (buttons) { 
			ButtonsPanel bp = new ButtonsPanel(FlowLayout.RIGHT, "Submit", "Back", "Quit");
			JButton b = (JButton)bp.getComponent(2);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			/*
			JButton b2 = (JButton)bp.getComponent(0);
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Panel p = (Panel)(c1.getComponent(labels.length-1));
					TextField l = (TextField)(p.getComponent(1));
					l.setText(l.getText()+" is submited");
					b2.setEnabled(false);
				}
			});*/
			add(bp, BorderLayout.SOUTH);
		}
		add(c, BorderLayout.NORTH);
		add(c1, BorderLayout.CENTER);
	}

	public JButton getButton(int index) {
		JButton ret = null;
		ButtonsPanel p = (ButtonsPanel)this.getComponent(0);
		ret = (JButton)p.getButton(index);
		return ret;
	}
	
	public JTextField getTextF(int index) {
		JTextField ret = null;
		JPanel p = (JPanel)this.getComponent(2);
		JPanel p2 = (JPanel)p.getComponent(index);
		ret = (JTextField)p2.getComponent(1);
		return ret;
	}
}
