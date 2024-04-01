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
}
public class threadnethod {
    public static void main(String[] args) {
        tdemo t1[]= new tdemo[5];
        for (int i=1; i<5; i++){
            t1[i]= new tdemo(i);
            t1[i].start();
        }
    }
}
