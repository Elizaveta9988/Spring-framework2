package Task6;

public interface TaskService {
    List<Task> getAllTasks();

    Task getTaskById(Long id);

    Task createTask(Task task);

    Task updateTask(Long id, Task task);

    void deleteTask(Long id);

    Task updateStatus(Long id);

    List<Task> getTasksByStatus(String status);

    Task assignExecutor(Long taskId, Long id);
}