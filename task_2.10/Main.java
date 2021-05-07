/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
      int [] arr={2,3,4,9,7,7,8,9,10};
       String result= "Нет";
       for (int i=0;i<arr.length;i++) {
           if (arr[i] == arr[i+1]) result="Да";
        }
      System.out.println(result);
    }
}
