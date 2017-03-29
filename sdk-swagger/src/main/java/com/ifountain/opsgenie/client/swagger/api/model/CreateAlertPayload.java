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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateAlertPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T15:24:56.545+03:00")
public class CreateAlertPayload {
  @JsonProperty("message")
  private String message = null;

  @JsonProperty("alias")
  private String alias = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("teams")
  private List<TeamRecipientDto> teams = new ArrayList<TeamRecipientDto>();

  @JsonProperty("visibleTo")
  private List<RecipientDto> visibleTo = new ArrayList<RecipientDto>();

  @JsonProperty("actions")
  private List<String> actions = new ArrayList<String>();

  @JsonProperty("tags")
  private List<String> tags = new ArrayList<String>();

  @JsonProperty("entity")
  private String entity = null;

  @JsonProperty("urgency")
  private String urgency = null;

  @JsonProperty("impact")
  private String impact = null;

  public CreateAlertPayload message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   *
   * @return message
   **/
  @NotNull
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CreateAlertPayload alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Get alias
   *
   * @return alias
   **/
  @ApiModelProperty(example = "null", value = "")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public CreateAlertPayload description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateAlertPayload teams(List<TeamRecipientDto> teams) {
    this.teams = teams;
    return this;
  }

  public CreateAlertPayload addTeamsItem(TeamRecipientDto teamsItem) {
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Get teams
   *
   * @return teams
   **/
  @ApiModelProperty(example = "null", value = "")
  public List<TeamRecipientDto> getTeams() {
    return teams;
  }

  public void setTeams(List<TeamRecipientDto> teams) {
    this.teams = teams;
  }

  public CreateAlertPayload visibleTo(List<RecipientDto> visibleTo) {
    this.visibleTo = visibleTo;
    return this;
  }

  public CreateAlertPayload addVisibleToItem(RecipientDto visibleToItem) {
    this.visibleTo.add(visibleToItem);
    return this;
  }

  /**
   * Get visibleTo
   *
   * @return visibleTo
   **/
  @ApiModelProperty(example = "null", value = "")
  public List<RecipientDto> getVisibleTo() {
    return visibleTo;
  }

  public void setVisibleTo(List<RecipientDto> visibleTo) {
    this.visibleTo = visibleTo;
  }

  public CreateAlertPayload actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public CreateAlertPayload addActionsItem(String actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Get actions
   *
   * @return actions
   **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public CreateAlertPayload tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateAlertPayload addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   *
   * @return tags
   **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CreateAlertPayload entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Get entity
   *
   * @return entity
   **/
  @ApiModelProperty(example = "null", value = "")
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public CreateAlertPayload urgency(String urgency) {
    this.urgency = urgency;
    return this;
  }

  /**
   * Get urgency
   * @return urgency
   **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrgency() {
    return urgency;
  }

  public void setUrgency(String urgency) {
    this.urgency = urgency;
  }

  public CreateAlertPayload impact(String impact) {
    this.impact = impact;
    return this;
  }

  /**
   * Get impact
   * @return impact
   **/
  @ApiModelProperty(example = "null", value = "")
  public String getImpact() {
    return impact;
  }

  public void setImpact(String impact) {
    this.impact = impact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAlertPayload createAlertPayload = (CreateAlertPayload) o;
    return ObjectUtils.equals(this.message, createAlertPayload.message) &&
            ObjectUtils.equals(this.alias, createAlertPayload.alias) &&
            ObjectUtils.equals(this.description, createAlertPayload.description) &&
            ObjectUtils.equals(this.teams, createAlertPayload.teams) &&
            ObjectUtils.equals(this.visibleTo, createAlertPayload.visibleTo) &&
            ObjectUtils.equals(this.actions, createAlertPayload.actions) &&
            ObjectUtils.equals(this.tags, createAlertPayload.tags) &&
            ObjectUtils.equals(this.entity, createAlertPayload.entity) &&
            ObjectUtils.equals(this.urgency, createAlertPayload.urgency) &&
            ObjectUtils.equals(this.impact, createAlertPayload.impact);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(message, alias, description, teams, visibleTo, actions, tags, entity, urgency, impact);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAlertPayload {\n");

    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    urgency: ").append(toIndentedString(urgency)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
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

