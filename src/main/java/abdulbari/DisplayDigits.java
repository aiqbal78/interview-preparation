package abdulbari;

public class DisplayDigits {
    int r ;
    private  void displayDigits(int n){
        while(n > 0) {
            r = n % 10;// get the last digit of a number
            System.out.println(r);
            n = n / 10;     // get the remaining number after getting last digit
        }
    }
    public static void main(String[] args){
      DisplayDigits displayDigits = new DisplayDigits();
      displayDigits.displayDigits(2459);
    }
}
