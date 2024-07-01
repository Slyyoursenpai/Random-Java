package strings;

public class PalindromeCheckString {

    String s = "madam";
    String reverse_string = "";

    public static void main(String[] args) {

        PalindromeCheckString check = new PalindromeCheckString();
        check.palindromeCheck(check.reverseString());
    }

    public String reverseString() {

        for (int i = s.length() - 1; i >= 0; i--) {

            reverse_string = reverse_string + s.charAt(i);
        }

        System.out.println(reverse_string);
        return reverse_string;
    }

    public void palindromeCheck(String string_to_check) {

        if (string_to_check.equalsIgnoreCase(s)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

    }

}