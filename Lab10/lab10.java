import java.io.*;

public class lab10{
    public static void main(String[] args) {
        try{
            BufferedReader in= new BufferedReader(new FileReader("dane.txt"));
    
            var ilosc=in.lines();
            var liczby=ilosc.toArray();
            //Wyjatek arytmetyczny
            if(liczby.length==0){
                in.close();
                throw new ArithmeticException();
            }


            double[] tab=new double[liczby.length];
            for(int i=0;i<liczby.length;i++)
            {
                tab[i]=Double.valueOf(liczby[i].toString());
            }
            
            double suma=0;
            for(int i=0;i<liczby.length;i++)
            {
                suma+=tab[i];
            }
            System.out.println(suma/liczby.length);
            in.close();
        }
        catch(FileNotFoundException e){
            System.err.println("Nie znaleziono pliku!");
        }
        catch(NumberFormatException e){
            System.err.println("Dane w pliku sa zle ustawione!");
        }
        catch(IOException e){
            System.err.println("Blad ze strumieniem wejscia wyjscia!");
        }
        catch(ArithmeticException e){
            System.err.println("Nie podano zadnej liczby w pliku");
        }
        catch(Exception e){
            System.err.println("Jakis inny blad");
        }
    }


}
    
