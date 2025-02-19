package abdulbari;

public class FibonacciSeries {

    private static int fib(int n){
        int t0=0,t1=1,sum=0;
        if(n<=1){
            return n;
        }
        for(int i =2 ; i<=n; i++){
            sum = t0+t1;
            t0 = t1;
            t1 = sum;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(fib(7));
    }
}
