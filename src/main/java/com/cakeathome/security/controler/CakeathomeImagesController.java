package com.cakeathome.security.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cakeathome.security.exception.domain.CakeathomeImages;
import com.cakeathome.security.service.impl.CakeathomeImagesImpl;

@RestController
@RequestMapping
@CrossOrigin("*")
public class CakeathomeImagesController {


	@Autowired
	CakeathomeImagesImpl cakeathomeImagesImpl;
	

	@PostMapping("/image")
	public CakeathomeImages createImage(@Validated @RequestBody(required = false) CakeathomeImages img) {
		return cakeathomeImagesImpl.createImage(img);

	}
	
	@GetMapping("/image/{id}")
	public ResponseEntity findImageById(@PathVariable(name = "id") Long id) {
		if (id == null) {
			return ResponseEntity.badRequest().body("Can't find Image with NULL ID from ImageController ");
		}
		// je rentre dans ma base de données en passant par images dao
		CakeathomeImages img = cakeathomeImagesImpl.getImageById(id);

		if (img == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(img);
	}
	
	@GetMapping("/image")
	public List<CakeathomeImages> getAllImages(@Validated @RequestBody(required = false) CakeathomeImages img) {
		return cakeathomeImagesImpl.getAllImages();

	}
	
	@PutMapping("/image/{id}")
	public ResponseEntity<CakeathomeImages> updateImage(@Validated @PathVariable(name = "id") Long id,
			@RequestBody(required = false) CakeathomeImages img) {

		if (img == null) {
			return ResponseEntity.notFound().build();
		}
		img.setId(id);
		cakeathomeImagesImpl.updateImage(img);

		return ResponseEntity.ok().body(img);
	}
	
	@DeleteMapping("/image/{id}")
	public ResponseEntity<CakeathomeImages> deleteImage(@Validated @PathVariable(name = "id") Long id) {
		// Je mets mon image dans une variable et je le recupere en fonction de son ID
		CakeathomeImages img = cakeathomeImagesImpl.getImageById(id);
		// Une fois que j ai l ID du image en passant par imageImpl si le image est
		// null

		if (img == null) {
			return ResponseEntity.notFound().build();

		}
		
		cakeathomeImagesImpl.deleteImage(img);

		return ResponseEntity.ok().body(img);
	}

}
