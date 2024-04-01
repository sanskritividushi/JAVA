public class strQs {

    public static void main(String[] args) {
        String a="hello world";

        // char b[]= new char[4];
        char c[]= a.toCharArray(); //convert str to char array
        
        for (int i=c.length-1; i>=0; i--){
            System.out.println(c[i]);
        }
        
        System.out.println();

        for (int i=0; i<a.length(); i++){
              System.out.println(a.charAt(i));
        }
        System.out.println();
        
    //     String [] name= new String [] {"hello", "jskbv", "abhja"};
    //     for (int i=0; i<name.length; i++){
    //         System.out.println(name[i]);
    //     }

        

    // String ss="ajhbcdjhjhacbhjajs n svmn";
    // String s=ss.substring(3,10);
    //     System.out.println(s);
    // }
    
}
}