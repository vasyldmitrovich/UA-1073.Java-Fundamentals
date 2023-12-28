public class Task1 {

    public static void main(String[] args) {
        String originalText = "abc";
        int shift = 3;

        String encryptedText = encrypt(originalText, shift);
        System.out.println("Encrypted: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted: " + decryptedText);
    }

    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (Character.isLetter(currentChar)) {
                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';
                char encryptedChar = (char) ((currentChar - base + n) % 26 + base);
                result.append(encryptedChar);
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, -n);
    }
}
