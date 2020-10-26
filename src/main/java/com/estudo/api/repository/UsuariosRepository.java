package com.estudo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.estudo.api.models.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios,Long> {
	
}
