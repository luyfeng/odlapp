package domain;

public class listNodeConnectorBean {

    private String id;
    private String FlowNodeInventory_PortNumber;
    private String FlowNodeInventory_HardwareAddress;
    private long FlowNodeInventory_CurrentSpeed;
    private String FlowNodeInventory_Name;
    private boolean live;

    public void setId(String id) {
        this.id = id;
    }

    public void setFlowNodeInventory_PortNumber(String flowNodeInventory_PortNumber) {
        FlowNodeInventory_PortNumber = flowNodeInventory_PortNumber;
    }

    public void setFlowNodeInventory_HardwareAddress(String flowNodeInventory_HardwareAddress) {
        FlowNodeInventory_HardwareAddress = flowNodeInventory_HardwareAddress;
    }

    public void setFlowNodeInventory_CurrentSpeed(long flowNodeInventory_CurrentSpeed) {
        FlowNodeInventory_CurrentSpeed = flowNodeInventory_CurrentSpeed;
    }

    public void setFlowNodeInventory_Name(String flowNodeInventory_Name) {
        FlowNodeInventory_Name = flowNodeInventory_Name;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public String getId() {
        return id;
    }

    public String getFlowNodeInventory_PortNumber() {
        return FlowNodeInventory_PortNumber;
    }

    public String getFlowNodeInventory_HardwareAddress() {
        return FlowNodeInventory_HardwareAddress;
    }

    public long getFlowNodeInventory_CurrentSpeed() {
        return FlowNodeInventory_CurrentSpeed;
    }

    public String getFlowNodeInventory_Name() {
        return FlowNodeInventory_Name;
    }

    public boolean isLive() {
        return live;
    }
}
