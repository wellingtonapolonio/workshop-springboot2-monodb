package com.wellington.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellington.workshopmongo.domain.Post;
import com.wellington.workshopmongo.repository.PostRepository;
import com.wellington.workshopmongo.services.exeption.ObjectNotFoundException;


@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
