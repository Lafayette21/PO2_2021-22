import java.util.*;


public class Lista_Studentow {
    private Vector<Student> vect;

    public Lista_Studentow(){
        vect=new Vector<Student>(0);
    }

    public void add(Student s1){
        vect.addElement(s1);
    }

    public void add(String fname,String lname,int age){
        Student s=new Student(fname,lname,age);
        vect.addElement(s);
    }
    public void wypisz_wszystkich(){
        for(Student s:vect){
            System.out.println(s.toString());
        }
    }
    //imie
    public void sort_imie_rosnaca(){
        Collections.sort(vect,new CompareNameAsc());
    }
    public void sort_imie_malejaca(){
        Collections.sort(vect,new CompareNameDes());
    }
    //nazwisko
    public void sort_nazwisko_rosnaca(){
        Collections.sort(vect,new CompareLnameAsc());
        
    }
    public void sort_nazwisko_malejaca(){
        Collections.sort(vect,new CompareLnameDes());
        
    }
    //wiek
    public void sort_wiek_rosnaca(){
        Collections.sort(vect,new CompareAgeAsc());
        
    }
    public void sort_wiek_malejaca(){
        Collections.sort(vect,new CompareAgeDes());
        
    }
}

class CompareNameAsc implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.getImie().compareTo(s2.getImie());
    }
}

class CompareNameDes implements Comparator<Student>{
    
    public int compare(Student s1,Student s2){
        return -s1.getImie().compareTo(s2.getImie());
    }
    
}

class CompareLnameAsc implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.getNazwisko().compareTo(s2.getNazwisko());
    }   
}

class CompareLnameDes implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return -s1.getNazwisko().compareTo(s2.getNazwisko());
    }
    
}


class CompareAgeAsc implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.getWiek().compareTo(s2.getWiek());
    }
}

class CompareAgeDes implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return -s1.getWiek().compareTo(s2.getWiek());
    }
}