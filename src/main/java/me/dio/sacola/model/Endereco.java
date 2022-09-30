package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Builder
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Embeddable
public class Endereco {
    private String cep;
    private String complemento;

    public Endereco(){

    }

    public Endereco(String cep, String complemento) {
        this.cep = cep;
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
