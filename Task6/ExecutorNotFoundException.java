package Task6;

/**
 * Исключение при отсутствии исполнителя.
 */
public class ExecutorNotFoundException extends RuntimeException {
    /**
     * Конструктор родительского класса.
     *
     * @param message сообщение об ошибке
     */
    public ExecutorNotFoundException(String message) {
        super(message);
    }
}