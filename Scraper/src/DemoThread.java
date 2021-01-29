import org.jsoup.Connection;
import org.jsoup.Jsoup;

import javax.swing.text.Document;
import java.io.IOException;
import java.util.Map;

public class DemoThread  extends Thread {

    private Thread t;
    private String url;
    private static int total = 0;
    private static int error = 0;

    DemoThread(String url){
        this.url = url;
    }

    public void run(){
        try {
            //LOGIN
            Connection.Response res = Jsoup.connect("https://www.airline4.net/weblogin/login.php")
                    .data("lEmail", "nightflames00@gmail.com", "lPass", "bentarigim7558165", "fbSig", "web")
                    .method(org.jsoup.Connection.Method.POST)
                    .execute();

            //COOKIES
            Map<String, String> loginCookies = res.cookies();

            //DATA
            org.jsoup.nodes.Document doc = Jsoup.connect(url)
                    .cookies(loginCookies)
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
