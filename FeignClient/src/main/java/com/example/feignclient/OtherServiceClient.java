package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "otherService", url = "http://other-service-url.com")
public interface OtherServiceClient {

    @GetMapping("/endpoint")
    String getData();
}
