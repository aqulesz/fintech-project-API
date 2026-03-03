package com.franmoyano.FintechProject.service;

import com.franmoyano.FintechProject.entity.Transaction;
import com.franmoyano.FintechProject.repository.TransactionJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    private final TransactionJpaRepository transactionJpaRepository;

    public TransactionService(TransactionJpaRepository transactionJpaRepository) {
        this.transactionJpaRepository = transactionJpaRepository;
    }

    public List<Transaction> findAll() {
        return transactionJpaRepository.findAll();
    }

    public Optional<Transaction> findById(Long id) {
        return transactionJpaRepository.findById(id);
    }

    public Transaction save(Transaction transaction) {
        return transactionJpaRepository.save(transaction);
    }

    public Transaction update(Transaction transaction) {
        return transactionJpaRepository.save(transaction);
    }

    public void delete(Long id) {
        transactionJpaRepository.deleteById(id);
    }
}
