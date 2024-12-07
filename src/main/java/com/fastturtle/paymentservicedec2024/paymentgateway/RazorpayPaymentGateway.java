package com.fastturtle.paymentservicedec2024.paymentgateway;

import org.springframework.stereotype.Component;

@Component
public class RazorpayPaymentGateway implements PaymentGateway {
    @Override
    public String getPaymentLink() {
        return null;
    }
}
