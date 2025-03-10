# **Circular Doubly Linked List for Course Management**

This project demonstrates the use of a **Circular Doubly Linked List** (CDLL) to manage a list of courses in an academic system. With this system, users can easily add, remove, modify, and display course information such as course name, credits, and cost.

## **Key Features**

- **Add Courses**: Add new courses to the list with course name, credits, and cost.
- **Remove Courses**: Remove the first or specific course based on the user's input.
- **Display Courses**: View the courses in the list in both regular and reverse order.
- **Modify Course**: Modify the information of an existing course.
- **Search for Courses**: Check if a course exists in the list based on specific criteria.
- **Remove Specific Course**: Remove a specific course based on its name.
  
---

## **Why a Circular Doubly Linked List?**

A **Circular Doubly Linked List (CDLL)** is an ideal data structure for managing dynamic sets of elements that need to be accessed in a circular manner (from the last node back to the first node). Here’s why it’s important:

- **Efficient Traversal**: Traversing the list in both forward and backward directions is fast, and the circular nature ensures we can easily loop through the list without worrying about reaching the end.
- **Flexible Modifications**: The doubly linked list allows efficient insertion and deletion operations, which are essential when managing a dynamic list of courses.
- **Memory Management**: Unlike arrays, this structure doesn't require a contiguous block of memory, providing better memory efficiency when handling a large number of courses.

---

## **Technical Overview**

This Java-based project utilizes **JOptionPane** for user input and output, making it an easy-to-use graphical interface for managing the list of courses. The main components of the project are:

1. **Node Class**: Represents an element in the list, holding the course data and links to both the next and previous nodes.
2. **Course Class**: Contains the course information (course name, credits, and cost).
3. **Circular Doubly Linked List (ListaDC)**: The core of the system, where the courses are managed, sorted, and manipulated using various methods such as inserting, deleting, and displaying.
4. **Menu Class**: Provides a simple text-based menu for interacting with the system, allowing the user to choose actions like adding, modifying, or deleting courses.

### **Class Diagram**
```plaintext
+---------------------+
|       Course        |
+---------------------+
| - nomCurso: String  |
| - canCreditos: int  |
| - costo: double     |
+---------------------+
| +getNomCurso(): String   |
| +setNomCurso(): void     |
| +getCanCreditos(): int   |
| +setCanCreditos(): void  |
| +getCosto(): double      |
| +setCosto(): void        |
+---------------------+
        ^
        |
        |
+---------------------+
|        Node         |
+---------------------+
| - elemento: Curso   |
| - siguiente: Nodo   |
| - anterior: Nodo    |
+---------------------+
| +getElemento(): Curso   |
| +setElemento(): void     |
| +getSiguiente(): Nodo    |
| +setSiguiente(): void    |
| +getAnterior(): Nodo     |
| +setAnterior(): void     |
+---------------------+
        ^
        |
        |
+---------------------+
|    ListaDC (CDLL)   |
+---------------------+
| - inicio: Nodo      |
| - fin: Nodo         |
+---------------------+
| +inserta(): void    |
| +extraer(): void    |
| +extraerEspecifico(): void |
| +mostrarElementos(): void  |
| +modificar(): void  |
| +existe(): void     |
| +mostrarInversa(): void   |
+---------------------+
```

---

## **How It Works**

The main operations of the **Circular Doubly Linked List** are demonstrated through the following classes:

### 1. **Node Class (`Nodo.java`)**

Each node represents a single course, containing links to both the next and previous nodes in the list. This allows the list to be traversed in both directions.

### 2. **Course Class (`Curso.java`)**

The `Curso` class holds the core data for each course: course name, number of credits, and cost.

### 3. **Circular Doubly Linked List (`ListaDC.java`)**

The `ListaDC` class is where the core operations on the list are carried out. The operations include adding a course (`inserta`), removing a course (`extraer`), modifying a course (`modificar`), and displaying courses (`mostrarElementos`).

---

## **Example Usage**

```bash
Menu Principal:
1- Add Course
2- Remove First Course
3- Display All Courses
4- Display Courses in Reverse Order
5- Modify Course
6- Search for Course
7- Remove Specific Course
8- Exit
```

Once the user selects an option, the program will prompt for the relevant input. For example, when adding a course, the system asks for the course name, number of credits, and cost.

### **Adding a Course**
```
Enter course name: "Computer Science"
Enter number of credits: 4
Enter course cost: 300.00
```

### **Displaying Courses**
```
The list contains:
Computer Science / 4 / 300.0 <=> 
```

---

## **Technologies Used**

- **Java**: The primary programming language used to implement this project.
- **JOptionPane**: Used for GUI-based input/output.
- **Circular Doubly Linked List**: The data structure used to manage the courses.

---

## **Project Details**

This project is not just a simple course management system but a demonstration of how an advanced data structure (Circular Doubly Linked List) can be used in real-world applications. It shows how managing dynamic data can be efficient and flexible, making it an ideal solution for situations like course management systems in academic environments.

The use of a circular doubly linked list in this project highlights the importance of understanding data structures, which are essential for building scalable and efficient applications. Moreover, it gives hands-on experience in manipulating nodes and pointers, which is fundamental to low-level programming and algorithm design.

---

## **Getting Started**

To run the project:

1. Clone the repository:
   ```bash
   git clone https://github.com/EmersonJPJ/Circular-double-linked-list-in-java.git
   ```

2. Compile the Java files:
   ```bash
   javac *.java
   ```

3. Run the `Principal.java` file:
   ```bash
   java Principal
   ```

---


## Contributing

Contributions are always welcome! If you have suggestions, improvements, or bug fixes, feel free to open an issue or create a pull request. 

---

## Contact  

Feel free to reach out for any questions or suggestions!  

- 📧 **Email**: emerson04vade@gmail.com  
- 💻 **GitHub**: EmersonJPJ
