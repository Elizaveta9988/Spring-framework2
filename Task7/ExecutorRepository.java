package Task7;

/**
 * Репозиторий для сущности executor.
 */
@Repository
public interface ExecutorRepository extends JpaRepository<Executor, Long> {

    /**
     * Получить список задач по статусу
     *
     * @param name имя исполнителя
     * @return список исполнителей
     */
    public List<Executor> findByName(String name);

    /**
     * Получить список исполнителей по возрасту
     *
     * @param age возраст исполнителя
     * @return список исполнителей
     */
    public List<Executor> findByAge(int age);
}