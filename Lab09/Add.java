public class Add{
    public void add(int ...x){
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum+=x[i];
        }
        System.out.print(x[0]);
        for(int i=1;i<x.length;i++){
            System.out.print(" + "+x[i]);
        }
        System.out.print(" = "+sum);
        System.out.println();
    }     
}