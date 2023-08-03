package com.example.feignclient;

import com.example.feignpoc.client.OtherServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {

    private final OtherServiceClient otherServiceClient;

    @Autowired
    public Service(OtherServiceClient otherServiceClient) {
        this.otherServiceClient = otherServiceClient;
    }

    @GetMapping("/data")
    public String getOtherServiceData() {
        return otherServiceClient.getData();
    }
}