package com.cakeathome.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.domain.Gallerie;



public interface IGallerieRepository extends JpaRepository<Gallerie, Long>{
	Gallerie findByGalleriefilename(String gallerie_filename);
}