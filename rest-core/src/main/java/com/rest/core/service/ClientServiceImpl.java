package com.rest.core.service;

import com.rest.api.dto.ClientDTO;
import com.rest.api.request.params.CreateClientParams;
import com.rest.api.request.params.UpdateClientParams;
import com.rest.core.dao.ClientRepository;
import com.rest.core.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository repository;


    public Long create(CreateClientParams params) {
        Client client = new Client();
        client.setEmail(params.getEmail());
        client.setPhone(params.getPhone());
        client.setName(params.getName());
        client.setSurname(params.getSurname());
        return repository.saveAndFlush(client).getId();
    }

    public ClientDTO get(Long id) {
        return null;
    }

    public List<ClientDTO> getAllClient() {
        return null;
    }

    public void update(UpdateClientParams params) {

    }

    public void delete(Long id) {

    }
}
