package com.microservice.notificationservice.service;

import com.microservice.notificationservice.grpc.NotificationServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class NotificationServiceServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051)
                .addService(new NotificationServiceImpl())
                .build();

        System.out.println("Notification Service started on port 50051");
        server.start();
        server.awaitTermination();
    }
}
