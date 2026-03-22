# Assignment #1: Recursion

**Student:** Tkachuk Bogdan  
**Group:** SE-2511

## Work Process Summary
В ходе выполнения данной работы я изучил и применил принципы рекурсивного программирования на языке Java. Каждая 
задача была решена путем дробления основной проблемы на мелкие подзадачи.

---

## Tasks Execution

### Task 1: Print Digits of a Number
* **Logic:**
    * **Base Case:** Если число меньше 10, выводим его.
    * **Recursive Step:** Вызываем функцию для `n / 10`, а после возврата печатаем `n % 10`.
* **Screenshot:** ![Task 1.png](Task%201.png)

### Task 2: Average of Elements
* **Logic:**
    * **Base Case:** Если количество элементов 0, сумма равна 0.
    * **Recursive Step:** Складываем последний элемент массива с результатом вызова для `n - 1` элементов.
* **Screenshot:** ![Task 2.png](Task%202.png)

### Task 3: Prime Number Check
* **Logic:**
    * **Base Case:** Если делитель в квадрате больше числа — оно простое. Если число делится на текущий делитель — оно составное.
    * **Recursive Step:** 
* **Screenshot:** ![Task 3.0.png](Task%203.0.png) ![Task 3.1.png](Task%203.1.png)

### Task 4: Factorial
* **Logic:**
    * **Base Case:** 
    * **Recursive Step:** Умножаем текущее число `n` на результат `factorial(n - 1)`.
* **Screenshot:** ![Task 4.png](Task%204.png)

### Task 5: Fibonacci Number
* **Logic:**
    * **Base Case:** $F(0) = 0$, $F(1) = 1$.
    * **Recursive Step:** Возвращаем сумму двух предыдущих чисел Фибоначчи: $F(n-1) + F(n-2)$.
* **Screenshot:** ![Task 5.0.png](Task%205.0.png) ![Task 5.1.png](Task%205.1.png)

### Task 6: Power Function
* **Logic:**
    * **Base Case:** 
    * **Recursive Step:** Умножаем основание `a` на результат `power(a, n - 1)`.
* **Screenshot:** ![Task 6.png](Task%206.png)

### Task 7: Reverse Output
* **Logic:**
    * **Base Case:** Если $n = 0$, прекращаем выполнение.
    * **Recursive Step:** Считываем число, вызываем рекурсию для оставшихся чисел, и только после возврата печатаем считанное число.
* **Screenshot:** ![Task 7.png](Task%207.png)

### Task 8: Check Digits in String
* **Logic:**
    * **Base Case:** Пустая строка — "Yes". Если символ не является цифрой — "No".
    * **Recursive Step:** Проверяем подстроку начиная со следующего символа.
* **Screenshot:** ![Task 8.0.png](Task%208.0.png) ![Task 8.1.png](Task%208.1.png)

### Task 9: Count Characters in a String
* **Logic:**
    * **Base Case:** Длина пустой строки равна 0.
    * **Recursive Step:** Прибавляем 1 к результату вызова функции для строки без первого символа.
* **Screenshot:** ![Task 9.0.png](Task%209.0.png) 
* ![Task 9.1.png](Task%209.1.png)

### Task 10: GCD (Euclidean Algorithm)
* **Logic:**
    * **Base Case:** Если второе число (остаток) равно 0, то первое число — это НОД.
    * **Recursive Step:** Вызываем `gcd(b, a % b)` согласно алгоритму Евклида.
* **Screenshot:** ![Task 10.0.png](Task%2010.0.png)![Task 10.1.png](Task%2010.1.png)