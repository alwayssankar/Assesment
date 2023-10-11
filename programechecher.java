package Com.java.Assesement;



import java.util.HashSet;

public class programechecher {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        
        s = s.toLowerCase();

        
        HashSet<Character> uniqueCharacters = new HashSet<>();

       
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
           
            if (c >= 'a' && c <= 'z') {
                uniqueCharacters.add(c);
            }
        }

    
        return uniqueCharacters.size() == 26;

    }}


