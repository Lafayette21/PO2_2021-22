public class lab09
{
  static double calculate(Dzialanie d,double a,double b){
    return d.wykonaj(a, b);
  }
  static double calculate(Dzialanie2 d,double a){
    return d.przeciwna(a);
  }

 //Tej metody nie wolno zmieniać!!!! (Resztę pliku wolno).
 public static void main(String[] args)
  {
   System.out.printf("2.2 + 2.2 = %f%n", calculate((double v1, double v2) -> v1 + v2, 2.2, 2.2));
   System.out.printf("44 / 2.0 = %f%n", calculate((v1, v2) -> v1 / v2, 44, 2.0));
   System.out.printf("-66 = %f%n", calculate(v -> -v, 66));
   System.out.printf("8 * 8 = %f%n", calculate((double v) -> v * v, 8));
 
   //Uwaga! Klasa Add MUSI zawierać tylko jedną funkcję!!!!
   Add oblicz=new Add();
   oblicz.add(1,2);
   oblicz.add(1,2,3);
   oblicz.add(1,2,3,4,5); 
   oblicz.add(1,2,3,4,5,6);
  }




}

/*
Wyjście z programu wygląda tak:

2.2 + 2.2 = 4,400000
44 / 2.0 = 22,000000
-66 = -66,000000
8 * 8 = 64,000000
1+2=3
1+2+3=6
1+2+3+4+5=15
1+2+3+4+5+6=21
*/