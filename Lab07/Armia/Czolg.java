package Armia;
import java.util.Vector;

import Armia.Identification;

public class Czolg implements Tank{
    private Vector<Rozkaz> listRozkaz;
    private static Identification id;

    public Czolg(){
        listRozkaz=new Vector<Rozkaz>(0);
        //id=new Identification();
    }
    @Override
    public String toString(){
        var help=new StringBuilder();
        //System.out.println(listRozkaz.capacity());
        for(int i=0;i<listRozkaz.size();i++){
            help.append(listRozkaz.elementAt(i).toString()+" \n");
        }
        return help.toString();
    }
    @Override
    public String ostatniRozkaz(){
        return "Ostatni rozkaz do mnie: "+listRozkaz.lastElement().toString();
    }
    @Override
    public void odbierzRozkaz(Rozkaz r){
        listRozkaz.addElement(r);
        //System.out.println(listRozkaz.capacity());
    }
    @Override
    public int getIdentification(){
        return id.valueOf();
    }
}
