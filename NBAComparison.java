import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class NBAComparison {
    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api-nba-v1.p.rapidapi.com/players?id=1"))
                .header("x-rapidapi-key", "b49e4c715fmshbd83223ed76921cp12465ejsn96a5e59db8c7")
                .header("x-rapidapi-host", "api-nba-v1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
            
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            
            // Pretty print the JSON response using Gson
            String responseBody = response.body();
            
            // Create Gson instance with pretty-printing enabled
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            
            // Convert JSON string to an object and pretty-print
            Object json = gson.fromJson(responseBody, Object.class);
            String prettyJson = gson.toJson(json);
            
            // Print the formatted JSON
            System.out.println(prettyJson);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
