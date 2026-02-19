import java.util.Scanner;

public class TechLab {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = askForCount(sc);

        Item[] itemArray = createItemArray(sc, count);

        printItem(itemArray);

        sortByName(itemArray);

        System.out.println("\n--- Sorted by Title ---");
        printItem(itemArray);

        sc.close();

    }

    // Ask user for number of items
    public static int askForCount(Scanner sc) {

        int count = 0;

        while (true) {
            System.out.print("How many items do you want to borrow? ");

            if (sc.hasNextInt()) {
                count = sc.nextInt();
                sc.nextLine();

                if (count > 0) break;
                else System.out.println("Enter a positive number!");
            } else {
                System.out.println("Invalid number!");
                sc.nextLine();
            }
        }

        return count;
    }


    public static Item[] createItemArray(Scanner sc, int count) {

        Item[] techLab = new Item[count];

        for (int i = 0; i < count; i++) {

            System.out.println("\nType (book/video/electronics): ");
            String type = sc.nextLine();

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Loan days: ");
            int loanDays = sc.nextInt();
            sc.nextLine();

            switch (type.toLowerCase()) {
                case "book":
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    techLab[i] = new Book(title, loanDays, author);
                    break;
                case "video":
                    System.out.print("Duration (minutes): ");
                    String duration = sc.nextLine();
                    techLab[i] = new Video(title, loanDays, duration);
                    break;
                case "electronic":
                    techLab[i] = new Electronics(title, loanDays);
                    break;
                default:
                    System.out.println("Unknown type, defaulting to Fruit.");
            }

        }

    }


    //Print all items
    public static void printItem(Item[] techLab) {

        for (int i = 0; i < techLab.length; i++) {
            System.out.println(techLab[i]);
        }
    }

    //Sort by title (Alphabetical A-Z)
    public static void sortByName(Item[] techLab) {

        // Bubble sort using nested loops
        for (int i = 0; i < techLab.length - 1; i++) {

            for (int j = 0; j < techLab.length - 1 - i; j++) {

                // compareTo compares Strings alphabetically
                if (techLab[j].getTitle()
                        .compareTo(techLab[j + 1].getTitle()) > 0) {

                    // Swap objects
                    Item temp = techLab[j];
                    techLab[j] = techLab[j + 1];
                    techLab[j + 1] = temp;
                }
            }
        }
    }


}



