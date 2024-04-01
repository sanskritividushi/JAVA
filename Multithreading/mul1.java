//wap to calculate average of 10000 nubers using 4 simultaneous threads in java
import java.util.Random;
// class mythread extends Thread{
//     int noofthr;
//     int sum=0;
//     mythread(int n){
//         this.noofthr=n;
//         System.out.println("Thread "+ n + " started");
//     }
//     public void run(){
//         while (true){
//             for (int i=1; i<5; i++){
//             System.out.println("Thread "+ i + " running");
//         }
//             Random rd = new Random(); // creating Random object
//             int[] arr1 = new int[2500];
//             for (int j = 0; j < 2500; j++) {
//                     arr1[j] = rd.nextInt(); // storing random integers in an array
//                     sum= sum+ arr1[j];
//                     int avg= sum/2500;
//                     System.out.println("Average of numbers is "+ avg);
//                     }   
//                 }  
//             }
//         }    
//     public class mul1{
//         public static void main(String[] args) {

//             mythread t1[] = new mythread[4];
//             for (int i=1; i<5; i++){
//                 t1[i]= new mythread(i);
//                 t1[i].start();
//             }
//             mythread t2= new mythread(4);
//             t2.start();
            
//         }
//     }
    //OR

class tdemo extends Thread{
    int t;
    int sum=0;
    tdemo(int t){
        this.t=t;
        System.out.println("Thread "+ t + " started");
    }
    public void run(){
        for (int i=1; i<5; i++){
            System.out.println("Thread "+ i + " running");
        }
        try{
            Thread.sleep(5);
        }
        catch(InterruptedException e){
            System.out.println("Thread "+ t + " interrupted");
        }   
    }
    public void calc(){
        Random rd = new Random(); // creating Random object
            int[] arr1 = new int[2500];
            for (int j = 0; j < 2500; j++) {
                    arr1[j] = rd.nextInt(); // storing random integers in an array
                    sum= sum+ arr1[j];
            }   
            int avg= sum/2500;
            System.out.println("Average of numbers is "+ avg);
    } 
}
public class mul1 {
    public static void main(String[] args) {
        tdemo t1[]= new tdemo[5];
        for (int i=1; i<5; i++){
            t1[i]= new tdemo(i);
            t1[i].start();
            t1[i].calc();
        }
    }
}
