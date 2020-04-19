class Flight extends SearchResults {
    private String company;
    private String flightN;
    private String duration;

    public Flight(int price, String depPoint, String destination, String depDate,
                  String arrDate, int passengersCount, boolean isDirect,
                  String company, String flightN, String duration) {
        super(price, depPoint, destination, depDate, arrDate, passengersCount, isDirect);
        this.company = company;
        this.flightN = flightN;
        this.duration = duration;
    }

    @Override
    public void showResults() {
        System.out.print("How much results do you want to see?");
        int rn = sc.nextInt();
        System.out.println("Following results meet the conditions of your search:");
        System.out.println("-----------------------------------------------------");
        for (int i=0; i < rn; i++) {
            System.out.println("Departure point: " + depPoint + " | Destination: " + destination +
                    " | Departure time" + depDate + " | Arrival time: " + arrDate + " | Duration: " + duration +
                    "Price: " + passengersCount*price + " Euro" + " | Company: " + company
                    + " | Flight number: " + flightN);
        }
    }

    @Override
    public void showDirectFlights() {
        System.out.print("How much results do you want to see?");
        int rn = sc.nextInt();
        System.out.println("Following results meet the conditions of your search:");
        System.out.println("-----------------------------------------------------");
        for (int i=0; i < rn; i++) {
            if (isDirect = true) {
                System.out.println("Departure point: " + depPoint + " | Destination: " + destination +
                        " | Departure time" + depDate + " | Arrival time: " + arrDate + " | Duration: " + duration +
                        "Price: " + passengersCount*price + " Euro" + " | Company: " + company
                        + " | Flight number: " + flightN);
            }
        }
    }

}
