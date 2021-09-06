/**
 * 请输出100~999之间所有的回文数
 * **/
public class test5 {
    public static void main(String[] args) {
            int count = 100;
            while(count < 1000){
                
                if(count % 10 == count / 100){
    
                    System.out.println(count);
    
                }
                ++count;
            }
    
        }
    }

