package LR4_pkg;

import java.awt.BorderLayout;
import javax.swing.*;

public class Country {
	static JFrame frame;
	public static void country() {
		 frame = new JFrame("Это моё окно");
		frame.setLocation(400, 400);
		frame.setSize(400, 400);
		//frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		JComboBox<String> box = new JComboBox<String>(Country_Information.COUNTRIES);
		
		JTextArea area = new JTextArea();
		area.setText("Выберите страну");
		area.setEditable(false);
		
		BoxListener myListener = new BoxListener(box, area);
		box.addActionListener(myListener);
		
		frame.add(box, BorderLayout.SOUTH);
		frame.add(area, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}