package Exceptions;

class CustomException extends Throwable {
    public CustomException(String x) {
        System.err.println(x);
    }
}
