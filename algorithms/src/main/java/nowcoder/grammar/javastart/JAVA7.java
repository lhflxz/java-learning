package nowcoder.grammar.javastart;

import java.util.Scanner;

//https://www.nowcoder.com/practice/caef110bb06149119672a4dd2bc5d4ad
//JAVA7 判断学生成绩等级
public class JAVA7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String a = in.next();
            String grade;
            switch (a){
                case "A":
                    grade="优秀";
                    break;
                case "B":
                    grade="良好";
                    break;
                case "C":
                    grade="及格";
                    break;
                case "D":
                    grade="不及格";
                    break;
                default:
                    grade="未知等级";
            }
            System.out.println(grade);
        }
    }
}
