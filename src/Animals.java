/**
 * Created by Donatas Auzelis
 * Date: 2020-09-29
 * Time: 15:35
 * Project: OOP_Uppgift_1
 * Copyright: MIT
 */
public enum Animals {

    DOG1("Sixten", 5), DOG2("Dogge", 10),
    CAT1("Venus", 5), CAT2("Ove", 3), SNAKE("Hypno", 1);

    String name;
    int weight;

    Animals (String name, int weight) {
        this.name = name;
        this.weight = weight;

    }
}
