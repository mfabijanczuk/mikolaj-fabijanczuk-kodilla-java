package com.kodilla.kodillahibernate.manytomany.dao;

import com.kodilla.kodillahibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query(nativeQuery = true)
    List<Company> retrieve3LettersOfCompanyName(@Param("COMPANY_NAME") String name);

    @Query
    List<Company> retrieveCompanyByLastname(@Param("FragmentOfName") String fragmentOfName);

}
