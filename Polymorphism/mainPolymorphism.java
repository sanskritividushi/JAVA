package Polymorphism;
class Polymorphism{
    int doorbell;
    String mobilebell;
    float alarmbell;

    Polymorphism(){//default constr
        doorbell=-1;
        mobilebell="Null";
        alarmbell=0.0f;
    }

    Polymorphism(int d){//parametrised constructor 1
        doorbell=d;
        mobilebell="Null";
        alarmbell=0.0f;
    }

    Polymorphism(String s){//parametrised constructor 2
        mobilebell=s;
        doorbell=-1;
        alarmbell=0.0f;
    }
    
    Polymorphism(float f){//parametrised constructor 3
        alarmbell=0;
        mobilebell="Null";
        doorbell=-1;
    }

    void printbell(){
        if (doorbell!=-1){
            System.out.println("Door bell: "+ doorbell);}
        else if(alarmbell!=0.0f){
            System.out.println("Alarm bell: "+ alarmbell);
        }
        else if(!mobilebell.equals("Null")){
            System.out.println("Mobile bell: "+ mobilebell);

        }
        else{
            System.out.println("No bell pressed.");
        }
    }
}

class mainPolymorphism{

    public static void main(String[] args) {
        Polymorphism bell1 = new Polymorphism();
        int a=10;
        float b=20.2f;
        String e= "message tone";
        Polymorphism bell2= new Polymorphism(a);
        Polymorphism bell3= new Polymorphism(b);
        Polymorphism bell4= new Polymorphism(e);
        bell1.printbell();
        bell2.printbell();
        bell3.printbell();
        bell4.printbell();

    }

}
