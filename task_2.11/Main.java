/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main (String[] args) {
        int [] arr={19,3,1,1,3,7,8,9,10};
            int summ = 0;
            for (int i = 0; i < arr.length; i++) {
                summ += arr[i];
                if (summ >=11) {
                    System.out.println("Чтобы сумма получилось больше 10, надо сложить " + (i + 1) + " элементов массива.");
                    break;
                }
            }

    }
}
