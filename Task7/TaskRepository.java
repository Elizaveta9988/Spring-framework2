package Task7;


/**
 * Репозиторий для сущности task.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    /**
     * Получить список задач по статусу
     *
     * @param status статус задачи
     * @return список задач
     */
    public List<Task> findByStatus(Status status);
}