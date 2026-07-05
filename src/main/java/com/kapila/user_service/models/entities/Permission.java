package com.kapila.user_service.models.entities;

import com.kapila.user_service.constants.PermissionStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "permissions")
@Data
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String permissionName;

    @Enumerated(EnumType.STRING)
    private PermissionStatus status;

    private String permissionDescription;

    @ManyToMany(mappedBy = "permissions")
    private Set<Role> roles = new HashSet<>();
}
