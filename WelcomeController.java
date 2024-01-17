@Controller
public class WelcomeController {
    @GetMapping("/")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname) {
        System.out.println("Hello, " + name + " " + surname);
        return "hello";
    }
}