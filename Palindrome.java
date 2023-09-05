// Задача 3.2
public class Palindrome {
    public static void main(String[] args){

        System.out.println(isPalindrome("wo;o@!w"));
        System.out.println(isPalindrome("wow"));
    }
    
    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }
    
}
