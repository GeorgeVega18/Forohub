package com.ejericio_tecnico.ForoHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejericio_tecnico.ForoHub.Entity.Respuesta;

@Repository
public interface IRespuestaRepository extends JpaRepository<Respuesta, Long>{

}
