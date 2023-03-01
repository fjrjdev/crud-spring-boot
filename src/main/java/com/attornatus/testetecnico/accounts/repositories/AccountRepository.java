package com.attornatus.testetecnico.accounts.repositories;

import com.attornatus.testetecnico.accounts.repositories.entities.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
}