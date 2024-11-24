package RSAImplementation;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Scanner;

//Key - Generation:- https://www.devglan.com/online-tools/rsa-key-generator.

public class RSA_Encryption_Decryption_Custom_Keys {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            // Public and Private Key Strings (replace with your keys)
            String publicKeyBase64 = "<Public key>";

            String privateKeyBase64 = "<Private key>";

            // Step 1: Convert Base64 keys to PublicKey and PrivateKey objects
            PublicKey publicKey = getPublicKeyFromBase64(publicKeyBase64);

            PrivateKey privateKey = getPrivateKeyFromBase64(privateKeyBase64);

            // Step 2: Define plaintext
            System.out.printf("Plaintext: ");
            String plaintext = sc.nextLine();
            // Step 3: Encrypt with the public key
            String encryptedText = encrypt(plaintext, publicKey);
            System.out.println("Encrypted Text: " + encryptedText);

            // Step 4: Decrypt with the private key
            String decryptedText = decrypt(encryptedText, privateKey);
            System.out.println("Decrypted Text: " + decryptedText);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Function to convert Base64 public key to PublicKey object
    public static PublicKey getPublicKeyFromBase64(String base64Key) throws Exception {
        byte[] keyBytes = Base64.getDecoder().decode(base64Key);
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePublic(spec);
    }

    // Function to convert Base64 private key to PrivateKey object
    public static PrivateKey getPrivateKeyFromBase64(String base64Key) throws Exception {
        byte[] keyBytes = Base64.getDecoder().decode(base64Key);
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePrivate(spec);
    }

    // Function to encrypt plaintext using a PublicKey
    public static String encrypt(String plaintext, PublicKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // Function to decrypt ciphertext using a PrivateKey
    public static String decrypt(String ciphertext, PrivateKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(ciphertext));
        return new String(decryptedBytes);
    }
}
