package sr08112017;

public class App {
    public static void main(String[] args) {

        Person person = new Person();
        person.purpose = "to breed";
        person.info = "A human being regarded as an individual.";
        person.famousOnes = "'Martin Luther King', 'Bill Gates', 'Dalaj Lama', 'Leonardo DaVinci', 'Galileo'";
        System.out.println("The purpose of a Person is " + person.purpose + ". " + "Definition: " + person.info);
        System.out.println("The best ones, for example are: " + person.famousOnes + ".");
        System.out.println();

        Athlete athlete = new Athlete();
        athlete.purpose = "to achieve titles";
        athlete.info = "A person who is proficient in sports and other forms of physical exercise.";
        athlete.famousOnes = "'Kobe Bryant', 'Muhammad Ali', 'Tiger Woods', 'Michael Phelps', 'Sidney Crosby'";
        System.out.println("The purpose of an Athlete is " + athlete.purpose + ". "+ "Definition: " + athlete.info);
        System.out.println("The best ones, for example are : " + athlete.famousOnes +".");
        System.out.println();

        Footballer footballer = new Footballer();
        footballer.purpose = "to score goals";
        footballer.info = "Football player.";
        footballer.famousOnes = "'Leo Messi', 'Thierry Henry', 'David Beckham', 'Diego Maradona'";
        System.out.println("The purpose of a Footballer is " + footballer.purpose + ". " + "Definition: " + footballer.info);
        System.out.println("The best ones, for example are: " + footballer.famousOnes + ".");
        System.out.println();

        Formula1Driver f1 = new Formula1Driver();
        f1.purpose = "to winnig races";
        f1.info = "A person who is driving one of the fastes vehicles on Earth.";
        f1.famousOnes = "'James Hunt', 'Niki Lauda', 'Michael Schumacher', 'Lewis Hamilton'";
        System.out.println("The purpose of a Formula One Driver is " + f1.purpose + ". " + "Definition: " + f1.info);
        System.out.println("The best ones, for example are: " + f1.famousOnes);
        System.out.println();

        Pilot pilot = new Pilot();
        pilot.purpose = "to fly a plane";
        pilot.info = "A person who operates the flying controls of an aircraft.";
        pilot.famousOnes = "'James H. Doolittle', 'Robert A. Hoover'";
        System.out.println("The purpose of a Pilot is " + pilot.purpose + ". " + "Definition: " + pilot.info);
        System.out.println("The best ones, for example are: " + pilot.famousOnes);



    }
}
