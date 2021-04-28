.getInfo();
    }
}

class Person{
    private String name;
    private int age;
    private int hp;
    private Person mother;
    private Person father;

    public Person(String name, int age, Person mother, Person father) {
        this.name = name;
        this.age = age;
        this.hp = 100;
        this.mother = mother;
        this.father = father;
    }
    public void getInfo(){
        String info= "Меня зовут "+this.name+"\n";
        if(this.mother != null){
            info += "Мою маму зовут "+this.mother.name+"\n"; // info = info + "Мою маму...";
            if (this.mother.mother != null){
                info += "Бабушка по маме "+this.mother.mother.name;
            }
        }
        if(this.father != null){
            info += "Моего папу зовут "+this.father.name+"\n";
        }
        System.out.println(info);
    }
    public Person getMother() {
        return mother;
    }
    public Person getFather() {
        return father;
    }
    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        if(this.hp + hp > 100) this.hp = 100;
        else this.hp = this.hp + hp;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
