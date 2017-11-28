package fr.aliart.bibliospring.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.aliart.bibliospring.model.Copy;

@Repository
public interface CopyRepository  extends JpaRepository<Copy, Integer> {

}