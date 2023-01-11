import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;

public class HttpURLContentGetter {
    private String urlString;

    public HttpURLContentGetter(String url) {
        this.urlString = url;
    }

    public void printFirstTenLines() {
        try{
            URL url = new URL(this.urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            System.out.println("Response Code: " + connection.getResponseCode());
            System.out.println("Content Type: " + connection.getContentType());
            System.out.println("Content Length: " + connection.getContentLength());

            InputStreamReader isr = new InputStreamReader((InputStream) connection.getContent());
            BufferedReader br = new BufferedReader(isr);
            StringBuilder buffer = new StringBuilder();
            String line;
            int counter = 0;
            do {
                line = br.readLine();
                buffer.append(line + "\n");
                counter++;
            } while (counter < 10);
            System.out.println(buffer.toString());
        }catch (MalformedURLException e) {

        }catch (IOException e) {

        }
    }
}
