package pkg1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pkg1.entity.student;

public interface StudentRepo extends JpaRepository<student, Integer> {
}