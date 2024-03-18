import java.util.Arrays;
public class Main8 {
    //Задача 8
    public static void changeValue8(Integer[] value8) {
        value8[0] = 99;
    }
    public static void main(String[] args) {
        Integer[] value8 = {3, 4};
        System.out.println("Массив value до вызова changeValue8: " + Arrays.toString(value8));
        changeValue8(value8);
        System.out.println("Массив value после вызова changeValue8: " + Arrays.toString(value8));
    }
}
