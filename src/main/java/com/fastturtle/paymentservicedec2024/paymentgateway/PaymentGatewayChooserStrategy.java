package com.fastturtle.paymentservicedec2024.paymentgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PaymentGatewayChooserStrategy {
    @Autowired
    private RazorpayPaymentGateway razorpayPaymentGateway;

    @Autowired
    private StripePaymentGateway stripePaymentGateway;

    public PaymentGateway getOptimalPaymentGateway() {

//        Random r = new Random();
//        int index = r.nextInt(10);

        // Call stripe if index is even, else call razorpay

//        if(index % 2 == 0) {
//            return stripePaymentGateway;
//        }
//        else {
//            return razorpayPaymentGateway;
//        }

        return stripePaymentGateway;
    }
}
