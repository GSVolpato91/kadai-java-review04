package animal;



public class Human extends Animal implements Thinkable{

    private String hobby;

    public Human (String getName, int getAge, String Hobby) {
        getName();
        getAge();

    }


    @Override
    public void think() {
        System.out.println ("私は"+ hobby + "について考えています。");

    }
}