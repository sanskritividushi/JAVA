public class newprac {
    public static void main(String[] args) {
        int a=30;
        for (int i=2; i<a;i++){
            if (a%i==0){
                System.out.println(a + " is not prime");
                break;
            }
            else{
                System.out.println(a + " is prime");
                break;
            }
        }
    }
}
