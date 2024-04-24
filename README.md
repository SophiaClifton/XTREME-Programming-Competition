# BracketOps Challenge

My java solution is attached above as  BracketOps_Challenge.java

## Challenge Description

In this advanced challenge, participants are tasked to create a BracketOps Resolver that evaluates complex mathematical expressions where the type of bracket dictates the operation to be performed on the numbers enclosed. The four types of brackets are: parentheses (), square brackets [], curly braces {}, and angle brackets <>. Each type of bracket represents a different arithmetic operation as follows:
- Parentheses () imply addition (+)
- Square brackets [] imply subtraction (-)
- Curly braces {} imply multiplication (*)
- Angle brackets <> imply division (/)

The expressions will not contain any explicit arithmetic operators; instead, the type of brackets used will implicitly determine the operations to be performed. Nested brackets and mixed operations are allowed, adding layers of complexity to the challenge.

## Input
A string representing a complex mathematical expression using the four types of brackets to indicate operations, along with integers and floating-point numbers.

## Output
The output should be the result of the evaluated expression as a float, rounded to four decimal places.

## Constraints
- The expression will always be valid and not exceed 200 characters.
- Handle division by zero with an appropriate error message or value.
- Operations must respect the mathematical rules of precedence, with any operation enclosed in brackets being performed first, followed by the precedence of the bracket types as listed (from parentheses to angle brackets).
- Assume all operations are binary (involving two operands) and that the unary minus (negation) is not used.

## Example
Input: {[9 3] 2}
Explanation:
- The square brackets imply subtraction: [9 3] becomes 9 - 3 = 6.
- The curly braces imply multiplication: {6 2} becomes 6 * 2 = 12.
Output: "12"

## Challenge Tasks
1. **Parsing and Operation Assignment:** Implement a system to parse the input string and assign operations based on bracket type.
2. **Evaluation with Nested and Mixed Operations:** Create a method to evaluate expressions with nested and mixed brackets, properly handling the operations' precedence.
3. **Bracket Handling:** Use stacks or a similar data structure to manage the opening and closing of different types of brackets, ensuring that the operations are performed in the correct order.
4. **Complex Error Handling:** Develop thorough error handling for edge cases, such as division by zero or improper bracket nesting.

## Bonus Challenges
- Extend the challenge to include new bracket types representing exponentiation, factorial, and modulus operations, further increasing the complexity of expression evaluation.

