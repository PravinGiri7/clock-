package com.pravin;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer.*;
import java.util.jar.Attributes.Name;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class MyWindow   extends JFrame	{
	
	private JLabel heading;
	private JLabel clocklable;
	
	private Font font  = new Font("",Font.BOLD, 35);
	
	public MyWindow() {
	
		setTitle("MyClock");
		setSize(400, 400);
		setLocation(300, 50);
		this.createGUI();
		this.clockStart();
		setVisible(true);
	}
	
	public void createGUI() {
		
		heading = new JLabel("my clock");
		
		clocklable  =new JLabel("clock");
		heading.setFont(font); 
		clocklable.setFont(font);

		this.setLayout(new GridLayout(2, 1));
		this.add(heading);
		this.add(clocklable);	
	}
	
	public void clockStart() {
		
			Timer timer= new Timer(1000,new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//String dateTime= new Date().toString();
					//String dateTime= new Date().toLocaleString();
					Date d= new Date();
					SimpleDateFormat sfd= new SimpleDateFormat("hh:mm:ss a") {
					};
					
					String dateTime=sfd.format(d);
					clocklable.setText(dateTime);
				}
			});
			
			timer.start();
		
	}

}
