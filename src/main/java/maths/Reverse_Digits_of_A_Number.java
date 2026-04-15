package maths;

public class Reverse_Digits_of_A_Number {
    public static void main(String[] args) {
        int number = 12345; // Example number
        int reversedNumber = reverseDigits(number);
        System.out.println("Reversed number of " + number + " is: " + reversedNumber);
    }

    public static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int lastDigit = num % 10; // Get the last digit
            reversed = reversed * 10 + lastDigit; // Append the digit to the reversed number
            num  = num / 10; // Remove the last digit
        }
        return reversed;
    }
}
