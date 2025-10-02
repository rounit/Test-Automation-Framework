
# Java Test Automation Framework

This repository contains a Java-based Test Automation Framework designed for UI and functional testing with support for data-driven testing, cloud execution (LambdaTest), headless mode for fast execution, and rich reporting.


## Authors

- [@rounit](https://github.com/rounit)
- EmailAddress: rounit19@gmail.com


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/rounit)

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/rounit-sharma/)




## 🚀 About Me
Hi, My Name is Rounit Sharma and I have 6+ years of experience in Automation Testing using technologies like Selenium Webdriver,RestAssured,Manual testing ,Core Java,Cucumber .


## Prerequisites

Before running this framework, make sure the following software are installed and configured:

-**Java 11** or above → Verify with:

java -version

-Maven (3.6+) → Verify with:

mvn -version

-Google Chrome / Edge / Firefox browsers → For local execution

-ChromeDriver / GeckoDriver / EdgeDriver → Managed automatically via WebDriverManager

-Git → To clone the project

-IDE (IntelliJ IDEA / Eclipse) → Recommended for development

-Node.js (Optional) → If you want to integrate frontend reporting dashboards

-LambdaTest Account → For cloud execution

##Features

✅ Cross-browser execution (Chrome, Edge, Firefox)
✅ Run tests in headless or headed mode
✅ Data-driven testing using CSV, JSON, Excel
✅ Parallel execution with TestNG
✅ Cloud execution on LambdaTest
✅ Maven Surefire integration for CLI execution
✅ ExtentReports for interactive HTML reports
✅ Log4j2 for detailed execution logs
✅ Screenshots on failure

##Tech Stack

- Language: Java 11

- Test Runner: TestNG

- Build Tool: Maven (Surefire plugin for CLI    execution)

- Cloud Execution: LambdaTest

- Data Driven Testing:

- OpenCSV (CSV)

- Gson (JSON)

- Apache POI (Excel)

- Test Data Generation: Java Faker

- Logging: Log4j2

- Reporting: ExtentReports



## Setup & Installation

Follow these steps to set up the framework locally:

**Clone the Repository:

```bash
  git clone https://github.com/rounit/Test-Automation-Framework.git

cd test-automation-framework
```
**Install Dependencies:

Run the following command to download all required Maven dependencies:

```bash
  mvn clean install

```

**Run Tests Locally (Chrome default)

```bash
  mvn clean test -Dbrowser=CHROME -DisLambdaTest=false -DisHeadLess=false


```

** Run in Headless Mode (Faster)

```bash
  mvn clean test -Dbrowser=CHROME -DisLambdaTest=false -DisHeadLess=true

```

** Run on LambdaTest Cloud
```bash
  mvn clean test -Dbrowser=CHROME -DisLambdaTest=true -DisHeadLess=false


```

👉 Parameters:

browser → CHROME / EDGE / FIREFOX

isLambdaTest → true (cloud) / false (local)

isHeadLess → true (headless mode) / false (normal mode)

📊 Reports & Logs

**Extent Report → Generated at:

```bash
 /reports/ExtentReport.html



```

** Log Files → Generated in:

```bash
 /logs/automation.log

```

** Screenshots on Failure → Stored in:

```bash
 /logs/automation.log

```
## Integrated the project Github Actions

This automation framework is Integrated with Github Actions . 

The reported will be archieved in gh-pages branch
