import java.util.Random;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
import java.io.File;

public class Rnd{
    double[] tab;
    int length;
    //Konstruktor tworzacy tabice double o roziarze size. w ktorej do kazdego elementu dodawane jest n lczb losowanych z przedzialu (0,1)
    Rnd(int size,int n){
        Random help=new Random();
        length=size;
        tab=new double[length];
        for(int i=0;i<length;i++){
            for(int j=0;j<n;j++){
                tab[i]+=help.nextDouble();
            }
        }
    }
    //Wypisanie tablicy na ekran
    public void Print(){
        for(int i=0;i<length;i++){
            System.out.println("["+i+"]="+tab[i]);
        }
    }
    public void Draw(){
        //ustalenie dlugosi slupkow dla poszczegolnych wartosci
        double[] r=new double[length];
        for(int i=0;i<length;i++){
            if(tab[i]==this.Min()){
                r[i]=0;
            }
            else if(tab[i]==this.Max()){
                r[i]=700;
            }
            else{
                double k=this.Max()-this.Min();
                r[i]=((tab[i]-this.Min())/k)*700;
            }
        }
    }
    //Minimalna wartosc tablicy tab
    public double Min(){
        double min=tab[0];
        for(int i=1;i<length;i++){
            if(tab[i]<min){
                min=tab[i];
            }
        }
        return min;
    }
    //Maksymalna wartosc tablicy tab 
    public double Max(){
        double max=tab[0];
        for(int i=1;i<length;i++){
            if(tab[i]>max){
                max=tab[i];
            }
        }
        return max;
    }
    //srednia wszystkich wartosci w tablicy tab
    public double Average(){
        double sum=0;
        for(int i=0;i<length;i++){
            sum+=tab[i];
        }
        return sum/length;
    }
}