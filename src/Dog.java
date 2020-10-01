/**
 * Created by Donatas Auzelis
 * Date: 2020-09-25
 * Time: 09:14
 * Project: OOP_Uppgift_1
 * Copyright: MIT
 */

//Behöver inte implementera Interface Food, då Class Animal gör det
public class Dog extends Animal {

    public Dog(String name, int weight) {
        super(name, weight);
    }

    //Encapsulation gör så att sub-klasserna har tillgång till metoderna som ger värden som i sig är exklusiva för huvud klassen
    //Privat data är då också gömd / ej åtkomling
    //Getters & setters används för att se och manipulera variablernas värden

    public String getMeasurement() {
        return "Hundfoder: " + getWeight() * 1000 / 100 + "g.";
    }

}
