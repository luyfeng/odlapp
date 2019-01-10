package domain;

import com.google.gson.annotations.SerializedName;

public class TestBean {



    @SerializedName("ag-e")
    public String AgE;
    private String name;
    private String id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAgE() {
        return AgE;
    }

    public void setAgE(String agE) {
        AgE = agE;
    }
}
