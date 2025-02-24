package mission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;

public interface missionRepository extends JpaRepository<MissionModel, Long> {
}
