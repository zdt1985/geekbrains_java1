package java_1.lesson_1;

/**
 * Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a,b,c,d
 * – входные параметры этого метода.
 */
public class third {
    public static void main(String[] args){
        System.out.println("Значение выражения a * (b + (c / d)) равно " + exp(58, 98, 17, 58));
        System.out.println("Значение выражения a * (b + (c / d)) равно " + exp(452, 42, 563, 42));
        System.out.println("Значение выражения a * (b + (c / d)) равно " + exp(4, 42, 4, 45));

    }

    private static  int exp(int a, int b, int c, int d){
        return a * (b + (c / d));
    }
}
