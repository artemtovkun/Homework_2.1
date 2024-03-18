public class Main5 {
    //Задача 5
    public static void changeValue5(int value5) {
        value5 = 22;
    }
    public static void main(String[] args) {
        int value5 = 33;
        System.out.println("До вызова метода changeValue5: " + value5);
        changeValue5(value5);
        System.out.println("После вызова метода changeValue5: " + value5);
    }
}
