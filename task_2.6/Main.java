/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print( "Введите первую переменную: ");
     double a = scan.nextDouble();
        System.out.print( "Введите вторую переменную: ");
        double b = scan.nextDouble();
        if (a%b==0) {
        System.out.println("Делится "+(a/b)); } else  System.out.println("Делится с остатком "+ a%b);
    }

}
