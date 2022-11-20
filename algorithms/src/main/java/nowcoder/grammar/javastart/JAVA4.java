package nowcoder.grammar.javastart;

import java.util.Scanner;

//https://www.nowcoder.com/practice/bd243c9bef70492f91959cc5556546a8
//JAVA4 交换变量值
public class JAVA4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            int temp=a;
            a=b;
            b=temp;
            System.out.println(a+" "+b);
        }
    }
}
