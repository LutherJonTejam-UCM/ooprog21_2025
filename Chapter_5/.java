import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentRecordManager {

    private static class StudentProfile {
        private String studentID;
        private String firstName;
        private String middleName;
        private String lastName;
        private String suffix;
        private int age;
        private int yearLevel;
        private String phoneNumber;
        private String email;

        public StudentProfile(String studentID, String firstName, String middleName, String lastName, String suffix, int age, int yearLevel, String phoneNumber, String email) {
            this.studentID = studentID;
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.suffix = suffix;
            this.age = age;
            this.yearLevel = yearLevel;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getStudentID() { return studentID; }
        public String getFirstName() { return firstName; }
        public String getMiddleName() { return middleName; }
        public String getLastName() { return lastName; }
        public String getSuffix() { return suffix; }
        public int getAge() { return age; }
        public int getYearLevel() { return yearLevel; }
        public String getPhoneNumber() { return phoneNumber; }
        public String getEmail() { return email; }

        public void setFirstName(String firstName) { this.firstName = firstName; }
        public void setMiddleName(String middleName) { this.middleName = middleName; }
        public void setLastName(String lastName) { this.lastName = lastName; }
        public void setSuffix(String suffix) { this.suffix = suffix; }
        public void setAge(int age) { this.age = age; }
        public void setYearLevel(int yearLevel) { this.yearLevel = yearLevel; }
        public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
        public void setEmail(String email) { this.email = email; }
    }

    private static class CourseDetails {
        private String courseName;
        private String courseCode;
        private String department;

        public CourseDetails(String courseName, String courseCode, String department) {
            this.courseName = courseName;
            this.courseCode = courseCode;
            this.department = department;
        }

        public String getCourseName() { return courseName; }
        public String getCourseCode() { return courseCode; }
        public String getDepartment() { return department; }

        public void setCourse(String courseName, String courseCode, String department) {
            this.courseName = courseName;
            this.courseCode = courseCode;
            this.department = department;
        }
    }

    private static Scanner scanner = new Scanner(System.in);
    private static StudentProfile studentRecord = null;
    private static CourseDetails courseRecord = null;
    private static final String APP_NAME = "Student Record Management App v1";
    private static int studentIdCounter = 1; // Used for simple ID generation

    private static void printHeader(String title) {
        System.out.println("\n" + APP_NAME);
        System.out.println(title);
        System.out.println("==========================================");
    }

    private static int getSelection(String prompt) {
        System.out.print("Enter Selection: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next(); 
            return -1; 
        } finally {
            // Clear the buffer after reading an int
            scanner.nextLine();
        }
    }

    private static void initialMenu() {
        int selection;
        while (true) {
            printHeader("Selection Menu");
            System.out.println("1. Create Student Record");
            System.out.println("2. Exit");
            System.out.println("==========================================");

            selection = getSelection("Enter Selection: ");

            switch (selection) {
                case 1:
                    createStudentRecord();
                    if (studentRecord != null) {
                        recordManagementMenu();
                    }
                    break;
                case 2:
                    System.out.println("\nExiting " + APP_NAME + ". Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nInvalid selection. Please try again.");
            }
        }
    }

    private static void createStudentRecord() {
        String studentID = "ID: " + String.format("%07d", studentIdCounter++);
        
        printHeader("Create Student Profile Details Creation");
        System.out.println("Student ID No.: " + studentID);
        System.out.println("------------------------------------------");
        
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Suffix (e.g., Jr., Sr., None): ");
        String suffix = scanner.nextLine();

        int age = 0;
        int yearLevel = 0;
        
        while (age <= 0) {
            System.out.print("Enter Age: ");
            try {
                age = scanner.nextInt();
                if (age <= 0) System.out.println("Age must be a positive number.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for Age. Please enter a number.");
                scanner.nextLine(); // consume invalid input
            }
        }

        while (yearLevel <= 0) {
            System.out.print("Enter Year Level: ");
            try {
                yearLevel = scanner.nextInt();
                if (yearLevel <= 0) System.out.println("Year Level must be a positive number.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for Year Level. Please enter a number.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        
        studentRecord = new StudentProfile(studentID, firstName, middleName, lastName, suffix, age, yearLevel, phoneNumber, email);

        updateStudentCourseDetails();
    }

    private static void recordManagementMenu() {
        int selection;
        boolean exitMenu = false;

        while (!exitMenu) {
            printHeader("Record Management Menu");
            System.out.println("1. Update Student Profile Details");
            System.out.println("2. Update Student Course Details");
            System.out.println("3. Display Student Record");
            System.out.println("0. Exit");
            System.out.println("==========================================");

            selection = getSelection("Enter Selection: ");

            switch (selection) {
                case 1:
                    updateStudentProfileDetails();
                    break;
                case 2:
                    updateStudentCourseDetails();
                    break;
                case 3:
                    displayStudentRecord();
                    break;
                case 0:
                    exitMenu = true;
                    // Go back to the main menu/exit
                    break; 
                default:
                    System.out.println("\nInvalid selection. Please try again.");
            }
        }
    }

    private static void updateStudentProfileDetails() {
        int selection;
        boolean exitMenu = false;

        while (!exitMenu) {
            printHeader("Update Student Profile Details");
            System.out.println("Update Student Profile Details Selection Menu:");
            System.out.println("1. Update First Name");
            System.out.println("2. Update Middle Name");
            System.out.println("3. Update Last Name");
            System.out.println("4. Update Suffix");
            System.out.println("5. Update Age");
            System.out.println("6. Update Year Level");
            System.out.println("7. Update Phone Number");
            System.out.println("8. Update Email");
            System.out.println("9. Return");
            System.out.println("==========================================");
            
            selection = getSelection("Enter Selection: ");

            String newValue;
            int newInt;
            
            switch (selection) {
                case 1:
                    System.out.print("Enter new First Name: ");
                    newValue = scanner.nextLine();
                    studentRecord.setFirstName(newValue);
                    System.out.println("First Name updated successfully.");
                    break;
                case 2:
                    System.out.print("Enter new Middle Name: ");
                    newValue = scanner.nextLine();
                    studentRecord.setMiddleName(newValue);
                    System.out.println("Middle Name updated successfully.");
                    break;
                case 3:
                    System.out.print("Enter new Last Name: ");
                    newValue = scanner.nextLine();
                    studentRecord.setLastName(newValue);
                    System.out.println("Last Name updated successfully.");
                    break;
                case 4:
                    System.out.print("Enter new Suffix: ");
                    newValue = scanner.nextLine();
                    studentRecord.setSuffix(newValue);
                    System.out.println("Suffix updated successfully.");
                    break;
                case 5:
                    System.out.print("Enter new Age: ");
                    try {
                        newInt = scanner.nextInt();
                        if (newInt > 0) {
                             studentRecord.setAge(newInt);
                             System.out.println("Age updated successfully.");
                        } else {
                            System.out.println("Age must be a positive number.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                    } finally {
                        scanner.nextLine();
                    }
                    break;
                case 6:
                    System.out.print("Enter new Year Level: ");
                    try {
                        newInt = scanner.nextInt();
                        if (newInt > 0) {
                             studentRecord.setYearLevel(newInt);
                             System.out.println("Year Level updated successfully.");
                        } else {
                            System.out.println("Year Level must be a positive number.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                    } finally {
                        scanner.nextLine();
                    }
                    break;
                case 7:
                    System.out.print("Enter new Phone Number: ");
                    newValue = scanner.nextLine();
                    studentRecord.setPhoneNumber(newValue);
                    System.out.println("Phone Number updated successfully.");
                    break;
                case 8:
                    System.out.print("Enter new Email: ");
                    newValue = scanner.nextLine();
                    studentRecord.setEmail(newValue);
                    System.out.println("Email updated successfully.");
                    break;
                case 9:
                    exitMenu = true;
                    System.out.println("\nReturning to Record Management Menu...");
                    break;
                default:
                    System.out.println("\nInvalid selection. Please try again.");
            }
        }
    }

    private static void updateStudentCourseDetails() {
        printHeader("Update Student Course Details");
        System.out.println("Select Student Course Details: (Update)");
        System.out.println("1. Bachelor of Science in Information Technology (BSIT)");
        System.out.println("2. Bachelor of Science in Computer Science (BSCS)");
        System.out.println("3. Associate of Computer Technology (ACT)");
        System.out.println("4. Bachelor of Science in Mechanical Engineering (BSME)");
        System.out.println("5. Bachelor of Science in Civil Engineering (BSCE)");
        System.out.println("------------------------------------------");

        int selection = getSelection("Enter Selection: ");
        
        String name = "";
        String code = "";
        String department = "";
        boolean validSelection = true;
        
        switch (selection) {
            case 1:
                name = "Bachelor of Science in Information Technology";
                code = "BSIT";
                department = "College of Computer Studies";
                break;
            case 2:
                name = "Bachelor of Science in Computer Science";
                code = "BSCS";
                department = "College of Computer Studies";
                break;
            case 3:
                name = "Associate of Computer Technology";
                code = "ACT";
                department = "College of Computer Studies";
                break;
            case 4:
                name = "Bachelor of Science in Mechanical Engineering";
                code = "BSME";
                department = "College of Engineering";
                break;
            case 5:
                name = "Bachelor of Science in Civil Engineering";
                code = "BSCE";
                department = "College of Engineering";
                break;
            default:
                System.out.println("\nInvalid course selection. Course not updated.");
                validSelection = false;
        }

        if (validSelection) {
            if (courseRecord == null) {          
                courseRecord = new CourseDetails(name, code, department);
            } else {
                courseRecord.setCourse(name, code, department);
            }
            System.out.println("\nCourse details successfully set/updated to: " + name + " (" + code + ")");
        }
    }

    private static void displayStudentRecord() {
        if (studentRecord == null) {
            System.out.println("\nNo student record exists yet. Please create one first.");
            return;
        }

        printHeader("Display Student Record");
        System.out.println("Student Record");
        System.out.println("------------------------------------------");

        System.out.println("Student Profile Details:");
        System.out.println(" * Student ID No. : " + studentRecord.getStudentID());
        System.out.println(" * First Name    : " + studentRecord.getFirstName());
        System.out.println(" * Middle Name   : " + studentRecord.getMiddleName());
        System.out.println(" * Last Name     : " + studentRecord.getLastName());
        String suffixDisplay = studentRecord.getSuffix().isEmpty() ? "None" : studentRecord.getSuffix();
        System.out.println(" * Suffix        : " + suffixDisplay);
        System.out.println(" * Age           : " + studentRecord.getAge());
        System.out.println(" * Year Level    : " + studentRecord.getYearLevel());
        System.out.println(" * Phone Number  : " + studentRecord.getPhoneNumber());
        System.out.println(" * Email         : " + studentRecord.getEmail());

        System.out.println();
        
        System.out.println("Student Course Details:");
        if (courseRecord != null) {
            System.out.println(" * Course Name   : " + courseRecord.getCourseName());
            System.out.println(" * Course Code   : " + courseRecord.getCourseCode());
            System.out.println(" * Department    : " + courseRecord.getDepartment());
        } else {
            System.out.println(" * Course Details: Not yet set.");
        }
        System.out.println("==========================================");
        System.out.println("\nPress Enter to return to menu...");
        scanner.nextLine(); // Pause execution until user presses Enter
    }

    public static void main(String[] args) {
        initialMenu(); 
    }
}
