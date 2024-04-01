public class Removevowels {

    public static void main(String[] args) {
        String str="JAVA EXAM";
        String s=str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(s);

        char ch='\0';
        String str2="JAVA EXAM";
        for (int i=0; i<str2.length(); i++){
            if (str2.charAt(i)=='a' || str2.charAt(i)=='e' || str2.charAt(i)=='i' || str2.charAt(i)=='o' || str2.charAt(i)=='u' ||str2.charAt(i)=='A' || str2.charAt(i)=='E' || str2.charAt(i)=='I' || str2.charAt(i)=='O' || str2.charAt(i)=='U'  ){
                str2=str2.replace(str2.charAt(i),ch);
            }
        }

        System.out.println(str2);

        String str3= "JAVA EXAM";
        String str4="";
        for (int i=0; i<str3.length(); i++){

            if (str3.charAt(i)!='a' || str3.charAt(i)!='e' || str3.charAt(i)!='i' || str3.charAt(i)!='o' || str3.charAt(i)!='u' ||str2.charAt(i)=='A' || str2.charAt(i)=='E' || str2.charAt(i)=='I' || str2.charAt(i)=='O' || str2.charAt(i)=='U'  ){
                continue;
            }
            else{
                str4=str4+str3.charAt(i);
            }
            System.out.println(str4);
        }
        
        

        
    }
    
}
