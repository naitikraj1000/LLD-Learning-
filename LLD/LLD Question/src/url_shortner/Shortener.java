package url_shortner;

import java.util.HashMap;
import java.util.Random;

public class Shortener {
    private static final String BASE62 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int URL_LENGTH = 6;
    private static final HashMap<String, String> globalUrlMap = new HashMap<>();
    private static final Random random = new Random();

    public Shortener() {
        System.out.println("Shortener initialized");
    }

    private String generateShortUrl() {
        StringBuilder shortUrl = new StringBuilder("http://tinyurl.com/");
        for (int i = 0; i < URL_LENGTH; i++) {
            shortUrl.append(BASE62.charAt(random.nextInt(BASE62.length())));
        }
        return shortUrl.toString();
    }

    public String encode(String longUrl, User user) {
        if (!user.isLoggedIn()) {
            System.out.println("Please login to use this feature");
            return "";
        }
        String shortUrl = generateShortUrl();
        user.urlMap.put(shortUrl, longUrl);
        System.out.println("Short URL generated: " + shortUrl);
        return shortUrl;
    }

    public String decode(String shortUrl, User user) {
        if (!user.isLoggedIn()) {
            System.out.println("Please login to use this feature");
            return "";
        }
        if (!user.urlMap.containsKey(shortUrl)) {
            System.out.println("Short URL not found");
            return "";
        }
        return user.urlMap.get(shortUrl);
    }
}
