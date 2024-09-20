public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("George", 4, 7);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Henry", 8, 11);
        cat2.printCatInfo();
        cat2.introduce(); 
    }
}
