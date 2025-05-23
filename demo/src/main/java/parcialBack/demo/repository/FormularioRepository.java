package main.java.parcialBack.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import main.java.parcialBack.demo.model.Formulario;

public interface FormularioRepository extends MongoRepository<Formulario, String>{
}
