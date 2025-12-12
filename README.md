# ATM Simulator

This project is an ATM simulator application that allows users to perform basic banking operations such as validating user credentials, checking account balances, and making deposits.

## Project Structure

```
atm-simulator
├── src
│   ├── main
│   │   ├── ATM.java          # Contains the ATM class for user operations 
│   │   ├── DBConnection.java  # Manages database connections
│   │   ├── User.java         # Represents a bank user
│   │   └── Transaction.java   # Represents a financial transaction
│   └── test
│       └── ATMTest.java      # Unit tests for the ATM class
├── lib                       # Directory for external libraries
├── .gitignore                # Specifies files to ignore in Git
├── pom.xml                   # Maven configuration file
└── README.md                 # Documentation for the project
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   ```

2. **Navigate to the project directory:**
   ```
   cd atm-simulator
   ```

3. **Build the project using Maven:**
   ```
   mvn clean install
   ```

4. **Run the application:**
   You can run the application by executing the main method in the `ATM.java` file.

## Usage

- **User Validation:** Users can validate their account number and PIN.
- **Check Balance:** Users can retrieve their current account balance.
- **Deposit Funds:** Users can deposit money into their account.

## Contributing

Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for details.