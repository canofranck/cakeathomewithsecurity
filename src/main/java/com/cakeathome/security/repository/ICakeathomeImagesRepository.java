package com.cakeathome.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.security.exception.domain.CakeathomeImages;

public interface ICakeathomeImagesRepository extends JpaRepository<CakeathomeImages,Long>{

}
