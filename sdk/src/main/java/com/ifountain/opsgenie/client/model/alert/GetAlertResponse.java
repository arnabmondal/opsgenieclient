package com.ifountain.opsgenie.client.model.alert;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.ifountain.opsgenie.client.model.BaseResponse;
import com.ifountain.opsgenie.client.model.beans.Alert;

/**
 * Represents the OpsGenie service response for an get alert request.
 *
 * @author Sezgin Kucukkaraaslan
 * @see com.ifountain.opsgenie.client.IAlertOpsGenieClient#getAlert(GetAlertRequest)
 */
public class GetAlertResponse extends BaseResponse {
    @JsonUnwrapped
    private Alert alert;

    public Alert getAlert() {
        return alert;
    }

    public void setAlert(Alert alert) {
        this.alert = alert;
    }
}
