package be.pxl.guiDecrypteren;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameDecrypt extends JFrame {

	private JLabel tekst = new JLabel("Selecteer een bestand: ");
	private JFileChooser fileKiezer = new JFileChooser();
	private JButton DecryptButton;
	private JPanel panel1;
	private JPanel panel2;
	
	public FrameDecrypt(){
		super("Decryptie programma");
		this.setLayout(new FlowLayout());
		
		DecryptButton = new JButton("Decrypteer");
		panel1 = new JPanel(new BorderLayout());
		panel2 = new JPanel(new BorderLayout(20, 20));
		
		panel1.add(tekst, BorderLayout.NORTH);
		panel2.add(fileKiezer, BorderLayout.NORTH);
		panel2.add(DecryptButton, BorderLayout.SOUTH);
		
		this.add(tekst);
		this.add(panel2);
		
	}
}
