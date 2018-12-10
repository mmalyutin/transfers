package com.model.transfers;

import com.model.BaseEntity;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Transfer extends BaseEntity<Integer> {

    private String paymentNumber;

    private Double amount;

    private LocalDate date;

    private String senderAccount;

    private String receiverName;

    private String receiverAccount;

}