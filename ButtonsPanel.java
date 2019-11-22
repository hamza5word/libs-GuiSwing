package com.hmz.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;


public class ButtonsPanel extends Panel {
	private int flow;
	private Color bc;
	private Color fc;
	private static final long serialVersionUID = 1L;

	public ButtonsPanel(String ...buttons) {
		this(FlowLayout.RIGHT, buttons);
	}
	
	public ButtonsPanel(int flow, String ...buttons) {
		this.flow = flow;
		this.bc = Color.DARK_GRAY;
		this.fc = Color.WHITE;
		setLayout(new FlowLayout(this.flow));
		for (String string : buttons) {
			JButton b = new JButton(string);
			b.setBackground(this.bc);
			b.setForeground(this.fc);
			add(b);
		}
	}

	public ButtonsPanel(int flow,Color bc, Color fc, String ...buttons) {
		this.flow = flow;
		this.bc = bc;
		this.fc = fc;
		setLayout(new FlowLayout(this.flow));
		for (String string : buttons) {
			JButton b = new JButton(string);
			b.setBackground(this.bc);
			b.setForeground(this.fc);
			add(b);
		}
	}
	
	public JButton getButton(int index) {
		JButton ret = null;
		ret = (JButton)this.getComponent(index);
		return ret;
	}

}
