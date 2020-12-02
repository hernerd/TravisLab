public class SimpleCalculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
    public int square(int a) {
        return a * a;
    }
    public int fact(int a) {
        int fact = 1;
        int i = 1;
        while( i <= a){
            fact = fact * i;
            i++;
        }
        return fact;
    }
    public static final void main(String[] args) {
        System.out.println("Hey there CIS350.");
    }
}

