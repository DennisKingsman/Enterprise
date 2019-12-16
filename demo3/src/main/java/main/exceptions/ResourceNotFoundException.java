package main.exceptions;

public class ResourceNotFoundException extends Exception {

    public ResourceNotFoundException(Object resoursId) {
        super(resoursId != null ? resoursId.toString() : null);
    }
}
