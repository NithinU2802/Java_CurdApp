package io.aiven.spring.mysql.CurdApp;


import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

}
