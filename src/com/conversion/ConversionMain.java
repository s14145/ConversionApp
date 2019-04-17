package com.conversion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;

import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConversionMain {

	private JFrame frame;
	
	// First Textbox
	private JTextField textField;
	
	// Second Textbox1
	private JTextField textField_1;
	
	// Button
	private JButton btnNewButton;
	
	// Label
	private JLabel lblFromTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversionMain window = new ConversionMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConversionMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200,400, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		
		/**
		 * 
		 * MouseListener applied on TextBox - Method that makes both TextBoxes empty when user perform mouse click action on TextBox
		 * 
		 * @param void
		 */
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				textField_1.setText("");
				
			}
		});
		
		textField.setColumns(10);
		
		/**
		 * 
		 * MouseListener applied on TextBox1 - Method that makes both TextBoxes empty when user perform mouse click action on TextBox1
		 * 
		 * @param void
		 */
	    
		textField_1 = new JTextField();
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				textField_1.setText("");
				
			}
		});
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("Miles - Km");
		btnNewButton.addActionListener(new ActionListener() {
			
			/**
			 * 
			 * Checking TextBoxes are empty and perform metric conversion from/to Miles-Km
			 * 
			 * @param void
			 */
			
			public void actionPerformed(ActionEvent e) {
				
				if ((textField.getText().equals("")) && textField_1.getText().contentEquals("")) {
					JOptionPane.showMessageDialog(null,"You must enter unit (digit/s only) in one of the textfields.","DST System",JOptionPane.INFORMATION_MESSAGE);
				}else if(!textField.getText().isEmpty()) {
					double a1=Double.parseDouble(textField.getText())*1.60934;
					String value=String.format("%.2f",a1);
					textField_1.setText(value+" Km");
				}else if(!textField_1.getText().isEmpty()) {
					double a2=Double.parseDouble(textField_1.getText())*0.621372;
					String value=String.format("%.2f",a2);
					textField.setText(value+" Miles");
				}
				
			}
		});
		
		JLabel lblConvesionApplication = new JLabel("Convesion Application");
		lblConvesionApplication.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		
		JButton btnLbsKg = new JButton("Lbs / Kg");
		btnLbsKg.addActionListener(new ActionListener() {
			
			/**
			 * 
			 * Checking TextBoxes are empty and perform metric conversion from/to Lbs-Kg.
			 * 
			 * @param void
			 */
			public void actionPerformed(ActionEvent e) {
				
				if ((textField.getText().equals("")) && textField_1.getText().contentEquals("")) {
					JOptionPane.showMessageDialog(null,"You must enter unit (digit/s only) in one of the textfields.","DST System",JOptionPane.INFORMATION_MESSAGE);
				}else if(!textField.getText().isEmpty()) {
					double a1=Double.parseDouble(textField.getText())*0.453592;
					String value=String.format("%.2f",a1);
					textField_1.setText(value+" Kg");
				}else if(!textField_1.getText().isEmpty()) {
					double a2=Double.parseDouble(textField_1.getText())*2.20462;
					String value=String.format("%.2f",a2);
					textField.setText(value+" Lbs");
				}
				
			}
		});
		
		JButton btnFtMeters = new JButton("Ft / Meters");
		btnFtMeters.addActionListener(new ActionListener() {
			
			/**
			 * 
			 * Checking TextBoxes are empty and perform metric conversion from/to Ft-Meters.
			 * 
			 * @param void
			 */
			public void actionPerformed(ActionEvent e) {
				
				if ((textField.getText().equals("")) && textField_1.getText().contentEquals("")) {
					JOptionPane.showMessageDialog(null,"You must enter unit (digit/s only) in one of the textfields.","DST System",JOptionPane.INFORMATION_MESSAGE);
				}else if(!textField.getText().isEmpty()) {
					double a1=Double.parseDouble(textField.getText())*0.3048;
					String value=String.format("%.2f",a1);
					textField_1.setText(value+" Meters");
				}else if(!textField_1.getText().isEmpty()) {
					double a2=Double.parseDouble(textField_1.getText())*3.28084;
					String value=String.format("%.2f",a2);
					textField.setText(value+" Ft");
				}
				
			}
		});
		
		JButton btnInCm = new JButton("In / Cm");
		btnInCm.addActionListener(new ActionListener() {
			
			/**
			 * 
			 * Checking TextBoxes are empty and perform metric conversion from/to In-Cm.
			 * 
			 * @param void
			 */
			public void actionPerformed(ActionEvent e) {
				
				if ((textField.getText().equals("")) && textField_1.getText().contentEquals("")) {
					JOptionPane.showMessageDialog(null,"You must enter unit (digit/s only) in one of the textfields.","DST System",JOptionPane.INFORMATION_MESSAGE);
				}else if(!textField.getText().isEmpty()) {
					double a1=Double.parseDouble(textField.getText())*2.54;
					String value=String.format("%.2f",a1);
					textField_1.setText(value+" Cm");
				}else if(!textField_1.getText().isEmpty()) {
					double a2=Double.parseDouble(textField_1.getText())*0.393701;
					String value=String.format("%.2f",a2);
					textField.setText(value+" In");
				}
			}
		});
		
		JButton btnDegree = new JButton("Degree Celsius / Degree Farenheit");
		btnDegree.addActionListener(new ActionListener() {
			
			/**
			 * 
			 * Checking TextBoxes are empty and perform metric conversion from/to Degree Celcius- Degree Farenheight.
			 * 
			 * @param void
			 */
			public void actionPerformed(ActionEvent e) {
				
				if ((textField.getText().equals("")) && textField_1.getText().contentEquals("")) {
					JOptionPane.showMessageDialog(null,"You must enter unit (digit/s only) in one of the textfields.","DST System",JOptionPane.INFORMATION_MESSAGE);
				}else if(!textField.getText().isEmpty()) {
					double tVal1=Double.parseDouble(textField.getText());
					float fVal1=(float)((tVal1 * 9)/5)+32;
					textField_1.setText(String.valueOf(fVal1)+" °F");
				}else if(!textField_1.getText().isEmpty()) {
					double tVal2=Double.parseDouble(textField_1.getText());
					float fVal2=(float)((tVal2 - 32)*5)/9;
					textField.setText(String.valueOf(fVal2)+" °C");
				}
			}
		});
		
		JLabel lblEnterUnit = new JLabel("Enter Unit:");
		
		lblFromTo = new JLabel("From / To (Only Digit/s):");
		
		JLabel lblFromTo_1 = new JLabel("From / To (Only Digit/s):");
		
		
		// Applying layout that will autosize graphical control element (such as Button, Label,Textbox,etc.)
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(112)
							.addComponent(lblConvesionApplication, GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnDegree, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
										.addComponent(btnLbsKg, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
										.addComponent(btnInCm, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
										.addComponent(btnFtMeters, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
									.addGap(104)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblFromTo_1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(lblFromTo)
											.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblEnterUnit)))))
							.addGap(88)))
					.addGap(51))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblConvesionApplication, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(13)
					.addComponent(lblEnterUnit)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFromTo)
						.addComponent(btnNewButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLbsKg))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblFromTo_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnFtMeters)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnInCm)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDegree, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(32))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}