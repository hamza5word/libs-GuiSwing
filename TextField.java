package com.hmz.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class TextField extends JTextField {

	private static final long serialVersionUID = 1L;

	public TextField(int size) {
		super(size);
		setOpaque(false);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setFont(new Font("Calibri Light", Font.BOLD, 30));
		setHorizontalAlignment(JTextField.CENTER);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		super.paintComponent(g);
	}

}
