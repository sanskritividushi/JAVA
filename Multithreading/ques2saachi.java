//1) wap to find avg of first n natural number using loops via 4 threads

//package multithreading;

class avg extends Thread {
    int t;
    int a;
    int n;
    static double TSUM = 0;

    avg(int t, int n) {
        this.t = t;
        a = t - 1;
        this.n = n;
        System.out.println("Thread " + t + " created");
    }
    
    public void run() {
        System.out.println("Thread " + t + " started");
        double sum = 0;
        try{
            for (int i = a; i < n + 1; i += 4) {
                sum += i;
                System.out.println("Thread "+t+" i "+i+ " sum "+sum);
            }
            
        }
        catch (Exception e) {
        }
        TSUM += sum/4.0;
        System.out.println("Thread " + t + " ended");
    }
}

public class ques2saachi {
    public static void main(String[] args) throws InterruptedException {
         avg t[] = new avg[4];

        for (int i = 0; i < 4; i++) {
            t[i] = new avg(i + 1,10000);
            t[i].start();
        }

        for (int i = 0; i < 4; i++) {
            t[i].join(); 
        }
        System.out.println(avg.TSUM);
        double mean = avg.TSUM / 4.0; 
    }
}
