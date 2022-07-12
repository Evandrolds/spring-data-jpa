package estudando_JPA.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Evandro
 */
@Entity
public class UserMensage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_User")
    private Integer id;
    @Column(length = 60, nullable = false)
    private String name;
    @Column(length = 60, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private Long password;

    public UserMensage() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "\n Id:" + id
                + "\n Name: " + name
                + "\n User name: " + username
                + "\n Password: " + password + '}';

    }

}
