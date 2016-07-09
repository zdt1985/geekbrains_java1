package java_1.lesson_1;

/**
 * Написать метод, который определяет является ли год високосным.
 * Каждый 4й  год является  високосным,
 * кроме каждого 100го,  при этом каждый 400й  – високосный.
 */
public class fifth {
    public static void main(String[] args){
        leap_year(4);
        leap_year(100);
        leap_year(400);
        leap_year(1001);
        leap_year(2016);
    }
    private static void leap_year(int a){
        if (a%4 == 0 & a%100 != 0){
            System.out.println("Год " + a + " является високосным.");
        }else if (a%100 == 0 & a%400 != 0){
            System.out.println("Год " + a + " не является високосным.");
        }else if (a%100 == 0 & a%400 == 0){
            System.out.println("Год " + a + " является високосным.");
        }else{
            System.out.println("Год " + a + " не является високосным.");
        }
    }
}
