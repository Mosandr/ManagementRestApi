package com.rest.core.domain;

import javax.persistence.*;

@Entity
@Table
public class Client {

    @Id
    @Column(name = "clientId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String email;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String phone;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "client", targetEntity = Account.class)
    private Account account;

    public Client(){}

    public Client(String email, String name, String surname, String phone) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getId() {

        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("id=").append(id);
        sb.append(", email='").append(email).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

