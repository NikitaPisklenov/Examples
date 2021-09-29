package Mentoring.EmplooyeProject;

import java.time.LocalDate;

public class Employee {


        String name;
        double salary;
        int workHours = 40;//40
        int hireYear;

//        public Employee(){
//        }


        public Employee(String setName, double setSalary, int setWorkHours, int setHireYear){

             this.name=setName;
             this.salary =setSalary;
             this.workHours = setWorkHours;
             this.hireYear = setHireYear;
        }

        public Employee (){
        }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Vasya",100,40,1999);
        Employee emp2 = new Employee("Christina", 20,20,2018);
        emp2.printInfo();
        emp1.printInfo();
    }


        public double taxMethod () {

            if (salary>=1000) {
                return salary*0.03;
            }
            return 0.0;
        }

        public double bonusMethod () {
            int extraHours = workHours-40;
            if (extraHours>0) {
                return extraHours*30;
            }
           return 0.0;
        }

        public double RaiseSalaryMethod () { // 2021; // get from computer //

            LocalDate date = LocalDate.now();

            int yearsWorked = date.getYear()  - hireYear;
            double salaryRaise = salary*0.05;

            if(yearsWorked>9 && yearsWorked<20) {
                salaryRaise = salary * 0.1;
            }else {
                salaryRaise = salary * 0.15;
            }
            return salaryRaise;

        }
        public void printInfo () {
            System.out.println("Name: "+name);
            System.out.println("Salary: "+ salary);
            System.out.println("Work Hours: "+ workHours);
            System.out.println("Hire Date : "+hireYear);
            System.out.println("========");
            System.out.println("Tax: "+taxMethod());
            System.out.println("Bonus: "+bonusMethod());
            System.out.println("Raise: "+RaiseSalaryMethod());
            System.out.println("Increase Salary :" + RaiseSalaryMethod());
            System.out.println("Salary with tax and bounus: "+ ((salary-taxMethod())+bonusMethod()));
            System.out.println("Total Salary with the raise: "+ (salary+RaiseSalaryMethod()));

        }


}
