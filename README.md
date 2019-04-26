# Final-Year-Project-
Project for the module: APPLIED PROJECT AND MINOR DISSERTATION

## Project Overiew
The front end was developed using Angular with the Ionic Framework. Users will be able 
to view the club and user’s collections in the remote mongo database using a Spring based 
API. The mongo database is stored on Heroku Cloud Service using the M-Lab cloud application.
The API will expose the database to allow for CRUD requests to be performed.  


## How to run the project
Once the repository is cloned open your IDE in this case IntelliJ and import the Intouch spring project. 
When the project has been selected with Maven import project the snapshot should be able to be imported. 
JDK 8 was used for this project so ensure this is the version selected. Once that’s completed the project 
will open correctly. Select the IntouchApplication and click play to run the Spring API. This will get a 
handle of the remote mongo database on Heroku and open it to crud operations.

## How to Run Ionic
In order to run the ionic project locally, the latest tools and plugins will need to be installed. After cloning the repository, 
navigate to the Client folder in the terminal and run the commands 

    -npm install

This will install the packages and dependencies listed in the package.json file. Once errors have ceased to be thrown, run
the command 

    - ionic serve -l

This will open a browser tab where the Ionic application will be hosted. 