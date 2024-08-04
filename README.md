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

1. using Terminal window
2. Open the Editor where project is imported
3. Now right click on project and click on Show in Terminal
4. Type mvn clean test or mvn test and hit enter
**Method 2.**
1. Using TestNG.xml file
2. Open the Editor where project is imported
3. Search for testng.xml file in root.(/fitpeo_karan_SDET/testng.xml)
4. right click on file and run as testNG(All test performed with parallel classes)
