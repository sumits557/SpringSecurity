package com.coforge.guestservices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sumit S.
 */
@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}
