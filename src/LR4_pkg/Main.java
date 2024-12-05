package LR4_pkg;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JButton comboBoxButton; // Кнопка вычисления
		JButton checkBoxButton; // Кнопка вычисления
		JButton textBoxButton; // Кнопка вычисления

		JFrame mainFrame = new JFrame();
		mainFrame.setTitle("Главное окно");
		mainFrame.setLocation(600, 400);
		mainFrame.setSize(800, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(new FlowLayout());
		// mainFrame.setBounds(100, 100, 450, 300);

		// Создание и добавление компонентов
		comboBoxButton = new JButton("comboBox");
		mainFrame.add(comboBoxButton);
		
		checkBoxButton = new JButton("checkBox");
		mainFrame.add(checkBoxButton);
		
		textBoxButton = new JButton("textBox");
		mainFrame.add(textBoxButton);

		// Обработчик кнопки
		textBoxButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PasswordCalc.calculator();
			}
		});
		
		// Обработчик кнопки
		comboBoxButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Country.country();
			}
		});
		
		// Обработчик кнопки
		checkBoxButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Check.check();
			}
		});

		mainFrame.setVisible(true);
	}
}
