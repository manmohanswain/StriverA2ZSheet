package maths;

public class Count_digits_in_a_number {
    public static void main(String[] args) {
        int number = 12345; // Example number
        int count = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + count);
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 1; // Special case for 0, which has 1 digit
        }

        int count = 0;
        while (num != 0) {
            num /= 10; // Remove the last digit
            count++; // Increment the count
        }
        return count;
    }
}
