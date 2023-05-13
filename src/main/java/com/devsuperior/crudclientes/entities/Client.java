package com.devsuperior.crudclientes.entities;

import com.devsuperior.crudclientes.dto.ClientDTO;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_client")
public class Client {

    //Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String cpf;

    private Double income;

    private LocalDate birthDate;

    private Integer children;

    //Constructors

    public Client() {
    }

    public Client(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public Client(ClientDTO clientDTO) {
        name = clientDTO.getName();
        cpf = clientDTO.getCpf();
        income = clientDTO.getIncome();
        birthDate = clientDTO.getBirthDate();
        children = clientDTO.getChildren();
    }

    //Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    //ToString

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", income=" + income +
                ", birthDate=" + birthDate +
                ", children=" + children +
                '}';
    }
}
