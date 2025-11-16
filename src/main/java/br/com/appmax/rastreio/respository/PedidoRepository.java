package br.com.appmax.rastreio.respository;

import br.com.appmax.rastreio.model.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoModel, Long> {

}