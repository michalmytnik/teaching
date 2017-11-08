package sr08112017;

public class App {
    public static void main(String[] args) {

        Person person = new Person();
        person.purpose = "to breed";
        System.out.println("The purpose of a Person is " + person.purpose + ".");

        Athlete athlete = new Athlete();
        athlete.purpose = "to achieve titles";
        System.out.println("The purpose of an Athlete is " + athlete.purpose + ".");

        Footballer footballer = new Footballer();
        footballer.purpose = "to score goals";
        System.out.println("The purpose of a Footballer is " + footballer.purpose + ".");



    }
}
