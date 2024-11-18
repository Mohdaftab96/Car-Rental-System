package Model;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;


@SuppressWarnings({"rawtype", "serial"})
public class JComboBox extends javax.swing.JComboBox{
	
	@SuppressWarnings("unchecked")
	public JComboBox(String[] items, int fontSize) {
		
		super(items);
		setFont(new Font("SansSerif", Font.BOLD, fontSize));
		setBackground(Color.white);
		((JLabel) getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		
	}

}
