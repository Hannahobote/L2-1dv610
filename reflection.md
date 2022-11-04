# Kapitel reflektioner

## Chapter 2, meaningful names
 This chapter has really affected me, because before I didn't take into account following the rule about **intention revealing names**, or **make meaningful distinctions**. I usually had many variables with the same or similar names, but did completely different things, and this was confusing for both for me and the teacher. I think these two rules go hand in hand. I usually had conflict between **readability** and **understandability**, when I tried to have **intention revealing names**, because it led to long detailed function names, however, it was not readable according to the **readability** perspective.

## Chapter 3, Functions
The rules in this chapter were one of the hardest to implement, becuase I’m so used to having nested if statements upon if statements . It was really hard keeping the code **small** and have it **do one thing**. What helped my my functions to be **small** and only **do one thing** is the fact that i **used descriptive names**. This forces me to stick to the name. If I promised a function should so a certain task, then it should only do that. I also tried to make my code as **dry** as possible by using the mvc pattern. Overall I agree with everything in this chapter . I also have a lot of **dyadic** and **triad function arguments**, which is still a problem i am dealing with.  An example of dyadic and triad functions can be found in the [SimpleAuth controller](SimpleAuth/src/controller/SimpleAuth.java), I did it mostly because i couldn't find another way to do it, and in this scenerio, it made sence to have a dyadic function

```java
  public void signIn(String username, String password) throws Exception {
    checkIfUserExist(username);
    checkCorrectCredentials(username, password);
  }
```

## Chapter 4, Comments
Yes, I used to make up for my bad code by having really good comments. But even if I read those comments now, they still don’t explain enough to supplement for having written bad code. So I wholeheartedly agree with the fact that **comments do not make up for bad code**. I think there’s a conflict between writing comments and not having them at all, because its required by most lectures, but then again, a **descriptive function** name and an **intention revealing variable** name, can actually say exactly what a comment is trying to say. The code explains itself by just looking at it (following the **“explain yourself in code rule”**). But lint packages like eslint for javaScript or checkstyles for Java require us to write comments, or else our code will simply not build. I agree with the majority of the rules, but it’s conflicting with other chapters (like ch.2 and 3). Most of my comments ends up being **mumbling** and **redundant** comments.


## Chapter 5, Formatting
I’ve had a hard time with formatting since every project has different rules and for some, formatting is not looked upon at all. I do agree with the rule of **vertical density** and **vertical openness**, which I’ve tried to implement for this project. This helps a lot with **readability** , instead of having a lot of code clumped together. I do think the formatting rules (and overall clean code) is very subjective and some of the rules cannot be used for every project and lecturer. **Indentation** heavily depends on the project your working on and which coding standards is required for that project. Also all lecturers have different preference, so it could be hard to implement.

## Chapter 6, Object and data structures
I think the rules in this chapter is important because the rules helps implement encapsulation in most places of the code. **The law of demeter** help with that, by hiding data and exposing operation, which keeps the implementation hidden. A problem I had in this project was not being able to follow the **train wreck** rule. I have a single line of code that calls method upon method, which could be separated by some variables. an example of a train wreck can be found in the [controller](src/controller/App.java), the code looks like this:

```java
   public void printDatabase() {
    authView.printUserDatabase(auth.getAllUsers()); // <------ this line here 
    pickDashboard(auth.getCurrentUser().getUsername());  // <------ this line here 
  }
```

## Chapter 7, Error handeling
This chapter was useful because before, I used to just console.log an error instead of **throwing an exception**, or I would just **return null**, which lead to even more errors. I also had a problem with showing **assert** error to the end user, which was not useful since an end user would not be able to understand the the errors and they were not practical. One conflict I had was that I wanted to check something without doing anything in return, which led me to just returning null but not really handeling it. I had to refactor those code bits many time.

## Chapter 8, Boundaries
This chapter was hard to understand and implement. I can agree that there is some boundary in depending on third party code. I think **isolating your code** form the third party code is useful, but it would have been great if they showed a better code example of this. On the other hand, I can agree with learning the third party code by testing it **(rule: learning tests are better than free)**. This is also a quick way to check if the third party code has updated or not, before it breaks the code without any notice.

## Chapter 9, Unit test
Although I haven’t written any tests with a framework, I  must agree with the fact that the tests must be **clean** and that the most important thing it’s **readability**. I think that unit tests follows some of the same rules as the once in chapter 2. By keeping them **small**, **doing one thing** , which is similar to **one assert per test.** I did not use these rules in my code for this project, since i didn’t know how to approach it directly. I hope to learn it in our upcoming course.

## Chapter 10, Classes

For the first time, I understood the concept of **cohesion**. I don’t think I implemented it well in my classes, although I do agree with the rule of high cohesion, which helps keep the class small (i.e **maintaining cohesion results in many small classes**). I think my classes in labb 1 and 2 are small. however there is no direct numeric limit on how much is too much code in one class, so i think this rule can be very subjective. Since this project was small, my controller class has been small as well, but they are usually over 400 lines long, and therefore holds too many responsibilities.

## Chapter 11, Systems
Since I did not fully understand the usage of systems, I didn’t implement it in my code. From what I understood, its main point is to stay “clean on a higher level of abstraction”. An example I saw was using the factory patter, which I have used before in other projects, but I had no use of it in this project. One thing i did take away form this chapter was the use of **separation of concern**, which I did through the MVC pattern and classes that have related code.