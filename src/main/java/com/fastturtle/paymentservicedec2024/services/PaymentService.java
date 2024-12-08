package com.fastturtle.paymentservicedec2024.services;

import com.fastturtle.paymentservicedec2024.paymentgateway.PaymentGateway;
import com.fastturtle.paymentservicedec2024.paymentgateway.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    public String getPaymentLink(Long amount, String orderId, String phoneNo, String name) {
        PaymentGateway paymentGateway = paymentGatewayChooserStrategy.getOptimalPaymentGateway();
        return paymentGateway.getPaymentLink(amount, orderId, phoneNo, name);
    }
}
