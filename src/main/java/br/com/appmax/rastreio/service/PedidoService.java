package br.com.appmax.rastreio.service;

import br.com.appmax.rastreio.model.PedidoModel;
import br.com.appmax.rastreio.respository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    // private final Map<Long, Pedido> pedidos = new HashMap<>();
    // private Long nextIdPedido = 1L;

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public PedidoModel registrarPedido(PedidoModel pedido) {
        // pedido.setIdPedido(nextIdPedido++);
        // pedidos.put(pedido.getIdPedido(), pedido);

        return pedidoRepository.save(pedido);
    }

    public List<PedidoModel> listarPedidos() {
        // return new ArrayList<>(pedidos.values());
        return pedidoRepository.findAll();
    }
}