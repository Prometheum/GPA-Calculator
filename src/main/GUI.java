package main;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;


public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField scale43 = new JTextField(), cale4 = new JTextField(),unitsBy3 = new JTextField();
	JLabel txt4_3 = new JLabel(),lblNewLabel1 = new JLabel(),lblNewLabel2 = new JLabel(), txt_Units = new JLabel(""), txt4 = new JLabel("");
	JTextPane unitsInput = new JTextPane(), gradesInput = new JTextPane();
	public GUI() {
		this.setTitle("GPA");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(234, 206));
		setAlwaysOnTop(true);
		getContentPane().setLayout(null);
		DecimalFormat f = new DecimalFormat("##.00");
		setLocationRelativeTo(null);
		setSize(260, 800);
		setVisible(true);
		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(260, 800);
		panel.setBackground(SystemColor.activeCaptionBorder);
		panel.setLayout(null);
		getContentPane().add(panel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 260, 800);
		panel.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaptionBorder);
		tabbedPane.addTab("GPA", null, panel_2, null);
		txt4.setLocation(137, 124);
		txt4.setSize(69, 16);
		panel_2.add(txt4);
		txt4_3.setLocation(137, 58);
		txt4_3.setSize(69, 20);
		panel_2.add(txt4_3);
		panel_2.setLayout(null);
		cale4.setLocation(12, 120);
		cale4.setSize(114, 20);
		panel_2.add(cale4);
		cale4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txt4.setText(""+f.format(Double.parseDouble(cale4.getText())*3));
			}
		});
		cale4.setText("0");
		
		unitsInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_TAB) {
                   unitsInput.transferFocusBackward();
                   try {
					gradesInput.getDocument().insertString(gradesInput.getDocument().getLength(),"\n",null);
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                   e.consume();
                }
            }
        });

		gradesInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_TAB) {
                    if (e.getModifiersEx() > 0) {
                    	gradesInput.transferFocusBackward();
                    } else {
                    	gradesInput.transferFocus();
                    	  try {
                    		  if (unitsInput.getDocument().getLength() > 0)
                    		  unitsInput.getDocument().insertString(unitsInput.getDocument().getLength(),"\n",null);
          				} catch (BadLocationException e1) {
          					// TODO Auto-generated catch block
          					e1.printStackTrace();
          				}
                    }
                    e.consume();
                }
            }
        });
		
		cale4.setColumns(10);
		unitsBy3.setLocation(12, 188);
		unitsBy3.setSize(114, 20);
		panel_2.add(unitsBy3);
		unitsBy3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txt_Units.setText(""+f.format(Double.parseDouble(unitsBy3.getText())/3));
			}
		});
		unitsBy3.setText("0");
		
		
		
		unitsBy3.setColumns(10);
		txt_Units.setLocation(137, 192);
		txt_Units.setSize(69, 16);
		panel_2.add(txt_Units);
		
		JLabel lblNewLabel_1 = new JLabel("Units Taken Divided By 3");
		lblNewLabel_1.setLocation(12, 160);
		lblNewLabel_1.setSize(138, 16);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblGpaMultipliedBy = new JLabel("GPA Multiplied by 3 - 4.0 Scale");
		lblGpaMultipliedBy.setLocation(12, 94);
		lblGpaMultipliedBy.setSize(169, 16);
		panel_2.add(lblGpaMultipliedBy);
		scale43.setLocation(12, 58);
		scale43.setSize(114, 20);
		panel_2.add(scale43);
		scale43.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				txt4_3.setText(""+f.format(Double.parseDouble(scale43.getText())*2.79));
			}
		});
		scale43.setText("0");
		scale43.setColumns(10);
		
		JLabel lblGpaMultipliedBy_1 = new JLabel("GPA Multiplied by 2.79 - 4.3 Scale");
		lblGpaMultipliedBy_1.setLocation(12, 22);
		lblGpaMultipliedBy_1.setSize(186, 16);
		panel_2.add(lblGpaMultipliedBy_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Calculation", null, panel_1, null);
		panel_1.setBackground(SystemColor.activeCaptionBorder);
		panel_1.setLayout(null);
		unitsInput.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
	
		unitsInput.setBounds(99, 28, 55, 643);
		panel_1.add(unitsInput);
		gradesInput.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
	
		gradesInput.setBounds(22, 28, 55, 643);
		panel_1.add(gradesInput);
		
		JLabel lblGpa = new JLabel("Grade");
		lblGpa.setBounds(22, 0, 55, 16);
		panel_1.add(lblGpa);
		
		JLabel lblUnits = new JLabel("Units");
		lblUnits.setBounds(99, 682, 55, 16);
		panel_1.add(lblUnits);
		
		JLabel lblNewLabel_2 = new JLabel("GPA");
		lblNewLabel_2.setBounds(22, 682, 55, 16);
		panel_1.add(lblNewLabel_2);
		
		JLabel totalGPALabel = new JLabel("");
		totalGPALabel.setBounds(51, 682, 38, 16);
		panel_1.add(totalGPALabel);
		
		JLabel lblUnits_1 = new JLabel("Units");
		lblUnits_1.setBounds(99, 0, 45, 16);
		panel_1.add(lblUnits_1);
		
		JLabel totalUnitsLabel = new JLabel("");
		totalUnitsLabel.setBounds(134, 682, 85, 16);
		panel_1.add(totalUnitsLabel);
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(10, 700, 98, 26);
		panel_1.add(btnCalculate);
		
		JButton button = new JButton("Clear");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unitsInput.setText("");
				gradesInput.setText("");
			}
		});
		button.setBounds(123, 702, 98, 26);
		panel_1.add(button);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				totalUnitsLabel.setText("");
				totalGPALabel.setText("");	
				String[] grades = gradesInput.getText().split("\\r?\\n");
				String[] units =unitsInput.getText().split("\\r?\\n");
				double[] gpaScores = new double[grades.length] ;
				double totalUnits=0,totalScore=0,totalGPA;
				double points =0;
				
				for (int i=0; i < grades.length;i++) {
					
					if (grades[i].toLowerCase().equals("a+")) {
						grades[i] ="95";
					}
					if (grades[i].toLowerCase().equals("a")) {
						grades[i] ="87";
					}
					if (grades[i].toLowerCase().equals("a-")) {
						grades[i] ="80";
					}
					if (grades[i].toLowerCase().equals("b+")) {
						grades[i] ="78";
					}
					if (grades[i].toLowerCase().equals("b")) {
						grades[i] ="75";
					}
					if (grades[i].toLowerCase().equals("b-")) {
						grades[i] ="70";
					}
					if (grades[i].toLowerCase().equals("c+")) {
						grades[i] ="69";
					}
					if (grades[i].toLowerCase().equals("c")) {
						grades[i] ="65";
					}
					if (grades[i].toLowerCase().equals("c-")) {
						grades[i] ="60";
					}
					if (grades[i].toLowerCase().equals("d+")) {
						grades[i] ="58";
					}
					if (grades[i].toLowerCase().equals("d")) {
						grades[i] ="55";
					}
					if (grades[i].toLowerCase().equals("d-")) {
						grades[i] ="51";
					}
					
					gpaScores[i]=Double.parseDouble(grades[i])*Double.parseDouble(units[i]);	
						
					
				}
				for (String s : units) {
					double currentUnit = Double.parseDouble(s);
					totalUnits +=currentUnit;				
				}
				
				
				for (int n=0 ; n < grades.length ; n++) {
					double d = Double.parseDouble(units[n]);
					double g = Double.parseDouble(grades[n]);
					points += g*d;
				}
				totalUnitsLabel.setText(""+totalUnits + " /3 = " +totalUnits/3);
				double gpa =points / totalUnits;
				if (gpa >=95) {
					gpa =12;
				}
				else if (gpa >=87) {
					gpa = 11;
				}
				else if (gpa >=80) {
					gpa =10;
				}
				else if (gpa >=78) {
					gpa =9;
				}
				else if (gpa >=75) {
					gpa =8;
				}
				else if (gpa>=70) {
					gpa = 7;
				}
				else if (gpa >=68) {
					gpa = 6;
				}
				else if (gpa >=65) {
					gpa =5;
				}
				else if (gpa >=60) {
					gpa =4;
				}
				else if (gpa >=58) {
					gpa =3;
				}
				else if (gpa >=55) {
					gpa =2;
				}
				else if (gpa >=50) {
					gpa =1;
				}
				
				totalGPALabel.setText(""+""+f.format(gpa));	
			}
		});
		}
}
