package requesters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.Information;
import org.springframework.web.client.RestTemplate;
import java.util.List;

public class TheWhiteCastleGameInformationRequester {
    private final String API_URL = "https://boardgamegeek.com/xmlapi/boardgame/371942";

    public List<Information> getGameInformation() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String xml = restTemplate.getForEntity(API_URL, String.class).getBody();

        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(xml, new TypeReference<List<Information>>() {});
    }
}