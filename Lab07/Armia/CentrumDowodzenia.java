package Armia;
import java.security.Principal;
import java.util.Vector;

public class CentrumDowodzenia implements CentrumDow{
    private Vector<Czolg> listaCzolg;

    public CentrumDowodzenia(){
        listaCzolg=new Vector<Czolg>(0);
    }
    @Override
    public void zarejestrujCzolg(Czolg c){
        listaCzolg.addElement(c);
        //System.out.println(listaCzolg.capacity());
        
    }
    @Override
    public void wydajRozkaz(String nrCzolgu,Rozkaz tresc){
        listaCzolg.elementAt(Integer.valueOf(nrCzolgu)-1).odbierzRozkaz(tresc);
        
    }
    @Override
    public String toString(){
        var help=new StringBuilder();
        int x=listaCzolg.capacity();
        for(int i=0;i<x;i++){
            help.append("Czolg nr "+(i+1)+"\n");
            help.append(listaCzolg.elementAt(i).toString());
        }
        return help.toString();
    }
}