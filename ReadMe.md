# Getting Started

Just a quick note to let you know that there is a Bash and Git Cheat Sheet available in the repository. It's a handy reference guide, especially if you're still getting familiar with commands and workflows. Make sure to check it out!

* [Bash Command CheatSheet](./Part1-BashCommands.md)
* [Git CheatSheet](./Part2-GitCheatSheet.md)

## Your info
**Updating the `info.txt` File with Your Personal Information**

Follow the steps below to update the `info.txt` file with your personal details:

1. **Locate the File**:
   - Find the `info.txt` file in the designated folder or directory on your computer or shared platform.

2. **Open the File**:
3. **Edit the File**:
   - The file contains three lines, each dedicated to specific personal information. Ensure to only replace the placeholders with your details without altering the structure of the file.
   - Below are the lines and the instructions on how to edit each:

     a. **Full Name**:
     - Locate the line `your-full-name= Tariq Hook`.
     - Replace `Tariq Hook` with your own full name, ensuring that you don't add any extra spaces.
     Example: `your-full-name= John Doe`

     b. **GitHub Name**:
     - Locate the line `your-github-name = code-rhino`.
     - Replace `code-rhino` with your own GitHub username.
     Example: `your-github-name = mygithubuser123`

     c. **Email Address**:
     - Locate the line `your-email = thook@desu.edu`.
     - Replace `thook@desu.edu` with your own email address.
     Example: `your-email = johndoe@email.com`

4. **Save the File**:
   - After updating your information, click on "File" in the top menu and then select "Save" to save the changes to the `info.txt` file.

5. **Verify Your Changes**:
   - It's always a good practice to double-check your changes. Re-open the `info.txt` file and review the information you entered to ensure accuracy.

6. **Submission (push to git)**:
   Certainly! Here are step-by-step instructions to help a student add their changes to Git, write a commit message, and push to the main branch:

### 1. Navigate to Your Repository:
Using the terminal or command prompt, navigate to the directory where your Git repository is located.

```bash
cd path/to/your/repository
```

### 2. Check the Current Status:
Before adding changes, it's a good practice to check which files have been modified or are untracked.

```bash
git status
```

### 3. Add Changes:

- To add all the changes in the repository:
```bash
git add .
```

### 4. Commit Your Changes:

Once you've added the desired changes, you can commit them with a meaningful commit message.

```bash
git commit -m "Your meaningful commit message here"
```

Replace `"Your meaningful commit message here"` with a short and descriptive message about the changes you've made.

### 5. Push to the Main Branch:

- Finally, push your committed changes to the remote main branch:
```bash
git push origin main
```


Remember, Git is a powerful tool, and there are many additional features and commands to explore as you become more familiar with it. These instructions are just a starting point!
7. **Important Reminders**:
   - Do not add or delete any lines in the file.
   - Ensure that the structure of the file remains intact.
   - Do not use any special characters or formatting.

Once you've completed these steps, you've successfully updated the `info.txt` file with your personal information.
# Unit Testing

Imagine a factory where toys are assembled on a conveyor belt. At various stages along the belt, different parts are added to the toy, and by the end of the line, the toy should be fully assembled and working.

**Conveyor Belt Process:**

1. **Base Assembly**: The basic structure of the toy is placed on the conveyor belt.
2. **Attachment of Arms and Legs**: Robotic arms attach arms and legs to the toy.
3. **Painting**: The toy is painted with the right colors and designs.
4. **Quality Check**: Before packaging, the toy is checked to ensure it works properly (e.g., if it's a wind-up toy, does it walk?).

Now, let's relate this to unit testing:

1. **Base Assembly Test**: This would check if the base structure is correct. Does it have the required slots for arms and legs? Is it made of the right material? If this "unit test" fails, there's no point in moving on.

2. **Attachment Test**: Once arms and legs are attached, a test checks if they are secure. Are they in the right position? Can they move if they are supposed to?

3. **Painting Test**: After painting, a test checks if the right colors were used. Are the designs correct? Is the paint evenly spread without smudges?

4. **Quality Check Test**: This is a final unit test. If it's a wind-up toy, winding it up and seeing if it walks is a test. It checks the main functionality of the toy.

In software, **unit tests** are similar. Before moving to the next stage (or before adding more code), developers ensure that each small piece (or "unit") of the software is working as expected. Just like you wouldn't want to package and sell a toy that hasn't been checked for quality, developers don't want to release software without making sure each part works correctly on its own.

By testing each "unit" (like each stage of the toy assembly), problems can be identified and fixed early, ensuring the final product is of high quality.

### Running Test

### 2. Writing a JUnit 5 Test

1. Right-click on the `src/test/java` directory in your project.
2. Select `New > Java Class` and provide a name, e.g., `MyFirstJUnit5Test`.
3. In the newly created class, write a simple test:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstJUnit5Test {

    @Test
    void simpleTest() {
        int expected = 2;
        int actual = 1 + 1;
        assertEquals(expected, actual, "1 + 1 should equal 2");
    }
}
```

### 3. Running the Test from IntelliJ IDEA

1. **From the Editor**: If you've opened your test class, you will see green play icons next to the class name and next to each test method. Clicking these icons will give you options to run or debug the test or the whole test class.

2. **From the Project Sidebar**: You can navigate to your test class in the `src/test/java` directory in the project sidebar. Right-click on the test class and choose `Run 'MyFirstJUnit5Test'`.

3. **From the Test Runner Tool Window**: After running tests once, they'll appear in the test runner tool window. You can re-run tests from this window by clicking the play button or right-clicking and selecting the appropriate option.

### 4. Viewing Test Results

Once your tests run, IntelliJ IDEA will display the results in the test runner tool window. Successful tests will be marked with a green checkmark, while failing tests will have a red "x". You can click on individual tests to see more details, stack traces, and even quickly navigate to the test source code.

### Tips:

- Use the `@BeforeEach` and `@AfterEach` annotations for methods to run before/after each test.
- Use the `@BeforeAll` and `@AfterAll` annotations for methods to run once before/after all tests in the class.

Remember to always ensure your project dependencies are updated and correctly configured. If IntelliJ IDEA ever seems to have trouble recognizing your tests, ensure that your `src/test/java` directory is correctly marked as a Test Sources Root (right-click the directory > `Mark Directory as` > `Test Sources Root`).


# Part A - Scientific Calculator Lab

## Introduction

Welcome to the Scientific Calculator Lab! In this exercise, you'll be developing functionalities for a scientific calculator. This will test your understanding of Java and provide hands-on experience with implementing mathematical operations. But there's a twist! You'll need to ensure that your methods are working correctly by creating and running unit tests.

## Prerequisites

- Java SDK installed
- Familiarity with basic mathematical operations
- An Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse
- A basic understanding of JUnit testing (JUnit5 is recommended)

## Instructions

1. **Clone the Repository**:
   Clone the lab repository to your local machine. This repository contains a starter code for the `ScientificCalculator` class and its unit tests.

2. **Open the Project**:
   Open the cloned project in your preferred IDE.

3. **Implement the Calculator**:
   Navigate to the `ScientificCalculator` class. Here, you'll find a number of methods with placeholders and comments. Your task is to complete each method according to its comment.

4. **Testing**:
   After implementing a method in the `ScientificCalculator` class, navigate to the associated unit test. Run the test to verify that your method is working correctly.

   For example, after completing the `add` method, run the `testAdd` method in the `ScientificCalculatorTest` class to ensure that your implementation of addition is correct.

   It's crucial to test after implementing each method to ensure that each function works correctly and independently of the others.

5. **Handle Edge Cases**:
   Pay close attention to the comments within each method. Some methods require handling specific scenarios (like division by zero). Make sure your methods are robust enough to handle these edge cases without crashing.

6. **Refactor**:
   After passing a test, take a moment to look at your code. Can you make it more efficient or readable? Refactoring is an essential step in the development process. It ensures that your code is not only functional but also clean and maintainable.

7. **Complete All Methods**:
   Work your way through all the methods in the `ScientificCalculator` class, ensuring each one is implemented and passes its associated test.

8. **Submission**:
   Once all methods are implemented and all tests pass, commit and push your changes to the repository. This will be your submission for the lab.

## Tips

- **Use Java's Math Library**: The Java standard library has a `Math` class with many useful methods. This can be especially handy for trigonometric functions.

- **Read Error Messages**: If a test fails, read the error message thoroughly. It will often provide clues about what's wrong with your implementation.

- **Ask for Help**: If you're stuck on a particular method or test, don't hesitate to ask your peers or instructor for help.

## Conclusion

By the end of this lab, you should have a working scientific calculator and corresponding tests to verify its accuracy. This lab emphasizes the importance of testing in software development. A working program is great, but a well-tested program ensures reliability and robustness. Good luck, and happy coding!

# PartB - Beginner Algos


### Problem 01: String Copies
**Problem:** We need you to make ___ amount of copies of a given string. A string will be given and a non-negative number. We need you to make the given number of copies of the original string.

Return a larger string that has n copies of the given string.

**Explanation:** Imagine you have a word like "Hi" and you want to say it 3 times continuously like "HiHiHi". Write a code that takes a word and a number and repeats that word the given number of times.

**Sample Input:** "Hi", 3
**Expected Output:** "HiHiHi"

```
public static String stringCopies(String word, int n) {
    return null;
}
```

**Test Cases:**
- As a user, I want to get a string repeated 'n' number of times.

1. Given the string "Hi" and n=2, the method should return "HiHi".
2. Given the string "Hi" and n=3, the method should return "HiHiHi".
3. Given the string "Hi" and n=1, the method should return "Hi".

### Problem 02: Followed X
**Problem:** Does the given string contain a first instance of "x" immediately followed by another "x"?
Evaulate the given string and return true if the first seen "x" is followed right by another "x".

**Explanation:** You're given a word. You need to check if the very first "x" you see in the word has another "x" right after it.

**Sample Input:** "axaxax"
**Expected Output:** false

```
public static Boolean followedX(String str) {
    return null;
}
```

**Test Cases:**
- As a user, I want to know if a string has an 'x' followed by another 'x'.

1. Given the string "axxbb", the method should return true.
2. Given the string "axaxax", the method should return false.
3. Given the string "xxxxx", the method should return true.

### Problem 03: Sub Two
**Problem:** Provided a given string, take note of how many times you see a substring length 2 occur.

Return the count of the number of times that a substring length 2 appears in the given string.
Also, the last 2 characters of the string, such as "hixxxhi" would yield 1; don't count the end substring.

**Explanation:** Look at a word and see how many times you find a set of two characters that also appear at the end of the word. But don't count the last set.

**Sample Input:** `"hixxhi"`  
**Expected Output:** `1`

```
public static Integer subTwo(String str) {
    return null;
}
```

**Test Cases:**
- As a user, I want to count the number of "xx" substrings in a given string.

1. Given the string "hixxhi", the method should return 1.
2. Given the string "xaxxaxaxx", the method should return 1.
3. Given the string "axxxaaxx", the method should return 2.

### Problem 04: Basic Numbers 123
**Problem:** The new elementary school teacher wants to make a fun interactive way of learning the basic numbers.
She wants to start with learning 1,2,3, but she is providing sets of numbers for the kids to find 1, 2, 3 out of.
The sets of numbers will be given in a array for you to decided if they contain the sequence 1,2,3 anywhere within the
array.

Return true if the sequence of numbers 1, 2, 3 appears in the array anywhere.

**Explanation:** Imagine you have a sequence of numbers. Check if the numbers 1, 2, 3 appear in that order anywhere in the sequence.

**Sample Input:** `[1, 1, 2, 4, 1]`  
**Expected Output:** `false`

```
public static Boolean basicNumbers123(int[] nums) {
    return null;
}
```

**User Story:**
- As a user, I want to know if an array has the sequence of numbers 1, 2, and 3.

1. Given the array [1, 1, 2, 3, 1], the method should return true.
2. Given the array [1, 1, 2, 4, 1], the method should return false.
3. Given the array [1, 1, 2, 1, 2, 3], the method should return true.

### Problem 05: Scramble of Letters
**Problem:** Lets play a game of scramble the letters of any given word.
A string will be given to you, and we need you to create a new string where we will only ask for specific letters
out of the string.

Return a new string made of characters at indexes 0, 1, 4, 5, 8, 9.

So "kittens" will yield "kien".

**Explanation:** You're given a word. From this word, take the 1st, 2nd, 5th, 6th, 9th, and 10th letters and form a new word.

**Sample Input:** `"Chocolate"`  
**Expected Output:** `"Chole"`

```
public static String scrambleOfLetters(String scramble) {
    return null;
}
```

**Test Cases:**
- As a user, I want a modified version of a string where certain characters are removed.

1. Given the string "kitten", the method should return "kien".
2. Given the string "Chocolate", the method should return "Chole".
3. Given the string "CodingHorror", the method should return "Congrr".

### Problem 06: Don't Accept Triples
**Problem:** For this special case, were going to say that during a game of basketball a "triple" is when someone scores the same
point value 3 times in a row. Such as, scoring 2 points three times in a row.
We are keeping track of players point values in an array, but we don't want you to accept any player who has "triples".

Evaluate the given array and return true if the array does not contain any triples.

**Explanation:** While playing basketball, you don't want anyone scoring the same point value three times in a row. Check a sequence of scores and make sure this doesn't happen.

**Sample Input:** `[1, 1, 2, 2, 2, 1]`  
**Expected Output:** `false`

```
public static Boolean dontAcceptTriples(int[] score) {
    return null;
}
```

**Test Cases:**
- As a user, I want to know if an array has any number that appears three times consecutively.

1. Given the array [1, 1, 2, 2, 1], the method should return true.
2. Given the array [1, 1, 2, 2, 2, 1], the method should return false.
3. Given the array [1, 1, 1, 2, 2, 2, 1], the method should return false.

### Problem 07: Front Copies
**Problem:** Provided a string, we need you to make x amount of copies of the front of a string.
The front of a string is considered to be the first 3 characters or whatever is there less than the 3 characters.
Return a new string of x copies of the front of the given string.

**Example:**

* frontCopies("Chocolate", 2) --> "ChoCho"
* frontCopies("Chocolate", 3) --> "ChoChoCho"
* frontCopies("Abc", 3) --> "AbcAbcAbc"

**Explanation:** Take the first 3 letters of a word and repeat them a given number of times to make a new word.

**Sample Input:** `"Chocolate", 2`  
**Expected Output:** `"ChoCho"`

```
public static String frontCopies(String str, int x) {
    return null;
}

```

**Test Cases:**
- As a user, I want the first two characters of a string to be repeated 'n' number of times.

1. Given the string "Chocolate" and n=2, the method should return "ChoCho".
2. Given the string "Chocolate" and n=3, the method should return "ChoChoCho".
3. Given the string "Abc" and n=3, the method should return "AbcAbcAbc".

### Problem 08: Every Other Bit
**Problem:** Lets break apart the given words and make new bits. Using those new bits we will put them together to create a new string.

Return a new string made of every other character, but start with the first character.

So "Hello" yields "Hllo"

**Example:**

* everyOtherBit("Hello") --> "Hllo"
* everyOtherBit("Hi") --> "H"
* everyOtherBit("Heeololeo") --> "Hello"

**Explanation:** Given a word, create a new word using every alternate letter, starting with the first.

**Sample Input:** `"Hello"`  
**Expected Output:** `"Hllo"`

```
public static String everyOtherBit(String word) {

    return null;
}
```

**Test Cases:**
- As a user, I want a modified version of a string that retains every other character.

1. Given the string "Hello", the method should return "Hllo".
2. Given the string "Hi", the method should return "H".
3. Given the string "Heeololeo", the method should return "Hello".

### Problem 09: Favorite Nine
**Problem:** Sam's favorite number is 9. She wants you to count how many occurences of her favorite number that you see within
a given set of numbers.

The sets of number will be provided in an array, return the number of 9's seen in the array.

**Explanation:** Sam loves the number 9! Count how many times the number 9 appears in a sequence of numbers.

**Sample Input:** `[1, 9, 9, 3, 9]`  
**Expected Output:** `3`

```
public static Integer favoriteNine(int[] nums) {

    return null;
}
```

**Test Cases:**
- As a user, I want to count how many times the number 9 appears in an array.

1. Given the array [1, 2, 9], the method should return 1.
2. Given the array [1, 9, 9], the method should return 2.
3. Given the array [1, 9, 9, 3, 9], the method should return 3.

### Problem 10: Am I A Match

**Problem:** You will be provided two strings to compare against each other.

We need you to compare to see if you see a substring in one string, that you see in the same spot in the next string.

So "xxcaazz" and "xxbaaz" yields 3, as you can see "xx", "aa", and "az" substrings appear in the same place in both.

Return the number of the positions where they contain the same length 2 substring.

**Example:**

* amIAMatch("xxcaazz", "xxbaaz") --> 3
* amIAMatch("abc", "abc") --> 2
* amIAMatch("abc", "axc") --> 0

**Explanation:** Compare two words. Check how many times you find a set of two letters in the first word that also appears in the same position in the second word.

**Sample Input:** `"xxcaazz", "xxbaaz"`  
**Expected Output:** `3`

```
public static Integer amIAMatch(String x, String z) {

    return null;
}
```

**Test Cases:**
- As a user, I want to know the number of pairs of matching characters at the same index in two strings.

1. Given the strings "xxcaazz" and "xxbaaz", the method should return 3.
2. Given the strings "abc" and "abc", the method should return 2.
3. Given the strings "abc" and "axc", the method should return 0.

### Problem 11: Unlucky Yak
**Problem:** Arnold is all about having goodluck stored around him. He is a pretty lucky guy, and he wants to remain that way.

Arnold heard that the word "yak" is very unlucky. He has a group of pharses he wants to store in his "book of good pharses".

Arnold wants you to look at the given pharses and remove all the "yak", but the "a" can be any character and the "yak"
strings will not overlap.

Return a new string where all the "yak" are removed to keep him a lucky man.

* unluckyYak("yakpak") --> "pak"
* unluckyYak("pakyak") --> "pak"
* unluckyYak("yak123ya") --> "123ya"

**Explanation:** Arnold believes the word "yak" is unlucky. You need to help him by removing it from any phrase he gives you. But the "a" in "yak" can be any letter.

**Sample Input:** `"yakpak"`  
**Expected Output:** `"pak"`

```
public static String unluckyYak(String phrase) {

    return null;
}
```


**Test Cases:**
- As a user, I want a string where "yak" is removed, but not if 'y' is at the start or end.

1. Given the string "yakpak", the method should return "pak".
2. Given the string "pakyak", the method should return "pak".
3. Given the string "yak123ya", the method should return "123ya".

### Problem 12: Pattern 271

**Problem:** Given an array of numbers, we need you took look to see if it contains a 2, 7, 1 pattern.
Return true if it contains a 2, 7, 1 pattern:

* a value,
* followed by the value plus 5,
* followed by the value minus 1.

Additionally, the 271 counts even if the "1" differs by 2 or less from the correct value.

**Example:**

* pattern271([1, 2, 7, 1]) --> true
* pattern271([1, 2, 8, 1]) --> false
* pattern271([2, 7, 1]) --> true

**Explanation:** Check a sequence of numbers to see if they contain a specific pattern: a number, that number plus 5, and then that number minus 1.

**Sample Input:** `[1, 2, 7, 1]`  
**Expected Output:** `true`

```
public static Boolean pattern271(int[] nums) {

    return null;
}
```

**User Story:**
- As a user, I want to know if an array contains the sequence 2, followed by a 7, followed by 1.

1. Given the array [1, 2, 7, 1], the method should return true.
2. Given the array [1, 2, 8, 1], the method should return false.
3. Given the array [2, 7, 1], the method should return true.
