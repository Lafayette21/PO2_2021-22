
public class Wielomian{
    private double a=0;
    private double b=0;
    private double c=0;

    public Wielomian(double aN,double bN, double cN){
        a=aN;
        b=bN;
        c=cN;
    }

    public Wielomian(double aN, double bN){
        a=aN;
        b=bN;
    }

    public Wielomian(double aN){
        a=aN;
    }

    public String toString(){
        StringBuilder str=new StringBuilder();
        str.append("f(x) = ");
        if(a!=0){
            str.append(a+"x^2 ");
        }
        if(b!=0){
            str.append("+ "+b+"x ");
        }
        if(c!=0){
            str.append("+ "+c);
        }
        return str.toString();
    }

    public void setABC(double aN,double bN,double cN){
        a=aN;
        b=bN;
        c=cN;
    }
    public double getAtX(double x){
        return a*x*x+b*x+c;
    }
    public double integral(double x1,double x2){
        double p1=((a*x1*x1*x1)/3)+((b*x1*x1)/2)+c*x1;
        double p2=((a*x2*x2*x2)/3)+((b*x2*x2)/2)+c*x2;
        return p2-p1;
    }
}

