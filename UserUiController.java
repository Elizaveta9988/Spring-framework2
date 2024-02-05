public class UserUiController {
    @Controller
@RequestMapping("/api/v1/ui/users")
public class UserUiController {
    private final UserService userService;

    @Autowired
    public UserUiController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAll());
        return "users/allUsers";
    }

    @RequestMapping(path = "save", method = RequestMethod.GET)
    public String saveUser(Model model) {
        model.addAttribute("user", new User());
        return "users/saveUser";
    }

    @RequestMapping(path = "save", method = RequestMethod.POST)
    public String saveUser(@Valid User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("users", userService.getAll());
            return "users/saveUser";
        }
        userService.createUser(user.getName(), user.getAge(), user.getEmail());
        model.addAttribute("users", userService.getAll());
        return "users/allUsers";
    }

    @RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)
    public String deleteUserById(@PathVariable Long id, Model model) {
        userService.deleteUser(id);
        model.addAttribute("users", userService.getAll());
        return "users/allUsers";
    }
}
