package com.codeit.practice3.run;

import com.codeit.practice3.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setEmpNo(100);
        employee.setEmpName("홍길동");
        employee.setDept("영업부");
        employee.setJop("과장");
        employee.setAge(25);
        employee.setGender('남');
        employee.setSalary(2500000);
        employee.setBonusPoint(0.05);
        employee.setPhone("010-1234-5678");
        employee.setAddress("서울시 강남구");

        System.out.println(employee.getEmpNo()+" "+employee.getEmpName()+" "+employee.getDept()+" "+ employee.getJop() +" "+ employee.getAge()+" "+
                employee.getGender()+ " "+ employee.getSalary()+" " +employee.getBonusPoint()+" "+employee.getPhone()+" "+employee.getAddress());
    }
}
