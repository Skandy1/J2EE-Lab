# Program 9

Using JDBC concepts create a database and retrieve info base on particular queries.

**Storing data using Database**

#### Prerequisites

- JDBC connector - [Download](https://dev.mysql.com/downloads/connector/j/)
- WAMPP Server/ MySQL Server running on port **3306**

### How to execute?

1. Firstly, download the JDBC connector from this [link ](https://dev.mysql.com/downloads/connector/j/) selecting **Platform Independent** as your option from the drop down. Create a new **java application** in NetBeans and import the jar file.

   ![JDBC](images/9.1.gif)

2. Next, open MySQL console and create a database **test** and a table **student** with name, usn and result as columns.
   ![DB](images/9.2.gif)

3. Copy and paste the code from this [file](Student.java) into your default java file under source packages and make sure your java file name is **student.java**. You can either rename it or create a new java class.

4. Click on run and watch out for the output in the console.

   ![Output](images/9.3.gif)



##### Date: 3/7/2021
