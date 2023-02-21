public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello World";
        int count;

        // Convert the string to lowercase to ignore case
        str = str.toLowerCase();

        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Loop through each character in the array
        for (int i = 0; i < charArray.length; i++) {
            count = 1;

            // Check if the character is already counted
            if (charArray[i] == '\0') {
                continue;
            }

            // Loop through the remaining characters in the array
            for (int j = i + 1; j < charArray.length; j++) {
                // If a duplicate is found, increment the count and set the duplicate to null
                if (charArray[i] == charArray[j]) {
                    count++;
                    charArray[j] = '\0';
                }
            }

            // Print the duplicate character and its count
            if (count > 1) {
                System.out.println(charArray[i] + " - " + count);
            }
        }
    }
}
