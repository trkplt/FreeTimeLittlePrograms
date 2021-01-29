import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Airport {

    private String name;
    private String icao;
    private String iata;
    private String country;
    private String city;
    private String geolocation;
    private int runwayLength;
    private int passengers;

    private static List<String> airports = Collections.emptyList();
    public static void createAirportList(){
        try{
            airports = Files.readAllLines(Paths.get("aviationfanatic.com-(Crawl-Run)---2020-03-16T120324Z.txt"), StandardCharsets.UTF_8);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public List<String> getAirports(){
        return airports;
    }

    public Airport(String name){
        //to enable the access to the airport list
        createAirportList();
    }

    public Airport(String name, String icao, String iata, String country, String city, String geolocation, int runwayLength, int passengers){
        this.name = name;
        this.icao = icao;
        this.iata = iata;
        this.country = country;
        this.city = city;
        this.geolocation = geolocation;
        this.runwayLength = runwayLength;
        this.passengers = passengers;
    }

    public String getName(){
        return name;
    }

    public String getIcao(){
        return icao;
    }

    public String getIata(){
        return iata;
    }

    public String getCountry(){
        return country;
    }

    public String getCity(){
        return city;
    }

    public String getGeolocation(){
        return geolocation;
    }

    public int getRunwayLength(){
        return runwayLength;
    }

    public int getPassengers(){
        return passengers;
    }


}
