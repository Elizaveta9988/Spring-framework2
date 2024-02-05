public interface ExecutorService {

    List<Executor> getAllExecutors();

    Executor getExecutorById(Long id);

    Executor createExecutor(Executor executor);

    Executor updateExecutor(Long id, Executor executor);

    void deleteExecutor(Long id);

    List<Executor> getExecutorsByAge(int age);

    List<Executor> getExecutorsByName(String name);
}