import java.util.*;

public class GetRandom {
    
    public int random(int minimum,int maximum,int exception) {
        
        Random random = new Random();
        int num = random.nextInt(maximum - minimum +1) + minimum;

        try {
            if(minimum > exception || maximum < exception)
                {throw new IllegalArgumentException();}
        } catch (IllegalArgumentException e) {
            System.err.print(e);
            System.err.println(": \"exception\" is greater than the maximum value or less than the minimum value");
            System.exit(1);
        } finally {
            while(num == exception){
                num = random.nextInt(maximum - minimum + 1) + minimum; 
            }
        }    
        return num;
    }
   
}
