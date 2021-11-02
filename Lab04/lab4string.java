public class lab4string{

    public static int dlugosc(String s){
        return s.length();
    }

    public static int ile_razy_literka_wystepuje(String s,char z){
        int l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==z){
                l++;
            }
        }
        return l;
    }

    public static boolean czy_takie_same(String s1,String s2){
        return s1.equals(s2);
    }

    public static String wspak(String s){
        char[] help=new char[s.length()];
        for(int i=0;i<s.length();i++){
            help[i]=s.charAt(s.length()-1-i);
        }
        return new String(help);
    }

    public static boolean czy_plaindrom(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    /**
     * Static Method which checks whether String s is "abecadlowy"
     * @param s String 
     * @return True if characters are in ascending order false if not
     */
    public static boolean czy_abecadlowe(String s){
        for(int i=0;i<s.length()-1;i++){
            if((int)s.charAt(i)>(int)s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    /**
     * Metoda przemienia String s poprzez przesuniecie wszystkich znakow o 13 do przodu. W wypadku wyjscia poza zakres alfabetu litera zaczyna od jego poczatku. Na przyklad A przechodzi w N,a Z w M
     * 
     * @param s String to convert
     * @return new String in wch
     */
    public static String rot13(String s){
        int k=13;
        char[] help=new char[s.length()];
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            char z=(char)((int)p+k);
            if(p==' ' || (p<'a' || p>'z') && (p<'A' || p>'Z')){
                help[i]=p;
            }
            else if((z>'a' && z<'z') || (z>'A' && z<'Z')){
                help[i]=z;
            }
            else{
                help[i]=(char)((int)z-26);
            }
        }
        return new String(help);
        
    }
}