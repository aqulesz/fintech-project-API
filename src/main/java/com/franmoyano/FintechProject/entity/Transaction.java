package com.franmoyano.FintechProject.entity;

import com.franmoyano.FintechProject.entity.enums.TransactionState;
import com.franmoyano.FintechProject.entity.enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="transactions")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private TransactionType type;
    @Enumerated(EnumType.STRING)
    private TransactionState state;
    @CreationTimestamp
    private LocalDateTime date;

    //referencia a las accounts
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="origin_account_id")
    private Account originAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="destination_account_id")
    private Account destinationAccount;
}
