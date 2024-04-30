package ada.tech.microservice.pagamento.payloads.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.UUID;

@Data
@Schema
public class PagamentoRequest {

    @Schema(example = "550e8400-e29b-41d4-a716-446655440000")
    private UUID id_cliente;

    @Schema(example = "")
    private UUID id_compra;

    @JsonProperty("numero-cartao")
    @Schema(example = "123456xxx")
    private String numero_cartao;

    @JsonProperty("nome-cartao")
    @Schema(example = "Maria da Silva")
    private String titular;

    @JsonProperty("validade")
    @Schema(example = "00/00/0000")
    private String validade;

    @Schema(example = "000")
    private String cvv;
}
