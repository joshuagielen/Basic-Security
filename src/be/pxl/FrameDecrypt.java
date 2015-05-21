package be.pxl;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameDecrypt extends JFrame implements ActionListener {

	private JLabel tekst = new JLabel("Selecteer een bestand: ");
	private JFileChooser fileKiezer = new JFileChooser();
	private JButton DecryptButton;
	private JPanel panel1;
	private JPanel panel2;
	private File[] files;
	
	public FrameDecrypt(){
		super("Decryptie programma");
		this.setLayout(new FlowLayout());
		
		//enable multiple files select
		fileKiezer.setMultiSelectionEnabled(true);
		files = fileKiezer.getSelectedFiles();
		fileKiezer.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		DecryptButton = new JButton("Decrypteer");
		DecryptButton.addActionListener(this);
		panel1 = new JPanel(new BorderLayout());
		panel2 = new JPanel(new BorderLayout(20, 20));
		
		panel1.add(tekst, BorderLayout.NORTH);
		panel2.add(fileKiezer, BorderLayout.NORTH);
		panel2.add(DecryptButton, BorderLayout.SOUTH);
		
		this.add(tekst);
		this.add(panel2);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		System.out.println(files);
		
		
		
		
	}
}
