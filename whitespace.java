public class whitespace {
   

        public static String encrypt(String str1, int num) {
            StringBuilder cipherWhitespace = new StringBuilder();
    
            for (char ch : str1.toCharArray()) {
                if (Character.isLetter(ch)) {
                    char base = Character.isUpperCase(ch) ? 'A' : 'a';
                    ch = (char) ((ch - base + num) % 26 + base);
                }
    
                else if(Character.isWhitespace(ch)){
                    ch = '`';
                }
                cipherWhitespace.append(ch);
            }
    
            return cipherWhitespace.toString();
        }
    
        public static void main(String[] args) {
            String str1 = "AARCHY PAREKH";
            int num = 17;
    
            String str2 = encrypt(str1, num);
    
            System.out.println("Plain text before encryption: " +str1);
            System.out.println("encrypted text after encryption: " +str2);
    
        }
    }

