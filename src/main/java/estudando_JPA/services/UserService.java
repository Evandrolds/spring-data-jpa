package estudando_JPA.services;
import estudando_JPA.repositories.UserRepository;
import estudando_JPA.model.UserMensage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Evandro
 */
@Component
public class UserService implements CommandLineRunner {

    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        UserMensage u = new UserMensage();
        u.setId(null);
        u.setName("Sandro");
        u.setUsername("sandroLima");
        u.setPassword(12345678L);
        repository.save(u);
    
    }
}
  

