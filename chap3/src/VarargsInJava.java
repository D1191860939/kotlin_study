public class VarargsInJava {

    public static void main(String[] args) {

        method("hello world");

    }

    public static void method(String str, int... args){

        for (int i = 0; i < str.length(); i++) {
//            char = str.charAt(i);
        }
    }
}
