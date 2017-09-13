package chap2_2;


public class TestInJava {

    public static void main(String[] args) {

        PersonInKotlin bob = new PersonInKotlin("Bob", false);

        System.out.println("name : " + bob.getName() + ", isMarried : " + bob.isMarried());
    }
}
