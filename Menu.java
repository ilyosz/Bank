import java.util.Scanner;

public class Menu {
    public int MainMenu(){
        System.out.println("select number from 1 to 3");
        System.out.println("1-set information");
        System.out.println("2- Get information");
        System.out.println("3-adding and getting money");
        Scanner scanner= new Scanner(System.in);
        return scanner.nextInt();

    }
}
