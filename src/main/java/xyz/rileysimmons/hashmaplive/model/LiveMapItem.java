package xyz.rileysimmons.hashmaplive.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LiveMapItem {

    @Id
    private String mapKey;

    private String mapValue;

    public String getMapKey() {
        return mapKey;
    }

    public void setMapKey(String mapKey) {
        this.mapKey = mapKey;
    }

    public String getMapValue() {
        return mapValue;
    }

    public void setMapValue(String mapValue) {
        this.mapValue = mapValue;
    }
}
