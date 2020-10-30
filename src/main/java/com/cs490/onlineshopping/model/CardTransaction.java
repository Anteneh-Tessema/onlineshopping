package com.cs490.onlineshopping.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class CardTransaction {
    @Id
    @GeneratedValue
    private BigInteger id;
    @Column(name = "card_number")
    private String cardNumber;
    @Column(name = "amount")
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    @Column(name = "transaction_type")
    private PaymentType transactionType;
    private PaymentStatus status;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public PaymentType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(PaymentType transactionType) {
        this.transactionType = transactionType;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
