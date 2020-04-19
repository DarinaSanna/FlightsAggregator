import java.util.Scanner;

public abstract class SearchResults {

    Scanner sc = new Scanner(System.in);

    int price;
    String depPoint;
    String destination;
    String depDate;
    String arrDate;
    int passengersCount;
    boolean isDirect;


    public SearchResults(int price, String depPoint, String destination, String depDate,
                         String arrDate, int passengersCount, boolean isDirect) {
        this.price = price;
        this.depPoint = depPoint;
        this.destination = destination;
        this.depDate = depDate;
        this.arrDate = arrDate;
        this.passengersCount = passengersCount;
        this.isDirect = isDirect;
    }

    public void showResults() {
        System.out.print("How much results do you want to see?");
        int rn = sc.nextInt();
        System.out.println("Following results meet the conditions of your search:");
        System.out.println("-----------------------------------------------------");
        for (int i=0; i < rn; i++) {
            System.out.println("Departure point: " + depPoint + " | Destination: " + destination +
                                " | Departure time" + depDate + " | Arrival time: " + arrDate +
                                "Price: " + passengersCount*price + " Euro");
        }

    }

    public void showDirectFlights() {
        System.out.print("How much results do you want to see?");
        int rn = sc.nextInt();
        System.out.println("Following results meet the conditions of your search:");
        System.out.println("-----------------------------------------------------");
        for (int i=0; i < rn; i++) {
            if (isDirect = true) {
                System.out.println("Departure point: " + depPoint + " | Destination: " + destination +
                        " | Departure time" + depDate + " | Arrival time: " + arrDate +
                        "Price: " + passengersCount * price + " Euro");
            }
        }
    }

    public void bookFlight() {}

    public void sortByPrice() {}

    public void showFastest() {}

}
