package maths;

public class Check_if_a_number_is_Palindrome_or_Not {
    public static void main(String[] args) {
        int number = 12321; // Example number
        boolean isPalindrome = checkPalindrome(number);
        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(int num) {
        // Negative numbers are not palindromes
        if (num < 0) {
            return false;
        }

        int originalNum = num; // Store the original number
        int reversedNum = 0;

        while (num != 0) {
            int lastDigit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + lastDigit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit
        }

        return originalNum == reversedNum; // Check if original and reversed numbers are the same
    }
}
