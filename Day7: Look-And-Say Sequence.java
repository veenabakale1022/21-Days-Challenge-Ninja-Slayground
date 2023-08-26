public class Solution {
	 public static String generateNextTerm(String currentTerm) {
        StringBuilder nextTerm = new StringBuilder();
        
        int count = 1;
        char currentDigit = currentTerm.charAt(0);
        
        for (int i = 1; i < currentTerm.length(); i++) {
            if (currentTerm.charAt(i) == currentDigit) {
                count++;
            } else {
                nextTerm.append(count).append(currentDigit);
                count = 1;
                currentDigit = currentTerm.charAt(i);
            }
        }
        
        nextTerm.append(count).append(currentDigit);
        return nextTerm.toString();
    }

	public static String lookAndSaySequence(int n) {
		// Write your code here.
		if (n <= 0) {
            return "";
        }
        
        String term = "1";
        for (int i = 1; i < n; i++) {
            term = generateNextTerm(term);
        }
        
        return term;
	}
}
