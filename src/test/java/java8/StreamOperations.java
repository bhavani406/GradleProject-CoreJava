package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        String[] names = {"bhanu", "adi", "abhay"};
        Stream<String> strArr = Arrays.stream(names);
        Stream<String> strArr1 = Stream.of("bha", "adi", "abhay");
        List<Employee> employees = getEmployeeList();
        // Stream Methods / Operations
        // Req : Get all employee names as list
        List<String> employeeNames = employees.stream().map(emp -> emp.getName()).toList(); //Employee::getName
        System.out.println(employeeNames);
        Stream<Employee> streamEmployee = employees.stream();
        //filter
        //age >25
        List<String> empls = streamEmployee.filter(x -> x.getAge() > 25).map(Employee::getName).toList();
        //List<String> empls1 = streamEmployee.map(Employee::getName).toList();//illegalstateexception don't use stream reference 2nd time

        //PRINT ALL CITY NAMES DISTINCT
        employees.stream().map(Employee::getCity).distinct().forEach(System.out::println);

        //GET COUNT OF EMPLOYEES WHOSE SALARY > 20000
        long countOfEmp = employees.stream().filter(x -> x.getSalary() > 20000).count();
        System.out.println(countOfEmp);

        //GET FIRST 3 EMPL OBJECTS AS A LIST
        //employees.stream().limit(3).forEach(System.out::println);

        //SKIP  FIRST 3 EMPLOYEES
        //employees.stream().skip(3).forEach(System.out::println);

        //any match - one of the elements matches return true UNDER AGE
        boolean check = employees.stream().anyMatch(emp -> emp.getAge() < 18);
        //System.out.println(check);

        // allMatch - check all the epmyeees joined before 2020- check for all the employees
        boolean check1 = employees.stream().allMatch(emp -> emp.getYearOfJoining() < 2020);
        System.out.println(check1);

        //noneMatch - oop to allMatch- like all employees matches with condition return false
        boolean check2 = employees.stream().noneMatch(emp -> emp.getYearOfJoining() < 2020);
        System.out.println(check2);

        //findAny = get one value from out of all values return Optional
        Employee emp = employees.stream().findAny().get();
        //System.out.println(emp);

        //findFirst= returns first element of the stream
        Employee emp1 = employees.stream().findFirst().get();
        //System.out.println(emp1);

        //sorted - emp id's on sorted order
        List<Integer> listOfId = employees.stream().map(Employee::getId).sorted().toList();
        //System.out.println(listOfId);

        //sorted with comparater - sort Employee objects based on empid
        List<Employee> sortedEmployeeId = employees.stream().sorted((x, y) -> x.getId() > y.getId() ? 1 : -1).toList();
        List<Employee> sortedEmployeeIds = employees.stream().sorted((e1, e2) -> {
            return e1.getAge() - e2.getAge();
        }).toList();
        List<Employee> sortedEmployeeNames = employees.stream().sorted((e3, e4) -> {
            return e3.getName().compareTo(e4.getName());
        }).toList();
        //System.out.println(sortedEmployeeIds);

        //min -min salary
        Employee emp2 = employees.stream().min((emp3, emp4) -> (int) (emp3.getSalary() - emp4.getSalary())).get();
        Employee emp3 = employees.stream().min(Comparator.comparingDouble(Employee::getSalary)).get();
        //System.out.println(emp2);


        //max
        Optional<Employee> emp4 = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        if (emp4.isPresent()) {
            System.out.println(emp4.get());
        }
        /// (OR)
        emp4.ifPresent(System.out::println);
        //System.out.println(emp4);

        //average
        OptionalDouble db = employees.stream().mapToDouble(Employee::getSalary).average();
        db.ifPresent(System.out::println);


        //peek(consumer) - just to perform some operations before pass it to next intermediate operation/filter/map
        employees.stream().peek(System.out::println).filter(y -> y.getSalary() > 20000).forEach(System.out::println);

        //Collectors class - terminal
        //unique department name
        Set<String> uniqueDept = employees.stream().map(Employee::getDepartment).collect(Collectors.toSet());

        //collect employee IDs and their salaries as Map
        Map<Integer, Double> empIdAndSalaries =
                employees.stream().collect(Collectors.toMap(Employee::getId,

                        Employee::getSalary));

        System.out.println(empIdAndSalaries);

        //groupingBy()
        // get avg salary of each department
        Map<String, Double> avgGrpSalary = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgGrpSalary);

        //count()
        // Get Count of employees gender wise
        Map<String, Long> countOfEmpGenderWise = employees.stream().collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.counting()
                )
        );
        System.out.println(countOfEmpGenderWise);

        //summing...
        //summarizing...
        // Summing All employees salaries
        System.out.println(employees.stream()
                .collect(Collectors.summingDouble(Employee::getSalary)));
        System.out.println(employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary)));

        // maxBy()
        //finding max age of employees
        Employee maxAgeEmp = employees.stream()
                .collect(Collectors.maxBy((e1, e2) -> e1.getAge() - e2.getAge()))
                .get();
        System.out.println(maxAgeEmp);

        //joining
        // All Department names with delimiter :::
        String allDeparments = employees.stream().map(Employee::getDepartment).collect(Collectors.joining(":::"));

        System.out.println(allDeparments);

        //FLATMAP

        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("apple", "banana"), Arrays.asList("cherry", "date"));
        List<String> flattened = listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(flattened);
    }

    public static List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(6, "Six", 43, "Male", "Security", 2016, 9500.0, "Pune"));
        employeeList.add(new Employee(7, "Seven", 35, "Male", "Finance", 2010, 27000.0, "Pune"));
        employeeList.add(new Employee(3, "Three", 29, "Male", "Infrastructure", 2012, 18000.0, "Hyderabad"));
        employeeList.add(new Employee(8, "Eight", 31, "Male", "Development", 2015, 34500.0, "Pune"));
        employeeList.add(new Employee(9, "Nine", 24, "Female", "Sales", 2016, 11500.0, "Hyderabad"));
        employeeList.add(new Employee(10, "Ten", 25, "Female", "Sales", 2009, 22500.0, "Pune"));
        employeeList.add(new Employee(2, "Two", 25, "Male", "Sales", 2015, 13500.0, "Hyderabad"));
        employeeList.add(new Employee(4, "Four", 28, "Female", "Development", 2014, 32500.0, "Pune"));
        employeeList.add(new Employee(5, "Five", 27, "Female", "HR", 2013, 22700.0, "Pune"));
        employeeList.add(new Employee(1, "One", 32, "Female", "HR", 2011, 25000.0, "Hyderabad"));


        return  employeeList;
    }
}
