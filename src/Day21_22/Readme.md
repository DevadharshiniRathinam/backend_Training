
## Files
- **Student.java**: Contains the `Student` class, which represents student details and provides methods for getting and setting values for ID, name, age, grade, and email. It also includes methods for converting student data to CSV format.
- **StudentManagementSystems.java**: Contains the main application logic, including functions for adding, viewing, searching, updating, deleting, and sorting student details. It interacts with the `students1.csv` file to store and retrieve student data.
- **students1.csv**: A CSV file where student details are saved and loaded. This file is used for persistent data storage.

## Installation
1. Clone the repository or download the files.
2. Ensure you have Java installed on your system.
3. Compile the Java files using a Java compiler.
4. Run the `StudentManagementSystems.java` class to start the application.

## Usage
Run the program, and the system will present a menu with various options:
- Add Student
- View Students
- Search Student by ID
- Update Student
- Delete Student
- Sort by Name or Age
- Exit

The system will prompt you to enter the required student details or options for each operation.

## Example
- **Adding a Student**:  
  The system will ask for student details (ID, Name, Age, Grade, and Email). The program ensures that the student ID is unique before adding the student to the system.

- **Viewing All Students**:  
  The students will be listed in order by their IDs.

- **Searching for a Student by ID**:  
  You can search for a student by their ID, and if found, their details will be displayed.

- **Updating a Student**:  
  You can update specific fields (Name, Age, Grade, or Email) of an existing student.

- **Deleting a Student**:  
  You can delete a student by their ID, and their record will be removed from the system.

- **Sorting**:  
  You can sort students either by Name or Age.

## Requirements
- Java 8 or later
