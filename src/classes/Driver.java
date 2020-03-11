package classes;

// Driver == Client == Main
// - where you have the main method to run your java program!
public class Driver {
    public static void main(String[] args) {
        Pokemon pika = new Pokemon("Pikachu", "Electric", 100, 20);
//        pika.name = "Pikachu";
//        pika.type = "Electric";
//        pika.healthPoint = 100;
//        pika.attackPoint = 20;


        Pokemon charzard = new Pokemon("Charzard", "Fire/Fly", 120, 70);
//       charzard.name = "Charzard";
//       charzard.type = "Fire/Fly";
//       charzard.healthPoint = 120;
//       charzard.attackPoint = 70;

        // acessing fields
        System.out.println(pika.name);
        System.out.println(charzard.type);

        // call methods on a instance(object)
        pika.attack(charzard);
        System.out.println("Charzard (HP): " + charzard.healthPoint);




    }
}
