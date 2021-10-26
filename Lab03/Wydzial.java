import java.util.Vector;

public class Wydzial {
    private Vector<Student> baza;

    Wydzial(){
        baza=new Vector<Student>(0);
    }
    public void add_student(Student s) throws NullPointerException{
        if(baza.contains(s)){
            System.out.println("Ten student juz jest w bazie");
        }
        else{
            baza.addElement(s);
        }
    }
    public void wypisz_baze(){
        for(int i=0;i<baza.capacity();i++){
            baza.get(i).wypisz();
        }
    }
}
