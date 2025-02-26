import java.util.*;

public class lab2 {
        
    // Task 1: Multiply without *
    public static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            result += a;
        }
        return (b < 0) ? -result : result;
    }
    
    // Task 2: Count numbers and find average
    public static void countNumbers() {
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0, num;
        while ((num = scanner.nextInt()) != 0) {
            sum += num;
            count++;
        }
        System.out.println("Total numbers: " + count);
        System.out.println("Average: " + (count == 0 ? 0 : (double) sum / count));
    }
    
    // Task 3: Find maximum number
    public static void findMax() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE, num;
        while ((num = scanner.nextInt()) != 0) {
            if (num > max) max = num;
        }
        System.out.println("Max number: " + max);
    }
    
    // Task 4: Sum of first N odd numbers
    public static int sumOddNumbers(int n) {
        int sum = 0, current = 1;
        for (int i = 0; i < n; i++, current += 2) {
            sum += current;
        }
        return sum;
    }
    
    // Task 5: Sum of odd numbers until 0
    public static void sumOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, num;
        while ((num = scanner.nextInt()) != 0) {
            if (num % 2 != 0) sum += num;
        }
        System.out.println("Sum of odd numbers: " + sum);
    }
    
    // Task 6: Find maximum among three numbers
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    
    // Task 7: Count vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) count++;
        }
        return count;
    }
    
    // Task 8: Filter words with more than 4 vowels
    public static List<String> filterVowelWords(String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (countVowels(word) > 4) result.add(word);
        }
        return result;
    }
    
    // Task 9: Check if text1 contains text2
    public static String containsText(String text1, String text2) {
        return text1.contains(text2) ? "YES" : "NO";
    }
    
    // Task 10: Check if a string is a palindrome
    public static String isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed) ? "YES" : "NO";
    }
    
    // Task 11: Reverse number excluding a digit
    public static int reverseExcluding(int num, int exclude) {
        int result = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit != exclude) result = result * 10 + digit;
            num /= 10;
        }
        return result;
    }
    
    // Task 12: Length of the longest word in a string
    public static int longestWordLength(String str) {
        String[] words = str.split(" ");
        int maxLength = 0;
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }
        return maxLength;
    }
    
    // Task 13: Find non-common elements in two arrays
    public static Set<Integer> uniqueElements(int[] A, int[] B) {
        Set<Integer> setA = new HashSet<>(), setB = new HashSet<>();
        for (int num : A) setA.add(num);
        for (int num : B) setB.add(num);
        Set<Integer> result = new HashSet<>(setA);
        result.addAll(setB);
        result.removeAll(setA.retainAll(setB) ? setA : new HashSet<>());
        return result;
    }
}
