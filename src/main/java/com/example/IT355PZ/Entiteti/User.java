package com.example.IT355PZ.Entiteti;

import com.example.prodavnicaPoklona.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String name;
    private String email;
    private UserRole userRole;
    private byte[] img;


}
