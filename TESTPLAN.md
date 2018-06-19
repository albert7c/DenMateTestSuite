# DenmateTestSuite Test Plan

## Description
DenMate provides a social platform for people to connect with roommates, landlords, tenants or locals who have common interests and personalities.

This test suite includes User Interface (UI) and Application Program Interface (API) test cases. 
The UI test suite uses Selenium Web Driver to automate website testing and Appium to automate mobile testing. The test suite is designed using Page Objects with TestNG as its base framework.
The API test suite is designed using Google Gson to map Json objects and also uses TestNG as its base framework.

### Objective
This test suite is made to conduct functionality testing to verify the stability of the product

### Scope
This test suite should contain happy path and error test cases.
The test methods used should also have unit tests to verify functionality

## Features to be tested
DenMate Website UI
DenMate API Endpoints

## Features not to be tested
DenMate Mobile Application (Not Yet Implemented)

## Environmental Needs
QA Environments - An isolated environment from Dev/Prod environments in which QA is able to conduct testing

## Continuous Integration Tools
Jenkins
Git

## Testing tasks
TestRail - provides a separation of testing tasks 

## Risks and Mitigation
| Risk | Mitigation |
| :---: | :---: |
| Lack of personnel to conduct full regression testing | Automate most functional testing to reduce Manual testing load|
| Deprecation of tooling | Versioning and continuously keep up to date with latest testing tools |
| Development Scope increases | Work closely with the team to continuously update tests |

## Testing Deliverables
TestNG generates a report to view the amount of test cases that passed/failed

Failed test cases should be investigated before logging in a tool such as JIRA

## Stakeholders
Albert