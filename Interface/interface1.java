interface i1{
    void f();
}
class a1 implements i1{
    public void f(){
        System.out.println("eg of interface");
    }

}

class interface1{
    public static void main(String[] args) {
        a1 obj= new a1();
        obj.f();
    }
}