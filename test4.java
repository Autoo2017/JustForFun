/***
 * 输出10~99之间十位数比个位数大的数。
 * 
 */
public class test4 {
    public static void main(String[] args){
        int count = 100;
        while(count < 100){
            
            if(count % 10 < count / 10){

                System.out.println(count);

            }
            ++count;
        }

    }
}
