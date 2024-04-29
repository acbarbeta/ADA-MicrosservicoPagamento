package ada.tech.microservice.pagamento.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "pagamento")
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Pagamento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra", nullable = false, unique = true)
    private UUID id_compra;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", nullable = false, unique = true)
    private UUID id_cliente;

    @Column(name = "numero_cartao", nullable = false, unique = true)
    @NotBlank(message = "Esse campo é obrigatório!")
    @Size(min = 16, max = 16, message = "Esse campo deve conter 16 dígitos!")
    private String numero_cartao;

    @Column(name = "titular", nullable = false)
    @NotBlank(message = "Esse campo é obrigatório")
    @Size(min = 10, message = "Esse campo deve conter no mínimo 10 caracteres")
    private String titular;

    @Column(name = "cvv", nullable = false)
    @NotBlank(message = "Esse campo é obrigatório")
    @Size(min = 3, max = 3, message = "Esse campo deve conter 3 caracteres")
    private String cvv;

    @Column(name = "status", nullable = false)
    @NotBlank(message = "Esse campo é obrigatório")
    private String status;

    @Column(name = "envio", nullable = false)
    @NotBlank(message = "Esse campo é obrigatório")
    @OneToOne
    private Envio envio;
}
