package com.rest.core.endpoint;

import com.rest.api.dto.ClientDTO;
import com.rest.api.endpoint.ClientEndpoint;
import com.rest.api.request.GeneralRequest;
import com.rest.api.request.params.CreateClientParams;
import com.rest.api.request.params.UpdateClientParams;
import com.rest.api.response.GeneralResponse;
import com.rest.core.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientRestEndpoint implements ClientEndpoint {

    @Autowired
    private ClientService service;


    public GeneralResponse<Long> createClientRecord(
            @RequestBody GeneralRequest<CreateClientParams> request) {
        return new GeneralResponse<Long>(200, service.create(request.getParameters()));
    }

    public GeneralResponse<Void> deleteClient(@RequestParam("clientId") Long clientId) {
        service.delete(clientId);
        return new GeneralResponse<Void>(200, null);
    }

    public GeneralResponse<ClientDTO> getClientById(@RequestParam ("clientId") Long clientId) {
        return new GeneralResponse<ClientDTO>(200, service.get(clientId));
    }

    public GeneralResponse<List<ClientDTO>> getAllClient() {
        return new GeneralResponse<List<ClientDTO>>(200, service.getAllClient());
    }

    public GeneralResponse<Void> updateClient(@RequestBody GeneralRequest<UpdateClientParams> request) {
        service.update(request.getParameters());
        return new GeneralResponse<Void>(200,null);
    }

}


