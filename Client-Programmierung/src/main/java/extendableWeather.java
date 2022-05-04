import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.Map;

public class extendableWeather {

    public String name;
    public Map<String, String> properties;

    @JsonAnyGetter
    private Map<String, String> getProperties() {
        return properties;
    }
}
