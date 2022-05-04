import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

    public class weather {

        @JsonProperty("tempCurrent")
        private Double tempCurrent;
        @JsonProperty("tempMax")
        private Double tempMax;
        @JsonProperty("tempMin")
        private Double tempMin;
        @JsonProperty("comment")
        private String comment;
        @JsonProperty("timeStamp")
        private String timeStamp;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("tempCurrent")
        public Double getTempCurrent() {
            return tempCurrent;
        }

        @JsonProperty("tempCurrent")
        public void setTempCurrent(Double tempCurrent) {
            this.tempCurrent = tempCurrent;
        }

        @JsonProperty("tempMax")
        public Double getTempMax() {
            return tempMax;
        }

        @JsonProperty("tempMax")
        public void setTempMax(Double tempMax) {
            this.tempMax = tempMax;
        }

        @JsonProperty("tempMin")
        public Double getTempMin() {
            return tempMin;
        }

        @JsonProperty("tempMin")
        public void setTempMin(Double tempMin) {
            this.tempMin = tempMin;
        }

        @JsonProperty("comment")
        public String getComment() {
            return comment;
        }

        @JsonProperty("comment")
        public void setComment(String comment) {
            this.comment = comment;
        }

        @JsonProperty("timeStamp")
        public String getTimeStamp() {
            return timeStamp;
        }

        @JsonProperty("timeStamp")
        public void setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }
}
