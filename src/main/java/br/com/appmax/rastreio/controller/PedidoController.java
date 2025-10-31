package br.com.appmax.rastreio.controller;

import br.com.appmax.rastreio.model.Pedido;
import br.com.appmax.rastreio.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity<Pedido> save(@RequestBody Pedido pedido) {
        Pedido novo = pedidoService.registrarPedido(pedido);
        return ResponseEntity.ok(novo);
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listarPedidos() {
        return ResponseEntity.ok(pedidoService.listarPedidos());
    }
}
