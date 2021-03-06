package domain.Nodes;


import com.google.gson.annotations.SerializedName;

import java.util.List;

//3
public class NodeBean {

    private String id;
    @SerializedName("node-connector")
    private List<NodeConnectorBean> NodeConnector;
    @SerializedName("flow-node-inventory:ip-address")
    private String FlowNodeInventory_IpAddress;
    @SerializedName("flow-node-inventory:software")
    private String FlowNodeInventory_Software;
    @SerializedName("flow-node-inventory:port-number")
    private int FlowNodeInventory_PortNumber;
    @SerializedName("flow-node-inventory:hardware")
    private String FlowNodeInventory_Hardware;

    public void setId(String id) {
        this.id = id;
    }

    public void setNodeConnector(List<NodeConnectorBean> nodeConnector) {
        NodeConnector = nodeConnector;
    }

    public void setFlowNodeInventory_IpAddress(String flowNodeInventory_IpAddress) {
        FlowNodeInventory_IpAddress = flowNodeInventory_IpAddress;
    }

    public void setFlowNodeInventory_Software(String flowNodeInventory_Software) {
        FlowNodeInventory_Software = flowNodeInventory_Software;
    }

    public void setFlowNodeInventory_PortNumber(int flowNodeInventory_PortNumber) {
        FlowNodeInventory_PortNumber = flowNodeInventory_PortNumber;
    }

    public void setFlowNodeInventory_Hardware(String flowNodeInventory_Hardware) {
        FlowNodeInventory_Hardware = flowNodeInventory_Hardware;
    }

    public String getId() {
        return id;
    }

    public List<NodeConnectorBean> getNodeConnector() {
        return NodeConnector;
    }

    public String getFlowNodeInventory_IpAddress() {
        return FlowNodeInventory_IpAddress;
    }

    public String getFlowNodeInventory_Software() {
        return FlowNodeInventory_Software;
    }

    public int getFlowNodeInventory_PortNumber() {
        return FlowNodeInventory_PortNumber;
    }

    public String getFlowNodeInventory_Hardware() {
        return FlowNodeInventory_Hardware;
    }

    @Override
    public String toString() {
        return "NodeBean{" +
                "id='" + id + '\'' +
                ", NodeConnector=" + NodeConnector +
                ", FlowNodeInventory_IpAddress='" + FlowNodeInventory_IpAddress + '\'' +
                ", FlowNodeInventory_Software='" + FlowNodeInventory_Software + '\'' +
                ", FlowNodeInventory_PortNumber=" + FlowNodeInventory_PortNumber +
                ", FlowNodeInventory_Hardware='" + FlowNodeInventory_Hardware + '\'' +
                '}';
    }
}
