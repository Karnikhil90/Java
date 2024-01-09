# FileManipulation Project v02

This project provides enhanced functionalities for reading and manipulating a file named `name.txt`. It is designed for use in a Login System and the Library Project.

## Description

In the `v02` version, the `Test` class has been updated to include advanced methods for reading, processing, and adding new data to the `name.txt` file. The file format now supports user data in the form of "name,password,age".

### Reading Data

The `Reading` method in the `Test` class reads data from the `name.txt` file and returns a list of strings, where each string represents a line from the file.

### Processing Data

You can extract user data from a line using the following code:

```java
String[] name = new String[list.length];
String[] password = new String[list.length];
String[] age = new String[list.length];

for (int i = 0; i < list.length; i++) {
    String[] userData = list[i].split(","); // Split the line using commas
    name[i] = userData[0];
    password[i] = userData[1];
    age[i] = userData[2];
}
```

### Adding New Users

The `addUserToFile` method in the `Test` class allows you to append new user data to the `name.txt` file. It accepts user information in the form of "name,password,age".

## Important Note

The `name.txt` file now stores user data in the format "name,password,age". Make sure to update and format the file accordingly for accurate testing of both the Login System and the Library Project.

Feel free to customize this README.md according to your project's specific details in the `v02` folder.