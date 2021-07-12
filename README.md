# JPACRUDProject

##Overview
This full stack Java Spring Boot web application allows a user to to interact with a paraglider manufacturer database. A user can choose from a menu of options to view specific manufacturer information by searching by id, search by country and more. A user can also add new manufacturers to the database and edit or delete information in the database. The user views information presented dynamically based on user input.

##Technologies Used
Back end
Framework: Spring Boot
IDE: Eclipse
Solution Stack: MAMP
Web Server: Apache Tomcat v8.5
Build Automation & Dependency Manager: Gradle
Database Service: MySQL Workbench
Front End
Bootstrap
CSS
XML
Design Patterns
MVC (Model View Controller)
DAO (Database Access Object)
Lessons Learned
DAO: How to isolate entities that use data, access data, and persist data.
Relational mapping: How to link Java objects to the database.
JSP: How to write JPQL queries.
Further learned Bootstrap and the JSP language to provide the user interface.
How to apply the MVC design pattern.
#How To Operate the Website
A user is presented with the options to:
1. Search by Manufacturer ID
- Enter an id number (This number can be found by pressing the List All Manufacturers button) and pressing enter.
- After pressing pressing search button the user is displayed with the details of the manufacturer.
2. Search Manufacturer by country
- Enter a country name i.e. "Switzerland" to find manufacturers in a particular country.
- After pressing search the user is displayed manufacturers of that particular country.
3. List All manufacturers
- After pressing this the user is presented a list of all manufacturers.
4. Add Manufacturer
-After pressing this button the user is presented a form to enter the details of a
new manufacturer. After pressing Add Manufacturer, the new manufacturer will be added to the database.
