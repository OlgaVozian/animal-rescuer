package org.fasttrackit;
import java.time.LocalDateTime;
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.age = 3;
        animal.levelOfFeelingHungry = 5;
        animal.levelOfHealth = 10;
        animal.moodLevel = 10;
        animal.name = "Narta";
        animal.nameOfFavoriteFood ="Potatoes";
        animal.preferredRecreationalActivity = "Panda friend";

        Adopter adopter = new Adopter();
        adopter.availableMoney = 789456;
        adopter.name = "Olga Vozian";

        PetFood petFood = new PetFood();
        petFood.availabilityInStock = 456789123;
        petFood.expirationDate = LocalDateTime.of(2022,02, 11,9,15,45);
        petFood.name = "Pedigree";
        petFood.price = (float) 25.12;
        petFood.quantity = 789.26;

        RecreationActivity recreactionActivity = new RecreationActivity();
        recreactionActivity.name ="jumps";

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Mihail Vozian";
        veterinarian.specialization = "dogs";

        Game game = new Game();
        game.adopter = "Olga Vozian";
        game.dog = "Narta";
        game.veterinarian = "Mihail Vozian";

    }
}
