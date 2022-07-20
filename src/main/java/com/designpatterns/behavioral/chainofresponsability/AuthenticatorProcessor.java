package com.designpatterns.behavioral.chainofresponsability;

public abstract class AuthenticatorProcessor {

    public AuthenticatorProcessor nextProcessor;

    public AuthenticatorProcessor(AuthenticatorProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean isAuthorized(AuthenticatorProvider provider);

}
