package Task6;

@Data
@Entity
@Table(name = "executors")
public class Executor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 150, message = "Имя от 2 до 150 символов")
    @Column(name = "name", nullable = false)
    private String name;

    @Min(value = 18, message = "Минимальный возраст 18 лет")
    @Max(value = 90, message = "Максимальный возраст 90 лет")
    @Column(name = "age", nullable = false)
    private int age;
}