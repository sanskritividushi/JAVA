class Accounts implements Runnable{
    double bal;
    Accounts(double b){
        bal = b;
    }
    public synchronized void withdraw(double a){
        if(bal<a){
            System.out.println("low balance");
        }
        else{
            bal = bal - a;
        }
    }

    public synchronized void deposit(double a){
        bal = bal + a;
    }

    @Override
    public void run(){
        for(int i = 0; i<1000; i++){
            if(i%2==0){
                withdraw(10);
            }
            else{
                deposit(10);
            }
        }
    }


}


public class g6_multith_synchronized {
    public static void main(String[] args) {
        
        Accounts a = new Accounts(99999);
        Thread th = new Thread(a);
        Thread th2 = new Thread(a);

        th.start();
        th2.start();
        
        System.out.println("balance: " + a.bal);
    }
}
