package ada.tech.microservice.pagamento.payloads.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import tech.ada.tenthirty.ecommerce.model.StatusCompra;

import java.util.UUID;

@Data
@Schema
public class PagamentoResponse {
    @Schema(example = "550e8400-e29b-41d4-a716-446655440000")
    private UUID id_compra;
    private StatusCompra statusCompra;
}
