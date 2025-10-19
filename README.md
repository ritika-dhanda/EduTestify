
# EduTestify

![Node.js](https://img.shields.io/badge/Node.js-v14%2B-green)  
![Java](https://img.shields.io/badge/Java-JDK%2011%2B-orange)  
![TestNG](https://img.shields.io/badge/TestNG-7.8-blue)  
![License](https://img.shields.io/badge/License-MIT-blue)  

> **EduTestify** is a full-stack educational quiz platform with backend APIs, an interactive frontend quiz interface, automated testing using TestNG, and comprehensive HTML/JSON test reports.

---

## Table of Contents

- [Project Overview](#project-overview)  
- [Project Structure](#project-structure)  
- [Features](#features)  
- [Prerequisites](#prerequisites)  
- [Setup & Installation](#setup--installation)  
- [Running EduTestify](#running-edutestify)  
  - [Backend Server](#backend-server)  
  - [Frontend Quiz](#frontend-quiz)  
- [Running Automated Tests](#running-automated-tests)  
- [Test Reports](#test-reports)  
- [Notes](#notes)  
- [Author](#author)  
- [License](#license)  

---

## Project Overview

**EduTestify** is designed for students and educators to conduct quizzes online with:

1. **Backend:** Node.js server handling quiz data and APIs.  
2. **Frontend:** Interactive HTML/CSS/JS quiz interface.  
3. **Testing:** Automated testing using TestNG, Selenium WebDriver, and ChromeDriver.  
4. **Reporting:** HTML and JSON test reports for easy analysis.

---

## Project Structure

```
EduTestify/
│
├─ backend/                     
│  ├─ data/                     
│  ├─ node_modules/             
│  ├─ routes/                   
│  ├─ utils/                     
│  ├─ server.js                 
│  ├─ package.json               
│  └─ package-lock.json
│
├─ frontend/                     
│  ├─ index.html                 
│  ├─ style.css                  
│  └─ script.js                  
│
├─ libs/                         
│  ├─ testng.jar                 
│  ├─ opentelemetry.jar          
│  ├─ slf4j.jar                  
│  └─ --                         
│
├─ node_modules/                 
│  └─ --                         
│
├─ src/
│  ├─ testoutput/                
│  │   ├─ index.html             
│  │   └─ --                     
│  ├─ chromedriver.exe            
│  └─ testlistener/               
│      └─ --
│
├─ testing.xml                   
├─ results.json                  
├─ package.json                  
├─ package-lock.json
└─ README.md                     
```

> ⚡ **Note:** Files inside `testoutput/` and `node_modules/` are auto-generated or dependencies. Keep them intact for proper execution.

---

## Features

- Interactive quiz interface with multiple-choice questions.  
- Node.js backend with modular routes and utilities.  
- Automated testing using **TestNG** and **Selenium WebDriver**.  
- HTML and JSON reports for easy test analysis.  
- Fully modular and maintainable structure for scalability.

---

## Prerequisites

- [Node.js](https://nodejs.org/) (v14 or higher)  
- [Java JDK](https://www.oracle.com/java/technologies/downloads/) (v11 or higher)  
- [Chrome Browser](https://www.google.com/chrome/)  
- Maven or included JAR dependencies (`libs/`)  

---

## Setup & Installation

1. Clone the repository:

```bash
git clone <your-repository-url>
cd EduTestify
```

2. Install backend dependencies:

```bash
cd backend
npm install
```

3. Ensure `chromedriver.exe` in `src/` matches your Chrome version.  

4. Keep all JAR files in `libs/` for automated testing.

---

## Running EduTestify

### Backend Server

```bash
cd backend
node server.js
```

- The server will start at `http://localhost:3000` (default port).  
- API endpoints are available under `/routes`.

### Frontend Quiz

- Open `frontend/index.html` in your browser to access the quiz interface.  

---

## Running Automated Tests

1. Make sure **JAR files** are in `libs/`.  
2. Run TestNG from command line:

```bash
java -cp "libs/*;src" org.testng.TestNG testing.xml
```

3. Test execution will automatically generate reports in `src/testoutput/`.

---

## Test Reports

- **HTML Report:** `src/testoutput/index.html`  
  Open this file in a browser to view detailed test execution results.  

- **JSON Report:** `results.json`  
  Useful for CI/CD integrations or further data processing.

---

## Notes

- Do **not delete** `chromedriver.exe`; required for Selenium.  
- Keep `libs/` folder intact to avoid missing JAR errors.  
- Files in `testoutput/` are **auto-generated** after tests; manual edits may break reports.  

---

## Author

**Ritika Dhanda**  
- Email: [ritikadhanda6@gmail.com](mailto:ritikadhanda6@gmail.com)  
- GitHub: [ritika-dhanda](https://github.com/ritika-dhanda)  

---

## License

This project is licensed under the **MIT License**.  
