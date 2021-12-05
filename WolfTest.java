public class WolfTest {
    public static void main (String [] args) {
        Wolf wolfOne = new Wolf();
        System.out.println("Пол волка " + wolfOne.sex);
        System.out.println("Волка зовут " + wolfOne.name);
        System.out.println("Волк " + wolfOne.colour);
        System.out.println("Возраст Волка " + wolfOne.age);
        System.out.println("Вес " + wolfOne.weight + " кг");
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    } 
}
