package br.com.appmax.rastreio.service;

import br.com.appmax.rastreio.model.Pedido;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PedidoService {

    private final Map<Long, Pedido> pedidos = new HashMap<>();
    private Long nextIdPedido = 1L;

    public Pedido registrarPedido(Pedido pedido) {
        pedido.setIdPedido(nextIdPedido++);
        pedidos.put(pedido.getIdPedido(), pedido);
        return pedido;
    }

    public List<Pedido> listarPedidos() {
        return new ArrayList<>(pedidos.values());
    }
}
