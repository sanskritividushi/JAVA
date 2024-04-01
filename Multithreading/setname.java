class thr1 extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}
public class setname {
    public static void main(String[] args) {
        thr1 t1= new thr1();
        t1.setName("Daemon");
        System.out.println("Thread 1 name is "+ t1.getName());
        t1.start();

        thr1 t2= new thr1();
        t2.setName("Rhaenyra");
        System.out.println("Thread 2 name is "+ t2.getName());
        t2.start();
    }
    
}
