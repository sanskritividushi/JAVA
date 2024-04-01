public class adhoc {
    public static void main(String[] args) {
        Respond r1=new Respond("Door",1);
        r1.AnswerBell("mom");
        r1.AnswerBell(1);
        // r1.AnswerBell("Guest");
        // r1.AnswerBell(2);
    }
}
class Respond{
    String Dbell;
    int Mbell;
    Respond(String D, int Mbell){
        Dbell=D;
        this.Mbell=Mbell;
    }

    void AnswerBell(String D){
        System.out.println("Doorbell Pressed");
        System.out.println("Door Opened");
        System.out.println(D+" Arrived");
    }

    void AnswerBell(int Mbell){
        System.out.println("Mobile Ringing");
        switch(Mbell){
            case 1: System.out.println("INcomding calls");break;
            case 2: System.out.println("messagee");break;
        }
    }
}
