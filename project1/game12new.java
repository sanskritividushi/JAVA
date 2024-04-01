import java.util.Scanner;
// import orange.java;
// import white.java;

public class game12new{

    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("WELCOME TO ANIMAL KINGDOM!");
            System.out.println("Press Enter to proceed.");
            String enter=sc.nextLine();
            System.out.println("This is a Mathematical PEN AND PAPER game aimed at increasing your Mathematical calculation speed.\n");
            System.out.println("Press Enter to read the rules.");
            String enter1=sc.nextLine();
            System.out.println("🦋🦋🦋🦋🦋🦋");
            System.out.println("The rules are as follows: \n The game starts with a Level Guide, based on which you will be provided with a TARGET.\n");
            System.out.println("This TARGET is a progression of a number of objects including plants and animals and colored balls.\nEach object is worth a point.\n");
            System.out.println("For example: \n🔵🔵🔵🐍🟣🟣🟣🐈🟡🟡🔵🔵🐍🟣🟣🐈🟡🔵🐍🟣🐈🐍🐈🐍🟣🟣🟣🟡");
            String enter3=sc.nextLine();
            System.out.println("🐍🐍🐍🐍🐍");
            System.out.println("The purpose of the game is to find the sum of the points of all the objects.");
            System.out.println("You win the game if the sum of the points of all objects is more than 0.");
            System.out.println("The catch is, YOU WONT KNOW THE POINT OF ANY ANIMAL OR PLANT OBSTACLE.\n");
            System.out.println("But you do get to choose the points for the COLORED BALL obstacles.");
            System.out.println("So,what you have to do is, make a really good evaluation of the TARGET given to you and predict and enter the values of the Colored Balls.");
            String enter8=sc.nextLine();
            System.out.println("🐥🐥🐥🐥🐥🐥");
            System.out.println("The rule with choosing the points for the balls is that you only get to pick the points of 2 balls.");
            System.out.println("This way the point chosen first will be allocated to one ball and the additive inverse of that point will be allocated to another ball.");
            System.out.println("The points for the third ball can be chosen independantly by you with no added clause.");
            System.out.println("🐠🐠🐠🐠🐠🐠");
            System.out.println("ABOUT BONUS:\nTo make things interesting, you will be given a chance to guess the value of plant and animal obstacles.");
            System.out.println("If you guess correctly, you will get a BONUS of 10 points.\nBut if your guess is incorrect, 20 points will be DEDUCTED from your overall score.");
            System.out.println();
            System.out.println("🐈🐈🐈🐈🐈");
            System.out.println("Please make sure to enter 1 NEGATIVE NUMBER to make the game more interesting.😚\n");
            System.out.println("If the sum of points comes up to be positive, Congrats, YOU WIN!");
            System.out.println("Would you like a hint?\nIf YES, PRESS ENTER.");
            String enter4=sc.nextLine();
            System.out.println("🌸🌸🌸🌸🌸🌸");
            System.out.println("The hint is: \nThe ANIMALS have NEGATIVE points while the PLANTS have POSITIVE points.😉");
            System.out.println("SO, LETS BEGIN!!!\n");
            System.out.println();

            System.out.println("1: 🟣\n2: 🟠\n");
            System.out.println("Select your choice of cursor by entering 1 or 2 " );
            int choice= sc.nextInt();
            switch(choice){
                case 1: 
                    System.out.println("🟣");
                    break;
                case 2:
                    System.out.println("🟠");
                    break;
            }
                System.out.println("LEVEL GUIDE:\nEASY: 1-5\nMEDIUM: 5-8\nHARD: 8-12");
                System.out.println("Enter any number between 1 and 12 to choose a level you want.");
                if (choice ==1){
                white s= new white();
                System.out.println();
                s.printTargetW();
                s.readW();
                s.outputW1();
                s.outputW2();
                s.guess1read();
                s.outputW6();
                s.outputW3();
                s.guess2read();
                s.Obstaclerabbit();
                s.outputW4();
            }
                if (choice ==2){
                orange o= new orange();
                System.out.println();
                o.printTargetO();
                o.readO();
                o.outputO1();
                o.outputO2();
                o.guess1read();
                o.outputO6();
                o.outputO3();
                o.guess2read();
                o.ObstacleCat();
                o.outputO4();
                }
        }
    }
}

