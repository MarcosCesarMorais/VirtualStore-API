package br.com.mcm.virtualStore.exception;

import br.com.mcm.virtualStore.validation.handler.Notification;

public class NotificationException extends DomainException{

    public NotificationException(final String aMessage, final Notification notification) {
        super(aMessage, notification.getErrors());
    }
}
