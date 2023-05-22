import java.util.Scanner;

public class Main {
    
    static Store store = new Store();
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Movie[] movies = new Movie[] {
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("12 Angry Men", "DVD", 8.9),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        System.out.println("********************************MOVIE STORE*******************************");

        for (int i = 0; i < movies.length; i++) {
            store.setMovie(i, movies[i]);
        }

        printStore();
        System.out.print("To edit another rating, type: 'continue': ");
        String choice = scan.next();
        scan.nextLine();

        while (choice.equals("continue")) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");
            int index = scan.nextInt();
            scan.nextLine();
            System.out.print("Set a new rating for " + store.getMovie(index).getName() + ": ");
            double rating = scan.nextDouble();
            scan.nextLine();
            store.getMovie(index).setRating(rating);
            // store.setMovie(index, new Movie(store.getMovie(index).getName(), store.getMovie(index).getFormat(), rating));
            printStore();
            System.out.print("\nTo edit another rating, type: 'continue': ");
            choice = scan.next();
            scan.nextLine();
        }
        


        scan.close();
    }

    public static void printStore() {
        System.out.println(store);
    }
}
