import java.util.Scanner;
class obstacleValues{
    int elephant=-1;
    int sumelephant;
    int nut=2;   
    int sumnut;
    int rabbit=-4;
    int sumrabbit;
}
public class white extends obstacleValues {
    int guess1, guess2;
    int r; int org; int b;
    int sum=0; int sumb1=0, sumr1=0, sumorg1=0, sumb2=0, sumorg2=0;
    int sumelephant=0, sumnut=0, sumrabbit=0;
    Scanner sc= new Scanner (System.in);
    int N1=sc.nextInt();
    void readW(){
        Scanner sc1= new Scanner (System.in);
                System.out.print("Enter your value of Red anywhere between -5 and 5: ");
                r= sc1.nextInt();
                if(r<-1 || r>5){
                    System.out.println("Invalid. Re-enter value of Red which is between -5 and 5.");
                    r= sc1.nextInt();
                }
                org=(0-r);
                System.out.print("Your value of Orange is: "+ org);
                System.out.println();
    
                System.out.print("Enter your value of Blue anywhere between -5 and 5: ");
                b= sc1.nextInt();
                if(b==r){
                    System.out.println("Invalid. Re-enter value of Blue which is not equal to Red.");
                    b= sc1.nextInt();
                }
                if(b==org){
                    System.out.println("Invalid. Re-enter value of Blue which is not equal to Orange.");
                    b= sc1.nextInt();
                }
                if (b<-5 || b>5){
                    System.out.println("Invalid. Re-enter value of Blue which is between -5 and 5.");
                    b= sc1.nextInt();
                }
                System.out.println();
        }
    public void targetLoopW(){
        int n=N1;
        System.out.print("🟣");
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
        int n =N1;
        int sumb1=0;
        System.out.print("🟣");
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
    
    public void outputW2(){
        int n =N1;
        int sumelephant=0;
        int sumb1=0, sumr1=0;
        System.out.print("🟣");
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
    public void guess1read(){
        System.out.println("BONUS TIME!");
        System.out.println("Enter your evaluation of the obstacle Elephant: ");
        guess1= sc.nextInt();
        System.out.println("The result of your evaluation will be disclosed at the end.");
        System.out.println();
    }
    public void guess1(){
        if(guess1==-1){
            System.out.println("Your first evaluation was correct! The bonus of 5 points will be added to your overall score at the end!");
            sum=sum+20;
        }
        if(guess1!=-1){
            System.out.println("Your first evaluation was incorrect! The bonus of 5 points will be subtracted from your overall score at the end!");
            sum=sum-20;
        }
    }
    public void outputW6(){
        int n =N1;
        int sumb1=0, sumr1=0, sumorg1=0;
        int sumelephant=0;
        System.out.print("🟣");
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
                sumorg1+=org;
            }
            System.out.print(sumb1+sumelephant+sumr1+sumorg1);
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

    public void outputW3(){
        int n =N1;
        int sumelephant=0, sumnut=0;
        int sumb1=0, sumr1=0, sumorg1=0, sumb2=0;
        System.out.print("🟣");
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
                sumorg1+=org;
            }
            for(int q=1; q<n; q++){
                sumnut=sumnut+nut;
            }
            for (int m=0; m<n+1; m++){
                sumb2+=b;
            }
            System.out.print(sumb1+sumelephant+sumr1+sumorg1+sumnut+sumb2);

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
    public void guess2read(){
        System.out.println("BONUS TIME!");
        System.out.println("Enter your evaluation of the obstacle Coconut: ");
        guess2= sc.nextInt();
        System.out.println("The result of your evaluation will be disclosed at the end.");
        System.out.println();
    }
    public void guess2(){
        if(guess2==2){
            System.out.println("Your second evaluation was correct! The bonus of 5 points will be added to your overall score at the end!");
            sum=sum+20;
        }
        if(guess2!=2){
            System.out.println("Your second evaluation was incorrect! The bonus of 5 points will be subtracted from your overall score at the end!");
            sum=sum-20;
        }
        System.out.println();
    }

    public void Obstaclerabbit(){
        int n =N1;
        int sumelephant=0, sumnut=0, sumrabbit=0;
        int sumb1=0, sumr1=0, sumorg1=0, sumb2=0;
        System.out.print("🟣");
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
                sumorg1+=org;
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
            System.out.print(sumb1+ sumelephant+sumr1+sumorg1+sumnut+sumb2+sumrabbit);

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
        int sumb1=0, sumr1=0, sumorg1=0, sumb2=0;
        int n =N1;
        System.out.print("🟣");
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
                sumorg1+=org;
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
                sumorg2+=org;
            }
            n--;
        } 
        sum=sumb1+sumelephant+sumr1+sumorg1+sumb2+sumrabbit+sumnut+sumorg2;
        System.out.print(sum);
        System.out.println();
        guess1();
        guess2();
        System.out.print("YOUR ANSWER IS ");
        System.out.print(sum);
        System.out.println();
        System.out.println();

    }
}


