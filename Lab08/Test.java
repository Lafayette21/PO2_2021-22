import java.util.Vector;
import java.util.Arrays;

public class Test{
    private Vector<int[]> testy;
    //Ilosc liczb
    private int n;
    //Liczba testow
    private int m;

    public Test(int nn,int mm){
        m=mm;
        n=nn;
        testy=new Vector<int[]>(0); 
    }
    public void addTest(int[] t){
        if (testy.size()>m){
            System.out.println("Juz nie mozesz dodac wiecej testow");
        }
        else{
            testy.addElement(t);
        }       
    }
    public String przeprowadzTest(){
        var grupy1=new Vector<int[]>(0);
        var grupy2=new Vector<int[]>(0);
        for(int i=0;i<m;i++){
            int[] g1=new int[n/2];
            int[] g2=new int[n/2];
            for(int j=0;j<n/2;j++){
                g1[j]=testy.get(i)[j];
                g2[j]=testy.get(i)[n/2+j];
            }
            Arrays.sort(g1);
            Arrays.sort(g2);
            grupy1.addElement(g1);
            grupy2.addElement(g2);
        }
        int x1=0;
        int x2=0;
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n/2;j++){
                for(int k=j+1;k<n/2;k++){
                    x1=grupy1.get(i)[j];
                    x2=grupy1.get(i)[k];
                    for(int z=0;z<m;z++){
                        //Sprawdzenie z grupami 2
                        if(Arrays.binarySearch(grupy2.get(z),x1)>0 && Arrays.binarySearch(grupy2.get(z),x2)>0){
                            return "Nie";
                        }
                        if(z==i){
                            continue;
                        }
                        //Sprawdzenie z grupami 1
                        if(Arrays.binarySearch(grupy1.get(z),x1)>0 && Arrays.binarySearch(grupy2.get(z),x2)>0){
                            return "Nie";
                        }
                    }
                }
            }
        }
        return "Tak";
        

    }
    public void printTesty(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(testy.get(i)[j]+" ");
            }
            System.out.println();
        }
    }
}