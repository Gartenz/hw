package ru.example.hr.hr1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CompanyRepository extends JpaRepository<Company, UUID> {
  @Query("SELECT c FROM Company c WHERE c.id <> :id")
  List<Company> getOtherCompanies(UUID id);
}
