/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, по вашему усмотрению
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/
public class Main {
    public static void main(String[] args) {

    }
}


class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if (this.weight != anotherCat.weight || this.age != anotherCat.age || this.strength != anotherCat.strength) {
            int countThisCat = 0;
            int countAnotherCat = 0;
            if (this.age > anotherCat.age) {
                countThisCat++;
            } else if (this.age != anotherCat.age)
                countAnotherCat++;
            if (this.weight > anotherCat.weight) {
                countThisCat++;
            } else if(this.weight != anotherCat.weight){
                countAnotherCat++;
            }
            if (this.strength > anotherCat.strength) {
                countThisCat++;
            } else if(this.strength != anotherCat.strength){
                countAnotherCat++;
            }
            if (countThisCat > countAnotherCat) {
                return true;
            } else
                return false;
        } else
            return false;
    }


}
