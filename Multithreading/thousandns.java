import java.util.Random;
class avg extends Thread{
    int t;
    static int sum=0;
    avg(int t){
        this.t=t;
    }
    public void run(){
        Random r= new Random();
        for (int i=0; i<2500; i++){
            int a= r.nextInt(10);
            sum+=a;
        }   
    }
}
public class thousandns {
    public static void main(String[] args) throws InterruptedException {
        avg t1= new avg(1);
        avg t2= new avg (2);
        avg t3= new avg (3);
        avg t4= new avg (4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        // for (int i=1; i<4; i++){
        //     t1[i]= new avg(i);
        //     t1[i].start();
        //     try {
        //         t1[i].join();
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // }
        
        int avg1= avg.sum/10000;
        System.out.println("avg: " +  avg1);
    }
}
