package ada.tech.microservice.pagamento.domain.entities;

import ada.tech.microservice.pagamento.enums.StatusPagamento;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@Table(name = "pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private UUID id_cliente;

    private UUID id_compra;

    private UUID id_cartao;

    private StatusPagamento statusPagamento;
}
