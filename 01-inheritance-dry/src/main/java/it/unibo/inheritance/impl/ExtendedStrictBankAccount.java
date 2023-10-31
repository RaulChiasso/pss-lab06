package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount{

    private static final double TRANSACTION_FEE = 0.1;

    public ExtendedStrictBankAccount(int id, double balance) {
        super(id, balance);
    }

    private boolean isWithdrawAllowed(final double amount) {
        return super.getBalance() >= amount;
    }

    @Override
    public void withdraw(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            super.withdraw(id, amount);
        }
    }

    @Override
    public void withdrawFromATM(final int id, final double amount) {
        if (isWithdrawAllowed(amount + SimpleBankAccount.ATM_TRANSACTION_FEE)) {
            super.withdrawFromATM(id, amount);
        }
    }

    @Override
    public void chargeManagementFees(final int id) {
        final double feeAmount = ExtendedStrictBankAccount.MANAGEMENT_FEE + super.getTransactionsCount() * ExtendedStrictBankAccount.TRANSACTION_FEE;
        if (super.checkUser(id) && isWithdrawAllowed(feeAmount)) {
            super.setBalance(super.getBalance() - feeAmount);
            super.resetTransactions();
        }
    }
    
}
