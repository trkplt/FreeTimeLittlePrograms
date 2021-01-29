import java.io.IOException;
import java.io.PrintWriter;

public class IncrementalURL {
    public static void main(String[] args) {

        try {
            PrintWriter writer = new PrintWriter("route demands url.txt", "UTF-8");
            for(int i = 1; i < 3983; i++){
                for(int j = 1; j < 3983; j++){
                    if(i != j){
                        writer.printf("https://www.airline4.net/route_research_route.php?dep=%d&arr=%d%n", i, j);
                    }
                }
            }
            writer.close();
        }catch(IOException e){
            System.out.println("Error!");
        }
    }
}
