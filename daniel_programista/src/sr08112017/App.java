package sr08112017;

public class App {
    public static void main(String[] args) {

        Person person = new Person();
        person.purpose = "to breed";
        person.info = "A human being regarded as an individual.";
        person.famousOnes = "'Martin Luther King', 'Bill Gates', 'Dalaj Lama', 'Leonardo DaVinci', 'Galileo'";
        System.out.println("The purpose of a Person is " + person.purpose + ". " + "Definition: " + person.info);
        System.out.println("The best ones for example are: " + person.famousOnes + ".");
        System.out.println();

        Athlete athlete = new Athlete();
        athlete.purpose = "to achieve titles";
        athlete.info = "A person who is proficient in sports and other forms of physical exercise.";
        athlete.famousOnes = "'Kobe Bryant', 'Muhammad Ali', 'Tiger Woods', 'Michael Phelps', 'Sidney Crosby'";
        System.out.println("The purpose of an Athlete is " + athlete.purpose + ". "+ "Definition: " + athlete.info);
        System.out.println("The best ones for example are : " + athlete.famousOnes +".");
        System.out.println();

        Footballer footballer = new Footballer();
        footballer.purpose = "to score goals";
        footballer.info = "Football player.";
        footballer.famousOnes = "'Leo Messi', 'Thierry Henry', 'David Beckham', 'Diego Maradona', ";
        System.out.println("The purpose of a Footballer is " + footballer.purpose + ". " + "Definition: " + footballer.info);
        System.out.println("The best ones for example are: " + footballer.famousOnes);



    }
}
