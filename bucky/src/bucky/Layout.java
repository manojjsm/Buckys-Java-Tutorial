package bucky;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Layout extends JFrame {

	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout layout;
	private Container container;
	
	public Layout(){
		super("the title");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		//left stuff here
		lb= new JButton("left");
		add(lb);
		lb.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}
				}
		);

		//Center stuff here
		cb= new JButton("center");
		add(cb);
		cb.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);
					}
				}
		);
		
		//right stuff in here
		rb= new JButton("right");
		add(rb);
		rb.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);
					}
				}
		);


	}
}
