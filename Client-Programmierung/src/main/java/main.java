import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.hivemq.client.internal.mqtt.message.MqttMessage;
import com.hivemq.client.mqtt.datatypes.MqttQos;
import com.hivemq.client.mqtt.mqtt5.*;

import java.util.Map;
import java.util.UUID;
public class main {

    public static void main(String[] args) {
        Mqtt5BlockingClient client = Mqtt5Client.builder()
                .identifier(UUID.randomUUID().toString())
                .serverHost("10.50.12.150")
                .serverPort(1883)
                .buildBlocking();

        client.connect();

        client.toAsync().subscribeWith()
                .topicFilter("/weather/#")
                .qos(MqttQos.AT_LEAST_ONCE)
                .callback(System.out::println)
                .send();

    }
}
