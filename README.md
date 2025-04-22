# LoginPart1
Portfolio of Evidence

README for User Registration and Login System
Overview
This project implements a simple user registration and login system in Java. It allows users to create an account by entering a username, password, and South African cell phone number. The system validates the input according to specified criteria and provides feedback on the registration and login processes.
Features

User Registration: Users can register with a username, password, and phone number.
Input Validation: The system checks:

Username must contain an underscore and be no longer than five characters.
Password must be at least eight characters long, contain a capital letter, a number, and a special character.
Phone number must follow the South African format with the international code.


User Login: Users can log in with their registered username and password.
Feedback Messages: The system provides clear messages for successful or failed registration and login attempts.

Requirements

Java Development Kit (JDK) 8 or higher
An IDE such as NetBeans or any text editor for Java development

Installation


Clone the Repository:
git clone <repository-url>
cd <repository-directory>



Compile the Code:
Open the project in your IDE or compile it using the command line:
javac LoginPart1.java



Run the Application:
Execute the main class:
java LoginPart1



Usage


Register a User:

Input a username, password, and phone number when prompted.
The system will validate the inputs and provide feedback.



Login:

Enter the registered username and password.
The system will confirm if the login is successful or not.



Code Structure

LoginPart1.java: Contains the main class with methods for user registration, login, and validation.
Validation Methods:

checkUserName(String username): Validates the username format.
checkPasswordComplexity(String password): Validates the password complexity.
checkCellPhoneNumber(String phone): Validates the phone number format.



Testing
The application includes basic functionality that can be tested by registering and logging in with various inputs. Ensure to test both valid and invalid cases to verify the validation logic.
Contributing
Contributions are welcome! If you have suggestions for improvements or new features, please open an issue or submit a pull request.
License
This project is licensed under the MIT License. See the LICENSE file for more details.
Acknowledgments

Inspired by common user authentication practices.
Developed as part of a learning exercise in Java programming.

Feel free to reach out if you have any questions or need further assistance!
