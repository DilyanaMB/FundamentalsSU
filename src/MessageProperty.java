import java.util.Random;

public class MessageProperty {
    private String[] phrases = {"Excellent product.",
            "Such a great product.",
            "I always use that product.",
            "Best product of its category.",
            "Exceptional product.",
            "I can’t live without this product."};

    private String[] events = {"Now I feel good.",
            "I have succeeded with this product.",
            "Makes miracles. I am happy of the results!",
            "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.", "I feel great!"};

    private String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

    private String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
    Random rnd = new Random();

    public String getRandomPhrase() {
        int randomNumber = rnd.nextInt(phrases.length);
        return phrases[randomNumber];
    }

    public String getRandomEvent() {
        int randomNumber = rnd.nextInt(events.length);
        return events[randomNumber];
    }

    public String getRandomAuthor() {
        int randomNumber = rnd.nextInt(authors.length);
        return authors[randomNumber];
    }

    public String getRandomCity() {
        int randomNumber = rnd.nextInt(cities.length);
        return cities[randomNumber];
    }

    public String buildMsg(){
       return String.format("%s %s %s – %s.", getRandomPhrase(),getRandomEvent(),getRandomAuthor(),getRandomCity());
    }
}
