package ada.tech.microservice.pagamento.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
    public <T> NotFoundException(String idPagamento, Class<T> pagamentoClass) {

        super(String.format("Não foi possível encontrar o %s para o identificador informado %s",
                pagamentoClass.getSimpleName(), idPagamento));
    }
}