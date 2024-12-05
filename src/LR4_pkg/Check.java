package LR4_pkg;

import java.awt.FlowLayout;

import javax.swing.*;

public class Check {
	public static void check() {
		JFrame frame = new JFrame("Это моё окно");
		frame.setLocation(400, 400);
		frame.setSize(400, 400);
		//frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		
		
		JCheckBox check = new JCheckBox("Галочка");
		JTextField name = new JTextField("Галочки нет",20);
		name.setEditable(false);
		CheckListener listener = new CheckListener(check, name);
		check.addActionListener(listener);
		
		
		frame.add(check);
		frame.add(name);
		
		
		
		frame.setVisible(true);
	}
}


