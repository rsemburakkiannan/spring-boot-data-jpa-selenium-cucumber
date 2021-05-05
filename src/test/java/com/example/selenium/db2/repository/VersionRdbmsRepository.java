package com.example.selenium.db2.repository;

import com.example.selenium.db2.model.ApiVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VersionRdbmsRepository extends JpaRepository<ApiVersion, Long> {

}
