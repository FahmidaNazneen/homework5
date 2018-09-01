package Finalize_Gc;

public class TestFinalize {
    public static void main(String[] args) {
        String st = new String("house");
        System.out.println(st);
        st = null;
        System.gc();



    }
}






