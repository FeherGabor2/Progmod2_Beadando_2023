package com.fehergabornorbert.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fehergabornorbert.app.rest.Models.Worker;

public interface WorkerRepo extends JpaRepository<Worker,Long> {
}


