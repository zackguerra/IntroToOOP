package zackstudies.collections;

public class Programmer extends Writer {
    public void write(){
        System.out.println("Writing code");
    }

    public static void main(String[] args) {
        Writer w = new Programmer();
        w.write();
    }
    
}
