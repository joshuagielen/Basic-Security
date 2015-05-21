package be.pxl;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame implements ActionListener{

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
	
	public Frame(){
		super("Beveiligde communicatie");
		this.setLayout(new BorderLayout(10,10));
		
		panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
		panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
		tekstLabel = new JLabel(tekst);
		tekstLabel2 = new JLabel(tekst2);
		EncryptButton = new JButton("Encrypteren");
		DecryptButton = new JButton("Decrypteren");
		
		EncryptButton.addActionListener(this);
		DecryptButton.addActionListener(this);
		panel2.add(tekstLabel);
		panel2.add(tekstLabel2);
		panel1.add(EncryptButton);
		panel1.add(DecryptButton);
		
		this.add(panel2, BorderLayout.NORTH);
		this.add(panel1, BorderLayout.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 
		if(e.getSource()==EncryptButton){
			FrameEncrypt encryptframe = new FrameEncrypt();
			encryptframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			encryptframe.pack();
			encryptframe.setVisible(true);
		}else
		
		if(e.getSource()==DecryptButton){
			FrameDecrypt decryptframe = new FrameDecrypt();
			decryptframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			decryptframe.pack();
			decryptframe.setVisible(true);
			
		}
	}
}