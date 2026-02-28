package com.franmoyano.FintechProject.entity;

import com.franmoyano.FintechProject.entity.enums.State;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name="accounts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private State state;

    //relacion usuario
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}
