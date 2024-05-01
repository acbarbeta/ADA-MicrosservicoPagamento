package ada.tech.microservice.pagamento.services;

import ada.tech.microservice.pagamento.domain.entities.Pagamento;
import ada.tech.microservice.pagamento.enums.StatusPagamento;
import ada.tech.microservice.pagamento.repository.PagamentoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class CancelarPagamentoService {
    private final PagamentoRepository pagamentoRepository;

    @Async
    public void cancelarPagamento(String pagamentoId){
        Pagamento pagamento = pagamentoRepository.findPagamentoById(pagamentoId);

        pagamento.setStatusPagamento(StatusPagamento.CANCELADO);
        pagamentoRepository.save(pagamento);
    }
}
