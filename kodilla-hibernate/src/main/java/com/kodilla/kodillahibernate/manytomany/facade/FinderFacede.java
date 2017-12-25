package com.kodilla.kodillahibernate.manytomany.facade;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.Employee;
import com.kodilla.kodillahibernate.manytomany.dao.CompanyDao;
import com.kodilla.kodillahibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinderFacede {
    private static final Logger LOGGER = LoggerFactory.getLogger(FinderFacede.class);

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    public List<Employee> findEmploeeByLastname(final String fragmentOfLastname) throws FinderProcessingExeption {
        boolean wasError = false;
        List<Employee> foundEmployees;
        String fragmentToFind = "%" + fragmentOfLastname + "%";
        try {
            LOGGER.info("Finding employee by fragment: " + fragmentOfLastname);
            foundEmployees = employeeDao.retrieveEmployeeByLastname(fragmentToFind);
            if(foundEmployees.size() == 0) {
                wasError = true;
                LOGGER.error(FinderProcessingExeption.ERR_EMPLOYEE_NOT_FOUND);
                throw  new FinderProcessingExeption(FinderProcessingExeption.ERR_EMPLOYEE_NOT_FOUND);
            }else {
                foundEmployees.forEach(employee -> LOGGER.info("Employee: " + employee));
                return foundEmployees;
            }
        } finally {
            if (wasError) {
                LOGGER.error(FinderProcessingExeption.ERR_SEARCH_FINISHED);
            }else {
                LOGGER.info(FinderProcessingExeption.ERR_SEARCH_FINISHED);
            }
        }
    }

    public List<Company> findCompanyByName(final String fragmentOfName) throws FinderProcessingExeption {
        boolean wasError = false;
        List<Company> foundCompany;
        String fragmentToFind = "%" + fragmentOfName + "%";
        try {
            LOGGER.info("Finding employee by fragment: " + fragmentOfName);
            foundCompany = companyDao.retrieveCompanyByLastname(fragmentToFind);
            if(foundCompany.size() == 0) {
                wasError = true;
                LOGGER.error(FinderProcessingExeption.ERR_COMPANY_NOT_FOUND);
                throw new FinderProcessingExeption(FinderProcessingExeption.ERR_COMPANY_NOT_FOUND);
            }else {
                foundCompany.forEach(company -> LOGGER.info("Company: " + company));
                return foundCompany;
            }
        } finally {
            if (wasError) {
                LOGGER.error(FinderProcessingExeption.ERR_SEARCH_FINISHED);
            }else {
                LOGGER.info(FinderProcessingExeption.ERR_SEARCH_FINISHED);
            }
        }
    }
}
