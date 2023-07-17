package com.csi.dao.test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeDaoImplTest {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    @MockBean
    EmployeeRepo employeeRepoImpl;

    @Test
    public void getAllDataTest(){

        when(employeeRepoImpl.findAll()).thenReturn(Stream.of(new Employee(121, "SWARA", "INDIA", 56000),
                new Employee(122, "RAM", "INDIA", 66000),
                new Employee(125, "SURAJ", "USA", 86000),
                new Employee(127, "LAKSHMI", "PUNE", 46000),
                new Employee(129, "VENKAT", "INDIA", 16000)).collect(Collectors.toList()));


        assertEquals(5, employeeDaoImpl.getAllData().size());

    }

    @Test
    public void saveDataTest(){

        Employee employee =  new Employee(125, "SURAJ", "USA", 86000);

        employeeDaoImpl.saveData(employee);

        verify(employeeRepoImpl, times(1)).save(employee);
    }

    @Test
    public void updateDataTest(){

        Employee employee =  new Employee(125, "SURAJ", "USA", 86000);

        employeeDaoImpl.updateData(employee);

        verify(employeeRepoImpl, times(1)).save(employee);
    }

    @Test
    public void deleteDataByIdTest(){

        Employee employee =  new Employee(125, "SURAJ", "USA", 86000);

        employeeDaoImpl.deleteDataById(employee.getEmpId());

        verify(employeeRepoImpl, times(1)).deleteById(employee.getEmpId());
    }
}
