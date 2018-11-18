package com.rest.api.request.params;

public class CreateAccountParams {

    private Long clientId;
    private String login;
    private String password;

    public Long getClientId() {
        return clientId;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreateAccountParams{");
        sb.append("clientId=").append(clientId);
        sb.append(", login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
