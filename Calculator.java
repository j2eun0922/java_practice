public class Calculator {
    public int add(short a, short b) {
        if(a + b > Short.MAX_VALUE) {
            return -1;
        }
        return (int)(a + b);
    }
}