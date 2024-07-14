package com.empmanager.TheEmployeeManager.service;

import com.empmanager.TheEmployeeManager.model.Department;
import com.empmanager.TheEmployeeManager.model.Employee;
import com.empmanager.TheEmployeeManager.model.UserType;
import com.empmanager.TheEmployeeManager.repository.DepartmentRepository;
import com.empmanager.TheEmployeeManager.repository.EmployeeRepository;
import com.empmanager.TheEmployeeManager.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;
import java.util.Random;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final Random RANDOM = new Random();
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private UserTypeRepository userTypeRepository;

    @Override
    public void createEmployee() {
        Employee employee =new Employee();

        employee.setAge(55);

        Optional<Department> department = departmentRepository.findById(2l);
        Department departmentModel = department.get();
        employee.setDepartment(departmentModel);

        employee.setName("Vinod Kumar Yadav");

        employee.setPhoneNumber(9582986958l);

        Optional<UserType> userType = userTypeRepository.findById(3l);
        UserType userTypeModel = userType.get();
        employee.setType(userTypeModel);

        employee.setUserid(generateRandomID());

        String password = encode("YADAV");
        employee.setPassword(password);

        employeeRepository.save(employee);
    }

    public String encode(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes());

            // Convert byte array to hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error encoding password", e);
        }
    }



    public int generateRandomID() {
        return 1000 + RANDOM.nextInt(9000);
    }
}
