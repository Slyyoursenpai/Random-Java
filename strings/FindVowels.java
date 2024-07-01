package strings;

import javax.print.attribute.standard.Fidelity;

public class FindVowels {
    String str = "Akash";
    int count = 0;
    public static void main(String[] args) {
        FindVowels vowels = new FindVowels();
        vowels.countVowels();
    }

    public void countVowels(){
     str = str.toLowerCase();
     for (int i = 0; i<str.length();i++){
         char ch = str.charAt(i);
         if (ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
             count++;
         }
        }
        System.out.println("Number of vowels in String: "+count);
    }
}
