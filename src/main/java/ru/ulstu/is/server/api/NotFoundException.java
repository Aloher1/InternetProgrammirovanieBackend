package ru.ulstu.is.server.api;

public class NotFoundException extends RuntimeException {
    NotFoundException(String entity, int id) {
        super(String.format("%s with id %s is not found", entity, id));
    }
}
