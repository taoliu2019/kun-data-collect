package com.miotech.kun.data.collect.client;

import java.io.IOException;

public class ElasticsearchClientTest {

    @org.testng.annotations.Test
    public void testPerformSearchRequest() throws IOException {
        ElasticsearchClient.getIndexes(null);
    }
}