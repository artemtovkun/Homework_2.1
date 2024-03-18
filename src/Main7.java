import java.util.Arrays;
public class Main7 {
    //Задача 7
    public static void changeValue7(Integer[] value7) {
        value7 = new Integer[]{1, 2};
    }
    public static void main(String[] args) {
        Integer[] value7 = {3, 4};
        System.out.println("Массив value до вызова changeValue7: " + Arrays.toString(value7));
        changeValue7(value7);
        System.out.println("Массив value после вызова changeValue7: " + Arrays.toString(value7));
    }
}

