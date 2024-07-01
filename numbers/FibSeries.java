package numbers;

public class FibSeries {

    int a = 0;
    int b = 1;

    public static void main(String[] args) {
        FibSeries fs = new FibSeries();
       // fs.fiboSeriesPrint();

        //// using recursion
        int n=10;
        for (int i = 0;i<n;i++){
            System.out.println(fiboSeriesRecursive(i)+" ");
        }
    }

    public void fiboSeriesPrint() {
        System.out.println(a + " " + "\n" + b);

        for (int i = 2; i < 10; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    public static int  fiboSeriesRecursive(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fiboSeriesRecursive(n - 1) + fiboSeriesRecursive(n - 2);
        }
    }
}
