package requesters;

import io.cucumber.core.internal.com.fasterxml.jackson.core.type.TypeReference;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.Document;

public class GameInformationRequester {
    private final String API_URL = "https://boardgamegeek.com/xmlapi/boardgame/white-castle";

    public Document getGameInformation() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(API_URL, String.class);

        // на лекции использовали JSON, тут XML.
    }
}