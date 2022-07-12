package estudando_JPA.repositories;



import estudando_JPA.model.UserMensage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Evandro
 */
public interface UserRepository extends JpaRepository<UserMensage, Integer> {

}
