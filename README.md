# Diha Agency API

This is an API made with Spring, about Travel Management.

How to use it ?

 1) You must have Java installed on your computer/laptop.
  > I use Java 18 and JDK 18
  
 2) Clone the repository :
 
 ```sh
    https://github.com/Sanmandresy/diha-agency-api.git
 ```
 
 3) Install all the necessary maven dependencies.
 
 4) You can run the project with whatever IDE you use.
 
 5) Make sure that you have PostgreSQL installed on your computer.
 
 6) The project will be running on the port 8080, which is TomCat port.
 
 7) You need to create the database "diha" and specify your connection to it (username,password,database_url) within the environment variables.
 
 8) To test if the API is responding to your call :
 
    - If you just use your Browser then go to **http://localhost:8080/hello**
    - If you have Postman installed, then do a GET Request to **http://localhost:8080/hello_there**
   
  > These two will render the same output : "General Kenobi !".
  
 9) To have access to all available endpoints:
  
  - You must do a POST Request to **http://localhost:8080/admin** (that request is available in the Admin folder in postman)
  - After receiving a successfull response, you just need to use Basic Auth with the credentials you just added to the database to execute all the available requests.
  
 10) To see the api documentation, you can check it in the folder "doc" or follow this link  [Diha Agency API](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/Sanmandresy/diha-agency-api/master/doc/api.yaml)
