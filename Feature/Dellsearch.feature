@sc2
Feature:  user want to visit dell web page and verify search

 In order to verify search 
 as a register user 
 i want to visit dell web page and write a text in search box then search
  
 Scenario Outline: 
 Given  user visits dell home page
 And    user will search by "<productname>" 
 Then   user clicks on search button
 
Examples:
| productname| 
| HP Laptop |


