package me.dio.sacola.resource.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Embeddable;

@Builder
@Data
@Embeddable
public class ItemDto {
    private Long produtoId;
    private int quantidade;
    private Long sacolaId;

    public ItemDto() {
    }

    public ItemDto(Long produtoId, int quantidade, Long sacolaId) {
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.sacolaId = sacolaId;
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getSacolaId() {
        return sacolaId;
    }

    public void setSacolaId(Long sacolaId) {
        this.sacolaId = sacolaId;
    }
}
