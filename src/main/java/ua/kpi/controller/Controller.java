package ua.kpi.controller;


import ua.kpi.model.Model;
import ua.kpi.model.entities.Contribution;
import ua.kpi.model.entities.InterestPayment;
import ua.kpi.view.View;

public class Controller {
    Model model;
    View view;

    public Model getModel() {
        return model;
    }

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Contribution contribution = Contribution.newBuilder()
                .setAnnualRate(4)
                .setInterestPayment(InterestPayment.MONTHLY)
                .setName("Standart1")
                .setTerm(12)
                .setPossibilityOfReplenishment(true)
                .build();
        Contribution contribution1 = Contribution.newBuilder()
                .setAnnualRate(5)
                .setInterestPayment(InterestPayment.ANNUALLY)
                .setName("Standart2")
                .setTerm(6)
                .setPossibilityOfReplenishment(true)
                .build();
        Contribution contribution2 = Contribution.newBuilder()
                .setAnnualRate(6)
                .setInterestPayment(InterestPayment.MONTHLY)
                .setName("Standart3")
                .setTerm(12)
                .setPossibilityOfReplenishment(true)
                .build();
        model.add(contribution2);
        model.add(contribution1);
        model.add(contribution);
    }
}
