import java.util.Scanner;
class obstacleValues1{
    int tiger =-1; 
    int sumtiger;
    int flower=2; 
    int sumflower;
    int cat=-4;
    int sumcat;
}
public class orange extends obstacleValues1 {
    int choice;
    int sum=0;
    int guess1, guess2;
    int wh; int b; int r;
    int sumr1=0, sumwh1=0, sumb1=0, sumr2=0, sumb2=0;
    int sumtiger=0, sumflower=0, sumcat=0;
    Scanner sc= new Scanner (System.in);
    int N1=sc.nextInt();
    void readO(){

        Scanner sc1= new Scanner (System.in);
                System.out.print("Enter your value of White anywhere between -5 and 5: ");
                wh= sc1.nextInt();
                if(wh<-1 || wh>5){
                    System.out.println("Invalid. Re-enter value of White which is between -5 and 5.");
                    wh= sc1.nextInt();
                }
                b= 0-wh;
                System.out.print("Your value of Blue is: "+b);
               System.out.println();
    
                System.out.print("Enter your value of Red anywhere between -5 and 5: ");
                r= sc1.nextInt();
                if(r==wh){
                    System.out.println("Invalid. Re-enter value of Red which is not equal to White.");
                    b= sc1.nextInt();
                }
                if(r==b){
                    System.out.println("Invalid. Re-enter value of Red which is not equal to Blue.");
                    b= sc1.nextInt();
                }
                if (r<-5 || r>5){
                    System.out.println("Invalid. Re-enter value of Red which is between -5 and 5.");
                    r= sc1.nextInt();
                }
                System.out.println();
        }
    
    public void targetLoopO(){
        int n=N1;
        System.out.print("🟠");
        while(n!=0){
            for (int i=0;i<n-2; i++){
                System.out.print("🔴");
            }
            for (int z=0; z<n+1; z++){
                System.out.print("🐅");
            }
            for(int j=0; j<n-1; j++){
                System.out.print("⚪️");
            }
            for (int k=1; k<n+1; k++){
                System.out.print("🔵");
            }
            for(int q=1; q<n; q++){
                System.out.print("🏵️");
            }
            for (int m=0; m<n+1; m++){
                System.out.print("🔴"); 
            }
            for (int t=1; t<n+1; t++){
                System.out.print("🐈");   
            }
            for (int o=1; o<n-1; o++){
                System.out.print("🔵");
            }
            
            n--;
        } 
        System.out.println();
        System.out.println();
    }
    public void printTargetO(){    
        System.out.print("Your target: ");
        targetLoopO();
        System.out.println();  
    }

    public void outputO1(){
        int n=N1;
        System.out.print("🟠");
        int sumr1=0;
        while(n!=0){
            for (int i=0;i<n-2; i++){
                sumr1=sumr1+r;
            }
            System.out.print(sumr1);

            for (int z=0; z<n+1; z++){
                System.out.print("🐅");
            }
            for(int j=0; j<n-1; j++){
                System.out.print("⚪️");
            }
            for (int k=1; k<n+1; k++){
                System.out.print("🔵");
            }
            for(int q=1; q<n; q++){
                System.out.print("🏵️");
            }
            for (int m=0; m<n+1; m++){
                System.out.print("🔴"); 
            }
            for (int t=1; t<n+1; t++){
                System.out.print("🐈");   
            }
            for (int o=1; o<n-1; o++){
                System.out.print("🔵");
            }
            
            n--;
        } 
        System.out.println();
        System.out.println();
    }
    public void outputO2(){
        int n=N1;
        int sumtiger=0;
        int sumr1=0, sumwh1=0;
        System.out.print("🟠");
        while(n!=0){
            for (int i=0;i<n-2; i++){
                sumr1=sumr1+ r;
            }
            for (int z=0; z<n+1; z++){
                sumtiger+=tiger;
            }
            for(int j=0; j<n-1; j++){
                sumwh1+=wh;
            }
            System.out.print(sumr1+sumtiger+ sumwh1);
            
            for (int k=1; k<n+1; k++){
                System.out.print("🔵");
            }
            for(int q=1; q<n; q++){
                System.out.print("🏵️");
            }
            for (int m=0; m<n+1; m++){
                System.out.print("🔴"); 
            }
            for (int t=1; t<n+1; t++){
                System.out.print("🐈");   
            }
            for (int o=1; o<n-1; o++){
                System.out.print("🔵");
            }
            
            n--;
        } 
        System.out.println();
        System.out.println();
    }
    public void guess1read(){
        System.out.println("BONUS TIME!");
        System.out.println("Enter your evaluation of the obstacle Tiger: ");
        guess1= sc.nextInt();
        System.out.println("The result of your evaluation will be disclosed at the end.");
        System.out.println();
    }
    
    public void guess1(){
    if(guess1==-1){
        System.out.println("Your first evaluation was correct! The bonus of 10 points will be added to your overall score at the end!");
        sum=sum+10;
    }
    if(guess1!=-1){
        System.out.println("Your first evaluation was incorrect! The bonus of 20 points will be subtracted from your overall score at the end!");
        sum=sum-20;
    }
}
    public void outputO6(){
        int n=N1;
        int sumr1=0, sumwh1=0, sumb1=0;
        int sumtiger=0;
        System.out.print("🟠");
        while(n!=0){
            for (int i=0;i<n-2; i++){
                sumr1=sumr1+ r;
            }
            for (int z=0; z<n+1; z++){
                sumtiger+=tiger;
            }
            for(int j=0; j<n-1; j++){
                sumwh1+=wh;
            }
            for (int k=1; k<n+1; k++){
                sumb1+=b;
            }
            System.out.print(sumr1+sumtiger+sumwh1+sumb1);
            for(int q=1; q<n; q++){
                System.out.print("🏵️");
            }
            for (int m=0; m<n+1; m++){
                System.out.print("🔴"); 
            }
            for (int t=1; t<n+1; t++){
                System.out.print("🐈");   
            }
            for (int o=1; o<n-1; o++){
                System.out.print("🔵");
            }
            
            n--;
        } 
        System.out.println();
        System.out.println();

    }
    
    public void outputO3(){
        int n=N1;
        int sumtiger=0, sumflower=0;
        int sumr1=0, sumwh1=0, sumb1=0, sumr2=0;
        System.out.print("🟠");
        while(n!=0){
            for (int i=0;i<n-2; i++){
                sumr1=sumr1+ r;
            }
            for (int z=0; z<n+1; z++){
                sumtiger+=tiger;
            }
            for(int j=0; j<n-1; j++){
                sumwh1+=wh;
            }
            for (int k=1; k<n+1; k++){
                sumb1+=b;
            }
            for(int q=1; q<n; q++){
                sumflower+=flower;
            }
            for (int m=0; m<n+1; m++){
                sumr2+=r;
            }
            System.out.print(sumr1+sumtiger+sumwh1+sumb1+sumflower+sumr2);

            for (int t=1; t<n+1; t++){
                System.out.print("🐈");   
            }
            for (int o=1; o<n-1; o++){
                System.out.print("🔵");
            }
           
            n--;
        } 
        System.out.println();
        System.out.println();
    }
    public void guess2read(){
        System.out.println("BONUS TIME!");
        System.out.println("Enter your evaluation of the obstacle Flower: ");
        guess2= sc.nextInt();
        System.out.println("The result of your evaluation will be disclosed at the end.");
        System.out.println();
    }
    public void guess2(){
        if(guess2==2){
            System.out.println("Your second evaluation was correct! The bonus of 10 points will be added to your overall score at the end!");
            sum=sum+10;
        }
        if(guess2!=2){
            System.out.println("Your second evaluation was incorrect! The bonus of 20 points will be subtracted from your overall score at the end!");
            sum=sum-20;
        }
        System.out.println();
    }

    public void ObstacleCat(){
        int n=N1;
        int sumtiger=0, sumflower=0, sumcat=0;
        int sumr1=0, sumwh1=0, sumb1=0, sumr2=0;

        System.out.print("🟠");
        while(n!=0){
            for (int i=0;i<n-2; i++){
                sumr1=sumr1+ r;
            }
            //System.out.print(sumb1);
            for (int z=0; z<n+1; z++){
                sumtiger+=tiger;
            }
            //System.out.print(sumb1+sumelephant);
            for(int j=0; j<n-1; j++){
                sumwh1+=wh;
            }
            for (int k=1; k<n+1; k++){
                sumb1+=b;
            }
            for(int q=1; q<n; q++){
                sumflower+=flower;
            }
            for (int m=0; m<n+1; m++){
                sumr2+=r;
            }            
            for (int t=1; t<n+1; t++){
                sumcat+=-4; 
            }
            System.out.print(sumr1+sumtiger+sumwh1+sumb1+sumflower+sumr2+sumcat);

            for (int o=1; o<n-1; o++){
                System.out.print("🔵");
            }
            
            n--;
        } 
        System.out.println();
        System.out.println();
    }

    public void outputO4(){
        int sumtiger=0, sumflower=0, sumcat=0;
        int sumr1=0, sumwh1=0, sumb1=0, sumr2=0, sumb2=0;
        int n=N1;
        System.out.print("🟠");
        while(n!=0){
            for (int i=0;i<n-2; i++){
                sumr1=sumr1+ r;
            }
            //System.out.print(sumb1);
            for (int z=0; z<n+1; z++){
                sumtiger+=tiger;
            }
            //System.out.print(sumb1+sumelephant);
            for(int j=0; j<n-1; j++){
                sumwh1+=wh;
            }
            for (int k=1; k<n+1; k++){
                sumb1+=b;
            }
            for(int q=1; q<n; q++){
                sumflower+=flower;
            }
            for (int m=0; m<n+1; m++){
                sumr2+=r;
            }
            for (int t=1; t<n+1; t++){
                sumcat+=cat;
            }
            for (int o=1; o<n-1; o++){
                sumb2=sumb2+b;
            }
            n--;
        }
        sum=sumr1+sumtiger+sumwh1+sumb1+sumflower+sumr2+sumcat+sumb2;
        System.out.print(sum);
        System.out.println();
        guess1();
        guess2();
        System.out.print("Your answer is: "); 
        System.out.print(sum);
        System.out.println();
        System.out.println();
    }
}