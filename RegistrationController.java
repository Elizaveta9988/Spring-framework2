import java.util.List;

public class RegistrationController {
    /*
Контроллер регистрации пользователя
 */
@Controller
@RequestMapping("/reg")
public class RegistrationController {
    private final RegistrationService registrationService;

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @RequestMapping(
            method = RequestMethod.POST)
    public ResponseEntity<List<User>> regUser(@RequestParam String name, @RequestParam int age, @RequestParam String email, @RequestBody List<User> users) {
        User user = registrationService.creationUser(name, age, email);

        return new ResponseEntity<>(registrationService.registrationUser(user.getName(), user.getAge(), user.getEmail(), users), HttpStatus.CREATED);
    }
}
