package javabasicsday9;

public class FinalVariable {

    final int x = 100;
    final static int Y;
    final static int Z = 10;

    void change() {
       //  x = 30; // This will cause a compilation error
         //Y = 200; // This will cause a compilation error
    }

    @Override
    public String toString() {
        return "FinalVariable [x=" + x + ", Y=" + Y + "]";
    }

    static {
        Y = 20;
        // Z = 100; // This will cause a compilation error
        System.out.println("Value of Y: " + Y);
    }

    public static void main(String[] args) {
        FinalVariable fv = new FinalVariable();
        System.out.println(fv);
    }
}
