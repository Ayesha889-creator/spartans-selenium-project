package tek.info;
import java.util.Random;
public class RandomEmailGenerator {

        public static void main(String[] args) {
            String randomEmail = generateRandomEmail();
            System.out.println("Random email address: " + randomEmail);
        }

        public static String generateRandomEmail() {
            // Generate a random name (6 characters)
            StringBuilder name = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < 6; i++) {
                char randomChar = (char) (random.nextInt(26) + 'a');
                name.append(randomChar);
            }

            // Choose a well-known domain (e.g., gmail.com, yahoo.com, hotmail.com)
            String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "redmail.com"};
            String domain = domains[random.nextInt(domains.length)];

            // Combine the name and domain to create the email address
            return name.toString() + "@" + domain;
        }

}
