package com.jbjohn.esclientjava.connector;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.ElasticsearchClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Connector test
 */
public class ElasticsearchConnectorTest {

    private ElasticsearchConnector elasticsearchConnector;
    private Client client;

    @Before
    public void setUp() throws Exception {
        elasticsearchConnector = new ElasticsearchConnector();
    }

    @Test
    public void create() throws Exception {
        client = elasticsearchConnector.create();
        Assert.assertTrue(client instanceof ElasticsearchClient);
    }

    @Test
    public void destroy() throws Exception {
        elasticsearchConnector.destroy(client);
        Assert.assertTrue(client == null);
    }

}