package be.pxl;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.DigestInputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.omg.CORBA.portable.InputStream;

public class FrameEncrypt extends JFrame implements ActionListener {
	private JLabel tekst = new JLabel("Selecteer een bestand: ");
	private JFileChooser fileKiezer = new JFileChooser();
	private JButton EncryptButton;
	private JPanel panel1;
	private JPanel panel2;
	
	public FrameEncrypt(){
		super("Encryptie programma");
		this.setLayout(new FlowLayout());
		
		EncryptButton = new JButton("Encrypteer");
		EncryptButton.addActionListener(this);
		panel1 = new JPanel(new BorderLayout());
		panel2 = new JPanel(new BorderLayout(20, 20));
		
		panel1.add(tekst, BorderLayout.NORTH);
		panel2.add(fileKiezer, BorderLayout.NORTH);
		panel2.add(EncryptButton, BorderLayout.SOUTH);
		
		this.add(tekst);
		this.add(panel2);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
			
		
		String geselecteerdeBestand = fileKiezer.getSelectedFile().getAbsolutePath();
		
		
		System.out.println(geselecteerdeBestand);
		FileEncryption encryption = null;
		try {
			encryption = new FileEncryption();
			//AES key aanmaken
			encryption.makeKey();
			System.out.println(FileEncryption.aesKey);
		} catch (GeneralSecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//RSA key genereren 
		RSA alice = new RSA("A");
		RSA bob = new RSA("B");
		
		alice.generateKey();
		bob.generateKey();
		
		//file encrypteren
		
		try {
			encryption.encrypt(new File(geselecteerdeBestand), new File("Keys/File1.txt"));
		} catch (InvalidKeyException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//symmetric key encrypteren met public key Bob
		
		
		File publicKeyFile = new File(bob.PUBLIC_KEY_FILE);
		String text = encryption.aesKey.toString();
		byte[] out = RSA.encrypt(text, bob.key.getPublic());
		System.out.println("AES: " + out);
		File file = new File("Keys/File2.txt");
		
 
		try (FileOutputStream fop = new FileOutputStream(file)) {
 
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 			fop.write(out);
			fop.flush();
			fop.close();
 
			System.out.println("Done");
 
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		//hash maken van oorspronkelijke boodschap
		
		
	
		
		
	}
}

