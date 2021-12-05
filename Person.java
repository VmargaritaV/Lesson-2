public class Person {
    String sex = "male";
    String name = "Ivan";
    float height = 180f;
    float weight = 75f;
    int age = 30;

    void walk() {
        System.out.println("Я умею ходить!");
    }

    String sit() {
        return "Сейчас я сижу";
    }

    void run() {
        System.out.println("Я умею бегать!");
    }

    void talk() {
        System.out.println("Я умею говорить!");
    }

    void learnJava() {
        System.out.println("Я учу Java!");
    }
}