import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while(n > 0){
            x += n--;

        }
        System.out.println(x);



    }

}