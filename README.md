# What is Cryptography?

**Cryptography is the science of encrypting and decrypting information to prevent unauthorized access. The decryption process should be known to both the sender and the receiver.**

![Encryption1](https://github.com/user-attachments/assets/e6c66f85-5b82-4a5a-9262-dcf0d29115cf)

---

## Encryption 

**Transforming normal, readable text into an unreadable format to secure it.**

```
"Hello" --> "M2#5K"
```

---

## Decryption 

**Reversing the encryption process to retrieve the original message.**

```
"M2#5K" --> "Hello"
```

---

## Ciphers & Ciphertext

1. **Cipher**: The tool or method used to encrypt/decrypt data.  
2. **Ciphertext**: The encrypted data produced by applying a cipher to plaintext.  

```
'plaintext' --> KEY [Encryption Algorithm] --> 'ciphertext'
```

---

# Applications of Cryptography

1. **SSL / TLS Encryption**  
2. **Digital Signature**  
3. **Safe Online Banking**  
4. **Secure Chatting Services**  
5. **Encrypted Emails**  
6. **Cryptocurrency**  

---

# Categories of Cryptography

1. **Symmetric Encryption**  
2. **Asymmetric Encryption**  
3. **Hashing**  

---

## Symmetric Encryption

- A single key is used for both encryption and decryption of data.
- It is less secure than asymmetric encryption but relatively faster.
- Both the sender and the receiver must possess the secret key.
- Symmetric encryption primarily uses two types of ciphers:
  1. **Block Cipher**: Plaintext is broken into blocks and encrypted in a chained manner.
  2. **Stream Cipher**: Plaintext is encrypted one bit at a time.

![symmetric-encryption](https://github.com/user-attachments/assets/11583cc6-9bfe-4e4d-97fa-c1cf36eb4f58)

### Examples of Symmetric Encryption:
- **AES 256 (Advanced Encryption Standard)**  
- **DES (Data Encryption Standard)**  
- **3DES (Triple DES)**  
- **Blowfish (64-bit block cipher)**  

---

## Asymmetric Encryption
- Public keys are used for encryption and private keys are used for decryption of information.
### Types of Keys in Asymmetric Encryption

1. **Public Keys**:
  - A public key is available to everyone and is used to encrypt data.
  - It can be shared openly without compromising security.
  - Example: A sender encrypts a message using the recipient's public key.

2. **Private Keys**:
  - A private key is kept secret and is used to decrypt data encrypted with the corresponding public key.
  - It must be securely stored and never shared.
  - Example: The recipient decrypts the message using their private key.

![Asymmetric-Encryption](https://github.com/user-attachments/assets/43bf90b3-727d-4749-b6a1-3d3539e67844)

### Examples of Asymmetric Encryption
- **RSA Encryption (Rives, Shamir, Adleman) Encryption.**
  - Based on Asymmetric algorithm approach
  - Most valuable when encrypting data in transit 
  - Used with VPN services, email transfer, messaging applications etc.

## Hashing
  - Scrambling data beyond recognition.
  - Output is called Hash value, and has a fixed size. 
  - Generally not reversible. 
  - MyPassword123 becomes something like i13@f_sd21$.

  ``'plaintext password' + hash function ---> 'hash value of the password'.``
  - This method does not allow even to administrator to see your password.
- ***How does it work?***
  - You sign up with your password.
  - The hashed value of the password is stored in the database.
  - When you try to log in, you enter your password.
  - The system generates the hashed value of the entered password and compares it with the hashed value stored in the database.

## Historical Significance of Cryptography
### 1. Caesar Cipher
  - Julius Caesar used a substitution cipher, appropriately named Caesar cipher today.
  - Alphabets are moved a by a certain number.
  - If the shift is 1, A becomes B, B becomes C and so on. 
![download](https://github.com/user-attachments/assets/96d4d2de-cfa5-4630-b783-1d2232813008)

### 2. The Enigma Machine
  - Developed and used by Nazi German armies in the World Wars.
  - Used to protect confidential information during transit.
  - Electromechanical signals generate random alphabets.

