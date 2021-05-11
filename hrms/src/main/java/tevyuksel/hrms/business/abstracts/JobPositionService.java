package tevyuksel.hrms.business.abstracts;

import java.util.List;

import tevyuksel.hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	List<JobPosition> getAll();
}
