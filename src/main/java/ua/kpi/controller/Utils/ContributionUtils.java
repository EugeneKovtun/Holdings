package ua.kpi.controller.Utils;



import ua.kpi.model.entities.Contribution;
import ua.kpi.model.entities.InterestPayment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ContributionUtils {
    public static List<Contribution> sortByAnnualRate(List<Contribution> list){
        List<Contribution> contributionsSortedList = new ArrayList<>();
        list.stream()
                .sorted(Comparator.comparingDouble(Contribution::getAnnualRate))
                .forEach(contributionsSortedList::add);
        return contributionsSortedList;
    }
    public static List<Contribution> sortByTerm(List<Contribution> list){
        List<Contribution> contributionsSortedList = new ArrayList<>();
        list.stream()
                .sorted(Comparator.comparingDouble(Contribution::getTerm))
                .forEach(contributionsSortedList::add);
        return contributionsSortedList;
    }
    public static List<Contribution> sortByName(List<Contribution> list){
        List<Contribution> contributionsSortedList = new ArrayList<>();
        list.stream()
                .sorted(Comparator.comparing(Contribution::getName))
                .forEach(contributionsSortedList::add);
        return contributionsSortedList;
    }
    public static List<Contribution> sortByPossibilityOfReplenishment(List<Contribution> list){
        List<Contribution> contributionsSortedList = new ArrayList<>();
        list.stream()
                .sorted(Comparator.comparing(Contribution::isPossibilityOfReplenishment))
                .forEach(contributionsSortedList::add);
        return contributionsSortedList;
    }
    public static List<Contribution> sortByInsertedPayment(List<Contribution> list){
        List<Contribution> contributionsSortedList = new ArrayList<>();
        list.stream()
                .sorted(Comparator.comparing(Contribution::getInterestPayment))
                .forEach(contributionsSortedList::add);
        return contributionsSortedList;
    }
}
