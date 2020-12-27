import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI {
	public JFrame start = new JFrame();
	public JFrame regeln = new JFrame();
	
	public GUI() {
		Start();
	}
	
	public void Start() {
		start.setTitle("Start");
		start.setSize(1000, 500); 
		
		JLabel h1 = new JLabel();
		h1.setText("Herzlich wilkommen");
		h1.setBounds(start.getWidth()/2-100, 1, 200, 10);
		
		JLabel h2 = new JLabel();
		h2.setText("Bitte geben sie von allen Mitspielern den Namen ein:");
		h2.setBounds(start.getWidth()/2-200, 30, 300, 20);
		
		JButton regeln = new JButton("Regeln");
		regeln.setBounds(start.getWidth()/2-100, 60, 100, 100);
		
		start.setLayout(null);
		start.add(h1);
		start.add(h2);
		start.add(regeln);
		start.setVisible(true);
		
		
		regeln.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                           Regeln();  
                           start.setVisible(false);
            }          
          });
	}

	public void Regeln() {
		regeln.setSize(1000, 500);
		regeln.setTitle("Regeln");
		
		JLabel h1 = new JLabel();
		h1.setText("Regeln");
		h1.setBounds(regeln.getWidth()/2-100, 1, 200, 10);
		
		JButton zurück = new JButton("zurück");
		zurück.setBounds(regeln.getWidth()/2-100, 60, 100, 100);
		
		regeln.setLayout(null);
		regeln.add(h1);
		regeln.add(zurück);
		regeln.setVisible(true);
		
		zurück.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {  
                           start.setVisible(true);
                           regeln.dispose();
            }          
          });
	} 
}