package org.csn.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SensorData {
    private String id;
    private String timestamp;
    private String value;

    public SensorData() {

    }

    public SensorData(String id, String Timestamp, String Value) {
        this.id = id;
        this.timestamp = Timestamp;
        this.value = Value;
    }

    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "id='" + id + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}