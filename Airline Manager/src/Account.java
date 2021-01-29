import java.util.LinkedList;
import java.util.List;

public class Account {

    private int cashBalance;
    private int bankBalance;
    private int fuel;
    private String name;
    private List<Aircraft> fleet;

    public Account(String name){
        this.name = name;
        this.cashBalance = 10000000;
        this.bankBalance = 0;
        this.fuel = 5000000;
        this.fleet = new LinkedList<Aircraft>();
    }

    public

}
