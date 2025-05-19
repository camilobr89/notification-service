package com.microservice.notificationservice.grpc;

import io.grpc.stub.StreamObserver;
import com.microservice.notificationservice.grpc.NotificationServiceGrpc;
import com.microservice.notificationservice.grpc.NotificationRequest;
import com.microservice.notificationservice.grpc.NotificationResponse;

public class NotificationServiceImpl extends NotificationServiceGrpc.NotificationServiceImplBase {

    @Override
    public void sendNotification(NotificationRequest request, StreamObserver<NotificationResponse> responseObserver) {
        System.out.println("Notificación enviada a: " + request.getEmail());
        System.out.println("Mensaje: " + request.getMessage());

        NotificationResponse response = NotificationResponse.newBuilder()
                .setStatus("SUCCESS")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
