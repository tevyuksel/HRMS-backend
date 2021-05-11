package tevyuksel.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import tevyuksel.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}
