package com.example.auction.bidding.impl;

import com.lightbend.lagom.javadsl.api.transport.TransportErrorCode;
import com.lightbend.lagom.javadsl.api.transport.TransportException;

public class BidValidationException extends TransportException {
    public BidValidationException(String message) {
        super(TransportErrorCode.PolicyViolation, message);
    }
}
