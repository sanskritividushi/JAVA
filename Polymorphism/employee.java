class info{
    String name;
    String gender;
    int age;
    String type;

    info(String n, String g, int a, String t){
        this.name=n;
        this.gender =g;
        this.type=t;
        this.age=a;
    }   
    void print(){
        System.out.println("Name: "+ this.name);
        System.out.println("Gender: "+ this.gender);
        System.out.println("Age: "+ this.age);
        System.out.println("Type: "+this.type);
    }
}

class infomanager extends info{
    String designation;

    infomanager(String n,String g,int a, String t,String des){
        super(n,g,a,t);
        this.designation=des;
    }
    void print(){
        System.out.println("Access managers:");
        super.print();
        System.out.println("designation: "+ this.designation);
    }
}

class infomember extends infomanager{
    int projectno;

    infomember(String n,String g,int a, String t,String des, int p){
        super(n,g,a,t,des);
        this.projectno=p;
    }
    void print(){
        System.out.println("Access members:");
        super.print();
        System.out.println("Project No.: "+ this.projectno);
    }
}

public class employee {
    public static void main(String[] args) {
        info i1= new infomanager("sanskriti", "F", 22, "intern", "manager");
        i1.print();
        info i2=new infomember("vishesh", "male",29, "Intern", "assistant", 12);
        i2.print();
    }
}


