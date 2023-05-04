package pl.coderslab.moviestowatchgpt.moviesToWatch;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesToWatchRepository extends JpaRepository<MoviesToWatch, Long> {
}
