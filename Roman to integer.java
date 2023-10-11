import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanToIntegerMap = new HashMap<>();
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanToIntegerMap.get(s.charAt(i));
            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }
            prevValue = currentValue;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        
        int result = romanToInt(romanNumeral);
        System.out.println("Equivalent integer: " + result);
    }
}
