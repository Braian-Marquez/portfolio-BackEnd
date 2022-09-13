package argentinaprograma.BackEnd.repository;

import argentinaprograma.BackEnd.domain.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends JpaRepository<Info,Long> {
}
