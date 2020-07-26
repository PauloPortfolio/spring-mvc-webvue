package ca.webvue.repository;


import ca.webvue.entity.VueUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueRepo extends JpaRepository<VueUser, Integer>{
    

}
