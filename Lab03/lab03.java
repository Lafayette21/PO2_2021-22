public class lab03 {
    public static void main(String[] args) throws NullPointerException {
        Student s1=new Student(560,"Marcin","Urbanowicz");
        Student s2=new Student(126,"Adam","Urbanowicz");
        Student s3=new Student(123,"Jan","Niezbedny");
        Student s4=new Student(124,"Jan","Niezbedny");

        Wydzial w=new Wydzial();
        w.add_student(s1);
        w.add_student(s2);
        w.add_student(s3);
        w.add_student(s4);
        System.out.println(Student.ile_studentow());
        w.wypisz_baze();
        
    }
}
