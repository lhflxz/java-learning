package nowcoder.grammar.javastart;

import java.util.Scanner;

//https://www.nowcoder.com/practice/cae89de6292b4084acb93659353260e0
//JAVA3 四舍五入
public class JAVA3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            double a = in.nextDouble();
            long b;
            b=Math.round(a);
            System.out.println(b);
        }
    }
}
