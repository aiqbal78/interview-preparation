package abdulbari;

public class DisplayMultiplicationTable {
    private static void displayTable(int n) {
        for(int i =1; i<=10 ;i++){
            System.out.println(n +"*"+i +"="+ n*i);
        }
    }
    private static void displayTableWhile(int n){
        int i =0;
        while(i<=10){
            System.out.println(STR."\{n}*\{i}=\{n * i}");
            i++;
        }
    }
    public static void main(String[] args){
       // displayTable(8);
        displayTableWhile(10);
    }
}
