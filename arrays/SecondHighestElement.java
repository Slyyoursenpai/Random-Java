package arrays;

public class SecondHighestElement {

    int[] arr = {5, 3, 8, 22, 4, 11, 33};
    int first;
    int second;

    public static void main(String[] args) {
        SecondHighestElement second = new SecondHighestElement();
        second.findingSecondHighest();

    }

    public void findingSecondHighest() {
        if (arr[0] > arr[1]) {
            first = arr[0];
            second = arr[1];
        } else if (arr[0] < arr[1]) {
            second = arr[0];
            first = arr[1];

        }
      /// 5, 3, 8, 22, 4, 11, 33
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        System.out.println("Second highest element in the array " + second);

    }
}
