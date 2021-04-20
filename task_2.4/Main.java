/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
        System.out.print( "Введите сумму вклада:");
       float vklad = scan.nextFloat();
        System.out.print( "Введите процент:");
        float percent = scan.nextFloat();
        float money=vklad;
               for (int i=1; i<6; i++) {
                    money = money*(1+percent/100);
                    System.out.println(i+" "+"год"+" "+ money );
        }
    }

}
