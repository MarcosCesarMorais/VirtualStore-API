package br.com.mcm.virtualStore.exception;

import br.com.mcm.virtualStore.validation.Error;
import java.util.Collections;
import java.util.List;

public class NotFoundException extends DomainException{

    protected NotFoundException(final String aMessage, final List<Error> anErrors) {

        super(aMessage, anErrors);
    }

    public static NotFoundException with(
            final Long id
    ) {
        final var anError = "%s with ID %s was not found".formatted(
               id
        );
        return new NotFoundException(anError, Collections.emptyList());
    }

    public static NotFoundException with(final Error error) {
        return new NotFoundException(error.message(), List.of(error));
    }
}
