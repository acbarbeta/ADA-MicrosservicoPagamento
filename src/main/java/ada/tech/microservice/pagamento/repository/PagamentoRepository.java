package ada.tech.microservice.pagamento.repository;

import ada.tech.microservice.pagamento.domain.entities.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, String> {
    Pagamento findPagamentoById(String UUID);
}
