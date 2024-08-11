import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome");
        int number=scanner.nextInt();
        boolean isPalindrome=Palindrome(number);
        System.out.println("Is the number"+number+"a palindrome? "+ isPalindrome);
        scanner.close();
    }

    public static Boolean Palindrome(int a) {
        if (a < 0) {
            return false;
        }
            int temp=a;
            int reverse=0;
            while (temp > 0) {
                int last = temp % 10;
                reverse = reverse * 10 + last;
                temp = temp / 10;

            }
        return reverse==a;
    }
    }
