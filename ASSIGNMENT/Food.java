public class Food {

    public void xc(){

        System.out.println("Food is the best!");
    }
}
 interface grains {
    void show ();
}
class Popcorns extends Food {
    public void  Lo(){
        System.out.println("You choose what you want.");
    }
}
class maize extends Popcorns  implements grains{
    public void show (){}
    }

class Allfood extends maize{
 public void LI(){
    System.out.println("And then were are satisfied.");
 }
}
class Recipe{
    public static void main(String[] args) {
        
    
    Allfood allfood= new Allfood();

    System.out.println();// jump line
    allfood.xc();
   allfood.Lo();
    allfood.LI();
    System.out.println();// jump line
    


}
}