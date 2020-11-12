package com.herokuYuklemeyeCalisiriq;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface adlarRepo extends JpaRepository<adlar, Long> {
        Optional<adlar> findById(Long id);
}
