/**
 * Created by Donatas Auzelis
 * Date: 2020-09-25
 * Time: 09:14
 * Project: OOP_Uppgift_1
 * Copyright: MIT
 */
public class Cat extends Animal implements Food {

    public Cat(String name, int weight) {
        super(name, weight);
    }

    //Kan också skapa "private String foder;" variabel i Animal Class
    //Och skapa getFoder(); metod i Animal Class
    //Då kan djur ha foder parameter också och man anropar getFoder(); metod

    public String getMeasurement() {
        return "Kattfoder: " + getWeight() * 1000 / 150 + "g."; //Man kan lägga till .0 för att få ett decimal värde
    }

}
