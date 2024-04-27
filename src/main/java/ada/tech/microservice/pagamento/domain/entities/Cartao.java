package ada.tech.microservice.pagamento.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "cartao")
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartaoId;

    @Column(unique = true)
    @NotBlank(message = "Esse campo é obrigatório!")
    @Size(min = 16, max = 16, message = "Esse campo deve conter 16 dígitos!")
    private Integer numeroCartao;

    @Column
    @NotBlank(message = "Esse campo é obrigatório")
    @Size(min = 10, message = "Esse campo deve conter no mínimo 10 caracteres")
    private String titularCartao;

    @Column
    @NotBlank(message = "Esse campo é obrigatório")
    @Size(min = 3, max = 3, message = "Esse campo deve ter 3 dígitos!")
    private Integer cvv;

    @Column
    @NotBlank(message = "Esse campo é obrigatório")
    @Temporal(TemporalType.DATE)
    private Date validadeCartao;

    public Cartao(Integer numeroCartao, String titularCartao, Integer cvv, Date validadeCartao) {
        this.numeroCartao = numeroCartao;
        this.titularCartao = titularCartao;
        this.cvv = cvv;
        this.validadeCartao = validadeCartao;
    }

    public void setValidadeCartao(String validadeCartao) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            this.validadeCartao = sdf.parse(validadeCartao);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
