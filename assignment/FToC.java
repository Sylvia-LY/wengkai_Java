import java.util.Scanner;

public class FToC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double f = in.nextDouble();
        double c = (f-32)*5/9;
        System.out.println("Temperature in Celsius is: "+(int)c);
    }
}

// 温度转换（5分）
// 题目内容：
// 写一个将华氏温度转换成摄氏温度的程序，转换的公式是：
// °F = (9/5)*°C + 32
// 其中C表示摄氏温度，F表示华氏温度。
// 程序的输入是一个整数，表示华氏温度。输出对应的摄氏温度，也是一个整数。
// 提示，为了把计算结果的浮点数转换成整数，需要使用下面的表达式：(int)x;
// 其中x是要转换的那个浮点数。