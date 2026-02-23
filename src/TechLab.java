import java.util.Scanner;

public class TechLab {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Techlab Loan System!\n--------------------------------------");

        int count = askForCount(sc);

        Item[] itemArray = createItemArray(sc, count);

        sortByTitle(itemArray);

        System.out.println("\nSorted loan items by Title:\n--------------------------------------");
        printItem(itemArray);

        printFee(itemArray);

        System.out.print("\nSummary:\nYou borrowed " + itemArray.length + " items today.");

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

                //Makes sure the input is a positive number
                if (count > 0) break;
                else System.out.println("Enter a positive number!");
            } else {
                System.out.println("Invalid number!");
                sc.nextLine();
            }
        }

        return count;
    }

    //Creates an array of items
    public static Item[] createItemArray(Scanner sc, int count) {

        Item[] techLab = new Item[count];

        for (int i = 0; i < count; i++) {

            System.out.print("\nType (book/video/electronics): ");
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
                    int duration = sc.nextInt();
                    techLab[i] = new Video(title, loanDays, duration);
                    break;
                case "electronics":
                    if (title.equalsIgnoreCase("raspberrypi")) {
                        System.out.print("Model (4B/5): ");
                        String model = sc.nextLine();
                        System.out.print("Base value: ");
                        int baseValue = sc.nextInt();
                        //Electronics rasp = new RaspberryPi(title, loanDays, model, baseValue);
                        //techLab[i] = rasp;
                        techLab[i] = new RaspberryPi(title, loanDays, model, baseValue);
                    } else if (title.equalsIgnoreCase("arduino")) {
                        System.out.print("Kit level (Beginner/Advanced): ");
                        String level = sc.nextLine();
                        System.out.print("Base value: ");
                        int bValue = sc.nextInt();
                        techLab[i] = new Arduino(title, loanDays, level, bValue);
                    } else {
                        System.out.println("Unknown input.");
                    }
                    break;
                default:
                    System.out.println("Unknown type, defaulting to Item.");
            }

        }
        return techLab;

    }


    //Print all items in the array.
    public static void printItem(Item[] techLab) {
        int n = 1;
        for (int i = 0; i < techLab.length; i++) {
            System.out.println("Item #" + n);
            n++;
            System.out.println(techLab[i] + "\n");
        }
    }

    //Sort by title (alphabetical)
    public static void sortByTitle(Item[] techLab) {

        // Bubble sort using nested loops
        for (int i = 0; i < techLab.length - 1; i++) {

            for (int j = 0; j < techLab.length - 1 - i; j++) {

                //compares the String titles alphabetically
                if (techLab[j].getTitle()
                        .compareTo(techLab[j + 1].getTitle()) > 0) {

                    //Swap objects
                    Item temp = techLab[j];
                    techLab[j] = techLab[j + 1];
                    techLab[j + 1] = temp;
                }
            }
        }
    }

    public static void printFee(Item[] techLab) {
        for (Item object : techLab) {
            //Polymorphism
            object.fee();
        }
    }
}



