package br.com.mcm.virtualStore.access.repository;

import br.com.mcm.virtualStore.access.entity.Access;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessRepository extends JpaRepository<Access,Long> {
}
