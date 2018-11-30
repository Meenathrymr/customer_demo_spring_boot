package net.thrymr.app.repository;

import net.thrymr.app.models.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface LoginRepository extends JpaRepository<AppUser,Long> {
}
