package net.thrymr.app.models;

import java.util.Date;

public class Order extends BaseEntity{

    String oNumber;
    Double amount;
    Double advanceAmount;
    Date date;
    Customer customer;
    String agentCode;
    String description;
}
