package Armia;
import java.util.*;

public interface Tank {

    public void odbierzRozkaz(Rozkaz r);
    public String ostatniRozkaz();
    public String toString();
    public int getIdentification();

    
}
