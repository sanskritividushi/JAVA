import javax.sound.sampled.SourceDataLine;

public class vehicle {
    
}
class automobile{
    String type;
    String color;
    void read(String c, String t){
        type=t;
        color=c;
    }
    void print(){
        System.out.println("Color: "+ color);
        System.out.println("Type: "+ type);
    }
}
class car extends vehicle{
    String model;
    void head(String m, String t, String c){
        read(c,t);
        model=m;

    }
}
