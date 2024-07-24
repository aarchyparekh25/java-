
    public class vigenere {

        public static String encrypt(String str1, String str3) {
            StringBuilder cipher = new StringBuilder();
            int keyLength = str3.length();
            int index = 0;
    
            for (char ch : str1.toCharArray()) {
                if (Character.isLetter(ch)) {
                    char base = Character.isUpperCase(ch) ? 'A' : 'a';
                    char keyChar = Character.toUpperCase(str3.charAt(index % keyLength));
                    ch = (char) ((ch - base + (keyChar - 'A')) % 26 + base);
                    index++;
                }
    
                cipher.append(ch);
            }
    
            return cipher.toString();
        }
    
        public static void main(String[] args) {
            String str1 = "INFORMATION";
            String str3 = "NOTE";
    
            String str2 = encrypt(str1, str3);
    
            System.out.println("Plain text before encryption: " + str1);
            System.out.println("Encrypted text after encryption: " + str2);
        }
    }
    
    

