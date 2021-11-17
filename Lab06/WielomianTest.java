import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class WielomianTest{
    public WielomianTest(){
        System.out.println("Zaczynamy test");
    }
    @BeforeEach
    public void help(){
        System.out.println("Test");
    }
    @Test
    public void testIntegral1(){
        System.out.println("Test integral");
        double expectedResualt=43.5;
        var wiel=new Wielomian(2,3,4);
        assertEquals(expectedResualt,wiel.integral(0,3));
    }
    @Test
    public void testIntegral2(){
        System.out.println("Test integral");
        double expectedResualt=729;
        var wiel=new Wielomian(2,4,9);
        assertEquals(expectedResualt,wiel.integral(0,9));
    }
    @Test
    public void testIntegral3(){
        System.out.println("Test integral");
        double expectedResualt=450;
        var wiel=new Wielomian(1,4,5);
        assertEquals(expectedResualt,wiel.integral(0,9));
    }
    @Test
    public void testIntegral4(){
        System.out.println("Test integral");
        double expectedResualt=12075;
        var wiel=new Wielomian(10,6,10);
        assertEquals(expectedResualt,wiel.integral(0,15));
    }
    

    @Test
    public void testGetAtX(){
        System.out.println("Test GetAtX");
        double expectedResualt=9;
        var wiel=new Wielomian(2,3,4);
        assertEquals(expectedResualt,wiel.getAtX(1));
    }
}