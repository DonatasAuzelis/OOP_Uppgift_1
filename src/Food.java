/**
 * Created by Donatas Auzelis
 * Date: 2020-09-28
 * Time: 14:49
 * Project: OOP_Uppgift_1
 * Copyright: MIT
 */
public interface Food {

    String getMeasurement();

    //Polymorphism ser till att rätt metod anropas, beroende på vilket Object anropas
    //Metoden anpassas beroende på skapad Object
    //Alltså, alla tre djur klasser implementerar getMeasurement(); metod, men den tar en annan form beroende på själva Object som vi skapar

}
