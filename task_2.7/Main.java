/*
Задание: Дано число, например 31. Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы. То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30. Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print( "Введите число:");
        int num = scan.nextInt();
            for ( int i=2; i < num; i++) {
                if ( num%i == 0) {
                    System.out.println("True");
                    return;
                }
            }
            System.out.println("False");
        }
    }
