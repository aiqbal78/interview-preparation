package abdulbari;

public class FindSumOfNNumbers {
    private static int findSum(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum =sum+i;
        }
        return sum;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println("sum of number "+n+" :"+findSum(n));
    }
}
