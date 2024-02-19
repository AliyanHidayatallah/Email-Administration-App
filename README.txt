# EmailApp Project

## Overview

Welcome to the EmailApp project! This Java application is designed to assist IT support administrators in creating email accounts for new hires. The program generates email addresses with a specific syntax, assigns departments, and provides functionality to manage various aspects of the email accounts.

## Features

1. **Email Generation:**
   - Email addresses are generated using the syntax: `firstname.lastname@department.company.com`.
   - The department is determined based on user input (sales, development, accounting), with an option to leave it blank.

2. **Password Generation:**
   - A random string is generated for the initial password.
   - Passwords are generated with a default length of 10 characters.

3. **Department Assignment:**
   - Users are prompted to enter a department code (1 for Sales, 2 for Development, 3 for Accounting, 0 for none).
   - The department code is used to assign the appropriate department to the email address.

4. **Mailbox Management:**
   - Users can set the mailbox capacity for each email account.
   - Alternate email addresses can be defined for account recovery.

5. **Password Management:**
   - Passwords can be changed using the `changePassword` method.

## How to Use

1. **Run the `EmailApp` Class:**
   - Execute the `main` method in the `EmailApp` class to create a new email account.

2. **Follow On-screen Prompts:**
   - When prompted, enter the department code to assign a department.
   - The generated email, password, and mailbox capacity will be displayed.

3. **Additional Functionality:**
   - Uncomment and use methods like `setAlternateEmail` and `getAlternateEmail` to manage alternate email addresses.

## Code Structure

- The project consists of two classes: `EmailApp` and `Email`.
- `EmailApp` contains the main method and is responsible for creating and displaying email accounts.
- `Email` encapsulates the functionality for email generation, password generation, and management.

## Contributors

- This project is maintained by Aliyan Hidayatallah.
- Contributions and improvements are welcome!

