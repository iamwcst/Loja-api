package com.example.Loja.clientes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.UUID;

@Entity
@Data

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
   private UUID id;
    private String nome;

    public Cliente(UUID id, String nome) {
        this.nome = nome;
    }

    public Cliente() {

    }
}




