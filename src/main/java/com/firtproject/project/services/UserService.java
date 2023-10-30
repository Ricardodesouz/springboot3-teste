package com.firtproject.project.services;

import java.util.List;
import java.util.Optional;

import com.firtproject.project.services.exceptions.DatabaseException;
import com.firtproject.project.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.firtproject.project.entities.User;
import com.firtproject.project.repositories.UserRepository;
@Service
public class UserService {
		@Autowired
		private UserRepository repository;
		public List<User> findAll(){
			return repository.findAll();
			
		}
		public User findById(Long id) {
			Optional<User> obj = repository.findById(id);
			return obj.orElseThrow(()-> new ResourceNotFoundException(id));
			
		}
		public User insert(User obj){
			return repository.save(obj);
		}

		public void delete(Long id){
			try {

				repository.deleteById(id);
			}catch(DataIntegrityViolationException e) {
				throw new DatabaseException(e.getMessage());
			}


		}
		public User upadateData(Long id, User obj){
			try {
				User entity = repository.getReferenceById(id);
				upadate(entity, obj);
				return repository.save(entity);
			}catch(EntityNotFoundException e) {
				throw new ResourceNotFoundException(id);
			}

        }

	private void upadate(User entity, User obj) {
			entity.setEmail(obj.getEmail());
			entity.setName(obj.getName());
			entity.setPhone(obj.getPhone());
	}

}



