/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
... */





public class Main {
    public static void main(String[] args) {
        int a=1;
        int b=11;
        int c=1;
        while (c<b) {
            do  {
                System.out.print((a*c)+ " ");
                a++;
            }
                while (a <b) ;
                System.out.println();
                a=1;
                c++;
        };
    }

}
/* можно сторить таблицу размера b-1 X b-1
 в условии нет задачи выравнивания столбцов */
