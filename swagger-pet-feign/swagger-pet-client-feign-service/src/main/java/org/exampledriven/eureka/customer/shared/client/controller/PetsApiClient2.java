package org.exampledriven.eureka.customer.shared.client.controller;

import io.swagger.api.PetsApi;
import io.swagger.configuration.ClientConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name="${ swaggerPetstoreSimple.name:swaggerPetstoreSimple}", url="${ swaggerPetstoreSimple.url:https://localhost:8080/api}", configuration = ClientConfiguration.class)
public interface PetsApiClient2 extends PetsApi {
}