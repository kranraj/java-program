package basicjava;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = findSumOfDigits(number);
        while (sum >= 10) {
            sum = findSumOfDigits(sum);
        }
        
        System.out.println("Sum of digits until single digit: " + sum);
    }
    
    public static int findSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
	}

}
