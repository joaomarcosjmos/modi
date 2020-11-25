package br.com.application.mvc.mudi.repository;

import java.util.List;

import br.com.application.mvc.mudi.model.Pedido;
import br.com.application.mvc.mudi.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	List<Pedido> findByStatus(StatusPedido aguardando);
	
}