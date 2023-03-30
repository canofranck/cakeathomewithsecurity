package com.cakeathome.security.service.impl;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeathome.security.exception.domain.CakeathomeImages;
import com.cakeathome.security.repository.ICakeathomeImagesRepository;




@Service
public class CakeathomeImagesImpl {

	@Autowired
	private ICakeathomeImagesRepository iCakeathomeRepository;
	

	// Create Image (Create)
	public CakeathomeImages createImage(CakeathomeImages img) {
		return iCakeathomeRepository.save(img);
	}

	// Read Image by Id
	public CakeathomeImages getImageById(Long id) {
		return iCakeathomeRepository.findById(id).get();
	}
	
	//List Images
	public List<CakeathomeImages> getAllImages() {
		return iCakeathomeRepository.findAll();
	}
	
	// Update Image
	public CakeathomeImages updateImage(@Valid CakeathomeImages img) {	
		return iCakeathomeRepository.saveAndFlush(img);		
	}
	
	// Delete Images
	public void deleteImage(CakeathomeImages img) {
		iCakeathomeRepository.delete(img);
	}
}
