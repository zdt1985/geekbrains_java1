package java_1.lesson_1;

/**
 * Создать переменные всех пройденных типов данных, и инициализировать их значения;
 * Ну и для закрепления материала выведу все эти переменные на экран;
 */
public class second {
    public static void main(String[] args){

        //целые
        byte var_byte = 5;
        short var_short = 25763;
        int var_int = 1000000;
        long var_long = 1000000l;

        //плавающая запятая
        float var_float = 0.84f;
        double var_double =0.65848;

        //символ
        char var_char = 'h';

        //логическая булева
        boolean var_boolean = true;

        //выводим все переменные на экран
        System.out.println("var_byte = " + var_byte);
        System.out.println("var_short = " + var_short);
        System.out.println("var_int = " + var_int);
        System.out.println("var_long = " + var_long);
        System.out.println("var_float = " + var_float);
        System.out.println("var_double = " + var_double);
        System.out.println("var_char = " + var_char);
        System.out.println("var_boolean = " + var_boolean);

    }
}
