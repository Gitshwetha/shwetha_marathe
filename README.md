# shwetha_marathe


QA Challenge - Kloeckner.I

This project is build using Selenium Webdriver and TestNG framework. Java is used to write the scripts.
Page object Model design is used to seggregate the classes.

This project focuses on the two important testcases of Trello App.
To run the scripts , clone this repository to your local. All the dependencies are added to the POM.xml file.
You just need to tweek the browser location in the TestBase class under main

Can change the credentials from config.properties file under config package.
Testcases to run are included in the testng.xml file or can also also be run individually from testclass.

Testcases covered are:
1. Login and create a board in trello.com
A valid user should be able to login into trello.com application and should create a new board successfully.

2.Login and navigate to the info page, get the page title.
In this testcase, user should be abale to login , click on the information from the home page and then click on the information
image 
Get the page title and assert if the page title(page navigated) is correct or not.



