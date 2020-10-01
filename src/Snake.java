/**
 * Created by Donatas Auzelis
 * Date: 2020-09-25
 * Time: 09:14
 * Project: OOP_Uppgift_1
 * Copyright: MIT
 */
public class Snake extends Animal implements Food {


    //Constructor
    public Snake(String name, int weight) {
        super(name, weight);
    }

    public String getMeasurement() {
        return "Ormpellets: 20g.";
    }

}
