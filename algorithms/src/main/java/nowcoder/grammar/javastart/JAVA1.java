package nowcoder.grammar.javastart;

import java.util.Scanner;

//https://www.nowcoder.com/practice/0540ee3987b64bd7bb93adb5bd0e35d4
//JAVA1 类型转换
public class JAVA1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            double a = in.nextDouble();
            int b = (int)a;
            System.out.println(b);
        }
    }
}
