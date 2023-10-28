package com.firtproject.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
			return obj.get();
			
		}
		public User insert(User obj){
			return repository.save(obj);
		}

		public void delete(Long id){
			repository.deleteById(id);

		}
		public User upadateData(Long id, User obj){
			User entity = repository.getReferenceById(id);
			upadate(entity, obj);
			return repository.save(entity);
		}

	private void upadate(User entity, User obj) {
			entity.setEmail(obj.getEmail());
			entity.setName(obj.getName());
			entity.setPhone(obj.getPhone());
	}

}



