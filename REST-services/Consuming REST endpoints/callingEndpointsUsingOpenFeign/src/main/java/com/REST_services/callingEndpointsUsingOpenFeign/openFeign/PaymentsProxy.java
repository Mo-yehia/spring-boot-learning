package com.REST_services.callingEndpointsUsingOpenFeign.openFeign;

import com.REST_services.callingEndpointsUsingOpenFeign.models.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "payments",
        url = "${payment.service.url}")
public interface PaymentsProxy {

    @PostMapping("/payment")
    Payment createPayment(
            @RequestHeader String requestId,
            @RequestBody Payment payment);

}
