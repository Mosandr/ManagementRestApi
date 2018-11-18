package com.rest.core.service;

import com.rest.api.dto.ClientDTO;
import com.rest.api.request.params.CreateClientParams;
import com.rest.api.request.params.UpdateClientParams;
import com.rest.core.domain.Client;

import java.util.List;

public interface ClientService {

    Long create(CreateClientParams params);

    ClientDTO get(Long id);

    List<ClientDTO> getAllClient();

    void update(UpdateClientParams params);

    void delete(Long id);
}
