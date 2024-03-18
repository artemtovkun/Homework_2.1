public class Main6 {
    //Задача 6
    public static void changeValue6(Integer value6) {
        value6 = 22;
    }
    public static void main(String[] args) {
        Integer value6 = 33;
        System.out.println("До вызова метода changeValue6: " + value6);
        changeValue6(value6);
        System.out.println("После вызова метода changeValue6: " + value6);
    }
}