package fr.aliart.bibliospring.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.aliart.bibliospring.model.Subscriber;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Integer> {

}