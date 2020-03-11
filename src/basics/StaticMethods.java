package basics;

public class StaticMethods {
    public static void main(String[] args) {
        int result = add(10,20);
        System.out.println(result);
        printName("Vancouver");
        int x = 10;
        int y = 7;
        swap(x, y);
        System.out.println("x = " + x + ", y = " +y);  // no swap
    }

    // Static Method
    public static int add(int a, int b) {
        return a + b;
    }


    // Method Prototype (header)
    // public: means this method can be called from outside of this class
    // static: means we can call this method without creating an object of this class
    // void: "empty" --> no 'return'value
    // printName: method name
    // (String name): a parameter (Type param, Type param, ...)
    public static void printName(String name) {
        System.out.println(name);
    }

    // pass by values (primitive types)
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    // pass by reference (reference types)




    }

}