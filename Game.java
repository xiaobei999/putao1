package Figurea;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        System.out.println("********欢迎来到猜数字小游戏******");

        System.out.println("是否开始游戏，请输入y(开始)/n(结束)");

        //生成随机数
        Random random = new Random();

       // System.out.println("请输入您想输的数字");
        Scanner scanner = new Scanner(System.in);

        //从控制台输入字符串
            String str = scanner.nextLine();

            if(str.equals("y")){

                //随机生成一个100以内的整数
                int num_1 = random.nextInt(100);

                System.out.println("系统已经生成一个【0-100】随机数，请您输入猜想的数字");

                //循环次数
                int count = 0;

                while (true) {

                    //num_2为用户输入的数
                    int num_2 = scanner.nextInt();

                    //判断输入的数字是否在100以内
                    if(num_2 > 100 || num_2 < 0){

                        System.out.println("请输入【0-100】的数字");

                    }else{

                        if (num_1 == num_2) {

                            System.out.println("恭喜您猜对了！正确数字为"+num_1);

                            break;

                        } else if (num_2 < num_1) {

                            System.out.println("很遗憾，您猜小了");

                            count++;

                        } else if (num_2 > num_1) {

                            System.out.println("很遗憾，您猜大了");

                            count++;

                        }
                        if(count == 5){

                            System.out.println("您的次数已用完，很遗憾，您没有猜对！");

                            System.out.println("正确数字为： "+num_1);

                            break;

                        }

                    }

                }

            }else if(str.equals("n")){

                System.out.println("已经退出游戏，欢迎下次再来！");

            }else{

                System.out.println("输入错误，请重新输入！");

            }

    }

}
