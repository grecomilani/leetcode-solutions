import static java.lang.System.*;

/**
 *
 * Exercise Number: 9
 * Exercise Name: PalindromeNumber
 * Date: 05/12/2023
 * Time: 22:12
 *
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        String str = String.valueOf(x);
        String strReversed = new StringBuilder(str).reverse().toString();

        return str.equals(strReversed);

    }

    public boolean isPalindromeWithoutString(int x) {

        if(x < 0){
            return false;
        }

        int original = x;
        int reversed = 0;

        while(x != 0){
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }


    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Boolean test = palindromeNumber.isPalindrome(212);
        Boolean test1 = palindromeNumber.isPalindromeWithoutString(212);
        out.println(test);
        out.println(test1);
    }

}
