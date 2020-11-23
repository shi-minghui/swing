package pac;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("请输入数字1");
        while (true){
            Scanner scanner = new Scanner(System.in);
            int sr = scanner.nextInt();
            int x = (int) (Math.random()*100%100);
            int y = (int) (Math.random()*100%100);
            if (sr==1){
                System.out.println("x坐标："+x + "\n" +"y坐标："+y);
            }else {
                System.out.println("输入有误，请重新输入。");
            }
        }
    }
}
