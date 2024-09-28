package Topic05Packages;

import Topic05Packages.Shipping.Transaction;


public class Main {
    // The `Transaction` class below refers to the one from `Topic05Packages.Shipping.Transaction`
    Transaction t = new Transaction("Yishun Ring Road Blk 666",
         "Tan Ah Kow", 123L);

    // Using the fully quantified name to a class
    Topic05Packages.Accounting.Transaction accountingTransaction = new Topic05Packages.Accounting.Transaction(0, null, null);
}