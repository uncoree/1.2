import java.util.*;


abstract class Item {
    String title;
    double rating;
    int year;

    Item(String title, double rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }

    abstract boolean isRecommended();
}


interface Printable {
    void printInfo();
}


class ActionMovie extends Item implements Printable {
    int explosions;
    ActionMovie(String title, double rating, int year, int explosions) {
        super(title, rating, year);
        this.explosions = explosions;
    }

    @Override
    boolean isRecommended() {
        return rating >= 8 && year >= 2015;
    }

    @Override
    public void printInfo() {
        System.out.println("боевик: " + title);
        System.out.println("рейтинг: " + rating);
        System.out.println("год: " + year);
        System.out.println("взрывов: " + explosions);
        System.out.println();
    }
}

class ComedyMovie extends Item implements Printable {
    boolean familyFriendly;

    ComedyMovie(String title, double rating, int year, boolean familyFriendly) {
        super(title, rating, year);
        this.familyFriendly = familyFriendly;
    }

    @Override
    boolean isRecommended() {
        return rating >= 7;
    }

    @Override
    public void printInfo() {
        System.out.println("комедия: " + title);
        System.out.println("рейтинг: " + rating);
        System.out.println("год: " + year);
        System.out.println("семейный: " + familyFriendly);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Item> catalog = new ArrayList<>();

        catalog.add(new ActionMovie("mad max", 8.5, 2015, 120));
        catalog.add(new ActionMovie("john wick", 9.0, 2019, 95));
        catalog.add(new ComedyMovie("mask", 7.8, 1994, true));
        catalog.add(new ComedyMovie("hangover", 7.5, 2009, false));
        catalog.add(new ActionMovie("matrix", 8.7, 1999, 60));


        for (Item item : catalog) {
            ((Printable) item).printInfo();
        }

        System.out.println("рекомендуем посмотреть:");
        for (Item item : catalog) {
            if (item.isRecommended()) {
                System.out.println("- " + item.title);
            }
        }

        Map<String, Item> map = new HashMap<>();
        for (Item item : catalog) {
            map.put(item.title, item);
        }

        System.out.println("\nвведи название фильма:");
        String search = sc.nextLine();

        Item found = map.get(search);
        if (found != null) {
            ((Printable) found).printInfo();
        } else {
            System.out.println("ничего не найдено ");
        }
    }
}
