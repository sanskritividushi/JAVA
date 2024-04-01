import java.util.Scanner;

class values {
    float radius; 
    String color; 
    float area;

    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        radius = sc.nextInt();
        System.out.println("Enter color: ");
        String color = sc.nextLine();
    }

    public void calc_area(){
        float area= (float) (3.14*radius*radius);
    }

    public void print(){
        System.out.println("Radius: "+ radius);
        System.out.println("Color: "+ color);
        float area= (float) (3.14*radius*radius);
        System.out.println("Area: "+ area);
    }
    
}
public class circle{
    public static void main(String[] args) {
        values c1= new values();
        c1.read();
        c1.calc_area();
        c1.print();
    }

}
