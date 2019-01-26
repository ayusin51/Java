interface FuncInterface {

    default void print() {

        System.out.println("Hello.. NO argument!");
    }

    void print(int a);
} 
