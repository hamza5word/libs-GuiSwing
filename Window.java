package com.hmz.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;


public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	public Window() {
		super();
	}
	
	public void config() {
		setTitle("HMZ Window");
		setSize(800, 600);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	void test1() {
		Panel p = new Panel();
		p.showLayouts("gl");
		setContentPane(p);
	}
	
	void test2() {
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		ButtonsPanel bp = new ButtonsPanel(FlowLayout.CENTER, Color.DARK_GRAY, Color.YELLOW, "Next", "Back", "Exit");
		p.add(bp, BorderLayout.SOUTH);
		setContentPane(p);
	}
	
	void test3() {
		SetupForm s = new SetupForm("SETUP FORM", 100, "Name", "Age", "Date");
		/*
		Panel p = (Panel)s.getComponent(2);
		Panel p2 = (Panel)p.getComponent(3);
		TextField t = (TextField)p2.getComponent(1);
		t.setEditable(false);
		t.setForeground(Color.GREEN);
		*/
		setContentPane(s);
	}
	
	void test4() {
		MenuPanel m = new MenuPanel("MENU PANEL", "BUTTON 1", "BUTTON 2", "BUTTON 3", "BUTTON 4", "BUTTON 5", "BUTTON 5", "BUTTON 5");
		setContentPane(m);
	}
	
	void test5() {
		SearchPanel s = new SearchPanel("Enter Value");
		setContentPane(s);
	}
	
	public static void main(String[] args) {
		new Window();
	}
}
