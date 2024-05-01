package ada.tech.microservice.pagamento.services;

import ada.tech.microservice.pagamento.domain.entities.Pagamento;
import ada.tech.microservice.pagamento.repository.PagamentoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ConsultarPagamentoService {
    private final PagamentoRepository pagamentoRepository;

    @Async
    public Optional<Pagamento> consultarPagamento(String id_pagamento){
        return pagamentoRepository.findPagamentoById(id_pagamento);
    }
}
