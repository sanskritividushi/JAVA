import java.util.Scanner;

class obstacleValues{
    int elephant=-1;
    int sumelephant;

    int nut=2;   
    int sumnut;

    int rabbit=-4;
    int sumrabbit;

    int snake=-1;
    int sumsnake;

    int wm1=2;
    int summwm1;

    int frog1=-4;
    int sumfrog1;


}

class structureForWhite extends obstacleValues {
    int choice;
    int r; int blk; int b;
    int sumb1=0, sumr1=0, sumblk1=0, sumb2=0, sumblk2=0, sumr3=0;
    int sumelephant=0, sumnut=0, sumrabbit=0;
    int sum1=0;
    int sumr2=0;
    int sum;

    void readW(){
        Scanner sc1= new Scanner (System.in);
                System.out.print("Enter your value of Red anywhere between -10 and 5: ");
                r= sc1.nextInt();
    
                System.out.print("Enter your value of Black anywhere between -10 and 5: ");
                blk= sc1.nextInt();
    
                System.out.print("Enter your value of Blue anywhere between -10 and 5: ");
                b= sc1.nextInt();
        }

    public void targetLoopW(){
        int n=5;
        System.out.print("⚪️");
        while(n!=0){
            for (int i=0;i<n-2; i++){
                System.out.print("🔵");
            }
            for (int z=0; z<n+1; z++){
                System.out.print("🐘");
            }
            for(int j=0; j<n-1; j++){
                System.out.print("🔴");
            }
            for (int k=1; k<n+1; k++){
                System.out.print("🟠");
            }
            for(int q=1; q<n; q++){
                System.out.print("🥥");
            }
            for (int m=0; m<n+1; m++){
                System.out.print("🔵"); 
            }
            for (int t=1; t<n+1; t++){
                System.out.print("🐇");   
            }
            for (int o=1; o<n-1; o++){
                System.out.print("🟠");
            }
            
            n--;
        } 
        System.out.println();
        System.out.println();
    }
    public void printTargetW(){    
        System.out.print("Your target: ");
        targetLoopW();
        System.out.println();  
    }

    public void outputW1(){
        
        int n=5;
        System.out.print("⚪️");
        int sumb1=0;
        while(n!=0){
            for (int i=0;i<n-2; i++){
                sumb1=sumb1+ b;
            }
            System.out.print(sumb1);

            for (int z=0; z<n+1; z++){
                System.out.print("🐘");
            }
            for(int j=0; j<n-1; j++){
                System.out.print("🔴");
            }
            for (int k=1; k<n+1; k++){
                System.out.print("🟠");
            }
            for(int q=1; q<n; q++){
                System.out.print("🥥");
            }
            for (int m=0; m<n+1; m++){
                System.out.print("🔵"); 
            }
            for (int t=1; t<n+1; t++){
                System.out.print("🐇");   
            }
            for (int o=1; o<n-1; o++){
                System.out.print("🟠");
            }
            
            n--;
        } 
        System.out.println();
        System.out.println();
    }
    public void Obstacleelephant(){
        int n=5;
        System.out.print("⚪️");
        int sumb1=0;
        int sumelephant=0;
        while(n!=0){
            for (int i=0;i<n-2; i++){
                sumb1=sumb1+ b;
            }
            //System.out.print(sumb1);
            for (int z=0; z<n+1; z++){
                sumelephant+=-2;
            }
            System.out.print(sumb1+sumelephant);
            
            for(int j=0; j<n-1; j++){
                System.out.print("🔴");
            }
            for (int k=1; k<n+1; k++){
                System.out.print("🟠");
            }
            for(int q=1; q<n; q++){
                System.out.print("🥥");
            }
            for (int m=0; m<n+1; m++){
                System.out.print("🔵"); 
            }
            for (int t=1; t<n+1; t++){
                System.out.print("🐇");   
            }
            for (int o=1; o<n-1; o++){
                System.out.print("🟠");
            }
            
            n--;
        } 
        System.out.println();
        System.out.println();
    }
        
    
    public void outputW2(){
        int n=5;
        int sumelephant=0;
        int sumb1=0, sumr1=0;
        System.out.print("⚪️");
        while(n!=0){
            for (int i=0;i<n-2; i++){
                sumb1=sumb1+ b;
            }
            for (int z=0; z<n+1; z++){
                sumelephant+=elephant;
            }
            for(int j=0; j<n-1; j++){
                sumr1+=r;
            }
            System.out.print(sumb1+sumelephant+ sumr1);
            
    
            for (int k=1; k<n+1; k++){
                System.out.print("🟠");
            }
            for(int q=1; q<n; q++){
                System.out.print("🥥");
            }
            for (int m=0; m<n+1; m++){
                System.out.print("🔵"); 
            }
            for (int t=1; t<n+1; t++){
                System.out.print("🐇");   
            }
            for (int o=1; o<n-1; o++){
                System.out.print("🟠");
            }
            
            n--;
        } 
        System.out.println();
        System.out.println();
    }
    public void outputW6(){
        int n=5;
        int sumb1=0, sumr1=0, sumblk1=0;
        int sumelephant=0;
        System.out.print("⚪️");
        while(n!=0){
            for (int i=0;i<n-2; i++){
                sumb1=sumb1+ b;
            }
            for (int z=0; z<n+1; z++){
                sumelephant+=elephant;
            }
            for(int j=0; j<n-1; j++){
                sumr1+=r;
            }
            for (int k=1; k<n+1; k++){
                sumblk1+=blk;
            }
            System.out.print(sumb1+sumelephant+sumr1+sumblk1);
            for(int q=1; q<n; q++){
                System.out.print("🥥");
            }
            for (int m=0; m<n+1; m++){
                System.out.print("🔵"); 
            }
            for (int t=1; t<n+1; t++){
                System.out.print("🐇");   
            }
            for (int o=1; o<n-1; o++){
                System.out.print("🟠");
            }
            
            n--;
        } 
        System.out.println();
        System.out.println();

    }
    
    public void Obstaclenut(){
        int n=5;
        int sumelephant=0, sumnut=0;
        int sumb1=0, sumr1=0, sumblk1=0;
        System.out.print("⚪️");
        while(n!=0){
            for (int i=0;i<n-2; i++){
                sumb1=sumb1+ b;
            }
            for (int z=0; z<n+1; z++){
                sumelephant+=elephant;
            }
            for(int j=0; j<n-1; j++){
                sumr1+=r;
            }
            for (int k=1; k<n+1; k++){
                sumblk1+=blk;
            }
            for(int q=1; q<n; q++){
                sumnut=sumnut+nut;
            }
            System.out.print(sumb1+sumelephant+sumr1+sumblk1+sumnut);
            for (int m=0; m<n+1; m++){
                System.out.print("🔵"); 
            }
            for (int t=1; t<n+1; t++){
                System.out.print("🐇");   
            }
            for (int o=1; o<n-1; o++){
                System.out.print("🟠");
            }
           
            n--;
        } 
        System.out.println();
        System.out.println();
    }
    
    public void outputW3(){
        int n=5;
        int sumelephant=0, sumnut=0;
        int sumb1=0, sumr1=0, sumblk1=0, sumb2=0;
        System.out.print("⚪️");
        while(n!=0){
            for (int i=0;i<n-2; i++){
                sumb1=sumb1+ b;
            }
            for (int z=0; z<n+1; z++){
                sumelephant+=elephant;
            }
            for(int j=0; j<n-1; j++){
                sumr1+=r;
            }
            for (int k=1; k<n+1; k++){
                sumblk1+=blk;
            }
            for(int q=1; q<n; q++){
                sumnut=sumnut+nut;
            }
            for (int m=0; m<n+1; m++){
                sumb2+=b;
            }
            System.out.print(sumb1+sumelephant+sumr1+sumblk1+sumnut+sumb2);

            for (int t=1; t<n+1; t++){
                System.out.print("🐇");   
            }
            for (int o=1; o<n-1; o++){
                System.out.print("🟠");
            }
           
            n--;
        } 
        System.out.println();
        System.out.println();
    }

    public void Obstaclerabbit(){
        int n=5;
        int sumelephant=0, sumnut=0, sumrabbit=0;
        int sumb1=0, sumr1=0, sumblk1=0, sumb2=0;

        System.out.print("⚪️");
        while(n!=0){
            for (int i=0;i<n-2; i++){
                sumb1=sumb1+ b;
            }
            //System.out.print(sumb1);
            for (int z=0; z<n+1; z++){
                sumelephant+=elephant;
            }
            //System.out.print(sumb1+sumelephant);
            for(int j=0; j<n-1; j++){
                sumr1+=r;
            }
            for (int k=1; k<n+1; k++){
                sumblk1+=blk;
            }
            for(int q=1; q<n; q++){
                sumnut=sumnut+nut;
            }
            for (int m=0; m<n+1; m++){
                sumb2+=b;
            }            
            for (int t=1; t<n+1; t++){
                sumrabbit+=rabbit;   
            }
            System.out.print(sumb1+ sumelephant+sumr1+sumblk1+sumnut+sumb2+sumrabbit);

            for (int o=1; o<n-1; o++){
                System.out.print("🟠");
            }
            
            n--;
        } 
        System.out.println();
        System.out.println();
    }

    public void outputW4(){
        int sumelephant=0, sumnut=0, sumrabbit=0;
        int sumb1=0, sumr1=0, sumblk1=0, sumb2=0;
        int n=5;
        System.out.print("⚪️");
        while(n!=0){
            for (int i=0;i<n-2; i++){
                sumb1=sumb1+ b;
            }
            //System.out.print(sumb1);
            for (int z=0; z<n+1; z++){
                sumelephant+=elephant;
            }
            //System.out.print(sumb1+sumelephant);
            for(int j=0; j<n-1; j++){
                sumr1+=r;
            }
            for (int k=1; k<n+1; k++){
                sumblk1+=blk;
            }
            for(int q=1; q<n; q++){
                sumnut+=nut;
            }
            for (int m=0; m<n+1; m++){
                sumb2+=b;
            }
            for (int t=1; t<n+1; t++){
                sumrabbit+=rabbit;   
            }
            for (int o=1; o<n-1; o++){
                sumblk2+=blk;
            }
            n--;
        } 
        System.out.print("YOUR ANSWER IS ");
        System.out.print(sumb1+sumelephant+sumr1+sumblk1+sumb2+sumrabbit+sumnut+sumblk2);
        System.out.println();
        System.out.println();

    }
}



public class game12{
    public static void main(String[] args) {
        //WELCOME 
        //RULES
        Scanner sc= new Scanner (System.in);
        System.out.println("1: ⚪️\n2: 🟠\n3: 🔴\n4: 🔵");
        System.out.println("Select your choice out of 4\nEnter digit between 1 and 4: " );
        int choice= sc.nextInt();
        switch(choice){
            case 1: 
                System.out.println("⚪️");
                break;
            case 2:
                System.out.println("🟠");
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
            structureForWhite s= new structureForWhite();
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


