"""
Date: 07/01/2021
File: BankAccount
Author: Tyler S. Unsworth
"""


# Create a class BankAccount
class BankAccount:

    # Declaration of Constructor
    def __init__(self, name, balance):
        self.name = name
        self.balance = balance
        self.num_deposits = 0
        self.deposit_total = 0
        self.num_withdraws = 0
        self.withdraw_total = 0

    # Increases the number of deposits by 1
    def numDeposits(self):
        self.num_deposits += 1

    # Increases the number of withdraw by 1
    def numWithdraws(self):
        self.num_withdraws += 1

    # Deposists money into the bank account
    def deposit(self, amount):
        self.balance += amount
        self.deposit_total += amount
        self.numDeposits()

    # Withdraws money from the account
    def withdraw(self, amount):
        self.balance -= amount
        self.withdraw_total += amount
        self.numWithdraws()

    # Declaration of Printing to Console Logic
    def endOfMonth(self):
        print('Bank Account :', self.name)
        print('Balance :', self.balance)

        # Displays the number of deposits
        print('Number of deposits :', self.num_deposits, ' totalling $', self.deposit_total)

        # Displays the number of withdraws
        print('Number of withdraws :', self.num_withdraws, ' totalling $', self.withdraw_total)
        print('*************')
print('*************')


# Declaration of Instance Initialization Logic
chase_account = BankAccount('Chase', 0) # Initializes object

# Adds money into the account
chase_account.deposit(50)
chase_account.deposit(50)

# Subtracts money from the account
chase_account.withdraw(100)
chase_account.withdraw(100)
chase_account.withdraw(100)

chase_account.endOfMonth()

print('*************')

# Initializes new account
bank_of_america_account = BankAccount('Bank of America', 100)

# Adds money into the account
bank_of_america_account.deposit(25)
bank_of_america_account.deposit(25)

# Subtracts amount 5000
bank_of_america_account.deposit(5000)
bank_of_america_account.withdraw(10)

# Withdraw from the account
bank_of_america_account.withdraw(1000)
bank_of_america_account.withdraw(70)

# Prints information
bank_of_america_account.endOfMonth()
