package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Override
	public Propietario buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.buscarPorId(id);
	}

	@Override
	public void guardar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.insertar(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.actualizar(propietario);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminar(id);
	}

	@Override
	public List<Propietario> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.buscarTodos();
	}

}
