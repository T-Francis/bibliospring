package fr.aliart.bibliospring.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.aliart.bibliospring.model.Borrow;

public interface BorrowRepository extends JpaRepository<Borrow, Integer> {

}