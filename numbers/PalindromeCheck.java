package numbers;

import java.util.Scanner;

public class PalindromeCheck {
       //// checks palindrome i.e 121 reverses to 121
       /// n = 121
       /// use while loop to segment digit

   // int n = 121;
    int temp=0;
    int rev_num = 0;
    int rem;

    public static void main(String[] args){

        PalindromeCheck pc = new PalindromeCheck();
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = input.nextInt();
        pc.test(n);


    }

    public  void test(int n){
        temp = n;
        while(temp !=0){
            rem = temp%10;
            rev_num = (rev_num*10)+rem;
            temp=temp/10;
        }
        if(rev_num==n){
            System.out.println(n + " is a Palindrome");
        } else {
            System.out.println(n+ " is not a Palindrome");
        }
    }
}
