import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Menu menu = new Menu();
    About about=new About();
    AddingMoney money=new AddingMoney();
    while (true) {
        int a = menu.MainMenu();
        switch (a){
            case 1:{
                System.out.println("Write Fullname:");
            String a1;
            Scanner sa=new Scanner(System.in);
            a1=sa.nextLine();
            about.setFullname(a1);
//                System.out.println(about.getFullname());
                System.out.println("your cash:");
                int a2;
                Scanner sa1=new Scanner(System.in);
                a2=sa1.nextInt();
                about.setCash(a2);
                System.out.println("you have succesfully registered");



            }
            break;
            case 2:{
                System.out.println("below your information ");
                System.out.println("your Fullname: " + about.getFullname());
                System.out.println("you have " + about.getCash() +  " dollar");

            }
            break;
            case 3:{
                int z1;
                System.out.println("select 1 to add money" + "\n" + "select 2 to get money from your balance");
                Scanner z2=new Scanner(System.in);
                z1=z2.nextInt();
                if (z1==1){
                    System.out.println("money:");
                    Scanner q=new Scanner(System.in);
                    int w=q.nextInt();
                about.setCash1(w);
                    System.out.println("money has been already added check it. select 2");


                }
                else if (z1==2){
                    System.out.println("money:");
                    Scanner e=new Scanner(System.in);
                    int t=e.nextInt();
                    about.setCash12(t);
                    System.out.println("you have already got money. check your balance. select 2");

                }


            }
            break;
        }



    }




    }
}
