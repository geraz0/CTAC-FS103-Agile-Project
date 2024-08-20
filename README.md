# Restaurant Management System

## Project Description
The Restaurant Management System is a desktop application developed in Java with an integrated graphical user interface (GUI) using Java Swing. This system provides various functionalities required for managing a restaurant effectively. The application is designed to help restaurants manage backend operations such as user authentication, menu management, order processing, table management, inventory management, and sales reporting. The system utilizes the Java Collections Framework for data management and Java File I/O for data persistence.

## Features

### 1. User Login
- Secure login system for both restaurant staff and managers.
- Passwords are hashed and stored securely.
- Differentiation between staff and manager roles with distinct permissions.
- GUI login screen for easy access.

### 2. Menu Management
- Add, delete, and edit items in the restaurant menu through the GUI.
- Each menu item includes:
  - Item Name
  - Item Description
  - Preparation Time
  - Item Price
  - Ingredients List
- Menu changes are saved and loaded between sessions using Java File I/O.

### 3. Order Processing
- System to handle orders from customers via the GUI.
- Each order includes:
  - Order ID
  - Items ordered (with quantity)
  - Total Price
  - Status (Waiting, Preparing, Ready)
- Manages multiple orders simultaneously and updates order status in real-time.

### 4. Table Management
- Manage tables in the restaurant with statuses such as Available, Reserved, Occupied.
- Assign customers to specific tables via the GUI.
- Each table includes:
  - Table ID
  - Table Size
  - Status (Available, Reserved, Occupied)

### 5. Inventory Management
- Track the usage of ingredients in the kitchen.
- Alerts staff when ingredients are running low.
- The system reflects real-time usage of ingredients, with visual alerts in the GUI.

### 6. Sales Report
- Generate and export daily sales reports.
- Reports include information like total revenue, most popular items, and tables with the most orders.
- Reports can be exported using Java’s File I/O.

## Technologies Used
- **Java:** Core logic and implementation.
- **Java Swing:** For creating the graphical user interface (GUI).
- **Java Collections Framework:** For managing data (List, Set, Map).
- **Java File I/O:** For saving and loading data between sessions.

