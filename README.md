# Rabbit Simulator

## Participants

Jack, Conor, Thanu, Emese, Tyler, James

## Trello Board

https://trello.com/b/2GxosGo3/rabbit-simulator

## Overview

This program simulates rabbits breeding, dying as well as the introduction of foxes (who also breed and die). The user inputs how long they would like the program to run in months (where one month is one second in real time) and finally outputs the following:

* Number of male rabbits alive

* Number of female rabbits alive

* Number of male foxes alive

* Number of female foxes alive

* Number of rabbits that have died (natural death and eaten)

## Future Improvements

If we had more time, some future features could include:

* Implementation of JDBC in order to make the program more efficient at high number of rabbit objects

* Variables for starting number of rabbits/foxes as well as breeding frequency, random chance percentage and changing number of offspring

* Create a more user friendly application rather than doing all in the console

# Rabbit Simulator Sprint Records

## Monday Afternoon- Scrum master: James




## Tuesday Morning - Scrum Master: Emese


### 9am morning stand-up: 

* make sprints longer

* set up gitHub yesterday -> create branches for everyone

* apply a more TDD approach 

* have a more clear definition of done at the end of the sprints

### 1st sprint (9:20 - 10:20):

Goals: 

* use git - (everyone, but mainly Jack and Conor)

* add Field class for rabbits to be created in - (Tyler, Emese)

* Run tests on what we have done so far (rabbit class) and see if it works

* merge the rabbit counter classes 

Sprint: 

* use git (blocker)  - issue: we don't know how to merge branches

* field class added - on Tyler's branch

* Tests run ( works on Tyler's branch) 

* Thanu and James reviewed the tests we have so far and added new ones

* merge the rabbit counter classes - due to blockers with git, moved this to a later sprint

Sprint review (10:25-10:38): 

* concentrate on creating a working tested code in next sprint

* refactor later

* start next sprint with 10 git best practice 

### 2nd sprint (10:53 - 11:10):

Goals:

* short sprint to discuss git best practice that everyone can follow so that we can move on

Sprint: 

* James had a technical issue and had to reinstall git.

* Added *.xml to gitignore file because it was cuasing git issues while merging. 

* But other than that we are now up to date with git.

* From now on, we will create branches for new features (so far we just created them based on names but we won't use those from now on).

* Meanwhile: Thanu and James merged the rabbit counter classes into one.

## 3rd Sprint (11:30 - 12:30) 

Goals: 

* Time Dependent methods Implementation - (James and Thanu)

* Threads: on simulating time flow and one handling rabbits - (Jack and Conor) - decide if we actually need this

* Rabbit states: age the rabbits method - (Tyler and Emese) 

Sprint: 

* getPregnant() and giveBirth methods were added to Rabbit class so that they can change states (tests all passed).

* Jack and Conor discussed the logic of the CreateOffspring logic 

* we won't multiple threads for time implemetation, we will use a timer class  

* James and Thanu mostly finished the time dependent methods implementation, finish up in sprint

Review: 

* need to start thinking about effciency and refactoring 

* need to make it more clear what each task includes at the start of the sprint so we don't make conflicting methods

## Tuesday Afternoon - Scrum Master: Jack

## 4th Sprint (13:46 - 14:46) 

Goals: 

* Implement TimeSimulator.class - (Conor and Jack)

* Implement breeding method - (Emese and Tyler)

* Implement dead rabbit counter - (Thanu and James) 

Sprint: 

* breed() method successfully implemented and tested

* Dead rabbit counter implemented successfully and tested 

* TimeSimulator implemented partially. Not tested due to a bug. Will need to finish in next sprint 

Review: 

* Team happy with how spring went and was able to get a lot done within the hour. 

## 5th Sprint (15:05 - 15:50)

Goals: 

* Refacotor and fix breeding error (Emese and Tyler)

* Fix TimeSimulator and test (Conor and Jack)

* Implenment user output within the program (Thanu and James) 

Sprint: 

* breed() method successfully fixed and tests completed.

* TimeSimulator class implemented and tested.

* User Output tested and implemented.

Review: 

* Team happy with final result of sprint. Managed to get all bugs ironed out and got a working version up.

## Wednesday Morning - Scrum Master: Conor

## Sprint 09:20-09:40

Goals: 

* Making sure everyone is on the same page

Sprint: 

* going through what was added late on Tuesday night (Everyone)


Review: 

* Team happy with where the project is currently

## Sprint (45 Minutes)

Goals: 

* Making the CheckTimerRuns test bug is squashed

* Making the 'Rabbits Breeding before they are mature' bug is also dealt with

Sprint: 

* CheckTimerRuns test (Tyler and Conor)

* Rabbits breeding in the second month bug (Emese and Jack)

* Implementing the Female Rabbits having a 50% chance of getting pregnant (Thanu and James)

* Implementing a cooldown for the Male Rabbits (Tyler and Conor)


Review: 

* Team worked well in this sprint we accomplished the sprint goals

* We talked at the end of the sprint about the male allocation and decided that what we had initially done it the right way, so we will be reverting the male allocation change


## Sprint (1 hour 15 Minutes)

Goals: 

* Implementing the counters

* Squashing the 50% pregnant bug

Sprint: 

* Squashing the 50% pregnant bug (Thanu, James and Tyler)

* Refactoring the breeding method (Emese and Jack)

* Implementing the actual counters (Tyler and Conor)

* Started looking at strenuous testing of the program (Tyler and Conor)


Review: 

* Team worked hard in this sprint but we were unable to fully complete the refactoring sprint goal and also the 50% pregnant bug still exists

* The uncompleted tasks will roll over into the afternoon.

* We also tested the program to see where the limit is, and we got to about 32 months before the program runs out of memory space

## Wednesday Afternoon - Scrum Master: Thanu

##  Sprint (14:00 - 15:15) 

Goals: 

* Further refactor the breeding method.

* Fix the phase-2 task - 50/50 rabbit breeding chance.

Sprint: 

* Refactor the breeding method, should be completed. (Jack, Emese, Conor, and Tyler).

* Phase-2 second task (50% chance of breeding) should be successfully fixed and completed. (Thanu and James).

Review: 

* Whole team was happy with how the sprint went. Also was able to get the '50% chance of breeding' completed. The refactoring the breeding method was completed.

## Sprint (15:30 - 16:45)

Goals: 

* Refactor other methods and classes.

* Implement user input within the program.

Sprint: 

* Refactor other methods and classes in order to make the program more efficent. (Jack, Emese, Conor, and Tyler).

* User input should be completed. This is where the user should be able to provide an input to specify how many months the program should run for. (Thanu and James).

Review: 

* Team happy with final result of sprint. Managed to complete the user input. Also the refactoring was completed too, which resulted in making the program more effiecent. (So from taking 24 minutes for 24 months, to about 1 minute for 24 months). 

## Thursday Morning - Scrum Master: Tyler
## Sprint 1 - (11am - 12.30pm)

* Add fox class, similar to rabbit class (James and Thanu)

* Add a fox field, similar to the field for rabbits (Tyler and Emese)

* Investigate whether/how we can implement JDBC/Database into the program (Jack)

* Start working on the killing method/implementation (Conor)

Review:

* Took a while to get started because of working remotely but managed to complete most of the goals

* Some slight github merging delays but also completed

* Decided it should be ok to use JDBC so will begin attempted implementation in the next sprint

## Sprint 2 - (12.30pm - 1.30pm)

* Fix tests and added more for the new fox and foxfield classes (Tyler and Emese)

* Continue working on killing method, decided to split it into two to make it easier (Conor)

* Begin implementation of JDBC (Jack)

* Work on the Fox Counter (Thanu and James)

Review:

* All tasks done other than killing method as this was more complicated than expected, so splitting it between three next sprint.

* Jack has done the start of the JDBC implementation, slight issue but confident knows a fix.

## Sprint 3 (1.30pm - 3pm)

* Work on killing method (Conor, Tyler and Emese)

* Continue JDBC implementation (Jack)

Review:

* Killing method #2 done (killing the rabbits), still doing #1 (determining how many to kill) in next sprint

## Sprint 4 (3pm - 4.15pm)

* Finish the killing method and merge and then make sure it's implemented (Tyler, Conor and Emese)

* Work on user output implementation (adding foxes and dead things) (James and Thanu)

* Continue JDBC implementation (Jack)

Review: 

* Done the killing method, but now rabbits die immediately (whether that's intended or not)

* Counters are done

## Sprint 5 (4.15pm - 5.15pm)

* Test the counters and fully implement them (Conor, Tyler, Emese, Thanu, James)

* Continue JDBC implementation (Jack)

Review:

* Counters now implemented (fixed bug where manually set genders didn't go onto the counters, now will need to adjust the tests potentially)

* Database seems to be going okay but won't know until we attempt implementation

* There was a bug in the fox hunting but only happened once and hard to find - so will look into it

## Friday Morning - Scrum Master: Tyler

## Sprint 1 (9.30am - 10.30am)

* Create an abstract class for Fox and Rabbit as Animal to cut repeated code (Thanu and Tyler)

* Investigate how to measure code coverage and begin that (Conor)

* Last attempt at making the database more efficient to use in the program (Jack)

* Fix and expand the breeding tests (Emese)

Review:

* All done, although not sure whether database will be completed by the deadline

* Need to correct bug in program where foxes are breeding beginning in month 12 and not month 10

## Sprint 2 (10.30am - 11.30am)

* Increasing code coverage by writing tests (All)

Review:

* Got up to 78% code coverage but due to time constraints couldn't get any further

## Sprint 3 (11.30am - 12pm)

* Fix final few errors (foxes not breeding/concurrent modification exception) - All

* Write up readme file

Review:

* Final project on github, need to add readme file still
