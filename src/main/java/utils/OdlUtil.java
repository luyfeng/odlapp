package utils;

import java.util.Base64;

public class OdlUtil {

    private String url = "";

    public OdlUtil(String host,int port){
        this.url = "http://" + host + ":" + port;
    }

    public String getNode_Connector(){
        return getNode_Connector("openflow:1:2");
    }

    public String getNode_Connector(String containerName, String username, String password) {
        HttpRequest.setBasicAuth(getBasicAuthStr(username,password));
        String str = HttpRequest.sendGet(url + "/restconf/operational/opendaylight-inventory:nodes/node/openflow:1/node-connector/" + containerName,"");
//        System.out.print(str);
        return str;
    }

    public String getNode_Connector(String containerName){
        return getNode_Connector(containerName, "admin","admin");
    }

    private String getBasicAuthStr(String name,String password){
        return "Basic " + Base64.getEncoder().encodeToString((name + ":" + password).getBytes());
    }



}
