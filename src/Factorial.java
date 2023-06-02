import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int fact = 1;
        for(int x = 1; x <= num; x++){
            fact *= x;
        }
        System.out.println(fact);

    }
}
