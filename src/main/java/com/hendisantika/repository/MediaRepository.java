package com.hendisantika.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hendisantika.entity.Media;

@Repository
public interface MediaRepository extends JpaRepository<Media, Long> {

}
