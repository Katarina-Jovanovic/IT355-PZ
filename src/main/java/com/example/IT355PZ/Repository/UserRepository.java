package com.example.IT355PZ.Repository;

import com.example.prodavnicaPoklona.Entiteti.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
