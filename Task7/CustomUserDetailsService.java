package Task7;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    private User userDetails;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("LoadUserByUsername {}", username);
        userDetails = userRepository.findByEmail(username);

        if (!Objects.isNull(userDetails)) {
            return new org.springframework.security.core.userdetails.User(userDetails.getEmail(), userDetails.getPassword(), List.of(
                    new SimpleGrantedAuthority(userDetails.getRole())));
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }

    public User getUserDetails() {
        return userDetails;
    }
}