import java.util.Scanner;
interface shape{
    void read();
    void print(); 
    void calcArea();

}
class circle implements shape{
    int radius; 
    circle(int r){
        this.radius= r; 
    }

    public void read(){
        System.out.println("Circle values");
        System.out.println(radius);
        
    }
    public void print(){
        System.out.println("Radius: "+ radius);
    }
    public void calcArea(){
        int area= (int) (3.14*radius*radius);
        System.out.println("Area: "+ area);
        System.out.println();
    }  
}

class tri implements shape{
    int ht; 
    int base; 

    tri(int h, int b){
        this.ht=h; 
        this.base=b;
    }

    public void read(){
        System.out.println("Triangle values");
        System.out.println(ht);
        System.out.println(base);
    }
    public void print(){
        System.out.println("ht: "+ ht);
        System.out.println("base: "+ base);
    }
    public void calcArea(){
        int area= (int) (0.5*base*ht);
        System.out.println("Area: "+ area);
        System.out.println();
    }

}
class rect implements shape{
    int len; 
    int bre; 

    rect(int l, int br){
        this.len=l; 
        this.bre=br;
    }

    public void read(){
        System.out.println("Rectangle values");
        System.out.println(len);
        System.out.println(bre);
    }
    public void print(){
        System.out.println("length: "+ len);
        System.out.println("breadth: "+ bre);
    }
    public void calcArea(){
        int area= (int) (len*bre);
        System.out.println("Area: "+ area);
        System.out.println();
    }
}
public class Q1i {
    public static void main(String[] args) {
        // circle c1= new circle(2);
        // c1.read();
        // c1.print(); 
        // c1.calcArea();

        // tri t1= new tri(2,3);
        // t1.read();
        // t1.print(); 
        // t1.calcArea();

        // rect r1= new rect (2,3);
        // r1.read();
        // r1.print(); 
        // r1.calcArea();

        
        shape s[]= new shape[10];
        int ch; 
        for (int i=0; i<10; i++){
            System.out.println("1. circle, 2. tri , 3. rect");
            Scanner sc= new Scanner (System.in);
            ch = sc.nextInt();
            if (ch==1){
                s[i]= new circle(4);
                s[i].read();
                s[i].print(); 
                s[i].calcArea();
            }
            else if(ch== 2){
                s[i]= new tri(2,6);
                s[i].read();
                s[i].print(); 
                s[i].calcArea();
            }
            else if(ch==3){
                s[i]= new rect(4,5);
                s[i].read();
                s[i].print(); 
                s[i].calcArea();
            }
            else{
                System.out.println("invalid");
                i-- ;
            }
        }
        
    
    }

    
}
