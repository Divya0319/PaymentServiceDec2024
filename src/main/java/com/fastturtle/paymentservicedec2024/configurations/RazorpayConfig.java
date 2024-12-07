package com.fastturtle.paymentservicedec2024.configurations;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayConfig {

    @Value("${razorpay.key}")
    private String razorPayKey;

    @Value("${razorpay.secret}")
    private String razorPaySecret;

    @Bean
    public RazorpayClient getRazorPayClient() {
        try {
            return new RazorpayClient(razorPayKey, razorPaySecret);
        } catch (RazorpayException e) {
            throw new RuntimeException(e);
        }
    }
}
