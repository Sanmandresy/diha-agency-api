/*
 * diha-agency-api
 * An early version of an API for a travel Agency named \"Diha Agency\".
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.BadRequestException;
import io.swagger.client.model.Client;
import io.swagger.client.model.InternalServerException;
import io.swagger.client.model.NotAuthorizedException;
import io.swagger.client.model.PreClient;
import io.swagger.client.model.ResourceNotFoundException;
import io.swagger.client.model.TooManyRequestsException;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ClientsApi
 */
@Ignore
public class ClientsApiTest {

    private final ClientsApi api = new ClientsApi();

    /**
     * 
     *
     * add a new client to our list.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createNewClientTest() throws Exception {
        PreClient body = null;
        List<Client> response = api.createNewClient(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * delete a specified client
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteClientByIdTest() throws Exception {
        Integer clientId = null;
        String response = api.deleteClientById(clientId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get a specified client
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getClientByIdTest() throws Exception {
        Integer clientId = null;
        Client response = api.getClientById(clientId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get all registered clients
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getClientsTest() throws Exception {
        Integer page = null;
        Integer pageSize = null;
        List<Client> response = api.getClients(page, pageSize);

        // TODO: test validations
    }
    /**
     * 
     *
     * modify a specified client&#x27;s details
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateClientByIdTest() throws Exception {
        PreClient body = null;
        Integer clientId = null;
        Client response = api.updateClientById(body, clientId);

        // TODO: test validations
    }
}
