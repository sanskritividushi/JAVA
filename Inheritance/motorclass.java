//Q1. DEFINE A CLASS MOTOR VEHICLE HAVING members ,model name ,model no, and price having method, 
// display for name no price, define another class path that inherits the class motor vehicle and has the data member car rate,
//  method display to display car name model no price and car rate and a car method to compute the car. Suitable constructors. 
//  Test for 2 obj

class motorvehicle{
    String ModelName;
    int modelno, price; 

    motorvehicle(){
        ModelName= "ABC";
        modelno=1;
        price=1080000;
    }
    motorvehicle(String name, int no, int price){
        this.ModelName=name; 
        this.modelno=no; 
        this.price=price;
    }
    void display(){
        System.out.println("model name: "+ModelName);
        System.out.println("model no: "+modelno);
        System.out.println("price: "+price);

    }
}

class car extends motorvehicle{
        
        String ModelName;
        int modelno, price; 
        double carrate;

        car(String name, int no, int price, double rate){
            this.ModelName=name; 
            this.modelno=no; 
            this.price=price;
            this.carrate=rate;
        }
        car(){
            ModelName= "ABC";
            modelno=1;
            price=1080000;
            carrate=10;
        }
        void display(){
            System.out.println("model name: "+ModelName);
            System.out.println("model no: "+modelno);
            System.out.println("price: "+price);
            System.out.println("car rate: "+carrate);
        }

        void disCalc(){
            double carvalue;
            carvalue=price - (price*carrate/100.00);
            System.out.println(carvalue);
        }

    }


public class motorclass {
    public static void main(String[] args) {
        motorvehicle m1= new motorvehicle("hbscb", 12, 1020304);
        m1.display();
        motorvehicle m2= new motorvehicle();
        m2.display();

        car d1= new car();
        d1.display();
        d1.disCalc();

        car d2= new car("jahcbj", 23, 3030303, 12);
        d2.display(); 
        d2.disCalc();
    }

    
}
