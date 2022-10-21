import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Enc {
    // DES - Data Encryption Standard
    // AES - Advanced Encryption Standard
    public static void main(String[] args) {
        try {
            // make obj to gen key
            KeyGenerator kg = KeyGenerator.getInstance("DES");

            // generate key
            SecretKey myKey = kg.generateKey();

            // init cipher obj for encription
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, myKey);
            byte[] text = "RT89Loc5".getBytes();
            System.out.println("Text in bytes: " + text);
            System.out.println("Text: " + new String(text));
            byte[] encText = cipher.doFinal(text);
            System.out.println("encText in bytes: " + encText);
            System.out.println("encText: " + new String(encText));

            // decryption
            cipher.init(cipher.DECRYPT_MODE, myKey);
            byte[] decText = cipher.doFinal(encText);
            System.out.println("decText in bytes: " + decText);
            System.out.println("decText: " + new String(decText));
        } catch (Exception e) {

        }
    }
}