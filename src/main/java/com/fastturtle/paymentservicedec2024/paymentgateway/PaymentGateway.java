package com.fastturtle.paymentservicedec2024.paymentgateway;

public interface PaymentGateway {

    String getPaymentLink(Long amount, String orderId, String phoneNo, String name);
}
