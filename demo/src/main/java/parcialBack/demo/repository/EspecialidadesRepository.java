package main.java.parcialBack.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import main.java.parcialBack.demo.model.Especialidades;

public interface EspecialidadesRepository extends MongoRepository<Especialidades, String>{
}
