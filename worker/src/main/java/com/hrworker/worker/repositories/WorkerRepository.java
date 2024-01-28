package com.hrworker.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrworker.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}