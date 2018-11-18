package com.rest.core.endpoint;

import com.rest.api.endpoint.AccountEndpoint;
import com.rest.api.request.GeneralRequest;
import com.rest.api.request.params.CreateAccountParams;
import com.rest.api.response.GeneralResponse;
import com.rest.core.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestEndpoint implements AccountEndpoint {

    @Autowired
    private AccountService service;

    public GeneralResponse<Long> createAccountRecord(
            @RequestBody GeneralRequest<CreateAccountParams> request) {
        return new GeneralResponse<Long>(200, service.create(request.getParameters()));
    }
}
