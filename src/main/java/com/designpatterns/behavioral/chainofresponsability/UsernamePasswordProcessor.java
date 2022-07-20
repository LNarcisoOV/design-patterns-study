package com.designpatterns.behavioral.chainofresponsability;

public class UsernamePasswordProcessor extends AuthenticatorProcessor {

    public UsernamePasswordProcessor(AuthenticatorProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticatorProvider authProvider) {
        if (authProvider instanceof UsernamePasswordProvider) {
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        }
        return false;
    }


}
