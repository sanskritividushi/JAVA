
class sq implements Runnable{
    double sqrt;
    
    int j=1;
    public synchronized void till4(){
            for (int i=1; i<=4; i++){
                sqrt=Math.sqrt(i);
                System.out.println(sqrt);
                j++;
            }
    }
    public synchronized void till8(){
            for (int i=5; i<=8; i++){
                sqrt=Math.sqrt(i);
                System.out.println(sqrt);
                j++;
            }
        }
    public synchronized void run(){
        if (j==1){
            till4();
        }
        else if (j==5){
            till8();
    }
}
public class sqrtq {
    public static void main(String[] args) {
        sq s1= new sq();
        Thread t= new Thread(s1);
        Thread t1= new Thread(s1);
        t.start();
        t1.start();


    }
}
}
