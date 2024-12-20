# ddl-commands

Table Management Operations:

Create Table: Creates a table Stud with fields (id, name, age, marks).


Alter Table: Adds a new column address to the Stud table.


Truncate Table: Deletes all data from the Stud table while retaining its structure.


Drop Table: Permanently deletes the Stud table from the database.


Database Connection:

Connects to the database batch1197 using MySQL credentials (root, root).


Reusable Methods:

Each operation is encapsulated in a separate method for modularity.


Main Method:

Allows testing of operations by invoking specific methods.


Usage:


Uncomment the desired method call in the main() method to execute a specific operation.


Improvements:


Add exception handling for better error messages.


Parameterize database credentials for flexibility.


Confirm user actions before destructive operations (e.g., truncate or drop).
