{% include navigation.html %}

# Study Week 1 

# 2015 FRQs 

### Question 1

![image](https://user-images.githubusercontent.com/89210546/164567953-9f6e5e5e-7dd7-4607-b986-b5916961c1e5.png)

![image](https://user-images.githubusercontent.com/89210546/164567956-d3be5140-8cc5-44d7-9b98-fa1bba7fd5a3.png)

### Question 2

![image](https://user-images.githubusercontent.com/89210546/165011533-d31b23ce-f73a-4cf0-b74f-baabb3efe0a5.png)

### Question 3

![image](https://user-images.githubusercontent.com/89210546/165011542-c4ca7e48-4b42-454b-b2a5-a8843b51c65e.png)

### Question 4 

![image](https://user-images.githubusercontent.com/89210546/165011557-8557ed0e-c7a6-4065-915e-a577a61d2009.png)

--------------------------------------------------------------------------------------------------------------------------------------------------------

# 2015 MC Questions + Corrections

### Question 26: (incorrect, forgot to check for pass-by-references and data types) 

![image](https://user-images.githubusercontent.com/89210546/164745112-f32d37a5-349d-4dbd-b18c-b3666ce94069.png)

**Corrections:** The answer is (e) because arrays, Strings, and int are passed by reference so their actual value is not changed, only a copy is changed. So the final print statements in start() will print the original values of nums, value, and name, so you get "1 2 3 4 5 6 blackboard". 

--------------------------------------------------------------------------------------------------------------------------------------------------------

### Question 27: (correct) 

![image](https://user-images.githubusercontent.com/89210546/164745201-2492bef3-b47b-46a9-8de4-46dbfec3c36d.png)

**Corrections:** The answer is (b) since the sort is selection sort. At j = 0, data becomes {1, 3 2, 5, 4, 6}. At j = 1, data becomes {1, 3, 2, 5, 4, 6}. At j = 2, data becomes {1, 3, 2, 5, 4, 6}. 

--------------------------------------------------------------------------------------------------------------------------------------------------------

### Question 28: (incorrect, didn't realize that assigns occur for the first iteration when you check each number)

![image](https://user-images.githubusercontent.com/89210546/164745538-159b0f53-cf44-466d-afa0-c04a5594b5af.png)

**Corrections:** The answer is (b) since the sort is selection sort. Even though the array is already sorted, it still does 15 comparisons. However it assigns 5 times since the number you're currently working with will be less than everything you compare it to. 

--------------------------------------------------------------------------------------------------------------------------------------------------------

### Question 29: (correct)

![image](https://user-images.githubusercontent.com/89210546/164746036-4f1032e3-e119-4559-91f7-4da9b6c20dc3.png)

**Corrections:** The answer is (a) since the code is recursive and divides the number by 10 each time, which returns the number of digits in the decimal representation.

--------------------------------------------------------------------------------------------------------------------------------------------------------

# Key Learnings:
- the code won't compile if there is no return statement after a loop in a method
- Primitive types are passed by value, so only their COPY is changed
- Non-primitive types are passed by reference, they are DIRECTLY changed
- in ```Parent p = new Child ();```, ```Parent``` is the declared type and ```Child``` is the runtime type
