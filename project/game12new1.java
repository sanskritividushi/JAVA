import java.util.Scanner;



public class game12new1{
    public static void main(String[] args) {
        //WELCOME 
        //RULES
        Scanner sc= new Scanner (System.in);
        System.out.println("1: ⚪️\n2: ⚫️\n3: 🔴\n4: 🔵");
        System.out.println("Select your choice out of 4\nEnter digit between 1 and 4: " );
        int choice= sc.nextInt();
        switch(choice){
            case 1: 
                System.out.println("⚪️");
                break;
            case 2:
                System.out.println("⚫️");
                break;
            case 3:
                System.out.println("🔴");
                break;
            case 4:
                System.out.println("🔵");
                break;
        }


        //EASY MEDIUM HARD FOR INPUT N
        
        //ENTER  A RANDOM NO

        if (choice ==1){
            white s= new white();
            s.printTargetW();
            s.readW();
            s.outputW1();
            s.Obstacleelephant();
            s.outputW2();
            s.outputW6();
            s.Obstaclenut();
            s.outputW3();
            s.Obstaclerabbit();
            s.outputW4();
        }
    }
}


