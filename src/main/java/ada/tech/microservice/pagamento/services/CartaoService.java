package ada.tech.microservice.pagamento.services;

import ada.tech.microservice.pagamento.domain.entities.Cartao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class CartaoService {

    private List<Cartao> lista_cartao = new ArrayList<>();

    public Cartao cadastrarCartao(Cartao cartao) {
        lista_cartao.add(cartao);
        return cartao;
    }

    public void deletarCartao(UUID id_cartao) {
        lista_cartao.removeIf(cartao -> cartao.getId().equals(id_cartao));
    }
}
