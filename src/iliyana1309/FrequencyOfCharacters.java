package iliyana1309;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println(frequencyOfChars(input));
    }

    public static String frequencyOfChars(String str) {
        StringBuilder result = new StringBuilder(); // To store the final output
        int[] freq = new int[256]; // ASCII range to count frequency of each character

        // Count frequency of each character
        for (char each : str.toCharArray()) {
            freq[each]++;
        }

        // Append characters and their frequency to the result
        for (char each : str.toCharArray()) {
            if (freq[each] != 0) {
                result.append(each).append(freq[each]);
                freq[each] = 0; // To avoid appending the same character again
            }
        }
        return result.toString();
    }
}
