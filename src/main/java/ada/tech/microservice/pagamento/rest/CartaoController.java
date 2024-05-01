package ada.tech.microservice.pagamento.rest;

import ada.tech.microservice.pagamento.domain.entities.Cartao;
import ada.tech.microservice.pagamento.services.CartaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/cartao")
@RequiredArgsConstructor
public class CartaoController {

    @Autowired
    private CartaoService cartaoService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Cartao> cadastrarCartao(@RequestBody Cartao cartao) {
        Cartao novoCartao = cartaoService.cadastrarCartao(cartao);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCartao);
    }

    @DeleteMapping("/{id_cartao}")
    public ResponseEntity<Void> deletarCartao(@PathVariable UUID id) {
        cartaoService.deletarCartao(id);
        return ResponseEntity.noContent().build();
    }
}
