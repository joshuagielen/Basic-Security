package be.pxl.project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tekst = "Wat wenst u te doen?";
	private String tekst2 = "klik op u keuze";
	private JLabel tekstLabel;
	private JLabel tekstLabel2;
	private JButton EncryptButton;
	private JButton DecryptButton;
	private JButton steganografieButton;
	private JPanel panel1;
	private JPanel panel2;
	
	public frame(){
		super("Beveiligde communicatie");
		this.setLayout(new BorderLayout(10,10));
		
		panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
		panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
		tekstLabel = new JLabel(tekst);
		tekstLabel2 = new JLabel(tekst2);
		EncryptButton = new JButton("Encrypteren");
		DecryptButton = new JButton("Decrypteren");
		steganografieButton = new JButton("Steganografie");
		
		panel2.add(tekstLabel);
		panel2.add(tekstLabel2);
		panel1.add(EncryptButton);
		panel1.add(DecryptButton);
		panel1.add(steganografieButton);
		
		this.add(panel2, BorderLayout.NORTH);
		this.add(panel1, BorderLayout.CENTER);
		
		steganografieButton.addActionListener(new SteganografieHandler());
		
	}
	
	private class SteganografieHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
