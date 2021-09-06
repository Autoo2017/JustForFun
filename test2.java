import java.util.Random;
/**
 * 测试foreach
 * 
 */
public class test2 {

    public static void main(String[] args){
        Random random = new Random();
        int[] a = new int[9];
        for( int i = 0; i < a.length ; i++){
            a[i] = random.nextInt(26)+'a';
        }
        for (int f : a){
            System.out.print((char)f);
        }

    }
}

