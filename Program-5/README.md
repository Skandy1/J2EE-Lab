# Program 5

JAVA Servlet program to implement sessions using HTTP Session Interface.

**Storing user name in a session**

```java
HttpSession session = request.getSession(); // creating a session
session.setAttribute("uname", name); // adding attributes to the session
```

### How to execute?

1. Fork on download in a zip file and extract in your local machine.
2. Open NetBeans and choose *open project* and choose the folder which contains the program files.
3. Choose the suitable browser and click run to execute.
4. Enter your name in the TextField and submit the form.
5. Your data will be stored in the session file and can be accessed across the website.  

### Screenshot

------

![5.1](images/5.1.gif)

##### Date: 7/5/2021