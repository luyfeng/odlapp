package utils;

import com.google.gson.Gson;
import domain.TestBean;
import org.junit.jupiter.api.Test;

import java.util.Base64;

import static org.junit.jupiter.api.Assertions.*;

class OdlUtilTest {

    @Test
    void getNode_Connector() {

//        System.out.println(Base64.getEncoder().encodeToString(("admin" + ":" + "admin").getBytes()));
        OdlUtil odlUtil = new OdlUtil("10.1.11.26",8181);
        String str  = null;
        str = odlUtil.getNode_Connector();

        Gson gson = new Gson();
        String json = gson.toJson(str);

        System.out.println(json);

    }

    @Test
    void test() {

        String jsonStr = "{\"name\":\"1\",\"ag-e\":2,\"id\":0}";

        Gson gson = new Gson();
        String json = gson.toJson(jsonStr);
        System.out.println(json);

        Gson gson1 = new Gson();

        TestBean lu = gson1.fromJson(jsonStr,TestBean.class);

        String age = lu.AgE;

        System.out.println(age);



    }

}