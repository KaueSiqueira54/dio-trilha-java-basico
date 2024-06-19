package me.dio.santander_bootcamp_dev_week.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import me.dio.santander_bootcamp_dev_week.dominio.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
