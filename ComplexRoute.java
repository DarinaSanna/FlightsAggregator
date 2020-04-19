public class ComplexRoute extends Flight {

    private String transferPoint;
    private String depDate1;
    private String depDate2;
    private String arrDate1;
    private String arrDate2;
    private String company1;
    private String company2;
    private String flightN1;
    private String flightN2;
    private String duration1;
    private String duration2;
    private String transferLength;

    private ComplexRoute(int price1, int price2, String depPoint, String transferPoint, String destination, String depDate1, String depDate2,
                         String arrDate1, String arrDate2, int passengersCount, boolean isDirect, String company1, String company2, String flightN1, String flightN2,
                         String duration, String duration1, String duration2, String transferLength) {
        super(price1 + price2, depPoint, destination, depDate1, arrDate2, passengersCount, isDirect, company1 + "/" + company2,
                flightN1 + "/" + flightN2, duration);
        this.transferPoint = transferPoint;
        this.depDate1 = depDate1;
        this.arrDate1 = arrDate1;
        this.depDate2 = depDate2;
        this.arrDate2 = arrDate2;
        this.company1 = company1;
        this.company2 = company2;
        this.flightN1 = flightN1;
        this.flightN2 = flightN2;
        this.duration1 = duration1;
        this.duration2 = duration2;
        this.transferLength = transferLength;
    }

    @Override
    public void showResults() {
        System.out.println("Following results meet the conditions of your search:");
        System.out.println("-----------------------------------------------------");
            System.out.println("-- Flight with transfer --");
            System.out.println("First flight: ");
            System.out.println("Departure point: " + depPoint + " | Destination: " + transferPoint +
                    " | Departure time: " + depDate1 + " | Arrival time: " + arrDate1 + " | Duration: " + duration1 +
                    " | Company: " + company1 + " | Flight number: " + flightN1);
            System.out.println("Transfer at " + transferPoint + ": " + transferLength);
            System.out.println("Second flight: ");
            System.out.println("Departure point: " + transferPoint + " | Destination: " + destination +
                    " | Departure time" + depDate2 + " | Arrival time: " + arrDate2 + " | Duration: " + duration2 +
                    " | Company: " + company2 + " | Flight number: " + flightN2);
            System.out.println("Price: " + passengersCount*price + " Euro");
    }

    public static void main(String[] args) {
        ComplexRoute route1 = new ComplexRoute(100,22, "SPB", "Munich", "Amsterdam", "24/04/2020 23:45",
                "25/04/2020 05:30", "25/04/2020 03:15", "25/04/2020 06:20", 2, false, "Aeroflot", "Rynair",
                "N303", "R567", "06:35", "03:30", "00:50", "02:15");
        route1.showResults();

        Flight flight1 = new Flight(200, "Berlin", "Prague", "23/12/2020 23:30", "24/12/2020 01:00",
                2, true, "airBaltic", "N980", "01:30");

        flight1.showResults();

    }


}
