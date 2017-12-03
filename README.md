# JAVA-PROJECT-3

Queens College
Computer Science Department
CS 212 – Fall 2016 – Project 3
Assigned: 9 November 2016
Due: 28 November 2016
Cutoff: 8 December 2016
1. Create a class hierarchy which has an abstract class called DateList (the same class as in project 2 but it is abstract). This class should have two subclasses: UnsortedDateList and SortedDateList, each having a method called add. In the UnsortedDateList the method add will add to the end of the list (append), and in the SortedDateList it will do an insert. So now, rather than in project 2 where you used two of the same kind of list (DateList) you will use one unsorted list and one sorted list.
2. Create a new exception called IllegalDate212Exception by extending lllegalArgumentException.
3. When you create a new Date212 from a String read from the input file, catch any exceptions thrown by the constructor and print the offending string to the console along with the message from the Exception.
4. Add a File menu to your GUI which has menu items for Open and Quit. You should now be able to select an input file using the GUI.
The format of the input file will be the same as Project 1.
Submitting the Project.
You should now have at least the following files to submit for this project:
Project3.java
Date212.java
DateGUI.java
DateNode.java
DateList.java
UnsortedDateList.java
SortedDateList.java
FileMenuHandler.java
IllegalDate212Exception.java
Submit a jar file.
Create a jar file called Project3.jar and submit and upload it to Blackboard by the due date for full credit.
