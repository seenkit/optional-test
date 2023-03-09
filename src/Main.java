public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasia", "Black");
        Cat cat2 = new Cat("Sonia", "White");
        Cat cat3 = new Cat("Monia", "Grey");

        Cat[] cats = {cat1, cat2, cat3};

        Cat resultCat = findCatByName("test", cats);

        System.out.println(resultCat.getName());

    }

    public static Cat findCatByName(String name, Cat[] cats) {
        for (Cat cat: cats) {
            if (cat.getName().equals(name)) {
                return cat;
            }
        }
        return null;
    }
}
