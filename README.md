# fitpeo_karan_SDET
#Note: This project is made with TestNG framework with Maven as build automation tool . 
Language used for Selenium test is Java.

**This is a user guide to run the Fitpeo functional test**
#Steps to run the code, Below steps performed on Eclipse
1. Open any Editor for eg. IntelliJ or Eclipse
2. Go to New->Project->Import from Git
3. Copy paste the git URL , https://github.com/asksleo/fitpeo_karan_SDET.git
4. Click on Finish
**#Now the Steps to run the above code**
#There are two ways it can be run
**Method 1.**
#using Terminal window
#Open the Editor where project is imported
#Now right click on project and click on Show in Terminal
#Type mvn clean test or mvn test and hit enter
**Method 2.**
#Using TestNG.xml file
#Open the Editor where project is imported
#Search for testng.xml file in root.(/fitpeo_karan_SDET/testng.xml)
#right click on file and run as testNG(All test performed with parallel classes)
