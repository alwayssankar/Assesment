package Com.java.Assesement;


	import java.util.HashMap;

	public class RommanToInteger {
	    public static void main(String[] args) {
	        String romanNumeral = "IX"; 
	        int result = romanToInt(romanNumeral);
	        System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
	    }

	    public static int romanToInt(String s) {
	        HashMap<Character, Integer> romanMap = new HashMap<>();
	        romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        romanMap.put('L', 50);
	        romanMap.put('C', 100);
	        romanMap.put('D', 500);
	        romanMap.put('M', 1000);

	        int result = 0;
	        for (int i = 0; i < s.length(); i++) {
	            int current = romanMap.get(s.charAt(i));
	            if (i < s.length() - 1) {
	                int next = romanMap.get(s.charAt(i + 1));
	                if (current < next) {
	                    result -= current;
	                } else {
	                    result += current;
	                }
	            } else {
	                result += current;
	            }
	        }

	        return result;
	    }
	}



