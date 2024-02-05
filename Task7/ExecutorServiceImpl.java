package Task7;

/**
 * Сервис работы с задачами
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ExecutorServiceImpl implements ExecutorService {

    private final ExecutorRepository executorRepository;

    @Override
    public List<Executor> getAllExecutors() {
        log.info("Get all executors command");
        return executorRepository.findAll();
    }

    @Override
    public Executor getExecutorById(Long id) {
        log.info("Get executor by id " + id + " command");
        return executorRepository.findById(id).orElseThrow(() -> new ExecutorNotFoundException("Executor: " + id + " not found!"));
    }

    @Override
    public Executor createExecutor(Executor executor) {
        log.info("Create executor command");
        return executorRepository.save(executor);
    }

    @Override
    public Executor updateExecutor(Long id, Executor executor) {
        log.info("Update executor with id " + id + " command");
        if (executorRepository.findById(id).isPresent()) {
            Executor updatedExecutor = executorRepository.findById(id).get();
            updatedExecutor.setName(executor.getName());
            updatedExecutor.setAge(executor.getAge());
            executorRepository.save(updatedExecutor);
            return updatedExecutor;
        }

        throw new ExecutorNotFoundException("Executor with id " + id + " is not found.");
    }

    @Override
    public void deleteExecutor(Long id) {
        log.info("Delete executor with id " + id + " command");
        if (executorRepository.findById(id).isPresent()) {
            executorRepository.deleteById(id);
            log.info("Delete executor with id " + id + " success");
            return;
        }
        throw new ExecutorNotFoundException("Executor with id " + id + " is not found.");
    }

    @Override
    public List<Executor> getExecutorsByAge(int age) {
        log.info("Get executors by age " + age + " command");
        return executorRepository.findByAge(age);
    }

    @Override
    public List<Executor> getExecutorsByName(String name) {
        log.info("Get executors by name " + name + " command");
        return executorRepository.findByName(name);
    }
}