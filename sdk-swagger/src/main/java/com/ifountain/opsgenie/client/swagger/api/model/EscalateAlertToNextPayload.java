/*
 * OpsGenie REST API
 * OpsGenie API Description
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ifountain.opsgenie.client.swagger.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

import javax.validation.constraints.NotNull;

/**
 * EscalateAlertToNextPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T15:24:56.545+03:00")
public class EscalateAlertToNextPayload {
    @JsonProperty("user")
    private String user = null;

    @JsonProperty("note")
    private String note = null;

    @JsonProperty("source")
    private String source = null;

    @JsonProperty("escalation")
    private EscalationRecipientDto escalation = null;

    public EscalateAlertToNextPayload user(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     *
     * @return user
     **/
    @ApiModelProperty(example = "null", value = "")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public EscalateAlertToNextPayload note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Get note
     *
     * @return note
     **/
    @ApiModelProperty(example = "null", value = "")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public EscalateAlertToNextPayload source(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     *
     * @return source
     **/
    @ApiModelProperty(example = "null", value = "")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public EscalateAlertToNextPayload escalation(EscalationRecipientDto escalation) {
        this.escalation = escalation;
        return this;
    }

    /**
     * Get escalation
     *
     * @return escalation
     **/
    @NotNull
    @ApiModelProperty(example = "null", required = true, value = "")
    public EscalationRecipientDto getEscalation() {
        return escalation;
    }

    public void setEscalation(EscalationRecipientDto escalation) {
        this.escalation = escalation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EscalateAlertToNextPayload escalateAlertToNextPayload = (EscalateAlertToNextPayload) o;
        return ObjectUtils.equals(this.user, escalateAlertToNextPayload.user) &&
                ObjectUtils.equals(this.note, escalateAlertToNextPayload.note) &&
                ObjectUtils.equals(this.source, escalateAlertToNextPayload.source) &&
                ObjectUtils.equals(this.escalation, escalateAlertToNextPayload.escalation);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(user, note, source, escalation);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EscalateAlertToNextPayload {\n");

        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    escalation: ").append(toIndentedString(escalation)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
    return o.toString().replace("\n", "\n    ");
  }
  
}

