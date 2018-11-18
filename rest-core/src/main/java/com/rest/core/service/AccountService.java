package com.rest.core.service;

import com.rest.api.request.params.CreateAccountParams;

public interface AccountService {

    Long create(CreateAccountParams params);
}
