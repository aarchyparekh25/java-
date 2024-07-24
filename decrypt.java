public class decrypt {

        public static String decrypt(String str1, int num) {
            StringBuilder plain = new StringBuilder();
    
            for (char ch : str1.toCharArray()) {
                if (Character.isLetter(ch)) {
                    char base = Character.isUpperCase(ch) ? 'A' : 'a';
                    ch = (char) ((ch + base - num) % 26 + base);
                }
                plain.append(ch);
            }
    
            return plain.toString();
        }
    
        public static void main(String[] args) {
            String str1 = "RRITYP";
            int num = 17;
    
            String str2 = decrypt(str1, num);
    
            System.out.println("Plain text before decryption: " +str1);
            System.out.println("encrypted text after decryption: " +str2);
    
        }
    }

