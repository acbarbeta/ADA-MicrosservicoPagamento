package ada.tech.microservice.pagamento.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "cartao")
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Cartao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cartao", nullable = false, unique = true)
    private UUID id_cartao;

    @Column(name = "numero_cartao", nullable = false, unique = true)
    @NotBlank(message = "Esse campo é obrigatório!")
    @Size(min = 16, max = 16, message = "Esse campo deve conter 16 dígitos!")
    private String numero_cartao;

    @Column
    @NotBlank(message = "Esse campo é obrigatório")
    @Size(min = 10, message = "Esse campo deve conter no mínimo 10 caracteres")
    private String titular;

    @Column(name = "cvv", nullable = false)
    @NotBlank(message = "Esse campo é obrigatório")
    @Size(min = 3, max = 3, message = "Esse campo deve ter 3 dígitos!")
    private String cvv;

    @Column(name = "validade_cartao", nullable = false)
    @NotBlank(message = "Esse campo é obrigatório")
    @Temporal(TemporalType.DATE)
    private Date validadeCartao;


    public void setValidadeCartao(String validadeCartao) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            this.validadeCartao = sdf.parse(validadeCartao);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
