package com.rest.api.request.params;

public class UpdateClientParams extends CreateClientParams{

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {

        return id;
    }
}
