// Base for all Decryption / Encryption Techniques

public interface ICrypto{
    public String encrypt(String message);
    public String decrypt(String message);
}