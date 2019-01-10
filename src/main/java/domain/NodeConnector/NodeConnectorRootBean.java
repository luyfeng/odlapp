package domain.NodeConnector;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NodeConnectorRootBean {

    @SerializedName("node-connector")
    private List<NodeConnectorBean> NodeConnector;

    public List<NodeConnectorBean> getNodeConnector() {
        return NodeConnector;
    }

    public void setNodeConnector(List<NodeConnectorBean> nodeConnector) {
        NodeConnector = nodeConnector;
    }
}
