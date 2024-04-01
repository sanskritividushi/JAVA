class A{
    private int a;
    A(int a){
    this.a=a;
    }
    void print(){
        //System.out.println("a"+a);
        printX();
    }

    private void printX(){
        System.out.println("a"+a);
    }
}


public class access {
    public static void main(String[] args) {
        A obj = new A(10);
        obj.print();
        Sout(obj.a);//error due to private

        obj.printX()//error due to private, printX can only be called within its own class
        //see line 9

    }
}

