package pac;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            int x = (int) (Math.random()*100%100);
            int y = (int) (Math.random()*100%100);
            Thread.sleep(1000);
            System.out.println("x坐标："+x + " " +"y坐标："+y);
        }
    }
}
