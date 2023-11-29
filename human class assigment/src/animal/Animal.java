package animal;

public class Animal {

    public String name ;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal () {

    }
    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void say () {
        System.out.println (name + "です。" + age + "歳です。");
    }
}
