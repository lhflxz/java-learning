package nowcoder.grammar.javastart;

import java.util.Scanner;

//https://www.nowcoder.com/practice/cf4dcda7bf974f83afe38af4b14946a7
//JAVA5 计算商场折扣
public class JAVA5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b;
            if (a>=5000) {
                b=(int)(a*0.6);
            } else if (a>=2000) {
                b=(int)(a*0.7);
            } else if (a>=500) {
                b=(int)(a*0.8);
            } else if (a>=100) {
                b=(int)(a*0.9);
            } else {
                b=(int)(a);
            }
            System.out.println(b);
        }
    }
}
