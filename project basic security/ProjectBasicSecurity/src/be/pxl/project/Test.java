package be.pxl.project;
 
public class Test {
     
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
 
        AES d = new AES();
             
        System.out.println("Encrypted string:" + d.encrypt("test123"));           
        String encryptedText = d.encrypt("test123");
        System.out.println("Decrypted string:" + d.decrypt(encryptedText));         
 
    }
}