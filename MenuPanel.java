package com.hmz.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPanel extends Panel {

	private static final long serialVersionUID = 1L;
	private Panel container;
	public MenuPanel(String menuTitle, String ...titles) {
		container = new Panel();
		container.setLayout(new BoxLayout(container,BoxLayout.PAGE_AXIS));
		for (int i = 0; i < titles.length; i++) {
			Panel p = new Panel();
			p.setLayout(new FlowLayout(FlowLayout.CENTER));
			JButton key = new JButton(titles[i]);
			key.setBorder(BorderFactory.createEmptyBorder());
			key.setFont(new Font("Calibri Light", Font.BOLD, 20));
			key.setForeground(Color.WHITE);
			key.setBackground(getBackground());
		    key.setPreferredSize(new Dimension(650, key.getPreferredSize().height));
		    key.addMouseListener(new MouseAdapter() {
		    	public void mouseEntered(MouseEvent e) {
		    		key.setForeground(Color.YELLOW);
		    	}
		    	public void mouseExited(MouseEvent e) {
		    		key.setForeground(Color.white);
		    	}
			});
			p.add(key);
			container.add(p);
		}
		JLabel menu = new JLabel(menuTitle);
		menu.setForeground(Color.YELLOW);
		menu.setFont(new Font("Calibri Light", Font.BOLD, 50));
		Panel p = new Panel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));
		Panel ex = new Panel();
		ex.setLayout(new BorderLayout());
		JButton exit = new JButton("QUIT");
		exit.setBorder(BorderFactory.createEmptyBorder());
		exit.setFont(new Font("Calibri Light", Font.BOLD, 20));
		exit.setForeground(Color.WHITE);
		exit.setBackground(getBackground());
	    exit.setPreferredSize(new Dimension(500, exit.getPreferredSize().height*5));
	    exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	    exit.addMouseListener(new MouseAdapter() {
	    	public void mouseEntered(MouseEvent e) {
	    		exit.setForeground(Color.YELLOW);
	    	}
	    	public void mouseExited(MouseEvent e) {
	    		exit.setForeground(Color.WHITE);
	    	}
		});
		ex.add(exit, BorderLayout.SOUTH);
		p.add(menu);
		add(p);
		add(container);
		add(ex);
	}

	public JButton getButton(int index) {
		JButton ret = null;
		JPanel p = (JPanel)container.getComponent(index);
		ret = (JButton)p.getComponent(0);
		return ret;
	}
	
}
