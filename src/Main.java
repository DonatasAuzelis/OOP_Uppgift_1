import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //Eftersom class Animal implements Food, kan man därför skapa en Animal Reference och använda metoder i Food interface

        Animal dog1 = new Dog("Sixten", 5); //Skapar Animal reference och Dog object
        Dog dog2 = new Dog("Dogge", 10); //Skapar Dog reference och Dog object

        Animal cat1 = new Cat("Venus", 5); //Skapar Animal reference och Cat object
        Cat cat2 = new Cat("Ove", 3); //Skapar Cat reference och Cat object

        Snake snake1 = new Snake("Hypno", 1); //Skapar Snake reference och Snake object


        //For loop för att skriva ut dialogruta med alla djur på hotellet (bara namn) ENUMS här:
        String list = "";

        Animals allAnimals [] = Animals.values();
        for (Animals a: allAnimals){
            list += a.name + " \n";
        }
        JOptionPane.showMessageDialog(null, "Djur lista: \n" + list);


        //User interface med loop för fel input
        while (true) {

            String input = JOptionPane.showInputDialog(null, "Vilket djur ska få mat?");

            switch (input.toLowerCase()) {
                case "sixten":
                    JOptionPane.showMessageDialog(null, dog1.getMeasurement());//Output
                    break;
                case "dogge":
                    JOptionPane.showMessageDialog(null, dog2.getMeasurement());
                    break;
                case "venus":
                    JOptionPane.showMessageDialog(null, cat1.getMeasurement());
                    break;
                case "ove":
                    JOptionPane.showMessageDialog(null, cat2.getMeasurement());
                    break;
                case "hypno":
                    JOptionPane.showMessageDialog(null, snake1.getMeasurement());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Okänd namn, försök igen!");
                    continue; //Loopen fortsätter
            }
            break; //break för annars skulle while loopen fortsätta

        }

    }

}
