# Earthquake Risk Prediction System (Java)

A Java-based real-time earthquake risk prediction system that simulates seismic readings and classifies earthquake risk levels using predefined magnitude thresholds.  
This project is designed to demonstrate Java fundamentals, clean architecture, and real-world domain logic inspired by geology and seismology.


# Project Overview

Earthquake prediction is a complex scientific challenge.  
This project focuses on **earthquake risk classification**, not exact prediction, which is a realistic and industry-accepted approach.

The system:
- Simulates incoming seismic readings
- Classifies earthquake risk levels
- Maintains a prediction history
- Is designed to be extensible for Machine Learning, GIS, and real-time data integration


# Features

-  Real-time seismic reading simulation
-  Risk classification based on magnitude
  - Low Risk
  - Moderate Risk
  - High Risk
-  Prediction history tracking (most recent first)
-  Modular Java package structure
-  Built using IntelliJ IDEA and Maven

# Risk Classification Logic

| Magnitude Range | Risk Level |
|---------------|----------|
| < 4.5 | Low Risk |
| 4.5 – 5.9 | Moderate Risk |
| ≥ 6.0 | High Risk |

# Technologies Used

- Java
- Maven
- IntelliJ IDEA
- Object-Oriented Programming (OOP)

# How to Run the Project

1. Clone or download the repository
2. Open the project in **IntelliJ IDEA**
3. Ensure JDK 11 or higher is installed
4. Run the `Main.java` file
5. View seismic risk predictions in the console

# Learning Outcomes

- Java project structuring with Maven
- Real-time simulation concepts
- Risk classification systems
- Clean and modular code design
- Domain-driven problem solving (Geology + Software Engineering)


# Disclaimer

This project is for educational and simulation purposes only.  
It does not claim to predict real-world earthquakes.


# Author

**Sarthak Satapathy**
