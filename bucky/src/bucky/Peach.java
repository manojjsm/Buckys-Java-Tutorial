package bucky;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
//86-Drawing more Stuff
public class Peach extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.drawLine(10, 25, 200, 45);
		
		g.setColor(Color.RED);
		g.drawRect(10, 55, 100, 30);
		
		g.setColor(Color.GREEN);
		g.fillOval(10, 95, 100, 30);
		
		g.setColor(Color.ORANGE);
		g.fill3DRect(10, 160, 100, 50, true);
	}
}

//85-JColorChooser
//public class Peach extends JFrame {
//	private JButton b;
//	private Color color = (Color.WHITE);
//	private JPanel panel;
//	
//	public Peach(){
//		super("the title");
//		panel = new JPanel();
//		panel.setBackground(color);
//		
//		b = new JButton("choose a color");
//		b.addActionListener(
//				new ActionListener() {
//					
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						// TODO Auto-generated method stub
//						color = JColorChooser.showDialog(null, "pick your color", color);
//						if(color==null){
//							color = (Color.WHITE);
//							
//						}
//						
//						panel.setBackground(color);
//					}
//				}
//		);
//
//		add(panel,BorderLayout.CENTER);
//		add(b,BorderLayout.SOUTH);
//		setSize(425, 150);
//		setVisible(true);
//	}
//	
//}
//84-Drawing Grapphics
//public class Peach extends JPanel {
//	public void paintComponent(Graphics g){
//		super.paintComponent(g);
//		this.setBackground(Color.WHITE);
//		
//		g.setColor(Color.BLUE);
//		g.fillRect(25, 25, 100, 30);
//		
//		g.setColor(new Color(190,81,215));//RGB
//		g.fillRect(25, 65, 100, 30);
//		
//		g.setColor(Color.RED);
//		g.drawString("this is some text", 25, 120);
//	}
//}
