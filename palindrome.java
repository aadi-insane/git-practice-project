class palindrome {
    public static void main(String[] args) {
        String word = "Racecar";
        String reversed = reverse(word);

        if (isPalindrome(word, reversed)) {
            System.out.printf("%s is a palindrome%n", word);
        } else {
            System.out.printf("%s is not a palindrome%n", word);
        }
    }

    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        return new String(chars);
    }

    public static boolean isPalindrome(String original, String reversed) {
        return original.equalsIgnoreCase(reversed);
    }
}
