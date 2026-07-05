package com.kapila.user_service.models.entities;

import com.kapila.user_service.constants.AddressType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "addresses")
@Data
public class Address extends AuditDto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String state;

    private String country;

    private String zipCode;

    @Enumerated(EnumType.STRING)
    private AddressType addressType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
