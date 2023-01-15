import java.util.Base64;

public class Base64Crypt {

    public static String encrypt(String text) {
        byte[] encodedBytes = Base64.getEncoder().encode(text.getBytes());
        return new String(encodedBytes);
    }

    public static String decrypt(String text) {
        byte[] decodedBytes = Base64.getDecoder().decode(text.getBytes());
        return new String(decodedBytes);
    }

    public static void main(String[] args) {
        String originalText = "paranienormalni";
        String encryptedText = encrypt(originalText);
        String decryptedText = decrypt(encryptedText);

        System.out.println("Original Text: " + originalText);
        System.out.println("Encrypted Text: " + encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}
