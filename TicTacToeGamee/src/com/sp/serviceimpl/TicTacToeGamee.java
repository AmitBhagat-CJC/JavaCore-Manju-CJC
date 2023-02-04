package com.sp.serviceimpl;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToeGamee implements ActionListener 
{
		JFrame jf;
	    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
	    
	    int count=0;
	    String str="";
	    boolean win=false;
	    Color c;
	    
	    TicTacToeGamee()
	    {
	        jf=new JFrame("Tic Tac Toe Game by Deepak");
	        jf.setSize(400,400);
	        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        jf.setLayout(new GridLayout(3,3));
	        
	        jb1=new JButton();
	        jb1.addActionListener(this);
	        jf.add(jb1);
	        
	        jb2=new JButton();
	        jb2.addActionListener(this);
	        jf.add(jb2);
	        
	        jb3=new JButton();
	        jb3.addActionListener(this);
	        jf.add(jb3);
	        
	        jb4=new JButton();
	        jb4.addActionListener(this);
	        jf.add(jb4);
	        
	        jb5=new JButton();
	        jb5.addActionListener(this);
	        jf.add(jb5);
	        
	        jb6=new JButton();
	        jb6.addActionListener(this);
	        jf.add(jb6);
	        
	        jb7=new JButton();
	        jb7.addActionListener(this);
	        jf.add(jb7);
	        
	        jb8=new JButton();
	        jb8.addActionListener(this);
	        jf.add(jb8);
	        
	        jb9=new JButton();
	        jb9.addActionListener(this);
	        jf.add(jb9);
	        
	        jf.setVisible(true);
	    }

		
	}


