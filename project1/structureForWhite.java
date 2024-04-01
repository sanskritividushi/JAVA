import java.util.Scanner;

class obstacleValues{
    int snake=-5;
    int sumsnake=0;

    int wm=1;
    int sumwm;

    // int mango=2;
    // int summango;
    // // = 2*mango;

    int frog=-2;
    int sumfrog;

}


class ObstacleValues1 extends obstacleValues{
    int sumb1=0; 
    int n=4;
    int m=n;
    int sumr1=0;
    int choice;
    int r; int blk; int b;

    void readW(){
        Scanner sc1= new Scanner (System.in);
                System.out.print("Enter your value of Red anywhere between -20 and 20: ");
                r= sc1.nextInt();
    
                System.out.print("Enter your value of Black anywhere between -20 and 20: ");
                blk= sc1.nextInt();
    
                System.out.print("Enter your value of Blue anywhere between -20 and 20: ");
                b= sc1.nextInt();
        }

    // public void targetLoopW(){
    //     int n=3;
    //     while(n!=0){
    //         for (int i=0; i<n; i++){
    //             System.out.print("🔵");
    //         }
    //         for (int i=0; i<n; i++){
    //             System.out.print("🐍");
    //         }
    //         for(int j=0; j<n-1; j++){
    //             System.out.print("🔴");
    //         }

    //         for (int k=0; k<n+1; k++){
    //             System.out.print("⚫️");
    //         }
    //         for(int l=0; l<n; l++){
    //             System.out.print("🔴");
    //             // System.out.print("🍉");
    //         }
            
    //         for (int m=0; m<n+1; m++){
    //             System.out.print("🔵"); 
    //         }
    //         for (int m=1; m<n+1; m++){
                
    //             System.out.print("🐸");   
    //         }
            
    //         for (int o=0; o<n-1; o++){
    //             System.out.print("⚫️");
    //         }
    //         n--;
    //     } 
    // }

    public void targetloopnew1(){
        int n=4;
        while(n!=0){

            for (int i=0; i<n-1; i++){
                System.out.print("🔵");
            }
            System.out.print("🐍");
            for (int i=0; i<n-1; i++){
                System.out.print("🟣");
            }
                System.out.print("🐈");
            for(int i=0; i<n-2; i++){
                System.out.print("🟡");
            }
            
           n--;
         }
        }
    public void targetloopnew2(){
        
        int n=4;
        while (n!=0){
            System.out.print("🐍");
            for (int i=n-1; i<n+2; i++){
                System.out.print("🟣");
            }
            for (int i=n-1; i<n+2; i++){
                System.out.print("🟡");
            }

            System.out.print("🐍");
            for(int i=0; i<n-2; i++){
                System.out.print("🟡");
            }
            n--;
            }
        }
       
        void outputw11(){
            int n=4;
        while(n!=0){

            for (int i=0; i<n-1; i++){
                sumb1+=b;
            }
            System.out.print(sumb1);

            System.out.print("🐍");
            for (int i=0; i<n-1; i++){
                System.out.print("🟣");
            }
                System.out.print("🐈");
            for(int i=0; i<n-2; i++){
                System.out.print("🟡");
            }
            
           n--;
         }
        }

        void outputw12(){
            System.out.println();
        int m=4;
        while (m!=0){

            System.out.print(sumsnake+=snake);
            // System.out.print("🐍");
            for (int i=m-1; i<m+2; i++){
                System.out.print("🟣");
            }
            for (int i=m-1; i<m+2; i++){
                System.out.print("🟡");
            }
            System.out.print(sumsnake+=snake);
            for(int i=0; i<m-2; i++){
                System.out.print("🟡");
            }
            m--;
            }
            System.out.println();
            System.out.println();
        }
        
    void output21(){
        int sumsnake=0;
        int sumb1=0;
        int n=4;
        while(n!=0){

            for (int i=0; i<n-1; i++){
                sumb1+=b;
            }
            sumsnake+=snake;
            System.out.print(sumb1+sumsnake);
            for (int i=0; i<n-1; i++){
                System.out.print("🟣");
            }
                System.out.print("🐈");
            for(int i=0; i<n-2; i++){
                System.out.print("🟡");
            }
            
           n--;
         }

        System.out.println();
        System.out.println();

    }
    public void printTargetW(){    
        System.out.print("Your target: ");
        // targetLoopW();
        System.out.println("\n");  
    }

//     public void outputW1(){

//         int n=3;
//         int sumb1=0;

//         System.out.print("⚪️");


//         while(n!=0){

    
//             for (int i=0; i<n; i++){
//                 sumb1+=b;
//             }
//             System.out.print(sumb1);

//             for (int i=0; i<n; i++){
//                 System.out.print("🐍");
//             }

//             for(int j=0; j<n-1; j++){
//                    System.out.print("🔴");
//             }
//             for (int k=0; k<n+1; k++){
//                 System.out.print("⚫️");
//             }
//                 for(int l=0; l<n; l++){
//                System.out.print("🔴");
//                System.out.print("🍉");
//             }
            
//             for (int m=0; m<n+1; m++){
//                 System.out.print("🔵");
//                 System.out.print("🐸");   
//             }
            
//             for (int o=0; o<n-1; o++){
//                System.out.print("⚫️");
//             }
            
//             n--;

//         }

//         System.out.print("\n");
//         System.out.println();
//     }

// public void ObstacleSnake(){
//         int n=3;
//         int sumb1=0;
//         System.out.print("⚪️");
//         while(n!=0){
//                 for (int i=0; i<n; i++){
//                     sumb1+=b;
//                 }
//                 for (int i=0; i<n; i++){
//                     sumsnake=sumsnake-1;
//                 }

//                 System.out.print(sumsnake + sumb1);
    
//                 for(int j=0; j<n-1; j++){
//                        System.out.print("🔴");
//                 }
//                 for (int k=0; k<n+1; k++){
//                     System.out.print("⚫️");
//                 }
//                     for(int l=0; l<n; l++){
//                    System.out.print("🔴");
//                    System.out.print("🍉");
                   
//                 }
//                 for (int m=0; m<n+1; m++){
//                     System.out.print("🔵");  
//                     System.out.print("🐸");    
//                 }
                
//                 for (int o=0; o<n-1; o++){
//                    System.out.print("⚫️");
//                 }
//                     n--;
//         }
//         System.out.println();
//         System.out.println();
//     }
    

//     public void outputW2(){
 
//         int n=3;
//         System.out.print("⚪️");
//         int sumb1=0, sumr1=0;

//         while(n!=0){
            
//             for (int i=0; i<n; i++){
//                 sumb1+=b;
//             }
//             for (int i=0; i<n; i++){
//                 sumsnake=sumsnake-1;
//             }
//             for(int j=0; j<n-1; j++){
//                 sumr1+=r;
//             }
//             System.out.print(sumb1+ sumsnake+sumr1);

//             for (int k=0; k<n+1; k++){
//                 System.out.print("⚫️");
//             }
//                 for(int l=0; l<n; l++){
//                System.out.print("🔴");
//                System.out.print("🍉");
               
//             }
            
//             for (int m=0; m<n+1; m++){
//                 System.out.print("🔵");  
//                 System.out.print("🐸");       
//             }
            
//             for (int o=0; o<n-1; o++){
//                System.out.print("⚫️");
//             }
            
//             n--;
//         }
//         System.out.print("\n");
//         System.out.println();
// }

//         public void outputW3(){
//             int n=3;

//             System.out.print("⚪️");
//             int sumb1=0, sumr1=0, sumblk1=0; 

//         while(n!=0){

//             for (int i=0; i<n; i++){
//                 sumb1+=b;
//             }
//             for (int i=0; i<n; i++){
//                 sumsnake=sumsnake+snake;
//             }
//             for(int j=0; j<n-1; j++){
//                 sumr1+=r;
//             }
//             for (int k=0; k<n+1; k++){
//                 sumblk1+=blk;
//             }
//             System.out.print(sumb1+sumr1+sumblk1+sumsnake);

//             for(int l=0; l<n; l++){
//                System.out.print("🔴");
//                System.out.print("🍉");
               
//             }
            
//             for (int m=0; m<n+1; m++){
//                 System.out.print("🔵");
//                 System.out.print("🐸");   
//             }
            
//             for (int o=0; o<n-1; o++){
//                System.out.print("⚫️");
//             }
            
//             n--;
            
//         }
//         System.out.print("\n");
//         System.out.println();

//         }


//         public void outputW4(){
//             int n=3;
//             System.out.print("⚪️");
//             int sumb1=0, sumr1=0, sumblk1=0; 
//             int sumr2=0;
        
//         while(n!=0){
        
//             for (int i=0; i<n; i++){
//                 sumb1+=b;
//             }

//             for(int j=0; j<n-1; j++){
//                 sumr1+=r;
//             }
//             for (int i=0; i<n; i++){
//                 sumsnake=sumsnake+snake;
//             }

//             for (int k=0; k<n+1; k++){
//                 sumblk1+=blk;
//             }

//             for(int l=0; l<n; l++){
//                 sumr2+=r;
//             }
//             System.out.print(sumb1+sumr1+sumblk1+sumr2+sumsnake);

//             for(int l=0; l<n; l++){
//                 System.out.print("🍉");
//             }
            
//             for (int m=0; m<n+1; m++){
//                 System.out.print("🔵");
//                 System.out.print("🐸");   
//             }
            
//             for (int o=0; o<n-1; o++){
//                System.out.print("⚫️");
//             }
            
//             n--;
//         }
//         System.out.println();
//         System.out.println();

//         }

//         public void ObstacleWM(){

//             int n=3;
//             System.out.print("⚪️");
//             int sumb1=0, sumr1=0, sumblk1=0; 
//             int sumr2=0;
        
//         while(n!=0){
        
//             for (int i=0; i<n; i++){
//                 sumb1+=b;
//             }

//             for(int j=0; j<n-1; j++){
//                 sumr1+=r;
//             }
//             for (int i=0; i<n; i++){
//                 sumsnake=sumsnake+snake;
//             }

//             for (int k=0; k<n+1; k++){
//                 sumblk1+=blk;
//             }

//             for(int l=0; l<n; l++){
//                 sumr2+=r;
//             }
//             for(int l=0; l<n; l++){
//                 sumwm= sumwm+wm;
//                 // System.out.print("🍉🍉🍉");
//             }
            
//             System.out.print(sumb1+sumr1+sumblk1+sumr2+sumwm+sumsnake);
            
//             for (int m=0; m<n+1; m++){
//                 System.out.print("🔵");
//                 System.out.print("🐸");   
//             }
            
//             for (int o=0; o<n-1; o++){
//                System.out.print("⚫️");
//             }
            
//             n--;
//         }
//         System.out.println();
//         System.out.println();


//         }


//         public void outputW5(){
//             int n=3;
//             System.out.print("⚪️");
//             int sumb1=0, sumr1=0, sumblk1=0; 
//             int sumb2=0, sumr2=0;
            

//         while(n!=0){

           

//             for (int i=0; i<n; i++){
//                 sumb1+=b;
//             }

//             for(int j=0; j<n-1; j++){
//                 sumr1+=r;
//             }

//             for (int k=0; k<n+1; k++){
//                 sumblk1+=blk;
//             }

            
//             for(int l=0; l<n; l++){
//                 sumr2+=r;
//             }
//             for(int l=0; l<n; l++){
//                 sumwm= sumwm+wm;
//                 // System.out.print("🍉🍉🍉");
//             }

//             for (int m=0; m<n+1; m++){
//                 sumb2+=b;
//             }
//             System.out.print(sumb1+sumr1+sumblk1+sumr2+ sumb2+sumsnake+sumwm);

//             for (int m=0; m<n+1; m++){
//                 System.out.print("🐸"); 
//             }
              
//             for (int o=0; o<n-1; o++){
//                System.out.print("⚫️");
//             }
            
//             n--;
            
//         }
//         System.out.println();
//         System.out.println();

//         }

//         public void ObstacleFrog(){
//             int n=3;
//             System.out.print("⚪️");
//             int sumb1=0, sumr1=0, sumblk1=0; 
//             int sumb2=0, sumr2=0;
//         while(n!=0){

//             for (int i=0; i<n; i++){
//                 sumb1+=b;
//             }

//             for(int j=0; j<n-1; j++){
//                 sumr1+=r;
//             }

//             for (int k=0; k<n+1; k++){
//                 sumblk1+=blk;
//             }

            
//             for(int l=0; l<n; l++){
//                 sumr2+=r;
//             }
//             for(int l=0; l<n; l++){
//                 sumwm= sumwm+wm;
//                 // System.out.print("🍉🍉🍉");
//             }
            
//             for (int m=0; m<n+1; m++){
//                 sumb2+=b;
//                 // System.out.print("🐸");
//             }
//             for (int m=0; m<n+1; m++){
//                 sumfrog=sumfrog+frog;
//             }

//             System.out.print(sumb1+sumr1+sumblk1+sumr2+ sumb2+sumsnake+sumwm+sumfrog);

//             for (int o=0; o<n-1; o++){
//                System.out.print("⚫️");
//             }
            
//             n--;
            
//         }
//         System.out.println();
//         System.out.println();


//         }


//         public void outputW6(){
//             int n=3;
//             int s5=0;
//             System.out.print("⚪️");
//             int sumb1=0, sumr1=0, sumblk1=0; 
//             int sumb2=0, sumr2=0, sumblk2=0;


//         while(n!=0){
            
//             for (int i=0; i<n; i++){
//                 sumb1+=b;
//             }

//             for(int j=0; j<n-1; j++){
//                 sumr1+=r;
//             }

//             for (int k=0; k<n+1; k++){
//                 sumblk1+=blk;
//             }

            
//             for(int l=0; l<n; l++){
//                 sumr2+=r;
//             }
//             for(int l=0; l<n; l++){
//                 sumwm= sumwm+wm;
//                 // System.out.print("🍉🍉🍉");
//             }
//             for (int m=0; m<n+1; m++){
//                 sumb2+=b;
//                 // System.out.print("🐸");
//             }
//             for (int m=0; m<n+1; m++){
//                 sumfrog=sumfrog+frog;
//             }

//             for (int o=0; o<n-1; o++){
//                 sumblk2+=blk;
//             }
//               n--;
//               s5= sumb1+sumr1+sumblk1+sumr2+sumb2+sumblk2+sumfrog+sumwm+sumsnake;
//         }
        
//         System.out.println(s5);
//         System.out.println();
//         // System.out.println("YOUR ANSWER IS "+ s5);

// }
}


public class structureForWhite{
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
            ObstacleValues1 s= new  ObstacleValues1();
            // s.printTargetW();
            s.targetloopnew1();
            s.targetloopnew2();
            s.readW();

            s.outputw11();
            s.outputw12();
            s.output21();
            // s.ObstacleSnake();
            // s.outputW2();

            // s.outputW3();
            // s.outputW4();
            // s.ObstacleWM();
            // s.outputW5();
            // s.ObstacleFrog();
            // s.outputW6();


        }
    }
}
