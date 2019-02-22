package chapter11;
public class Chapter11 {
    public static void main(String[] args) {
        Person person = new Person("John", "459 Britol Road - Mississauga", "416-748-9974", "john.Kardy@yahoo.com");
        Student student = new Student();
        Employee employee = new Employee();
        Faculty faculty = new Faculty();
        Staff staff = new Staff();
                
        employee.HiredDate(2011, 2, 5);
       
     
        // Display a person
        System.out.println("Information of person: ");
        System.out.println( person.toString());
        
        // Display student;
        student.name ="Anita"; 
        student.stStatus ="freshman";
        student.address = "29 Dundas Street - Mississauga";
        student.email ="Anita.Rana@hotmail.com";
        student.phone = "905-789-7856";
        
        System.out.println("\nInformation of student: ");
        System.out.println(student.toString());
               
        // Display an Employee;     
        employee.name = "Lilanie";        
        employee.office_name="Accounting";
        employee.salary = 45000;
        
        employee.dateHired.day = 3;
        employee.dateHired.month = 1;
        employee.dateHired.year = 2011;
        
        System.out.println("\nInformation of employee: ");        
        System.out.println(employee.toString());       
        System.out.print("Hired Date: " + employee.dateHired.day);
        System.out.print( "/ " + employee.dateHired.month);                
        System.out.println( "/ " + employee.dateHired.year);
        
        // display information of fulcuty
        System.out.println("\nInformation of faculty: "); 
        faculty.name ="Charlotte";
        faculty.rank ="Manager";
        //faculty.salary = 60000;
        faculty.officeHours = 45;
        System.out.println(faculty.toString());
        
        // display information of staff
        System.out.println("\nInformation of staff: "); 
        staff.name ="Lina";
        staff.title = "Director";
        
        System.out.println(staff.toString());
        
        
    }
    
}
