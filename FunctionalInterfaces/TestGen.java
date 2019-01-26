public class TestGen {

    public static void main(String[] args) {

        GenFunInt<Integer> obj1 = (Integer a)->{System.out.println("Hello " + a);};
        obj1.print(1);

        GenFunInt<String> obj2 = (String s)->System.out.println("Hi " + s);
        obj2.print("Ayush");

    }
}
