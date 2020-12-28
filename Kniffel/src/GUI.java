import java.awt.Color;
import java.awt.event.*;

import java.util.ArrayList;

import javax.swing.*;

public class GUI {
	public JFrame spielfeld = new JFrame();
	public boolean übergabe = false;
	public ArrayList<String> spieler = new ArrayList<String>();
	
	public GUI() {
		Start();
	}
	
	public void Start() {
		final JFrame start = new JFrame();
		start.setTitle("Start");
		start.setSize(1000, 500);
		start.setBackground(Color.YELLOW);
		
		JLabel h1 = new JLabel();
		h1.setText("Herzlich wilkommen");
		h1.setBounds(start.getWidth()/2-100, 1, 200, 10);
		
		JLabel h2 = new JLabel();
		h2.setText("Bitte geben sie von allen Mitspielern den Namen ein:");
		h2.setBounds(start.getWidth()/2-200, 30, 300, 20);
		
		
		final JTextField name1 = new JTextField();
		name1.setBounds(300, 60, 400, 20);
		
		final JTextField name2 = new JTextField();
		name2.setBounds(300, 80, 400, 20);
		
		final JTextField name3 = new JTextField();
		name3.setBounds(300, 100, 400, 20);
		
		final JTextField name4 = new JTextField();
		name4.setBounds(300, 120, 400, 20);
		
		final JTextField name5 = new JTextField();
		name5.setBounds(300, 140, 400, 20);
		
		final JTextField name6 = new JTextField();
		name6.setBounds(300, 160, 400, 20);
		
		final JTextField name7 = new JTextField();
		name7.setBounds(300, 180, 400, 20);
		
		final JTextField name8 = new JTextField();
		name8.setBounds(300, 200, 400, 20);
		
		JButton bestätigen = new JButton("Bestätigen");
		bestätigen.setBounds(300, 220, 120, 80);
		
		JButton regeln = new JButton("Regeln");
		regeln.setBounds(start.getWidth()-120, start.getHeight()-140, 100, 100);
		
		start.setLayout(null);
		start.add(h1);
		start.add(h2);
		start.add(name1);
		start.add(name2);
		start.add(name3);
		start.add(name4);
		start.add(name5);
		start.add(name6);
		start.add(name7);
		start.add(name8);
		start.add(bestätigen);
		start.add(regeln);
		start.setVisible(true);
		
		
		bestätigen.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent arg0) {
	            	spieler.add(name1.getText());
	            	spieler.add(name2.getText());
	            	spieler.add(name3.getText());
	            	spieler.add(name4.getText());
	            	spieler.add(name5.getText());
	            	spieler.add(name6.getText());
	            	spieler.add(name7.getText());
	            	spieler.add(name8.getText());
	            	System.out.println(spieler.toString());
	            	Spielfeld();
	            	start.dispose();
	            	System.out.println("Action am ende");
			 }
		});
		
		regeln.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
            				Regeln();  
                           
                           
            }          
          });
		System.out.println("Ich bin Start() am ende");
	}

	public void Regeln() {
		final JFrame regeln = new JFrame();
		regeln.setSize(1000, 500);
		regeln.setTitle("Regeln");
		
		JLabel h1 = new JLabel();
		h1.setText("Regeln");
		h1.setBounds(regeln.getWidth()/2-100, 1, 200, 20);
		
		JButton zurück = new JButton("zurück");
		zurück.setBounds(regeln.getWidth()-120, regeln.getHeight()-140, 100, 100);
		
		regeln.setLayout(null);
		regeln.add(h1);
		regeln.add(zurück);
		regeln.setVisible(true);
		
		zurück.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {  
                          
                           regeln.dispose();
            }          
          });
	}
	
	public ArrayList getSpieler() {
		Start();
		System.out.println("Vor return");
		return spieler;
		System.out.println("nach return");
	}
	
	public void Spielfeld() {
		JFrame spielfeld = new JFrame();
		spielfeld.setTitle("Spielfeld");
		spielfeld.setSize(1000, 500);
		spielfeld.setVisible(true);
	}
}