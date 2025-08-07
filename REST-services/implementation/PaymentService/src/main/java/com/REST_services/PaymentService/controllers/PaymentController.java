package com.REST_services.PaymentService.controllers;


import com.REST_services.PaymentService.models.PaymentDetails;
import com.REST_services.PaymentService.services.PaymentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(
            @RequestHeader String requestId,
            @Valid @RequestBody PaymentDetails paymentDetails) {

        PaymentDetails processed = paymentService.processPayment(paymentDetails);

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("requestId" , requestId)
                .body(processed);
    }

}
