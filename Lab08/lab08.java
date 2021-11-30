import java.util.Arrays;

public class lab08{
    public static void main(String[] args) {
        var test=new Test(4,2);
        int[] t1={1,2,3,4};
        int[] t2={1,3,2,3};
        test.addTest(t1);
        test.addTest(t2);
        System.out.println(test.przeprowadzTest());

        var test2=new Test(6,3);
        int[] t3={3,5,2,4,6,1};
        int[] t4={1,4,5,2,3,6};
        int[] t5={4,5,6,1,2,3};
        test2.addTest(t3);
        test2.addTest(t4); 
        test2.addTest(t5);
        System.out.println(test2.przeprowadzTest());  

    }
}