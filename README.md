# Java Practical Course. Spring IoC
## ‘ToDo List’ Application

# 'To-Do List' Application

## Objective
Develop the Service Layer for a "To-Do List" Application that manages Users, To-Do Lists, and Tasks using natural keys (e.g., unique attributes like email for Users, titles for To-Do Lists and Tasks) instead of synthetic IDs. The implementation must follow the **Inversion of Control (IoC)** principle to manage dependencies, include **comprehensive testing**, and ensure proper **model-level encapsulation**.

## Requirements
The **Service Layer** of the "To-Do List" Application must support the following operations, using **natural keys** for identification:

### User Management:
- **Create**: Add a new User to the application, identified by a unique natural key (e.g., email address).
- **Read**: Retrieve details of existing Users (e.g., by email or as a list of all Users).
- **Update**: Modify details of an existing User identified by their natural key (e.g., update name or other attributes).
- **Delete**: Remove an existing User identified by their natural key.

### To-Do List Management:
- **Create**: Add a new To-Do List for an existing User, identified by a unique natural key (e.g., a combination of User’s email and To-Do List title).
- **Read**: Retrieve details of existing To-Do Lists (e.g., by User’s email and To-Do List title, or all lists for a User).
- **Update**: Modify details of an existing To-Do List identified by its natural key (e.g., update description).
- **Delete**: Remove an existing To-Do List identified by its natural key.

### Task Management:
- **Create**: Add a new Task to an existing To-Do List, identified by a unique natural key (e.g., a combination of To-Do List’s natural key and Task title).
- **Read**: Retrieve details of existing Tasks (e.g., by To-Do List’s natural key and Task title, or all Tasks in a list).
- **Update**: Modify details of an existing Task identified by its natural key (e.g., update status or due date).
- **Delete**: Remove an existing Task identified by its natural key.

---

## Additional Requirements

### Natural Keys:
Use **natural keys** for all entities instead of synthetic IDs:
- **User**: Email address (e.g., `user@example.com`).
- **To-Do List**: Combination of **User’s email** and **To-Do List title** (e.g., `user@example.com:Daily Tasks`).
- **Task**: Combination of **To-Do List’s natural key** and **Task title** (e.g., `user@example.com:Daily Tasks:Buy Groceries`).

✅ Ensure **uniqueness** of natural keys within their respective scopes (e.g., a User cannot have two To-Do Lists with the same title).

---

### Inversion of Control (IoC):
- Implement the **Service Layer** using **IoC principles** (e.g., **dependency injection**) to manage dependencies between components.
- Avoid **hard-coded dependencies**; instead, inject dependencies (e.g., `UserService`, `ToDoListService`, `TaskService`) via constructors or a **dependency injection framework** (e.g., **Spring IoC**, **Guice**).

---

### Model Layer:
- Implement all necessary **getters and setters** for the model classes (`User`, `ToDoList`, `Task`) to ensure **proper encapsulation** and data access.
- Ensure model classes store **natural keys appropriately** (e.g., `User` has an `email` field, `ToDoList` references the **User’s email** and its **own title**).

---

### Service Layer:
- Maintain a **list of all Users** as a field in the `UserService` class (e.g., as a `List<User>` or a `Map<String, User>` where the **key is the email**).
- Ensure services (`UserService`, `ToDoListService`, `TaskService`) **interact using natural keys** for lookups and operations.

---

### Testing:
- Write **unit tests** for all CRUD operations (`User`, `To-Do List`, `Task`) using **natural keys**.
- **Mock dependencies** where necessary to align with **IoC principles** (e.g., using a mocking framework like **Mockito** if using Java).
- **Execute** the tests to demonstrate the correct functionality of the Service Layer code.

---

📌 **Note:** Save a **list of all Users** as a field in the `UserService` class.

