/**
 * 
 */
package com.nagarro.nagp.microservice.user.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nagarro.nagp.microservice.user.dao.UserEntity;

/**
 * @author digvijayadhikari
 *
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

	@Query(value = "SELECT u FROM UserEntity u where u.id = :id")
	UserEntity findById(@Param("id") String id);
	
}
