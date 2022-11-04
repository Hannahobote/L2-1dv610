# Kapitel reflektioner

## Chapter 2, meaningful names
 This chapter has really affected me, because before I didn't take into account following the rule about **"intention revealing names"**, or **make meaningful distinctions**. I usually had many variables with the same or similar names, but did completely different things, and this was confusing for both for me and the teacher. I think these two rules go hand in hand. I usually had conflict between **readability** and **understandability**, when I tried to have **intention revealing names**, because it led to long detailed function names, however, it was not readable according to the **readability** perspective.

## Chapter 3, Functions
The rules in this chapter were one of the hardest to implement, becuase I’m so used to having nested if statements upon if statements . It was really hard keeping the code **small** and have it **do one thing**. What helped my my functions to be **small** and only **do one thing** is the fact that i **used descriptive names**. This forces me to stick to the name. If I promised a function should so a certain task, then it should only do that. I also tried to make my code as **dry** as possible by using the mvc pattern. Overall I agree with everything in this chapter . I also have a lot of **dyadic** and **triad function arguments**, which is still a problem i am dealing with.

(picture of dyadic and triad funtions)

## Chapter 4, Comments
Yes, I used to make up for my bad code by having really good comments. But even if I read those comments now, they still don’t explain enough to supplement for having written bad code. So I wholeheartedly agree with the fact that **comments do not make up for bad code**. I think there’s a conflict between writing comments and not having them at all, because its required by most lectures, but then again, a **descriptive function** name and an **intention revealing variable** name, can actually say exactly what a comment is trying to say. The code explains itself by just looking at it (following the **“explain yourself in code rule”**). But lint packages like eslint for javaScript or checkstyles for Java require us to write comments, or else our code will simply not build. I agree with the majority of the rules, but it’s conflicting with other chapters (like ch.2 and 3). Most of my comments ends up being **mumbling** and **redundant** comments.


## Chapter 5, Formatting
I’ve had a hard time with formatting since every project has different rules and for some, formatting is not looked upon at all. I do agree with the rule of **vertical density** and **vertical openness**, which I’ve tried to implement for this project. This helps a lot with **readability** , instead of having a lot of code clumped together. I do think the formatting rules (and overall clean code) is very subjective and some of the rules cannot be used for every project and lecturer. **Indentation** heavily depends on the project your working on and which coding standards is required for that project. Also all lecturers have different preference, so it could be hard to implement.

### Chapter 6, Object and data structures
I think the rules in this chapter is important because the rules helps implement encapsulation in most places of the code. **The law of demeter** help with that, by hiding data and exposing operation, which keeps the implementation hidden. A problem I had in this project was not being able to follow the **train wreck** rule. I have a single line of code that calls method upon method, which could be separated by some variables.

(train wreck example here)