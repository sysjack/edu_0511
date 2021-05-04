/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/
public class Main {
    public static void main (String[] args) {
        int [] arr={2,3,4,5};
       int result=1;
       for (int i=0;i<arr.length;i++) {
           result*=arr[i];
        }
System.out.println("Произведение элементов массива [2,3,4,5] равно "+result);
    }
}
