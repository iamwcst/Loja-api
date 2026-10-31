package com.example.Loja.vendas;

import com.example.Loja.clientes.Cliente;
import com.example.Loja.produtos.Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class Venda {
    @Id
    private UUID id;
    private LocalDateTime dataVenda;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Produto produto;

    public Venda(Produto produto, LocalDateTime dataVenda, Cliente cliente) {
        this.produto = produto;
        this.dataVenda = dataVenda;
        this.cliente = cliente;
    }

    public Venda() {

    }
}
