/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
      int [] arr={2,3,4,7,6,7,8,9,10};
       String result= "Нет";
       for (int i=0;i<arr.length;i++) {
           if (arr[i] == 5) result="Да";
        }
    System.out.println(result);

    }
}
