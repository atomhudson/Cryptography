package CeaserCipherImplementation;

import java.util.Scanner;

public class Ceaser_Cipher {

    static String CC_Encryption_Default(String s) {
        int shift = 3;
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                char encrypt = (char) ('A' + (ch - 'A' + shift) % 26);
                sb.append(encrypt);
            } else if (Character.isLowerCase(ch)) {
                char encrypt = (char) ('a' + (ch - 'a' + shift) % 26);
                sb.append(encrypt);
            } else {
                sb.append(ch); // Non-alphabetic characters remain unchanged
            }
        }
        return sb.toString();
    }

    // Custom Shift Encryption
    static String CC_Encryption_Custom_Shift(String s, int shift) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                char encrypt = (char) ('A' + (ch - 'A' + shift) % 26);
                sb.append(encrypt);
            } else if (Character.isLowerCase(ch)) {
                char encrypt = (char) ('a' + (ch - 'a' + shift) % 26);
                sb.append(encrypt);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    // Custom Shift Decryption
    static String CC_Decryption_Custom_Shift(String s, int shift) {
        // Decrypt by reversing the shift
        return CC_Encryption_Custom_Shift(s, 26 - (shift % 26));
    }

    // Default Decryption with shift = 3
    static String CC_Decryption_Default(String s) {
        // Reverse of the default shift (3)
        return CC_Encryption_Custom_Shift(s, 26 - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input plaintext
        System.out.print("Enter the PlainText: ");
        String str = sc.nextLine();

        // Default encryption and decryption
        String encryptedDefault = CC_Encryption_Default(str);
        System.out.println("Encrypted Text Using Default Shift of Caesar Cipher: " + encryptedDefault);
        System.out.println("Decrypted Text Using Default Shift of Caesar Cipher: " + CC_Decryption_Default(encryptedDefault));

        // Custom shift encryption and decryption
        System.out.print("Enter the Custom Shift: ");
        int customShift = sc.nextInt();
        String encryptedCustom = CC_Encryption_Custom_Shift(str, customShift);
        System.out.println("Encrypted Text Using Custom Shift (" + customShift + "): " + encryptedCustom);
        System.out.println("Decrypted Text Using Custom Shift (" + customShift + "): " + CC_Decryption_Custom_Shift(encryptedCustom, customShift));

        sc.close();
    }
}
