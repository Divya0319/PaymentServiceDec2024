package com.fastturtle.paymentservicedec2024.controllers;

import com.fastturtle.paymentservicedec2024.dtos.InitiatePaymentDTO;
import com.fastturtle.paymentservicedec2024.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentDTO initiatePaymentDTO) {
        return paymentService.getPaymentLink(
                initiatePaymentDTO.getAmount(),
                initiatePaymentDTO.getOrderId(),
                initiatePaymentDTO.getPhoneNo(),
                initiatePaymentDTO.getName());
    }
}
