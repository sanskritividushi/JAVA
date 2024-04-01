class A {
    private int ab;
    A(int a){
        this.ab=a;
    }
    void print(){
        System.out.println("a= "+ab);
    }
    private void printx(){
        System.out.println("Private");
    }
    
}

class pvt{
    public static void main(String[] args) {
        A obj = new A(10);
        obj.print();
        System.out.println(obj.ab); // wont print for object since "a" is private 
        obj.print();
    }
}
