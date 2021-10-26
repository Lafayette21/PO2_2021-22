public class Student{
    private int ID;
    private String Imie;
    private String Nazwisko;
    private static int ile;

    Student(int id,String name,String l_name){
        ID=id;
        Imie=name;
        Nazwisko=l_name;
        ile++;
    }
    public String get_name(int id){
        if(ID==id){
            return new String(Imie+" "+Nazwisko);
        }
        else
            return "Bledne id";
    }
        

    public int get_id(String name,String l_name){
        if(name==Imie && l_name==Nazwisko){
            return ID;
        }
        else return 0;
    }

    public void wypisz(){
        System.out.println(ID+" "+Imie+" "+Nazwisko);
    }

    public static int ile_studentow(){
        return ile;
    }


}