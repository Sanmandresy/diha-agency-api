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
import io.swagger.client.model.InternalServerException;
import io.swagger.client.model.NotAuthorizedException;
import io.swagger.client.model.PreTransaction;
import io.swagger.client.model.ResourceNotFoundException;
import io.swagger.client.model.TooManyRequestsException;
import io.swagger.client.model.Transaction;
import io.swagger.client.model.TransactionResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for TransactionApi
 */
@Ignore
public class TransactionApiTest {

    private final TransactionApi api = new TransactionApi();

    /**
     * 
     *
     * add a new transaction to our list
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createNewTransactionTest() throws Exception {
        PreTransaction body = null;
        TransactionResponse response = api.createNewTransaction(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * get a specified transaction.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTransactionByIdTest() throws Exception {
        Integer transactionId = null;
        Transaction response = api.getTransactionById(transactionId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get a list of all transactions
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTransactionsTest() throws Exception {
        List<Transaction> response = api.getTransactions();

        // TODO: test validations
    }
}
