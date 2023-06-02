import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();

        if (choice < 0 || choice > 4){
            System.out.println("Invalid");
        } else {
            System.out.println(menu[choice]);
        }
    }
}
