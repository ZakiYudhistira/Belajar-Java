import java.util.Scanner;

public class FunctionTes {
    
    public static String tes(){
        Scanner sc = new Scanner(System.in);
        String boom = sc.nextLine();
        sc.close();
        return boom;
    }
    public static void main(String args[]){
        String test;
        test = tes();
        System.out.println(test);
    }
}
