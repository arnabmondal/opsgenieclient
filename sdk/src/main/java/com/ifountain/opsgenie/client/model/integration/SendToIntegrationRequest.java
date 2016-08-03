package com.ifountain.opsgenie.client.model.integration;

import com.ifountain.opsgenie.client.OpsGenieClientConstants;
import com.ifountain.opsgenie.client.OpsGenieClientValidationException;
import com.ifountain.opsgenie.client.model.BaseRequestWithHttpParameters;

import java.util.HashMap;
import java.util.Map;

/**
 * Container for the parameters to send integration webhook call.
 *
 * @see com.ifountain.opsgenie.client.IIntegrationOpsGenieClient#sendToIntegration(com.ifountain.opsgenie.client.model.integration.SendToIntegrationRequest)
 */
public class SendToIntegrationRequest extends BaseRequestWithHttpParameters<SendToIntegrationResponse> {
    private String endPoint;
    private Map<String, Object> contentParameters;

    public Map<String, Object> getContentParameters() {
        return contentParameters;
    }

    public void setContentParameters(Map<String, Object> contentParameters) {
        this.contentParameters = contentParameters;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    /**
     * Rest api uri of send to integration operation.
     */
    @Override
    public String getEndPoint() {
        return endPoint;
    }

    @Override
    /**
     * @see com.ifountain.opsgenie.client.model.BaseRequest#createResponse()
     */
    public SendToIntegrationResponse createResponse() {
        return new SendToIntegrationResponse();
    }

    @Override
    public Map serialize() throws OpsGenieClientValidationException {
		Map contentParameters = new HashMap();
		if (getApiKey() != null) 
			contentParameters.put(OpsGenieClientConstants.API.API_KEY, getApiKey());
        // apiKey in contentParameters will override BaseRequest.apiKey
        contentParameters.putAll(getContentParameters());
        return contentParameters;
    }
}
