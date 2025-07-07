# REST-API-CLIENT

COMPANY: CODTECHIT SOLUTIONS

NAME: YASHVI BHALA

INTERNID: YASHVI38684

DOMAIN: JAVA 

DURATION: 6 WEEKS

MENTOR: NEELA SANTOSH

##REPORT ON REST API CLIENT

🎯 Objective of the Task
The main goal of Task 2 was to design a Java application that could interact with a public REST API, retrieve live weather data, and display the results in a structured format. This task was assigned to give practical exposure to RESTful APIs, JSON parsing, HTTP requests, and handling responses in Java. The system needed to be dynamic and user-interactive, allowing any user to fetch real-time weather information by entering a city name.
This task contributes to a better understanding of how backend systems communicate with APIs and how Java can be used in web-connected environments.

🔧 Technologies and Libraries Used
Java SE 8+
HTTPURLConnection – to perform HTTP GET requests
OpenWeatherMap REST API – public weather API used to fetch weather data
org.json library – to parse and manipulate JSON responses
Scanner – for capturing user input from the console

📜 Program Flow and Structure
The program follows a console-based interactive approach. Here's how it works:
The user is prompted to enter a city name.
The program dynamically forms a request URL using the OpenWeatherMap API and includes the API key and city name.
A GET request is sent to the server.
The JSON response is parsed using org.json to extract:
Temperature
Feels-like temperature
Weather condition description
The output is displayed to the user in a friendly, readable format.
The user can keep querying multiple cities or exit the program at any time.

🧠 Key Concepts Demonstrated
Concept	Implementation
REST API interaction	HttpURLConnection with dynamic URLs
JSON Parsing in Java	Using org.json.JSONObject and JSONArray
Input handling	Scanner to capture user city names
Error handling	Graceful messaging for invalid cities/responses
Loop control & logic	User remains in control of session

🧩 Why This Task is Important
This task is vital because modern software often integrates external services to provide meaningful experiences. Fetching live weather data demonstrates how applications can interact with third-party services in real time. It simulates real-world software behavior and prepares the developer for building scalable applications using APIs and HTTP.
The ability to consume APIs, parse JSON, and manage real-time data requests is a core requirement for backend developers, mobile app development, and enterprise-level systems.

✅ Task Outcome
The Java program met all the requirements:
User can input any city
Live weather data is retrieved and displayed
JSON response is parsed accurately
Errors like city not found or API issues are handled smoothly
The code is structured, commented, and fully functional. It provides a smooth user experience with useful prompts and instructions.

📁 Deliverables Submitted
InteractiveWeatherClient.java: The complete Java file with interactive weather querying capability
Instructions to compile and run the program, along with API key placement
Integration-ready for further UI or logging improvements

📘 Conclusion
Task 2 provided valuable hands-on experience with REST APIs and taught the practical aspects of HTTP request/response cycles, working with JSON data in Java, and making applications dynamic with real-time input. This project improves skills that are directly transferable to real-world full-stack or backend developer roles. It was a successful and insightful exercise under the CodTech Java Internship.

output: 
![Image](https://github.com/user-attachments/assets/19aa5b1e-b07a-4e36-8946-267f157800bf)

![Image](https://github.com/user-attachments/assets/93ec3c88-5c43-4b08-a7f5-67ca7a378b19)
