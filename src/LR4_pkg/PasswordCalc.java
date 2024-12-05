package LR4_pkg;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import java.awt.*;


public class PasswordCalc{

    public static void calculator() {
    	
    	JFrame frame;
        JTextField wordField;  // Поле для ввода слова
        JTextField cntField;        // Поле для подсчёта символов
        JTextField resultField;        // Поле для вывода результата
        
        frame = new JFrame();
    	frame.setTitle("Калькулятор Пароля");
    	frame.setLocation(400, 400);
    	frame.setSize(400, 300);
    	//frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    	frame.setLayout(new FlowLayout());

        // Создание и добавление компонентов
    	frame.add(new JLabel("Слово:"));
        wordField = new JTextField(10);
        frame.add(wordField);

        frame.add(new JLabel("Количество символов:"));
        cntField = new JTextField(10);
        cntField.setEditable(false);
        frame.add(cntField);

        frame.add(new JLabel("Сложность:"));
        resultField = new JTextField(10);
        resultField.setEditable(false);
        frame.add(resultField);
              
                
        wordField.addCaretListener(new CaretListener() {

	        @Override
	        public void caretUpdate(CaretEvent e) {
	            //System.out.println("text field have changed");
	        	String word = wordField.getText();
	            int cnt = word.length();
	            String result = "";
	
	            if(cnt<=5) {
	            	result="легко";
	            }else if(cnt<=10) {
	            	result="средне";
	            }else {
	            	result="сложно";
	            }
	            cntField.setText(String.valueOf(cnt));
	            resultField.setText(result);
	        }
	    });
        
        
        
        frame.setVisible(true);
   }
}
