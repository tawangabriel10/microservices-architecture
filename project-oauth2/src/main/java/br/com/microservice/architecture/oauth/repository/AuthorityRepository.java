package br.com.microservice.architecture.oauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.microservice.architecture.oauth.model.Authority;


public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
}
