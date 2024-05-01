package ada.tech.microservice.pagamento.services;

import ada.tech.microservice.pagamento.domain.entities.Pagamento;
import ada.tech.microservice.pagamento.payloads.request.PagamentoRequest;
import ada.tech.microservice.pagamento.payloads.response.PagamentoResponse;
import ada.tech.microservice.pagamento.repository.PagamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RealizarPagamentoService {
    private final PagamentoRepository pagamentoRepository;
    
    public PagamentoResponse realizarPagamento (PagamentoRequest pagamentoRequest){
        Pagamento pagamento = new Pagamento();
        pagamento.setId(UUID.randomUUID());
        pagamento.setId_cartao(UUID.randomUUID());
        pagamento.setId_cliente(UUID.randomUUID());
        pagamento.setId_compra(UUID.randomUUID());
        pagamentoRepository.save(pagamento);
        PagamentoResponse pagamentoResponse = new PagamentoResponse();
        
        return pagamentoResponse;
    }
}
