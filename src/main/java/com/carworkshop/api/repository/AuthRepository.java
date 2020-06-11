package com.carworkshop.api.repository;

import com.carworkshop.api.model.Autenticacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Autenticacao, Long> {
}
