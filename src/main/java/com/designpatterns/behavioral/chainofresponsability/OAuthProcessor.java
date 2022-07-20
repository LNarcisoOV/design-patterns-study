package com.designpatterns.behavioral.chainofresponsability;

public class OAuthProcessor extends AuthenticatorProcessor {

    public OAuthProcessor(AuthenticatorProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticatorProvider authProvider) {
        if (authProvider instanceof OAuthTokenProvider) {
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        }
        return false;
    }

}
