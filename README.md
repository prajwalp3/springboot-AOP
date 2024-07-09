## AOP in Spring Boot
This project demonstrates the use of Aspect-Oriented Programming (AOP) in a Spring Boot application to intercept function calls on standard libraries. AOP allows developers to inject additional behavior into existing code without modifying the original codebase. This is particularly useful for handling cross-cutting concerns such as logging, security, and transaction management.

### Key Concepts in AOP:
-Aspect: A module that encapsulates a concern that cuts across multiple classes or methods.
-Joinpoint: A point in the execution of the program, such as method execution or exception handling, where an aspect can be applied.
-Pointcut: An expression that selects one or more joinpoints where advice should be applied.
-Advice: Code that is executed at a selected joinpoint. Types of advice include "before," "after," and "around" advice.
-Weaving: The process of applying aspects to a target object to create a new proxy object with the added behavior.

### Features:
-Logging Aspects: Intercepts method calls to log execution details.
-Security Aspects: Checks user authentication and authorization at method execution points.
-Transaction Management: Manages database transactions declaratively.
-Dynamic and CGLIB Proxies: Demonstrates the use of dynamic proxies and CGLIB proxies for creating proxy objects.

### Technologies Used:
Spring Boot
Spring AOP
AspectJ
Java
