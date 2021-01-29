import java.util.Scanner;

public class TicketCalc {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean go = true;

        while(go){
            switch (scanner.nextLine()){
                case "start":
                    calc();
                    break;
                case "end":
                    go = false;
            }
        }

    }

    private static void calc(){

        double routeLength = 0;
        double flights = 0;
        double maxCap = 0;
        double rep = 0;
        double yDemand = 0;
        double jDemand = 0;
        double fDemand = 0;
        double ySeats = 0;
        double jSeats = 0;
        double fSeats = 0;
        double highestY = 0;
        double highestJ = 0;
        double highestF = 0;
        double yTicket = (150 + (0.3 * routeLength)) * 1.1;
        double jTicket = (500 + (0.6 * routeLength)) * 1.08;
        double fTicket = (1000 + (0.9 * routeLength)) * 1.06;
        double oneFlightIncome = rep * ((ySeats * yTicket) + (jSeats * jTicket) + (fSeats * fTicket));
        double dailyIncome = oneFlightIncome * flights;
        double highestDailyIncome = 0;

        System.out.println("Route length:");
        routeLength = scanner.nextDouble();
        System.out.println("Flights per day:");
        flights = scanner.nextDouble();
        System.out.println("Maximum capacity:");
        maxCap = scanner.nextDouble();
        System.out.println("Reputation");
        rep = scanner.nextDouble();
        System.out.println("Demand Y");
        yDemand = scanner.nextDouble();
        System.out.println("Demand J");
        jDemand = scanner.nextDouble();
        System.out.println("Demand F");
        fDemand = scanner.nextDouble();

        for(int f = 0; f <= Math.floor(maxCap / 3); f++){

            double newMaxCap = maxCap - (f * 3);

            for(int j = 0; j <= Math.floor(newMaxCap / 2); j++){

                fSeats = f;
                jSeats = j;
                ySeats = newMaxCap - (j * 2);

                yTicket = (150 + (0.3 * routeLength)) * 1.1;
                jTicket = (500 + (0.6 * routeLength)) * 1.08;
                fTicket = (1000 + (0.9 * routeLength)) * 1.06;
                oneFlightIncome = rep * ((ySeats * yTicket) + (jSeats * jTicket) + (fSeats * fTicket));
                dailyIncome = oneFlightIncome * flights;

                if(dailyIncome > highestDailyIncome){
                    highestDailyIncome = dailyIncome;
                    highestY = ySeats;
                    highestJ = jSeats;
                    highestF = fSeats;
                }
            }
        }

        System.out.println("Highest Daily Income = " + highestDailyIncome);
        System.out.println("Seat configuration: " + highestY + "Y " + highestJ + "J " + highestF + "F");

        System.out.println("routeLength = " + routeLength);
        System.out.println("rep = " + rep);
        System.out.println("fTicket = " + fTicket);
        System.out.println("oneFlightIncome = " + oneFlightIncome);
        System.out.println("dailyIncome = " + dailyIncome);

    }
}
