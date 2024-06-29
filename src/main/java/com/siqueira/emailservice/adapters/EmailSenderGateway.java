package com.siqueira.emailservice.adapters;

public interface EmailSenderGateway {

    // contrato da aplicacao com o provider
    void sendEmail(String to, String subject, String body);
}
