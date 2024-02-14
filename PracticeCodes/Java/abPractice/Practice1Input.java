package abPractice;

public class Practice1Input {

    public static void main(String[] args) {

        Practice1Main newDog = new Practice1Main();
        newDog.setName("Aldous");
        newDog.setColor("Brown");
        newDog.setBreed("Poodle");
        System.out.println("Dog Name: " + newDog.getDogName());
        System.out.println("Color: " + newDog.getDogColor());
        System.out.println("Breed: " + newDog.getDogBreed());
    }
    
}
