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



