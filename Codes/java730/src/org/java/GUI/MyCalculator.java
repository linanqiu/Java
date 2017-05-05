//HW given in lecture 16 just to create outer view of Calculator
package org.java.GUI;

import java.awt.*;

public class MyCalculator extends Frame {

	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bmr, bmw, brem;
	TextField t1;
	
		public MyCalculator(String title) throws HeadlessException {
			super(title);
		
			b1 = new Button("1");
			b2 = new Button("2");
			b3 = new Button("3");
			b4 = new Button("4");
			b5 = new Button("5");
			b6 = new Button("6");
			b7 = new Button("7");
			b8 = new Button("8");
			b9 = new Button("9");
			b0 = new Button("0");
			bmr = new Button("MR");
			bmw = new Button("M+");
			brem = new Button("M-");
			
			t1 = new TextField(20); 

			//Panel p1 = new Panel();
			Panel p2 = new Panel();
			
			setLayout(new GridLayout(5, 4));
			add(p2);

			add(b1);
			add(b2);
			add(b3);
			add(bmw);
			add(b4);
			add(b5);
			add(b6);
			add(brem);
			add(b7);
			add(b8);
			add(b9);
			add(bmr);
			add(b0);
			p2.add(t1);
		//	add(p1);
		}
			
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator("Calculator");
		mc.setVisible(true);
		mc.setBounds(20, 30, 500, 660);

	}
}
