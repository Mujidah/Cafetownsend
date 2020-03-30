# Cafetownsend

## Launching and executing project
### Dependencies
1. Maven - To download libraries and manage builds
2. TestNG - To manage tests
3. JDK 8 or higher - To aid automated tests
4. Git (Optional) - To push tests to a central repo
5. IDE(Eclipse, IntelliJ) - To write automated tests in Java

### How to setup project on a local machine
Go to https://github.com/Mujidah/Cafetownsend
Click Clone or Download button at the right hand side of the page
You can either Download it as a zip file to import or copy the git url displayed
Using command prompt, browse to where you would like to save the project
Enter 'git clone "git url"'
The project will be copied to your preferred location and ready for import

### How to import the project on Eclipse
Since its a maven project, do the following;
Launch IDE (Eclipse)
Click File in the menu
Click on Import -> Maven/Existing Maven Projects
Navigate to the project folder
Follow through the instruction wizard till completion

### How to run the project and view report
Using command prompt, browse to where the project is and enter "mvn test" to run all the tests according to testNG. 
To run a single test, enter "mvn -Dtest=SampleTest test". Where SampleTest is the name of the test
Check for the test results from the IDE's terminal or get the web version(index.html) of the report from surefire-reports in the project folder

## Conclusion
Summarily, I nudged towards using Selenium Webdriver with Java using Maven and TestNG. I used a design pattern called Page Object Model - an approach to separate the elements and functions from the test validations and make the tests independent of the page objects.
The test cases covered are for these features and all test passed successfully;
a.	Login 
b.	Logout
c.	View Employees
Due to an unexpected error in the application, I was unable to deepen the tests to cover other important features of the application such as Create, Update and Delete employee. 

I created a data properties file to store data like browser and app url. This was done to minimize error in case of a change and the change will only be done in one place. 
I used TestNG as the test framework for an easy test management as it provides features regarding how many tests to run and when to run them.
I used Maven as the build management tool for easy downloads of libraries and collaboration
Finally, I manually tested a wide range of features in the application, covering the full breadth of test cases around Positive scenarios and negative scenarios


