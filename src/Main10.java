public class Main10 {
    //Задача 10
    public static void changePerson(Person10 person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
    public static void main(String[] args) {
        Person10 person = new Person10();
        person.name = "Lyapis";
        person.surname = "Trubetskoy";
        System.out.println("Before changePerson: " + person);
        changePerson(person);
        System.out.println("After changePerson: " + person);
    }
}

