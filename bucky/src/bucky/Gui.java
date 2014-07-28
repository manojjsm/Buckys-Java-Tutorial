package bucky;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
//import java.awt.FlowLayout;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import javax.swing.JFrame;
//import javax.swing.JButton;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
//import javax.swing.JOptionPane;

public class Gui extends JFrame{
	//64-65 JcheckBox/The Final Check Box Program
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;
	
	public Gui(){
		super("the title");
		setLayout(new FlowLayout());
		tf = new JTextField("This is a sentence",20);
		tf.setFont(new Font("Serif",Font.PLAIN,14));
		add(tf);
		
		boldbox = new JCheckBox("bold");
		italicbox = new JCheckBox("italic");
		
		add(boldbox);
		add(italicbox);
		
		HandlerClass handler = new HandlerClass();
		boldbox.addItemListener(handler);
		italicbox.addItemListener(handler);
		
	}
	
	private class HandlerClass implements ItemListener {
		
		public void itemStateChanged(ItemEvent event){
			Font font = null;
			if(boldbox.isSelected() && italicbox.isSelected()){
				font = new Font("Serif",Font.BOLD+Font.ITALIC,14);
			}
			else if(boldbox.isSelected())
				font = new Font("Serif",Font.BOLD,14);
			else if(italicbox.isSelected())
				font = new Font("Serif",Font.ITALIC,14);
			else
				font = new Font("Serif",Font.PLAIN,14);
			
			tf.setFont(font);
		}
	}
	
	
	
	
	//62-63 - JButton
//	private JButton reg;
//	private JButton custom;
//	
//	public Gui(){
//		super("The title");
//		setLayout(new FlowLayout());
//		
//		reg = new JButton("reg Button");
//		add(reg);
//		
//		Icon b = new ImageIcon(getClass().getResource("images.jpg"));
//		Icon x = new ImageIcon(getClass().getResource("cat.jpg"));
//		
//		custom = new JButton("Custom",b);
//		custom.setRolloverIcon(x);
//		add(custom);
//		
//		HandlerClass handler = new HandlerClass();
//		reg.addActionListener(handler);
//		custom.addActionListener(handler);
//		
//		
//	}
//	
//	private class HandlerClass implements ActionListener{
//		
//		public void actionPerformed(ActionEvent event){
//			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
//		}
//		
//	}
}
