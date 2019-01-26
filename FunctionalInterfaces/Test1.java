public class Test1 {

    public static void main(String[] args) {

        FuncInterface obj1 = (int a)->{System.out.println("Hello " + a);};
        obj1.print(1);

        FuncInt2 obj2 = ()->{System.out.println("No arg");};
        obj2.print();
    }
}
