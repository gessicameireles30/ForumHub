package api.ForumHub.repository;

import api.ForumHub.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicoRepository extends JpaRepository<Topico, Long> {
}