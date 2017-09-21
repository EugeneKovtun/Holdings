package ua.kpi.view;

import ua.kpi.model.entities.Contribution;

public class View {
    public static String addContributionToTable(Contribution contribution) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<tr><td>"+contribution.getName()+"</td>"+
                "<td>"+contribution.isPossibilityOfReplenishment()+"</td>"+
                 "<td>"+contribution.getInterestPayment()+"</td>"+
                "<td>"+contribution.getTerm()+"</td>"+
                "<td>"+contribution.getAnnualRate()+"</td></tr>");
        return stringBuffer.toString();
    }

}
