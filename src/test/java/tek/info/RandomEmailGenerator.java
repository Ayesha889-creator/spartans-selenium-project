package tek.info;

import java.util.Random;
class RandomEmailGenerator {
    public static void main(String[] args) {

        String emailPrefix = "Jawid_spartans";
        int number = (int) (Math.random() * 100);
        String randomEmail = emailPrefix + number + "@gmail.com";



    }
}
