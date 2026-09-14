public class valid_parentheses {
    public static void main(String[] args) {
        String s="({[])}";
           System.out.println(isValid(s) ? "yes" : "no");

     }

     

            public static boolean isValid(String s) {
        String prev;
        do {
            prev = s;
            s = s.replace("()", "")
                 .replace("{}", "")
                 .replace("[]", "");
        } while (!s.equals(prev));
        
        return s.isEmpty();


            }
        }
