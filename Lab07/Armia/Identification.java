package Armia;

public class Identification {
    private static int id=0;
    public Identification(){
        id++;
    }
    public String toString(){
        return Integer.toString(id);
    }
    public int valueOf(){
        return id;
    }
}
