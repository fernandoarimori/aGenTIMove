package com.agentimove.aGenTIMove.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agentimove.aGenTIMove.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{
	public List<UsuarioModel> findAllByNomeContainingIgnoreCase(String nome);
	public Optional<UsuarioModel> findByEmail(String email);
}
