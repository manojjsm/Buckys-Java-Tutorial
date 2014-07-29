package bucky;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
//import java.awt.FlowLayout;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import javax.swing.JFrame;
//import javax.swing.JButton;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
//import javax.swing.JOptionPane;

public class Gui extends JFrame{
	
	//77-Adapter classes
	private String details;
	private JLabel statusbar;
	
	public Gui(){
		super("the title");
		statusbar = new JLabel("This is default");
		
		add(statusbar,BorderLayout.SOUTH);
		addMouseListener(new MouseClass());
		
		
	}
	
	private class MouseClass extends MouseAdapter{
		public void mouseClicked(MouseEvent event){
			details = String.format("You clicked %d ", event.getClickCount());
			if (event.isMetaDown()) {
				details += "with right mouse button";
			}
			else if (event.isAltDown()) {
				details += "with center mouse button";
			}
			else
				details += "with left mouse button";
			
			statusbar.setText(details);
		}
	}
	
	//74-76 Mouse Events/MouseListener/MouseMotionlistener interface
//	private JPanel mousepanel;
//	private JLabel statusbar;
//	public Gui(){
//		super("title");
//		mousepanel = new JPanel();
//		mousepanel.setBackground(Color.WHITE);
//		add(mousepanel,BorderLayout.CENTER);
//		
//		statusbar = new JLabel("default");
//		add(statusbar,BorderLayout.SOUTH);
//		
//		Handlerclass handler = new Handlerclass();
//		mousepanel.addMouseListener(handler);
//		mousepanel.addMouseMotionListener(handler);
//	}
//	
//	private class Handlerclass implements MouseListener, MouseMotionListener{
//		public void mouseClicked(MouseEvent event){
//			statusbar.setText(String.format("Click at %d %d", event.getX(),event.getY()));
//			
//		}
//		
//		public void mousePressed(MouseEvent event){
//			statusbar.setText("you pressed down the mouse");
//		}
//		
//		public void mouseReleased(MouseEvent event){
//			statusbar.setText("you released the button");
//		}
//		
//		public void mouseEntered(MouseEvent event){
//			statusbar.setText("you entered the area");
//			mousepanel.setBackground(Color.RED);
//		}
//		
//		public void mouseExited(MouseEvent event){
//			statusbar.setText("the mouse has left the window");
//			mousepanel.setBackground(Color.WHITE);
//		}
//		
//		//these are mouse motion events
//		
//		public void mouseDragged(MouseEvent event){
//			statusbar.setText("you are dragging the mouse");
//		}
//		
//		public void mouseMoved(MouseEvent event){
//			statusbar.setText("you moved the mouse");
//		}
//	}
	
	//72-73 Multiple Selection List/Moving List items program
//	private JList leftlist;
//	private JList rightlist;
//	private JButton movebutton;
//	private static String[] foods = {"bacon","wings","ham","beef","morebacon"};
//	
//	public Gui(){
//		super("the title");
//		setLayout(new FlowLayout());
//		
//		leftlist = new JList(foods);
//		leftlist.setVisibleRowCount(3);
//		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//		add(new JScrollPane(leftlist));
//		
//		movebutton = new JButton("Move -->");
//		movebutton.addActionListener(
//				new ActionListener() {
//					
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						// TODO Auto-generated method stub
//						rightlist.setListData(leftlist.getSelectedValues());
//						
//					}
//				}
//		);
//		
//		add(movebutton);
//		rightlist = new JList();
//		rightlist.setVisibleRowCount(3);
//		rightlist.setFixedCellWidth(100);
//		rightlist.setFixedCellHeight(15);
//		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//		add(new JScrollPane(rightlist));
//		
//	}
	
	//70-71 JList/JList Program
//	private JList list;
//	private static String[] colornames={"black","blue","red","white"};
//	private static Color[] colors= {Color.BLACK,Color.BLUE,Color.RED,Color.WHITE};
//	
//	
//	public Gui(){
//		super("the title");
//		setLayout(new FlowLayout());
//		
//		list = new JList(colornames);
//		list.setVisibleRowCount(4);
//		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		
//		add(new JScrollPane(list));
//		
//		list.addListSelectionListener(
//				new ListSelectionListener() {
//					
//					@Override
//					public void valueChanged(ListSelectionEvent e) {
//						// TODO Auto-generated method stub
//						getContentPane().setBackground(colors[list.getSelectedIndex()]);
//					}
//				}
//		);
//		
//	}
	
	
	//68-69 JComboBox/Drop Down list Program
//	private JComboBox box;
//	private JLabel picture;
//	
//	private static String[] filename = {"images.jpg","cat.jpg"};
//	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),new ImageIcon(getClass().getResource(filename[1]))};
//	
//	public Gui(){
//		super("the title");
//		setLayout(new FlowLayout());
//		
//		box = new JComboBox(filename);
//		box.addItemListener(
//				new ItemListener(){
//					public void itemStateChanged(ItemEvent event){
//						if(event.getStateChange()==ItemEvent.SELECTED){
//							picture.setIcon(pics[box.getSelectedIndex()]);
//						}
//					}
//				}
//		);
//		
//		add(box);
//		picture = new JLabel(pics[0]);
//		add(picture);
//		
//	}
	//66-JRadioButton
//	private JTextField tf;
//	private Font pf;
//	private Font bf;
//	private Font itf;
//	private Font bif;
//	private JRadioButton pb;
//	private JRadioButton bb;
//	private JRadioButton ib;
//	private JRadioButton bib;
//	private ButtonGroup group;
//	
//	public Gui(){
//		super("the title");
//		setLayout(new FlowLayout());
//		tf = new JTextField("Bucky is awesome and hot",25);
//		add(tf);
//		
//		pb = new JRadioButton("plain", true);
//		bb = new JRadioButton("bold", true);
//		ib = new JRadioButton("italic", true);
//		bib = new JRadioButton("bold and italic", true);
//		
//		add(pb);
//		add(bb);
//		add(ib);
//		add(bib);
//		
//		group=new ButtonGroup();
//		group.add(pb);
//		group.add(bb);
//		group.add(ib);
//		group.add(bib);
//		
//		pf = new Font("Serif", Font.PLAIN,14);
//		bf = new Font("Serif", Font.BOLD,14);
//		itf = new Font("Serif", Font.ITALIC,14);
//		bif = new Font("Serif", Font.BOLD+Font.ITALIC,14);
//		tf.setFont(pf);
//		
//		//wait for the event to happen, pass in font object to constructor
//		pb.addItemListener(new HandlerClass(pf));
//		bb.addItemListener(new HandlerClass(bf));
//		ib.addItemListener(new HandlerClass(itf));
//		bib.addItemListener(new HandlerClass(bif));
//		
//	}
//	
//	public class HandlerClass implements ItemListener{
//		private Font font;
//		
//		//the font object get variable font
//		public HandlerClass(Font f){
//			font=f;
//		}
//		
//		//sets the font to the font object that was passed in
//		public void itemStateChanged(ItemEvent event){
//			tf.setFont(font);
//		}
//	}
	
	//64-65 JcheckBox/The Final Check Box Program
//	private JTextField tf;
//	private JCheckBox boldbox;
//	private JCheckBox italicbox;
//	
//	public Gui(){
//		super("the title");
//		setLayout(new FlowLayout());
//		tf = new JTextField("This is a sentence",20);
//		tf.setFont(new Font("Serif",Font.PLAIN,14));
//		add(tf);
//		
//		boldbox = new JCheckBox("bold");
//		italicbox = new JCheckBox("italic");
//		
//		add(boldbox);
//		add(italicbox);
//		
//		HandlerClass handler = new HandlerClass();
//		boldbox.addItemListener(handler);
//		italicbox.addItemListener(handler);
//		
//	}
//	
//	private class HandlerClass implements ItemListener {
//		
//		public void itemStateChanged(ItemEvent event){
//			Font font = null;
//			if(boldbox.isSelected() && italicbox.isSelected()){
//				font = new Font("Serif",Font.BOLD+Font.ITALIC,14);
//			}
//			else if(boldbox.isSelected())
//				font = new Font("Serif",Font.BOLD,14);
//			else if(italicbox.isSelected())
//				font = new Font("Serif",Font.ITALIC,14);
//			else
//				font = new Font("Serif",Font.PLAIN,14);
//			
//			tf.setFont(font);
//		}
//	}
	
	
	
	
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
