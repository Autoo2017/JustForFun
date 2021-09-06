import java.util.*;
/***
 * 测试冒泡排序
 * 
 */
public class test1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tmp;
        int[] a = new int[3];
        //input some number
        for(int i = 0 ; i <= a.length-1; i++){
            System.out.println("请输入第（"+(i+1)+"/3）个数字");
            a[i] = sc.nextInt();

        }
        sc.close();
        //array the number
        for(int x = 0; x<a.length - 1;x++){
            for (int y = 0; y < a.length -x -1; y++) {
                if (a[y]>a[y+1]) {
                    tmp = a[y+1];
                    a[y+1] = a[y];
                    a[y] = tmp;
                }
            }

        }
        //output the number that after array
        for(int o = 0; o<a.length;o++){
            System.out.print(a[o]+",");

        }
        
    }
}