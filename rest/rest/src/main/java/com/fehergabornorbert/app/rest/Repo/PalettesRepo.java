package com.fehergabornorbert.app.rest.Repo;

import com.fehergabornorbert.app.rest.Models.Palettes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PalettesRepo extends JpaRepository<Palettes,Long> {
}
