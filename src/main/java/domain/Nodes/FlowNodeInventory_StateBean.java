package domain.Nodes;

//5
public class FlowNodeInventory_StateBean {

    private boolean live;

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    @Override
    public String toString() {
        return "FlowNodeInventory_StateBean{" +
                "live=" + live +
                '}';
    }
}
