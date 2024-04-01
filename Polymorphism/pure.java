class Bell{
    void ansbell(){
        System.out.println("bell pressed in parent class");
    }
}
class mbell extends Bell{
    String mbell;
    void ansbell(){
        System.out.println("MOBLILE RINGING");
        System.out.println(mbell);
    }
}

public class pure {
    public static void main(String[] args) {
        Bell b=new Bell();
        b.ansbell();
        b=new mbell();
        b.ansbell();
    }
}
