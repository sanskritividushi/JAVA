
class tttt extends Thread{
    int cel;
    tttt(int cel){
        this.cel=cel;
    }
    public void run(){
        System.out.println("Thread is running");
        int fah= (int) ((1.8*cel) +32);
        System.out.println(fah);
    }
}
public class temp {
    
    public static void main(String[] args) {
        tttt t1= new tttt(45);
        t1.start();   
    }
}
