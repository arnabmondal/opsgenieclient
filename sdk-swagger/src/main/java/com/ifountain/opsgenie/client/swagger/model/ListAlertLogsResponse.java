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


package com.ifountain.opsgenie.client.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * ListAlertLogsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-13T16:12:27.505+03:00")
public class ListAlertLogsResponse {
    @JsonProperty("requestId")
    private String requestId = null;

    @JsonProperty("took")
    private Float took = 0.0f;

    @JsonProperty("data")
    private List<AlertLog> data = new ArrayList<AlertLog>();

    @JsonProperty("paging")
    private Paging paging = null;

    public ListAlertLogsResponse requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get requestId
     *
     * @return requestId
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListAlertLogsResponse took(Float took) {
        this.took = took;
        return this;
    }

    /**
     * Get took
     *
     * @return took
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public Float getTook() {
        return took;
    }

    public void setTook(Float took) {
        this.took = took;
    }

    public ListAlertLogsResponse data(List<AlertLog> data) {
        this.data = data;
        return this;
    }

    public ListAlertLogsResponse addDataItem(AlertLog dataItem) {
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @ApiModelProperty(value = "")
    public List<AlertLog> getData() {
        return data;
    }

    public void setData(List<AlertLog> data) {
        this.data = data;
    }

    public ListAlertLogsResponse paging(Paging paging) {
        this.paging = paging;
        return this;
    }

    /**
     * Get paging
     *
     * @return paging
     **/
    @ApiModelProperty(value = "")
    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlertLogsResponse listAlertLogsResponse = (ListAlertLogsResponse) o;
        return ObjectUtils.equals(this.requestId, listAlertLogsResponse.requestId) &&
                ObjectUtils.equals(this.took, listAlertLogsResponse.took) &&
                ObjectUtils.equals(this.data, listAlertLogsResponse.data) &&
                ObjectUtils.equals(this.paging, listAlertLogsResponse.paging);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(requestId, took, data, paging);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlertLogsResponse {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    took: ").append(toIndentedString(took)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

