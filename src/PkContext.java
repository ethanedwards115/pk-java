import java.net.Authenticator;
import java.net.http.*;
import java.time.Duration;

public class PkContext {


    // HTTP URI CONSTANTS
    private final String pkUri = "https://api.pluralkit.me";
    private final String pkRootEndpoint = pkUri + "/v1";
    private final String pkSystemEndpoint = pkRootEndpoint + "/s";
    private final String pkMemberEndpoint = pkRootEndpoint + "/m";
    private final String pkDiscordSystemEndpoint = pkRootEndpoint + "/a";
    private final String pkMessageEndpoint = pkRootEndpoint + "/msg";

    private HttpClient pkHttpClient;
    private String pkAuthToken;

    public PkContext(String pkAuthToken) {

        this.pkAuthToken = pkAuthToken;

        // Build client for context usage
        pkHttpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .connectTimeout(Duration.ofSeconds(15))
                .build();
    }
}
