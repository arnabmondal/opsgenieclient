package com.ifountain.opsgenie.client.model.customer;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Container for the parameters to make a create heartbeat monitor api call.
 *
 * @see com.ifountain.opsgenie.client.IOpsGenieClient#updateHeartbeat(UpdateHeartbeatRequest)
 */
public class UpdateHeartbeatRequest extends AddHeartbeatRequest{
	@JsonSerialize(include=Inclusion.ALWAYS)
    private String name;
    /**
     * Rest api uri of updating heartbeat monitor operation.
     */
    @Override
    public String getEndPoint() {
        return "/v1/json/heartbeat";
    }

    /**
     * Return name of heartbeat monitor
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of heartbeat monitor
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    /**
     * @see com.ifountain.opsgenie.client.model.BaseRequest#createResponse()
     */
    public AddHeartbeatResponse createResponse() {
        return new UpdateHeartbeatResponse();
    }
}
