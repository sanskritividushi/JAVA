

public class practice {
    public static void main(String[] args) {
        int a,b,c;
        a=100;
        b=20;
        char op= '%';
        if (op== '+'){
            c=a+b;
        }
        else if (op== '-'){
            c=a-b;
        }
        else if (op== '*'){
            c=a*b;
        }
        else if (op== '/'){
            c=a/b;
        }
        else{
            c=a%b;
        }
        System.out.print("Output: "+ c);
    }   
}
//     public static void main(String[] args) {
//         double sum=0; 
//         int x; 
//         int y;

//         for (x=2, y=10; x<=20; x=x+2, y--){
//             if (y==0){
//                 break;
//             }
//             else{
//                 sum=sum+(x/y);
//             }


//         }
//         System.out.println(sum);
//     }
// }
    
//     public static void main(String[] args) {
//         int x=2;
//         int n=3;
//         double sum=0; 
//         for (int i=1; i<=n; i++){
//             sum=sum+ 1/(Math.pow(x, i));
            
//         }
//         System.out.println(sum);
//     }
// }
//     public static void main(String[] args) {
//         int [] a= new int[5];
//         int sum=0;

//         int x,y,z,b,c;
//         Scanner sc = new Scanner (System.in);
//         x= sc.nextInt();
//         a[0]= x;
//         y= sc.nextInt();
//         a[1]= y;
//         z= sc.nextInt();
//         a[2]= z;
//         b= sc.nextInt();
//         a[3]= b;
//         c= sc.nextInt();
//         a[4]= c;

//         for (int i=0; i< a.length; i++){
//             if (a[i]%2!=0){
//                 sum=sum+a[i];
//             }
//         }
//         System.out.println(sum);
//     }
// }
//     public static void main(String[] args) {

//         int prime=30;
//         for (int i=1; i<=prime; i++){
//             if (prime%i==0){

//                 System.out.println("no is not prime");
//                 break;
//             }
//             else{
//                 System.out.println("no is prime.");
//             }
            
//         }

//     }
// }
//         int c=0; 
//         String s="hellooo";

//         for (int i=0; i< s.length(); i++){
//             if (s.charAt(i)=='o' || s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'||  s.charAt(i)=='u'){
//                 c++;
//             }
//         }
//         System.out.println(c);
//     }
// }
    
    
//     public static void main(String[] args) {
//         int a=5;
//         int b=10;
//         String s;

//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter the operator");
//         s= sc.nextLine();

//         switch (s) {

//             case "+" :
//                 System.out.println(a+b);
//                 break;

//             case "-" :
//                 System.out.println(a-b);
//                 break;
//             }
//     }

    
// }   
    
//     int x;
    
//     Scanner sc= new Scanner (System.in);
//     System.out.println("enter no");
//     x=sc.nextInt();

//     for (int i=1; i<=10; i++){
//         System.out.print(x*i+ " ");

//     }

// }
// }
    
//     public static void main(String[] args) {

//         // for (int i=1; i<=5; i++){
//         //     for (int j=1; j<=6-i; j++){
//         //         System.out.print("* ");
//         //     }
//         //     System.out.println();
            
//         // }
//         // System.out.println();
        
//             // for (int i=1; i<=5; i++){
//             //     for (int j=6-i; j>=1;j--){
//             //         System.out.print("* ");
//             //     }
//             //     System.out.println();
//             // }
            

//             // for(int i=1; i<=5; i++){
//             //     for (int j= 1; j<=i; j++){}
//             //             System.out.print(j);
//             //     }
//             //     System.out.println();
//             // }
//     //             int n=5;

//     //         for (int i=1; i<= 2*n-1; i++){
                
//     //                 int c=2*n-i-1;
//     //                 if (i>n){
//     //                 for (int j=1; j<=c; j++){
//     //                     System.out.print("*");
//     //                 }
//     //                 System.out.println();

//     //             }
//     //             else{
//     //                 for (int j=1; j<=i; j++){
//     //                     System.out.print("*");
//     //                 }
//     //                 System.out.println();
//     //             }

//     //         }

//     // }
//         int n=5;
//         for (int i=1; i<=2*n-1;i++){

//             for (int s=1; s<=n; s++){
//                 System.out.print(" ");
//             }
           

//             if (i<=n){
//                 for (int j=1; j<=i; j++){
//                     System.out.print("*");
//                 }
//             }
//             else{
//                 for (int j=1; j<=2*n-i; j++){
//                     System.out.print("*");
//                 }
//             }

//             System.out.println();
//         }
//         System.out.println();

//     }

// }


//     // public static void main(String[] args) {
//     //     int n;
//     //     double fact=1; 
//     //     double sum=1;

//     //     Scanner sc = new Scanner(System.in);
//     //     System.out.println("enter number: ");
//     //     n = sc.nextInt();

//     //     for (int i=1; i<=n; i++){
//     //         fact= fact*i;
//     //     }
//     //         sum= sum+(1/fact);
//     //         System.out.println(sum);
//     //     }



//         // for(int i=1;i<=n;i++){ //1/x^n series oopj file 
//         //     sum=sum + 1/(Math.pow(x,i));
//         // }
//         // System.out.println("The sum of series is: "+ sum);

//         // double sum = 0;
//         // double i;
//         // int j;
        

//         // for(i=1; i<=n;i++){
//         //     int fac =1;
//         //     for(j=2; j<=i;j++){
//         //         fac*=j;
//         //     }
//         //     sum +=(1.0d/fac);
//         // }
//         // System.out.println("The sum is " + sum);


//     /* 
//     public static void main(String[] args) {
//         int sum=0;
//         //Scanner n= new Scanner (System.in);
//         //System.out.println("Enter a number: ");
//         //int num=n.nextInt();

//         for (int a=1; a<=4; a++){
//             sum=sum + 1*a/(a+1);
//         }
//         System.out.println("The sum of series is: "+ sum);
//     }
// }
    
//     public static void main(String[] args) {
//         int sum=1;
//         int n=5;
        
        
//         double fact (int n)
//         {
//             int fact=1;
//             return (n*fact(n-1));
//         }

//         for (int a=1; a<=n; a++){
//             sum=sum+ (1/fact(n));
//         }
//         System.out.print("The sum is: "+ sum);
        
// }
// }
// /* 

//     public static void main(String[] args) {
//         int n=25;
//         for (int i=2; i<n; i++){
//             if (n%1==0){
//                 System.out.println(n+ " is not prime.");
//             }
//             else{
//                 System.out.println(n+ " is prime.");
//             }
//         }
//     }
//     */


    