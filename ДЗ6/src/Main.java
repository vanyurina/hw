public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat(100, 4,1.5f, 200, 0, 2.0f);
        Cat cat2 = new Cat(200, 0,1.5f, 700, 0, 1.0f);
        Dog dog1 = new Dog(400, 7,0.4f, 500, 10, 0.5f);

        cat1.canSwim(5);
        System.out.println();
        System.out.println(dog1.canRun(50));
    }
}
