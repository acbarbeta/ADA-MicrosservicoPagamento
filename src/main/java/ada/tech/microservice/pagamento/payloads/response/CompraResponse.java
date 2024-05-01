package ada.tech.microservice.pagamento.payloads.response;

import ada.tech.microservice.pagamento.enums.StatusPagamento;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

public class CompraResponse{

    @Schema(example = "550e8400-e29b-41d4-a716-446655440000")
    private UUID id_compra;

    @Schema(example = "550e8400-e29b-41d4-a716-446655440000")
    private UUID id_pagamento;

    @Schema(example = "A compra foi processada com sucesso")
    private StatusPagamento statusPagamento;
}
