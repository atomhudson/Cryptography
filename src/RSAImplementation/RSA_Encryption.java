package RSAImplementation;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class RSA_Encryption {

    public static void main(String[] args) {
        try {
            // Step 1: Generate RSA Key Pair
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
            generator.initialize(1024); // Use 512 bits for simplicity
            KeyPair keyPair = generator.generateKeyPair();
            PublicKey publicKey = keyPair.getPublic();
            PrivateKey privateKey = keyPair.getPrivate();

            // Display the keys
            System.out.println("Public Key: " + publicKey);
            System.out.println("Private Key: " + privateKey);

            // Step 2: Define plaintext
            String plaintext = "Hello World, RSA Encryption";
            System.out.println("Plaintext: " + plaintext);

            // Step 3: Encrypt plaintext using the public key
            Cipher encryptCipher = Cipher.getInstance("RSA");
            encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] encryptedBytes = encryptCipher.doFinal(plaintext.getBytes());

            // Convert encrypted bytes to Base64 for readability
            String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);
            System.out.println("CipherText / Encrypted: " + encryptedText);

            // Step 4: Decrypt ciphertext using the private key
            Cipher decryptCipher = Cipher.getInstance("RSA");
            decryptCipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] decryptedBytes = decryptCipher.doFinal(Base64.getDecoder().decode(encryptedText));
            String decryptedText = new String(decryptedBytes);

            // Display the decrypted text
            System.out.println("Decrypted Text: " + decryptedText);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
