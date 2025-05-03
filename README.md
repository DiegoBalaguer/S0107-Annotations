# S01.07 - Java Annotations & JSON Serialization

---

# 🎯 Objectives

- Understand how **Java annotations** work.
- Learn to override methods and recognize deprecated ones.
- Create and use **custom annotations** to control serialization behavior.
- Use **Java Reflection** to access metadata at runtime.
- Apply **Jackson** to serialize and deserialize objects in JSON format.

---

## 🔹 Level 1

### 📘 Exercise 1 - Worker Hierarchy and `@Override`

Create a class hierarchy with three classes:

- `Worker` (base class)
- `RemoteWorker` (child)
- `OnsiteWorker` (child)

The `Worker` class should have the attributes: `name`, `surname`, `hourlyRate`, and a method `calculateSalary()` that receives the number of hours worked and returns the result of multiplying by `hourlyRate`.

Child classes must **override** this method using the `@Override` annotation:

- `OnsiteWorker` adds a static `gasoline` cost to the final calculation.
- `RemoteWorker` includes a constant representing the flat-rate internet fee in the calculation.

In the `main()` method of the class `Principal`, demonstrate the behavior of overridden methods.

---

### 📘 Exercise 2 - Deprecated Methods

Add some **deprecated methods** to the child classes and use the `@Deprecated` annotation.

From an external class, call these methods and **suppress warnings** using the appropriate annotation (e.g., `@SuppressWarnings("deprecation")`).

---

## 🔹 Level 2

### 📘 Exercise 1 - Custom Annotation for JSON Output

Create a **custom annotation** that allows an object to be serialized to a JSON file.

The annotation must accept a **directory path** as a parameter, indicating where the output file should be saved.

Serialization is performed using the **Jackson** library.

---

## 🔹 Level 3

### 📘 Exercise 1 - Runtime Annotation Processing

Update the custom annotation so that it can be **retained at runtime**.

Use **Java Reflection** to access and read the annotation metadata during execution, and verify that the information is being used correctly (e.g., to control the output location of JSON serialization).

---

# 🛠️ Technologies Used

- Java 21
- Jackson (com.fasterxml.jackson.core)
- Custom Java Annotations
- Reflection API
- Maven

---

## ⚙️ Installation & Execution

### 📋 Requirements

To run this project, you need:

- Java Development Kit (JDK) 21 or higher
- Maven
- Eclipse or IntelliJ IDEA
- Git

---

### 🛠️ Installation

1. Make sure **JDK 21** or higher is installed.
2. Clone this repository:
   ```sh
   git clone <👉 https://github.com/DiegoBalaguer/S0107-Annotations.git>
   ```
3. Open the project with your preferred IDE (Eclipse or IntelliJ).
4. Build the project with Maven:
   ```sh
   mvn clean install
   ```

---

### ▶️ Execution

1. From your IDE:
   - Open the `main()` method in the `Principal` class or any exercise class.
   - Run the file directly using your IDE's run configuration.

2. (Optional) From the command line:
   ```sh
   mvn exec:java -Dexec.mainClass="package.name.Principal"
   ```

---

# 🌐 Deployment

This project is for **educational purposes** and is intended for **local development only**. No deployment or external environment is required.

---

## 📦 Repository

You can find the full source code on GitHub:
🔗 👉 https://github.com/DiegoBalaguer/S0107-Annotations.git

---

## ✅ Author Notes

These exercises are designed to give you practical experience with Java annotations, inheritance, and reflection, while integrating real-world tools like Jackson for serialization.

Feel free to explore, modify, and expand upon the base code!

Happy coding! 🚀
