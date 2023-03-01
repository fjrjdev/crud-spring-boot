package com.attornatus.testetecnico.addresses.repositories;

import com.attornatus.testetecnico.addresses.repositories.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  AddressRepository extends JpaRepository<Address, String> {
}
