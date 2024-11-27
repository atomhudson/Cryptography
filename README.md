# What is Cryptography?

**Cryptography is the science of encrypting and decrypting information to prevent unauthorized access. The decryption process should be known to both the sender and the receiver.**

![Encryption1](https://github.com/user-attachments/assets/052f5c87-e0d2-4df8-b0da-e9c48688056b)

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

![symmetric-encryption](https://github.com/user-attachments/assets/5a3c35a0-87e5-4104-930c-f13604cd6785)

### Types of encryptions in Symmetric Encryption.
1. **Stream Ciphers**
  - **Encrypt information one bit/byte at time.**
  - **Quicker format of encryption.**
  - **Data is converted to binary digits and encrypted sequentially.**
  - **Popular algorithms - RC4, Salsa20.**

![steamcipher1](https://github.com/user-attachments/assets/e441fe6e-4496-4bef-ab37-9a06a026c704)
![steamcipher2](https://github.com/user-attachments/assets/5067b3f2-601a-465e-aff7-bcb441cd2ae6)

2. **Block Ciphers**
  - **Information broken down to chunks/blocks of fixed size.**
  - **Size of block depends on key size.**
  - **The chunks are encrypted and later chained together.**
  - **Popular algorithms - AES, DES, 3DES.**

![Blockcipher1](https://github.com/user-attachments/assets/8277bfe2-daea-4e78-af72-8ac6c4c4e047)
![blockcipher2](https://github.com/user-attachments/assets/2e3b5611-f37c-4f42-b52e-976dda0c98df)
![blockcipher3](https://github.com/user-attachments/assets/fdcb5105-5b5b-4a82-962f-82acad832a1b)

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

![Asymmetric-Encryption](https://github.com/user-attachments/assets/9e2692e8-7ebc-43cb-bde5-c6b85c5ab4db)

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
  ![download](https://github.com/user-attachments/assets/97be72ff-b802-47f4-9887-7d52b46d2231)

### 2. The Enigma Machine
- Developed and used by Nazi German armies in the World Wars.
- Used to protect confidential information during transit.
- Electromechanical signals generate random alphabets.
  ![enigma machine1](https://github.com/user-attachments/assets/7056178d-19ed-49a5-ba32-a994483c6b31)