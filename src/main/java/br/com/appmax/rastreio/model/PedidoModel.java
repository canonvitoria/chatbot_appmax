package br.com.appmax.rastreio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pedidos")

public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPedido;

    private String telefone;
    private String statusPedido;


    public void Pedido() {
    }

    public void Pedido(long idPedido, String telefone, String statusPedido) {
        this.idPedido = idPedido;
        this.telefone = telefone;
        this.statusPedido = statusPedido;
    }

    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }
}