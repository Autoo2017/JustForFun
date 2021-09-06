import java.util.Scanner;

/**
 * 请输入三个整数，判断这三个数的大小，并按格式要求输出最大的那个数。
 * 
 */
public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        int max = 0;
        
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int j = 0; j<num.length-1; j++) {
            if (num[j+1]>num[j]) {
                max = num[j+1];
            }
        }


        sc.close();
        System.out.println("最大的数为:"+max);
    }
}
