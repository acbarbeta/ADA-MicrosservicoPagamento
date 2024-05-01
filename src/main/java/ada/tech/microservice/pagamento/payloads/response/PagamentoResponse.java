package ada.tech.microservice.pagamento.payloads.response;

import ada.tech.microservice.pagamento.enums.StatusPagamento;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import ada.tech.microservice.pagamento.enums.StatusPagamento;

import java.util.UUID;

@Data
@Schema
public class PagamentoResponse {
    @Schema(example = "550e8400-e29b-41d4-a716-446655440000")
    private UUID id_compra;
    private StatusPagamento statusPagamento;
}
