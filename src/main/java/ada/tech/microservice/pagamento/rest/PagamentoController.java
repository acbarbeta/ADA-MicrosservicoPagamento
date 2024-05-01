package ada.tech.microservice.pagamento.rest;

import ada.tech.microservice.pagamento.domain.entities.Pagamento;
import ada.tech.microservice.pagamento.payloads.response.PagamentoResponse;
import ada.tech.microservice.pagamento.services.CancelarPagamentoService;
import ada.tech.microservice.pagamento.services.ConsultarPagamentoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(name = "/pagamento")
@RequiredArgsConstructor

public class PagamentoController {
    private final ConsultarPagamentoService consultarPagamentoService;
    private final CancelarPagamentoService cancelarPagamentoService;

    @Operation(summary = "Consultar o pagamento")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Pagamento localizado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Pagamento não encontrado"),
    })
    @GetMapping(value = "/{pagamento_id}")
    @ResponseStatus(HttpStatus.OK)
    public Pagamento consultarPagamento(@PathVariable String pagamento_id) {

        return consultarPagamentoService.consultarPagamento(pagamento_id);
    }

    @Operation(summary = "Cancelar o pagamento")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Pagamento cancelado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro ao cancelar pagamento"),
    })
    @PatchMapping(value = "/{pagamento_id}")
    @ResponseStatus(HttpStatus.OK)
    public void cancelarPagamento(@PathVariable String pagamento_id) {
        Pagamento pagamento = consultarPagamentoService.consultarPagamento(pagamento_id);
        UUID pagamentoId = pagamento.getId();

        cancelarPagamentoService.cancelarPagamento(pagamentoId.toString());
    }
}


