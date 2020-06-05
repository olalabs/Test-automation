# Test-automation
Software testing projects with various automation tools, i.e. Robot Framework and Selenium.

## Table of contents
* [Robot Framework](#Robot-Framework)
* [Selenium Webdriver](#Selenium-Webdriver)


### POM Pattern
Projects includes test cases for the [Mercury Newtours website](http://newtours.demoaut.com/). 
The structure of these projects is based on page object pattern.

## Robot Framework

**Prerequisites and getting the tools:**

Install 
* [Python](https://www.python.org/downloads/)
* [Pycharm IDE](https://www.jetbrains.com/pycharm/download/#section=windows)
* [Chromedriver](https://chromedriver.chromium.org/downloads) - check in your browser settings, which version you need.

1. Selenium
```
pip install selenium
```

2. Robot Framework
```
pip install robotframework
```

3. Robotframework Selenium Library 
```
pip install robotframework-seleniumlibrary
```

In Pycharm
1. Add this 3 tools above to project interpreter
2. Install Intellibot @SeleniumLibrary Patched plugin

Next steps: 
1. Put your chromedriver .exe file to Scripts in Python Folder 
2. Add tools (path to Scripts in Python Folder) to path in environemnt variables: 
Control Panel -> System and Security -> System Properties
-> Environment Variables 


## Selenium Webdriver

**Prerequisites and getting the tools:**

Install 
* [JDK - Java Development Kit](https://www.oracle.com/technetwork/java/javase/overview/index.html )
* [IDE e.g. IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows)
* [Maven](https://maven.apache.org/download.cgi) - download .zip and add Maven to path in environemnt variables.
* [Chromedriver](https://chromedriver.chromium.org/downloads)
* Selenium
```
pip install selenium
```

In your IDE you can add 'Create TestNG XML' plugin.

If you don't want to create maven project, you can also create java project and download dependencies specified in pom.xml. Next, compile downloaded dependecies - in IntelliJ IDEA:   
Project -> project structure -> dependencies -> click + button -> select  .jar file -> compile -> OK 




**Projects status:**  In development  
