# 🚀 Test Automation Framework

## 📌 Overview
This is a robust test automation framework designed for executing automated tests efficiently. It integrates with Cucumber, Selenium, and Maven to provide seamless test execution and reporting.

## 🎯 How to Execute Tests
You can specify the test scenarios to run by setting the desired **tags** in the `TestRunner.java` class.

To execute the tests, use the following command:
```sh
mvn clean install
```

Alternatively, you can run tests with specific tags:
```sh
mvn test -Dcucumber.filter.tags="@Regression"
```

## 📊 Reporting
After execution, the test reports are automatically generated:
- **Cucumber Report:** Located in `target/cucumber-reports/`
- **HTML & JSON Reports:** Stored inside the `target/cucumber-reports/`

To view the Cucumber report, open:
```
target/cucumber-reports/index.html
```

## 🛠 Prerequisites
Ensure the following are installed:
- **Java 17+**
- **Maven**
- **Google Chrome** 
