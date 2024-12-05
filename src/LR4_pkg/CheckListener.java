package LR4_pkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class CheckListener implements ActionListener {
	private JCheckBox check;
	private JTextField field;
	
	public CheckListener(JCheckBox check, JTextField field) {
		this.check = check;
		this.field = field;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(check.isSelected()) {
			field.setText("Галочка есть");
		}else {
			field.setText("Галочки нет");
		}
		
	}
}