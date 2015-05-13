package be.pxl.guistart;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
	private JPanel panel1;
	private JPanel panel2;
	
	public frame(){
		super("Beveiligde communicatie");
		this.setLayout(new BorderLayout(10,10));
		
		panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
		panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
		tekstLabel = new JLabel(tekst);
		tekstLabel2 = new JLabel(tekst2);
		EncryptButton = new JButton("Encrypteren");
		DecryptButton = new JButton("Decrypteren");
		
		panel2.add(tekstLabel);
		panel2.add(tekstLabel2);
		panel1.add(EncryptButton);
		panel1.add(DecryptButton);
		
		this.add(panel2, BorderLayout.NORTH);
		this.add(panel1, BorderLayout.CENTER);
		
	}
}
