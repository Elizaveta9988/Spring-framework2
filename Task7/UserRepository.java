package Task7;

/**
 * Репозиторий для сущности user.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(@Param("email") String email);


}
