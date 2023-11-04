//This program is identifying classes and methods
public class Simple{
    int year;  
    double rate;
    long  principle;
    

    void getamount(int y, double r,   long p)//initialize methods and attributes
    {

        year=y;
        rate = r;
        principle=p;
    }
    void calculation()
        {
            double interest = year*principle*rate;//formular of Simple interest
            System.out.println(interest);

        }  

        public static void main(String[] args) {
            
            Simple s= new Simple();
            s.getamount(5,0.05, 100000);
            s.calculation();
        }
    


}
