package java_1.lesson_1;

/**
 * Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
 * пределах 10 до 20, если да – вернуть true, в противном случае – false.
 */
public class fourth {
    public static void main(String[] args){
        System.out.println(test(2, 3));
        System.out.println(test(5, 5));
        System.out.println(test(7, 8));
        System.out.println(test(10, 10));
        System.out.println(test(15, 7));
    }

    private static boolean test(int a, int b){
        if (10 <= a+b & a+b <= 20){
           return true;
        }else{
           return false;
        }
    }
}
