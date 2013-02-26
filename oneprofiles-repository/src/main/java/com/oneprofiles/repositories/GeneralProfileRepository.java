package com.oneprofiles.repositories;

import com.oneprofiles.domain.GeneralProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

public interface GeneralProfileRepository  extends JpaRepository<GeneralProfile, Long> {

    GeneralProfile findByUserName(String userName);

}