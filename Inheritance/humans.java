import java.util.Scanner;

class Humanbeings {
    String name;
    int height, weight, AadharNo;
    Scanner sc= new Scanner (System.in);

    void read(){
        System.out.println("Enter name");
        name=sc.next(); 
        System.out.println("Enter height");
        height=sc.nextInt();
        System.out.println("Enter weight");
        weight=sc.nextInt();
        System.out.println("Enter AadharNo");
        AadharNo=sc.nextInt();
    }

    void print(){
        System.out.println(name);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(AadharNo);
        System.out.println();
    }

}

class Male extends Humanbeings{
    String name;
    int height, weight, AadharNo;
    Scanner sc= new Scanner (System.in);

    void read(){
        System.out.println("Enter his name");
        name=sc.next(); 
        System.out.println("Enter his height");
        height=sc.nextInt();
        System.out.println("Enter his weight");
        weight=sc.nextInt();
        System.out.println("Enter his AadharNo");
        AadharNo=sc.nextInt();
        
    }

    void print(){
        System.out.println(" His name is "+name);
        System.out.println(" His height is "+height);
        System.out.println(" His weight is "+weight);
        System.out.println(" His AadharNo is "+AadharNo);
        System.out.println();
    }
}

class Female extends Humanbeings{
    String name;
    int height, weight, AadharNo;
    Scanner sc= new Scanner (System.in);

    void read(){
        System.out.println("Enter his name");
        name=sc.next(); 
        System.out.println("Enter his height");
        height=sc.nextInt();
        System.out.println("Enter his weight");
        weight=sc.nextInt();
        System.out.println("Enter his AadharNo");
        AadharNo=sc.nextInt();
    }

    void print(){
        System.out.println("his name is "+name);
        System.out.println("his height is "+height);
        System.out.println("his weight is "+weight);
        System.out.println("his AadharNo is "+AadharNo);
        System.out.println();
    }
}

class Trans extends Humanbeings{
    String name;
    int height, weight, AadharNo;
    Scanner sc= new Scanner (System.in);

    void read(){
        System.out.println("Enter their name");
        name=sc.next(); 
        System.out.println("Enter their height");
        height=sc.nextInt();
        System.out.println("Enter their weight");
        weight=sc.nextInt();
        System.out.println("Enter their AadharNo");
        AadharNo=sc.nextInt();
    }

    void print(){
        System.out.println("Their name is "+name);
        System.out.println("Their height is "+height);
        System.out.println("Their weight is "+weight);
        System.out.println("Their AadharNo is "+AadharNo);
        System.out.println();
    }
}


class humans{
    public static void main(String[] args) {

        // Humanbeings h1= new Humanbeings();
        // h1.read();
        // h1.print();
        
        Humanbeings m1= new Male();
        m1.read();
        m1.print();

        Humanbeings f1= new Female();
        f1.read();
        f1.print();

        Humanbeings t1= new Trans();
        t1.read();
        t1.print();
    }
}