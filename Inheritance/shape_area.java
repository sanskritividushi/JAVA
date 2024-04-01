class shapes1 {
    String type;
    String color;
    double area;
    void print_s(){
        System.out.println("Type: "+ type);
        System.out.println("Color: "+ color);
        System.out.println("Area "+ area);
    }
}
class circle extends shapes1{
    int rad;
    void calc_area(){
        area= 3.14*rad*rad;
    }
    void print(){
        System.out.println("Radius: "+ rad);
    }
}

class triangle extends shapes1{
    int side1;
    int side2;
    int side3;

    void calc_area(){
        double semi=(side1+side2+side3)/2;
        area= Math.sqrt((semi)*(semi-side1)*(semi-side3)*(semi-side2));
    }
    void print(){
        System.out.println("Sides: "+ side1+ ","+ side2+ ","+ side3);
    }
}

class square extends shapes1{
    int side;
    void calc_area(){
        area= side*side;
    }
    void print(){
        System.out.println("Side: "+ side);
    }
}
class shape_area{
    public static void main(String[] args) {
        circle cl= new circle();
        cl.color="Red";
        cl.type="Circle";
        cl.rad=10;
        cl.calc_area();
        cl.print_s();
        cl.print();

        triangle t1=new triangle ();
        t1.color="Blue";
        t1.type="Triangle";
        t1.side1=10;
        t1.side2=10;
        t1.side3=10;
        t1.calc_area();
        t1.print_s();
        t1.print();

        square s1= new square ();
        s1.color="Yellow";
        s1.type="Square";
        s1.side=8;
        s1.calc_area();
        s1.print_s();
        s1.print();
    }
}

