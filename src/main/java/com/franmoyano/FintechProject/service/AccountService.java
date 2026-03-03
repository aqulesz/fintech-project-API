package com.franmoyano.FintechProject.service;

import com.franmoyano.FintechProject.entity.Account;
import com.franmoyano.FintechProject.repository.AccountJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private final AccountJpaRepository accountJpaRepository;

    public AccountService(AccountJpaRepository accountJpaRepository) {
        this.accountJpaRepository = accountJpaRepository;
    }

    public List<Account> findAll() {
        return accountJpaRepository.findAll();
    }

    public Optional<Account> findById(Long id) {
        return accountJpaRepository.findById(id);
    }

    public Account save(Account account) {
        return accountJpaRepository.save(account);
    }

    public Account update(Account account) {
        return accountJpaRepository.save(account);
    }

    public void delete(Long id) {
        accountJpaRepository.deleteById(id);
    }
}
