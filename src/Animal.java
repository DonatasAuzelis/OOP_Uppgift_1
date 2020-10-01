/**
 * Created by Donatas Auzelis
 * Date: 2020-09-25
 * Time: 09:13
 * Project: OOP_Uppgift_1
 * Copyright: MIT
 */
abstract class Animal implements Food{

    private String name;
    private int weight;

    public Animal () {}

    public Animal (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }


}
