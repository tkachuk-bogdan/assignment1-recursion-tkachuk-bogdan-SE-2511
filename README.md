# Assignment #1: Recursion

**Student:** Tkachuk Bogdan  
**Group:** SE-2511

## Work Process Summary
During this project, I learned and applied the principles of recursive programming in Java. Each
problem was solved by breaking the main problem down into smaller subproblems.

---

## Tasks Execution

### Task 1: Print Digits of a Number
* **Logic:**
    * **Base Case:** If the number is less than 10, we print it.
    * **Recursive Step:** We call the function for `n / 10`, and after returning we print `n % 10`.
* **Screenshot:** ![Task 1.png](Task%201.png)

### Task 2: Average of Elements
* **Logic:**
    * **Base Case:** If the number of elements is 0, the sum is 0.
    * **Recursive Step:**  Add the last element of the array to the result of the call for `n - 1` elements.
* **Screenshot:** ![Task 2.png](Task%202.png)

### Task 3: Prime Number Check
* **Logic:**
    * **Base Case:** If the divisor squared is greater than the number, it is prime. If the number is divisible by the current divisor, it is composite.
    * **Recursive Step:** increase the value of the variable by one and call the function again.
* **Screenshot:** ![Task 3.0.png](Task%203.0.png) ![Task 3.1.png](Task%203.1.png)

### Task 4: Factorial
* **Logic:**
    * **Base Case:** If `n` is 0 or 1, return 1.
    * **Recursive Step:** Multiply the current number `n` by the result of `factorial(n - 1)`.
* **Screenshot:** ![Task 4.png](Task%204.png)

### Task 5: Fibonacci Number
* **Logic:**
    * **Base Case:** $F(0) = 0$, $F(1) = 1$.
    * **Recursive Step:** We return the sum of the two previous Fibonacci numbers: $F(n-1) + F(n-2)$.
* **Screenshot:** ![Task 5.0.png](Task%205.0.png) ![Task 5.1.png](Task%205.1.png)

### Task 6: Power Function
* **Logic:**
    * **Base Case:** If the degree `n` is 0, the result is always 1.
    * **Recursive Step:** Multiply the base `a` by the result of calling the function with the power `n - 1`.
* **Screenshot:** ![Task 6.png](Task%206.png)

### Task 7: Reverse Output
* **Logic:**
    * **Base Case:** If $n = 0$, then we havee to stop the execution.
    * **Recursive Step:** We read a number, call recursion for the remaining numbers, and only after returning do we print the read number.
* **Screenshot:** ![Task 7.png](Task%207.png)

### Task 8: Check Digits in String
* **Logic:**
    * **Base Case:** An empty string means "Yes." If the character is not a number, it means "No."
    * **Recursive Step:** We check the substring starting from the next character.
* **Screenshot:** ![Task 8.0.png](Task%208.0.png) ![Task 8.1.png](Task%208.1.png)

### Task 9: Count Characters in a String
* **Logic:**
    * **Base Case:** The length of an empty string is 0.
    * **Recursive Step:** Add 1 to the result of calling the function for a string without the first character.
* **Screenshot:** ![Task 9.0.png](Task%209.0.png) 
* ![Task 9.1.png](Task%209.1.png)

### Task 10: GCD (Euclidean Algorithm)
* **Logic:**
    * **Base Case:** If the second number (remainder) is 0, then the first number is the GCD.
    * **Recursive Step:** We call `gcd(b, a % b)` according to the Euclidean algorithm.
* **Screenshot:** ![Task 10.0.png](Task%2010.0.png)![Task 10.1.png](Task%2010.1.png)