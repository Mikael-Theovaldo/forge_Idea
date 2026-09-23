package com.forgeidea.api.repository;

import com.forgeidea.api.model.Ideia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeiaRepository extends JpaRepository<Ideia, Long> {
}
