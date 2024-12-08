package com.fastturtle.paymentservicedec2024.paymentgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayChooserStrategy {
    @Autowired
    private RazorpayPaymentGateway razorpayPaymentGateway;

    public PaymentGateway getOptimalPaymentGateway() {
        return razorpayPaymentGateway;
    }
}
