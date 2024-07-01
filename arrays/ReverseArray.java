package arrays;

public class ReverseArray {
    int [] arr = {10,14,21,34,36,2};
    int temp=0;
    public static void main(String[] args) {

        ReverseArray reverse = new ReverseArray();
        reverse.reverseArray();
    }

    public void reverseArray(){
       for (int i = 0;i < arr.length/2; i++){
           int k = i;
           temp = arr[k];
           arr[k] = arr[arr.length-(i+1)];
           arr[arr.length-(i+1)] = temp;
       }
       for (int i =0; i< arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
