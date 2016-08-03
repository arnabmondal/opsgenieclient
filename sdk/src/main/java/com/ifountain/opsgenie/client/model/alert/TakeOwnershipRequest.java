package com.ifountain.opsgenie.client.model.alert;

/**
 * Container for the parameters to make a take ownership api call.
 *
 * @author Sezgin Kucukkaraaslan
 * @version 11/26/12 4:32 PM
 * @see com.ifountain.opsgenie.client.IAlertOpsGenieClient#takeOwnership(TakeOwnershipRequest)
 */
public class TakeOwnershipRequest extends BaseAlertRequestWithSource<TakeOwnershipResponse> {
    private String user;
    private String note;

    /**
     * Rest api uri of take ownership operation.
     */
    @Override
    public String getEndPoint() {
        return "/v1/json/alert/takeOwnership";
    }

    /**
     * The user who is performing the take ownership operation.
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the user who is performing the take ownership operation.
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Additional alert note.
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets additional alert note.
     */
    public void setNote(String note) {
        this.note = note;
    }
    @Override
    /**
     * @see com.ifountain.opsgenie.client.model.BaseRequest#createResponse()
     */
    public TakeOwnershipResponse createResponse() {
        return new TakeOwnershipResponse();
    }

}
