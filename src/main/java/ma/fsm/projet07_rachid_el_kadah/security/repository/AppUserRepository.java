package ma.fsm.projet07_rachid_el_kadah.security.repository;

import ma.fsm.projet07_rachid_el_kadah.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);
}
