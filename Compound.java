// this program find the compound interest of Mr bob
import java.lang.Math;
public class Compound {

    int time;
    double rate;
    long principle;
    int n;


    void getamount(int t,  double r, long p ,int m) //methods and attributes
    {

        time= t;
        rate= r;
        principle= p;
        n = m;
    }
    void calculation()
    {
        double Compound= principle*Math.pow(1+rate/n, n * time);// the formular of compound interest
        System.out.println(Compound);
    }
    public static void main(String[] args) {
            
        Compound s= new Compound ();
        s.getamount(3,0.18, 500000 ,12); 
        s.calculation();
    }
}
