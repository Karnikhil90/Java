# FileManipulation Project

This project provides functionalities for reading and manipulating a file named `name.txt`. It is primarily used for a Login System and the Library Project.

## Description

The `Test` class in this project includes methods for reading data from the `name.txt` file, splitting lines into name and subject, and adding new lines to the file.

## Usage

### Reading Data

The `Reading` method in the `Test` class reads data from the `name.txt` file. It counts the number of lines, concatenates elements in each row, and returns the flattened array.

### Processing Data

You can split the lines into name and subject using the following code:

```java
String[] name = new String[list.length];
String[] subject = new String[list.length];

for (int i = 0; i < list.length; i++) {
    String[] a = list[i].split("\\$"); // Escape the dollar sign
    name[i] = a[0];
    subject[i] = a[1];
}
```

### Adding New Lines

The `addLineToFile` method in the `Test` class allows you to append new lines to the `name.txt` file.

## Important Note

This file (`name.txt`) serves as a test file for both a Login System and a Library Project. Ensure the file is appropriately formatted and populated with test data for accurate testing.

Feel free to customize this README.md according to your project's specific details.