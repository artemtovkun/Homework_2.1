public class Main9 {
    //Задача 9
    public static void changePerson(Person9 person) {
        person = new Person9();
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
    public static void main(String[] args) {
        Person9 person = new Person9();
        person.name = "Lyapis";
        person.surname = "Trubetskoy";
        System.out.println("Before changePerson: " + person);
        changePerson(person);
        System.out.println("After changePerson: " + person);
    }
}

