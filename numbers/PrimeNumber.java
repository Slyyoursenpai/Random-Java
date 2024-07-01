package numbers;

public class PrimeNumber {
    int i;
    int n =4;
    int flag=0;
    public static void main(String[] args) {
        PrimeNumber prime = new PrimeNumber();
        prime.checkPrime();
        //////////////////////////
        boolean checker = prime.isPrime();
        if (checker){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }

    public void checkPrime(){
        int m = n/2;
        if(n==0||n==1){
            System.out.println("Not prime");
        }else{
            for (i=2;i<=m;i++){
                if (n%i==0){
                    System.out.println("Not Prime");
                    flag=1;
                    break;
                }
            }
        } if (flag==0){
            System.out.println("Prime");
        }
    }

    public boolean isPrime() {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
