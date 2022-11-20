package nowcoder.grammar.javastart;

import java.util.Scanner;

//https://www.nowcoder.com/practice/688f96cc38bb4a76996698d2f987b1b5
//JAVA6 判断体重指数
public class JAVA6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            double a = in.nextDouble();
            double b = in.nextDouble();
            double bmi = b/(a*a);
            String health;
            if (bmi<18.5){
                health="偏瘦";
            }else if (18.5<=bmi && bmi<20.9){
                health="苗条";
            }else if (20.9<=bmi && bmi<24.9){
                health="适中";
            }else{
                health="偏胖";
            }
            System.out.println(health);
        }
    }
}
