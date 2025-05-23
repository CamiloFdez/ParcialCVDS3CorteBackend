package main.java.parcialBack.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import main.java.parcialBack.demo.model.Doctor;

public interface DoctorRepository extends MongoRepository<Doctor, String>{
}

