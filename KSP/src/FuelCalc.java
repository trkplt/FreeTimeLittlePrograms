import java.util.Scanner;

public class FuelCalc {

    static double endMass = 0;
    static double engineMass = 0;
    static double reqDeltaV = 0;
    static double isp = 0;
    static double maxThrust = 0;
    static double gravity = 0;
    static double fuelMass = 0;
    static double fuelAmount = 0;
    static double oxMass = 0;
    static double oxAmount = 0;
    static final double constant = 9.81;
    /*static double endMassEng = endMass + engineMass;
    static double startMass = endMassEng + fuelMass;
    static double currentDeltaV = Math.log(startMass / endMassEng) * isp * constant;
    static double twr = maxThrust / startMass / gravity;*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String scanned = scanner.nextLine();
        boolean go = true;

        while(go){
            switch (scanned){
                case "start":
                    calc();
                    break;
                case "end":
                    go = false;
            }
        }
    }

    public static void calc(){
        endMass = 0;
        engineMass = 0;
        reqDeltaV = 0;
        isp = 0;
        fuelMass = 0;
        fuelAmount = 0;
        oxMass = 0;
        oxAmount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cargo mass:");
        endMass = scanner.nextDouble();
        System.out.println("Engine mass:");
        engineMass = scanner.nextDouble();
        System.out.println("Required Delta V:");
        reqDeltaV = scanner.nextDouble();
        System.out.println("ISP:");
        isp = scanner.nextDouble();
        System.out.println("Max thrust:");
        maxThrust = scanner.nextDouble();
        System.out.println("Gravitational acceleration:");
        gravity = scanner.nextDouble();

        System.out.println("current delta v:" + Math.log((endMass + engineMass + fuelMass + oxMass) / (endMass + engineMass)) * isp * constant);

        while(Math.log((endMass + engineMass + fuelMass + oxMass) / (endMass + engineMass)) * isp * constant < reqDeltaV){
            fuelMass += 5;
            fuelAmount++;
            oxMass += 5;
            oxAmount++;
        }

        /*System.out.println(endMass);
        System.out.println(endMassEng);
        System.out.println(engineMass);
        System.out.println(reqDeltaV);*/
        System.out.println("Required fuel amount is " + fuelAmount);
        System.out.println("Required oxidizer amount is " + oxAmount);
        System.out.println("TWR is " + maxThrust / ((endMass + engineMass + fuelMass + oxMass) * gravity));
    }
}