package java_1.lesson_1;

/**
 * Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a,b,c,d
 * – входные параметры этого метода.
 */
public class third {
    public static void main(String[] args){
        int a, b, c, d;
        a = 23;
        b = 43;
        c = 65;
        d = 54;
        System.out.println("Значение выражения a * (b + (c / d)) равно " + exp(a, b, c, d));
    }

    private static  int exp(int a, int b, int c, int d){
        return a * (b + (c / d));
    }
}
