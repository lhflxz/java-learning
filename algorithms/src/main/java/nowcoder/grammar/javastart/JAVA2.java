package nowcoder.grammar.javastart;

import java.util.Scanner;

//https://www.nowcoder.com/practice/6817945637dd4a31811d38313653e967
//JAVA2 简单运算
public class JAVA2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            if (a<b){
                int temp = a;
                a=b;
                b=temp;
            }
            System.out.println((a+b)+" "+(a-b)+" "+(a*b)+" "+(a/b)+" "+(a%b));
        }
    }
}
