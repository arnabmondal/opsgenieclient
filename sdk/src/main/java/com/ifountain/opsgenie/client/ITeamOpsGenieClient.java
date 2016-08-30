package com.ifountain.opsgenie.client;

import com.ifountain.opsgenie.client.model.team.AddTeamMemberRequest;
import com.ifountain.opsgenie.client.model.team.AddTeamMemberResponse;
import com.ifountain.opsgenie.client.model.team.DeleteTeamMemberRequest;
import com.ifountain.opsgenie.client.model.team.DeleteTeamMemberResponse;
import com.ifountain.opsgenie.client.model.team.*;

import java.io.IOException;
import java.text.ParseException;

/**
 * Interface for accessing OpsGenie for team related operations
 *
 * @author Sezgin Kucukkaraaslan
 * @version 12/3/2014 12:04 PM
 * @see com.ifountain.opsgenie.client.OpsGenieClient
 */
public interface ITeamOpsGenieClient {
    /**
     * Adds a team at OpsGenie.
     *
     * @param addTeamRequest Object to construct request parameters.
     * @return <code>AddTeamResponse</code> object containing OpsGenie response information.
     * @see com.ifountain.opsgenie.client.model.team.AddTeamRequest
     * @see com.ifountain.opsgenie.client.model.team.AddTeamResponse
     */
    public AddTeamResponse addTeam(AddTeamRequest addTeamRequest) throws IOException, OpsGenieClientException, ParseException;

    /**
     * Updates team at OpsGenie.
     *
     * @param updateTeamRequest Object to construct request parameters.
     * @return <code>UpdateTeamResponse</code> object containing OpsGenie response information.
     * @see com.ifountain.opsgenie.client.model.team.UpdateTeamRequest
     * @see com.ifountain.opsgenie.client.model.team.UpdateTeamResponse
     */
    public UpdateTeamResponse updateTeam(UpdateTeamRequest updateTeamRequest) throws IOException, OpsGenieClientException, ParseException;

    /**
     * Deletes a team at OpsGenie.
     *
     * @param deleteTeamRequest Object to construct request parameters.
     * @return <code>DeleteTeamResponse</code> object containing OpsGenie response information.
     * @see com.ifountain.opsgenie.client.model.team.DeleteTeamRequest
     * @see com.ifountain.opsgenie.client.model.team.DeleteTeamResponse
     */
    public DeleteTeamResponse deleteTeam(DeleteTeamRequest deleteTeamRequest) throws IOException, OpsGenieClientException, ParseException;

    /**
     * Get team details
     *
     * @param getTeamRequest Object to construct request parameters.
     * @return <code>GetTeamResponse</code> object containing OpsGenie response information.
     * @see com.ifountain.opsgenie.client.model.team.GetTeamRequest
     * @see com.ifountain.opsgenie.client.model.team.GetTeamResponse
     */
    public GetTeamResponse getTeam(GetTeamRequest getTeamRequest) throws IOException, OpsGenieClientException, ParseException;

    /**
     * List teams of customer
     *
     * @param listTeamsRequest Object to construct request parameters.
     * @return <code>ListTeamsResponse</code> object containing OpsGenie response information.
     * @see com.ifountain.opsgenie.client.model.team.ListTeamsRequest
     * @see com.ifountain.opsgenie.client.model.team.ListTeamsResponse
     */
    public ListTeamsResponse listTeams(ListTeamsRequest listTeamsRequest) throws IOException, OpsGenieClientException, ParseException;

    /**
     * Lists team logs
     *
     * @param listTeamLogsRequest  Object to construct request parameters.
     * @return Object containing alert logs
     * @see com.ifountain.opsgenie.client.model.team.ListTeamLogsRequest
     * @see com.ifountain.opsgenie.client.model.team.ListTeamLogsResponse
     */
    public ListTeamLogsResponse listTeamLogs(ListTeamLogsRequest listTeamLogsRequest) throws ParseException, OpsGenieClientException, IOException;

    
    /**
     * Adds a team member at OpsGenie.
     *
     * @param addTeamMemberRequest Object to construct request parameters.
     * @return <code>AddTeamResponse</code> object containing OpsGenie response information.
     * @see com.ifountain.opsgenie.client.model.team.AddTeamMemberRequest
     * @see com.ifountain.opsgenie.client.model.team.AddTeamMemberResponse
     */
    public AddTeamMemberResponse addTeamMember(AddTeamMemberRequest addTeamMemberRequest) throws IOException, OpsGenieClientException, ParseException;

    /**
     * Removes a team member at OpsGenie.
     *
     * @param deleteTeamMemberRequest Object to construct request parameters.
     * @return <code>AddTeamResponse</code> object containing OpsGenie response information.
     * @see com.ifountain.opsgenie.client.model.team.DeleteTeamMemberRequest
     * @see com.ifountain.opsgenie.client.model.team.DeleteTeamMemberResponse
     */
    public DeleteTeamMemberResponse deleteTeamMember(DeleteTeamMemberRequest deleteTeamMemberRequest) throws IOException, OpsGenieClientException, ParseException;

    

}
