
class tryrun implements Runnable{
    private String msg;
    public tryrun(String msg){
        this.msg=msg;
    }
    @Override
    public void run() {
        while (true){
            // System.out.println(msg+ " running for "+ Thread.currentThread().getId());
            System.out.println(msg);
        }
    }
}

public class runnableclass {
    public static void main(String[] args) {
        int n=5;
        for (int i=1; i<=n; i++){
            tryrun t1= new tryrun("HELLO "+i);
            Thread t= new Thread(t1);
            t.start();
        }
        
    }
}
