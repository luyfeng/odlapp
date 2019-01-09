package domain;

public class Table {
    private String id;
    private String priority;
    private String table_id;
    private String hard_timeout;
    private String idle_timeout;
    private String flow_name;
    private String in_port;
    private String instruction_order;
    private String action_order;
    private String output_node_connector;

    public void setId(String id) {
        this.id = id;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setTable_id(String table_id) {
        this.table_id = table_id;
    }

    public void setHard_timeout(String hard_timeout) {
        this.hard_timeout = hard_timeout;
    }

    public void setIdle_timeout(String idle_timeout) {
        this.idle_timeout = idle_timeout;
    }

    public void setFlow_name(String flow_name) {
        this.flow_name = flow_name;
    }

    public void setIn_port(String in_port) {
        this.in_port = in_port;
    }

    public void setInstruction_order(String instruction_order) {
        this.instruction_order = instruction_order;
    }

    public void setAction_order(String action_order) {
        this.action_order = action_order;
    }

    public void setOutput_node_connector(String output_node_connector) {
        this.output_node_connector = output_node_connector;
    }


    public String getId() {
        return id;
    }

    public String getPriority() {
        return priority;
    }

    public String getTable_id() {
        return table_id;
    }

    public String getHard_timeout() {
        return hard_timeout;
    }

    public String getIdle_timeout() {
        return idle_timeout;
    }

    public String getFlow_name() {
        return flow_name;
    }

    public String getIn_port() {
        return in_port;
    }

    public String getInstruction_order() {
        return instruction_order;
    }

    public String getAction_order() {
        return action_order;
    }

    public String getOutput_node_connector() {
        return output_node_connector;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id='" + id + '\'' +
                ", priority='" + priority + '\'' +
                ", table_id='" + table_id + '\'' +
                ", hard_timeout='" + hard_timeout + '\'' +
                ", idle_timeout='" + idle_timeout + '\'' +
                ", flow_name='" + flow_name + '\'' +
                ", in_port='" + in_port + '\'' +
                ", instruction_order='" + instruction_order + '\'' +
                ", action_order='" + action_order + '\'' +
                ", output_node_connector='" + output_node_connector + '\'' +
                '}';
    }
}
