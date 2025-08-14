# Grouping Utility

A simple Java utility for **hierarchical grouping** of objects using multiple criteria.  
This example project demonstrates how to group data by multiple levels — such as **University → Main Domain → Language Domain → Students** 

---

## 📌 Features
- help to detribute student data according their Departments ,Domain and their programing languages
- **Multi-level grouping** (e.g., University → Main Domain → Language Domain → Names)
- Easy to extend for any entity (Sports, Employees, Projects, etc.)

---

# Use
Java collections and streams API.

---
# output
```bash
DEPSTAR:
   Java -> Tirth
   AI/ML -> Harshit, Krish
   Cloud -> Prince
   OS -> Kavy
CSPIT:
   Python -> Nikunj
   Cloud -> Raxeet
```
# usage
1. Clone the repository:
   ```bash
   git clone https://github.com/Tirth-22/grouping-utility.git
   cd grouping-utility
   ```

---
2. Compile and run:
   ```bash
   javac -d out src/model/*.java src/service/*.java src/Main.java
   java -cp out Main
