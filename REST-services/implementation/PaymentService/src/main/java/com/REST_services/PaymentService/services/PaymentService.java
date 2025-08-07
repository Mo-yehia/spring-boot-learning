package com.REST_services.PaymentService.services;

import com.REST_services.PaymentService.controllers.PaymentController;
import com.REST_services.PaymentService.exceptions.NotEnoughMoneyException;
import com.REST_services.PaymentService.models.PaymentDetails;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.logging.Logger;

@Service
public class PaymentService {
    private static final Logger logger =
            Logger.getLogger(PaymentService.class.getName());

    public PaymentDetails processPayment(PaymentDetails paymentDetails) {

        double amount = paymentDetails.getAmount();

        double accountBalance = 1000.0; //just to simulate the account balance
        if (amount > accountBalance) {
            throw new NotEnoughMoneyException();
        }
        logger.info("Received payment of amount: " + paymentDetails.getAmount());
        paymentDetails.setId(UUID.randomUUID().toString());
        logger.info("Payment id: " + paymentDetails.getId());

        return paymentDetails;
    }
}
