package com.hmz.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel {
	int index = 0;
	private static final long serialVersionUID = 1L;

	public Panel() {
		setBackground(Color.DARK_GRAY);
	}
	
	public void showLayouts(String layout_name) {
		switch (layout_name) {
		case "bl":
			borderL();
			break;
		case "gl" :
			gridL();
			break;
		case "bxl" :
			boxL();
			break;
		case "cl" :
			cardL();
			break;
		case "fl" :
			flowL();
			break;
		default:
			break;
		}
	}
	
	void gridL() {
		setLayout(new GridLayout(3, 2));
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
	}
	
	void boxL() {
		JPanel p1 = new JPanel(), p2 = new JPanel(), p3 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.LINE_AXIS));
		p1.add(new JButton("Button 1"));
		p2.setLayout(new BoxLayout(p2, BoxLayout.LINE_AXIS));
		p2.add(new JButton("Button 2"));
		p2.add(new JButton("Button 3"));
		p3.setLayout(new BoxLayout(p3, BoxLayout.LINE_AXIS));
		p3.add(new JButton("Button 4"));
		p3.add(new JButton("Button 5"));
		p3.add(new JButton("Button 6"));
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		add(p1);
		add(p2);
		add(p3);
	}
	
	void cardL() {
		CardLayout cl = new CardLayout();
		JPanel content = new JPanel();
		JPanel buttonPane = new JPanel();
		JPanel card1 = new JPanel();
		card1.setBackground(Color.BLUE);
		JPanel card2 = new JPanel();
		card2.setBackground(Color.RED);
		JPanel card3 = new JPanel();
		card3.setBackground(Color.GREEN);
		String[] listContent = {"CARD_1", "CARD_2", "CARD_3"};
		JButton b1 = new JButton("Next Content");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cl.next(content);
			}
		});
		JButton b2 = new JButton("Content By Index");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(++index > 2) index = 0;
				cl.show(content, listContent[index]);
			}
		});
		buttonPane.add(b1);
		buttonPane.add(b2);
		content.setLayout(cl);
		content.add(card1, listContent[0]);
		content.add(card2, listContent[1]);
		content.add(card3, listContent[2]);
		setLayout(new BorderLayout());
		add(buttonPane, BorderLayout.NORTH);
		add(content, BorderLayout.CENTER);
	}
	
	void flowL() {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(new JButton("Button 1"));
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		add(new JButton("Button 4"));
		add(new JButton("Button 5"));
	}
	
	void borderL() {
		setLayout(new BorderLayout());
		add(new JButton("NORTH"), BorderLayout.NORTH);
		add(new JButton("SOUTH"), BorderLayout.SOUTH);
		add(new JButton("CENTER"), BorderLayout.CENTER);
		add(new JButton("EAST"), BorderLayout.EAST);
		add(new JButton("WEST"), BorderLayout.WEST);
	}
	
	
	
	
	/*public void paintComponent(Graphics g) {
		g.drawString("Content Pane 1", getWidth()/6, getHeight()/6);
		//g.draw3DRect(100, 100, 10, 10, true);
		//g.fillRect(this.getWidth()/4, this.getHeight()/4, this.getWidth()/2, this.getHeight()/2);
		g.setColor(Color.BLACK);
		g.drawRect(10, 10, this.getWidth()/2, this.getHeight()/2);
		g.drawRect(80, 80, this.getWidth()/2, this.getHeight()/2);
		g.drawLine(10, 10, 80, 80);
		g.drawLine(10+this.getWidth()/2, 10, 80+this.getWidth()/2, 80);
		g.drawLine(10, 10+this.getHeight()/2, 80, 80+this.getHeight()/2);
		g.drawLine(10+this.getWidth()/2, 10+this.getHeight()/2, 80+this.getWidth()/2, 80+this.getHeight()/2);
	}*/

}
