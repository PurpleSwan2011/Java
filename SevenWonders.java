import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        // Arrays to store the names of the Seven Wonders and their locations
        String[] wonders = {
            "Great Wall of China", 
            "Petra", 
            "Christ the Redeemer", 
            "Machu Picchu", 
            "Chichen Itza", 
            "Roman Colosseum", 
            "Taj Mahal"
        };
        
        String[] locations = {
            "China", 
            "Jordan", 
            "Brazil", 
            "Peru", 
            "Mexico", 
            "Italy", 
            "India"
        };

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of a country: ");
        String country = scanner.nextLine().trim();

        // Search for wonders in the given country
        boolean found = false;
        for (int i = 0; i < locations.length; i++) {
            if (locations[i].equalsIgnoreCase(country)) {
                System.out.println("The wonder in " + country + " is: " + wonders[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No wonders found in " + country + ".");
        }

        scanner.close();
    }
}
