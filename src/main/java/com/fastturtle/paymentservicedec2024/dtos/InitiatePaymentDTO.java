package com.fastturtle.paymentservicedec2024.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentDTO {

    private String orderId;
    private String phoneNo;
    private String name;
    private Long amount;
}
