package entity;

import java.time.LocalDateTime;

public class Transaction {
    private double amount;
    private boolean isIncome;
    private Category category;
    private LocalDateTime date;
    private String description;
}
