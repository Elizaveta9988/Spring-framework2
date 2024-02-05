package task1;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DataProcessingService {
     private  final NotificationService notificationService;

    public DataProcessingService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public String getGreeting() {
        return "!!Hello, world!";
    }

    public List<User> sortUsersByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
    }

    public List<User> filterUsersByAge(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    public double calculateAverageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
    }

    public List<User> regUser(String name, int age, String email, List<User> users) {
        User user =new User(name, age, email);
        users.add(user);
        notificationService.notifyUserReg(user);
        return users;
    }

}

