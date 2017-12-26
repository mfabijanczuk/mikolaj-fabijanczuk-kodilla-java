package com.kodilla.kodillahibernate.manytomany.dao.facade;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.Employee;
import com.kodilla.kodillahibernate.manytomany.dao.CompanyDao;
import com.kodilla.kodillahibernate.manytomany.dao.EmployeeDao;
import com.kodilla.kodillahibernate.manytomany.facade.FinderFacede;
import com.kodilla.kodillahibernate.manytomany.facade.FinderProcessingExeption;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FinderFacadeTestSuite {

    @Autowired
    private FinderFacede finderFacede;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

        @Test
        public void testFindEmploeeByLastname() throws FinderProcessingExeption {
            //Given
            Employee johnSmith = new Employee("John", "Smith");
            Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
            Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

            //When
            employeeDao.save(johnSmith);
            int johnSmithId = johnSmith.getId();
            employeeDao.save(stephanieClarckson);
            int stephanieClarcksonId = stephanieClarckson.getId();
            employeeDao.save(lindaKovalsky);
            int lindaKovalskyId = lindaKovalsky.getId();

            String fragmentOfLastname = "valsk";
            List<Employee> foundEmployees = finderFacede.findEmploeeByLastname(fragmentOfLastname);

            //Then
            Assert.assertEquals(1, foundEmployees.size());

            try {
                employeeDao.delete(johnSmithId);
                employeeDao.delete(stephanieClarcksonId);
                employeeDao.delete(lindaKovalskyId);
            } catch (Exception e) {
                //do nothing
            }
        }

        @Test
        public void testFindCompanyByName() throws FinderProcessingExeption {
            //Given
            Company softwareMachine = new Company("Software Machine");
            Company dataMaesters = new Company("Data Maesters");
            Company greyMatter = new Company("Grey Matter");

            companyDao.save(softwareMachine);
            int softwareMachineId = softwareMachine.getId();
            companyDao.save(dataMaesters);
            int dataMaestersId = dataMaesters.getId();
            companyDao.save(greyMatter);
            int greyMatterId = greyMatter.getId();

            //When
            String fragmentOfName = "at";
            List<Company> foundCompany = finderFacede.findCompanyByName(fragmentOfName);
            //Then
            Assert.assertEquals(2, foundCompany.size());
            try {
                companyDao.delete(softwareMachineId);
                companyDao.delete(dataMaestersId);
                companyDao.delete(greyMatterId);
            } catch (Exception e) {
                //do nothing
            }


        }
}

