# i2i Academy - Spring Boot Project

## About This Project
This is a basic Spring Boot project for the i2i Systems Summer Internship. It has a simple web page that shows a welcome message. I tested it on my local machine first, and then I successfully deployed it to a Google Cloud server.

## Technologies
* Java 21
* Spring Boot
* Maven
* Google Cloud (Debian VM)
* Git

## Prerequisites
* Java 21 installed
* Git installed

## How to Run Locally
1. Download the project:
git clone https://github.com/zeliiss/i2i-Academy-SpringBoot-4.git

2. Go to the project folder:
cd i2i-Academy-SpringBoot-4

3. Make the file executable:
chmod +x mvnw

4. Run the project:
./mvnw spring-boot:run

5. Open your browser and go to:
http://localhost:8080

## Cloud Server (Google Cloud VM)
I deployed and tested this project on a Google Cloud Virtual Machine. I connected to the Debian server using SSH, installed the required tools (Java 21 and Git), and downloaded my project code from GitHub to the server. The project successfully ran on port 8080 using the server's external IP address.
