public class whileloop2 {
    public static void main(String[]args){

        int i=1;
        int j=10;

        while( i <= 10)
        {
            while(j > 0)
            {
                int s = i * j;
                System.out.print(s);
                j--;
            }
            i++;
            System.out.println();
       }
    }
    
}
