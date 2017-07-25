import java.util.Scanner;
import java.util.ArrayList;

public class Lab10 {

    public static void main(String[] args) {

        System.out.println("Welcome to the Grand Circus Car Dealership\n");
        System.out.println("Here is a list of the available cars");


        ArrayList<Car> roster = new ArrayList<Car>();
        roster.add(new Car("Tesla", "Model S",
                2017, 54999.90));
        roster.add(new Car("Ford", "Focus",
                2017, 24500.99));
        roster.add(new Car("Chevy", "Vette",
                2017, 64500.99));
        roster.add(new UsedCar("Honda", "S2000",
                2009, 53500.99, 12745.8, " used"));
        roster.add(new UsedCar("Ford", "Edsel",
                1958, 94500.99, 288.5, " used"));
        roster.add(new UsedCar("Ford", "Pinto",
                1975, 500.99, 8888.30, " used"));

        int n = 1;

        for (Car c : roster) {
            System.out.println(n+": "+ c);
            n++;


        }
        Scanner scan = new Scanner(System.in);

        System.out.println("Which car would you like?");

        int   choice = scan.nextInt();
        choice--;//convert from human friendly to arraylist index

        System.out.println(roster.get(choice ));

        roster.remove(choice);
        n = 1;

        for (Car c : roster) {
            System.out.println(n+": "+ c);
            n++;


        }
    }
}