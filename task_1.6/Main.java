/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;
public class Main {
               public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
     float IN = scan.nextInt();
     float OUT ;
            OUT =  (IN/100) * 15 + IN ;
        System.out.println( OUT);
    }
}
