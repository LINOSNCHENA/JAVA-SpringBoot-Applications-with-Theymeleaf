package com.monze.praha.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.monze.praha.model.Customa;

@Repository
public interface CustomaRepository extends CrudRepository<Customa, Long> {
	@Query("SELECT X FROM Customa X WHERE CONCAT(X.firstName, ' ', X.lastName, ' ', X.email) LIKE %?1%")
	public List<Customa> findCustoma(String keyword);
	// User findByEmailAddress(String emailAddress);
	// public List<Customa> search(String lastName);
}
