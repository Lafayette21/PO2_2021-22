public class Student{
    private String fname;
    private String lname;
    private int age;

    public Student(){}

    public Student(String fn,String ln,int ag){
        fname=fn;
        lname=ln;
        age=ag;
    }

    public void setImie(String n){
        fname=n;
    }

    public void setNazwisko(String n){
        lname=n;
    }

    public void setWiek(int a){
        age=a;
    }

    public String getImie(){
        return fname;
    }
    public String getNazwisko(){
        return lname;
    }
    public String getWiek(){
        return Integer.valueOf(age).toString();
    }
    public String toString(){
        return fname+" "+lname+" "+age;
    }
}