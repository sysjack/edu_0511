/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print( "Введите число: ");
        Scanner scan = new Scanner (System.in);
        double IN = scan.nextDouble();
        System.out.println( IN+ " плюс 15 % равно " + ((IN/100) * 15 + IN));
    }
}
