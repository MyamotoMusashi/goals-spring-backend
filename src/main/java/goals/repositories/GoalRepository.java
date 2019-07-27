package goals.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import goals.models.Goal;

@CrossOrigin(origins = "http://localhost:4200")
@Repository
public interface GoalRepository extends JpaRepository<Goal, Integer>{
	
	public List<Goal> findGoalsByParentidIsNull();
	
	public List<Goal> findGoalsByParentid(int parentid);
	
	public List<Goal> findGoalsByPhase(String phase);
	
	public List<Goal> findGoalsByPhaseIsNotNullAndParentidIsNull();
	
	public List<Goal> findGoalsByPhaseIsNotNullAndPhaseNotLike(String phase);
	
	public List<Goal> findGoalsByIsDailyIsTrue();
	
	public Goal findGoalByPriority(int priority);
	
	
}
