package domain;

import com.google.gson.annotations.SerializedName;

public class TestBean {



    @SerializedName("ag-e")
    public String AgE;

    public String getAgE() {
        return AgE;
    }

    public void setAgE(String agE) {
        AgE = agE;
    }
}
