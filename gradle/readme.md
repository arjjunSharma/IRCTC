# 🚆 Train Ticket Booking System

A console-based Train Ticket Booking System written in **Java**, using **Gradle** for build automation and **Jackson** for JSON processing.
It supports user registration, login, booking tickets, and searching for trains.

---

## 🧠 Features

- User Sign-up/Login
- Search Trains
- Book a Ticket
- Cancel Booking
- Fetch All Bookings
- Password hashing with BCrypt

---

## 📁 Project Structure

IRCTC/
├── app/
│ ├── src/
│ │ └── main/
│ │ └── java/ticket/booking/...
│ ├── build.gradle
├── build.gradle
├── settings.gradle
├── run.sh
└── README.me

---

## 🛠️ Technologies Used

- Java 8+
- Gradle
- Jackson (for JSON serialization/deserialization)
- jBCrypt (for password hashing)

---

## 🚀 How to Run

### ▶️ 1. Run using Gradle (Recommended)
```bash 
./gradlew run
**⚠️ Note: Make sure your terminal supports input via Scanner. Some IDEs or background terminals may cause NoSuchElementException.**


🏗️ 2. Create and Run Fat JAR (All-in-one)
bash
Copy
Edit
./gradlew shadowJar
java -jar app/build/libs/app-all.jar
This bundles all dependencies (Jackson, BCrypt, etc.) into one JAR.

🔧 3. Run Without Fat JAR (Manual classpath method)
Step 1: Copy dependencies to /libs
Add this to app/build.gradle:

groovy
Copy
Edit
task copyRuntimeLibs(type: Copy) {
    from configurations.runtimeClasspath
    into "$buildDir/libs"
}
```
Then run:(in bash shell)

./gradlew copyRuntimeLibs
Step 2: Run app with dependencies

   cd app/build/classes/java/main
   java -cp ".:../../../libs/*" ticket.booking.App
(Optional)
📝 Custom Script
You can use a run.sh to make execution easier:

#!/bin/bash
echo "Launching Train Booking System..."
java -jar app/build/libs/app-all.jar
Make it executable:

chmod +x run.sh
./run.sh
✅ To Do
 Add train data persistence (JSON/DB)

 Add GUI (JavaFX or web frontend)

 Add admin panel for train updates

🧑‍💻 Author
Arjun Sharma
passionate backend learner from 🇮🇳
Built with ❤️ and lots of curiosity.
