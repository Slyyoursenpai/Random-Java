package arrays;

public class HighestElement {
    int[] arr = {1, 2, 3, 4, 5, 6, 9, 81};
    int max = arr[0];
    int secondMax = 0;

    public static void main(String[] args) {
        HighestElement max = new HighestElement();
        max.highestElement();
        max.secondHighestElement();
    }

    public void highestElement() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Highest Element is " + max);
    }

    public void secondHighestElement() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("2nd Highest Element is " + secondMax);
    }
}
