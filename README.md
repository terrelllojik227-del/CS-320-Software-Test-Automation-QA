# CS-320 Software Test, Automation, and Quality Assurance

This repository contains work from my CS-320 course at Southern New Hampshire University. I included the Contact Service from Project One and my summary and reflections report from Project Two. These projects focused on JUnit testing, automation, code coverage, and making sure the software actually matched the requirements.

## How can I ensure that my code, program, or software is functional and secure?

One thing this course made clear to me is that just because a program runs does not mean it is completely correct. I used JUnit to test both the things that should work and the things that should fail, like null values, duplicate IDs, invalid inputs, and values that were right at the limits. I also used JaCoCo to see how much of the code my tests were actually covering. Going forward, I would keep testing as I build instead of waiting until the end. I would also use things like code reviews, integration testing, and security testing as a project gets bigger. The more different situations I test, especially the bad ones, the more confident I can be that the software will behave the way I expect it to.

## How do I interpret user needs and incorporate them into a program?

I usually start with the requirements and break them down into specific things the program needs to do. That is what I did with the Contact, Task, and Appointment projects. If a requirement said an ID could not be more than 10 characters, I made sure I tested one at exactly 10 and another that was too long. I also think it is important to make sure the requirements actually match what the user is asking for. I have seen in my own IT work that something can work exactly the way it was built and still not be what the person really needed. Because of that, I think communication and getting feedback during the process are just as important as writing the code.

## How do I approach designing software?

I normally start by breaking the problem into smaller pieces and deciding what each part should be responsible for. In these projects, the object classes handled the data and validation, while the service classes handled things like adding, deleting, and updating the objects. Keeping those responsibilities separate made the code easier to understand and easier to test. I also try not to repeat the same logic in different places if I do not have to. Keeping validation in one place and reusing code where it makes sense makes the program easier to maintain and change later.
