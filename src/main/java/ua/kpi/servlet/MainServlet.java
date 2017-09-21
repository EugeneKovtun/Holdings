package ua.kpi.servlet;

import ua.kpi.controller.Controller;
import ua.kpi.controller.Utils.ContributionUtils;
import ua.kpi.model.Model;
import ua.kpi.model.entities.Contribution;
import ua.kpi.view.View;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


public class MainServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
        StringBuffer stringBuffer = new StringBuffer();
        String sortByValue = req.getParameter("sortBy")==null?"":req.getParameter("sortBy");
        for (Contribution cont :
                getSortedListByRequest(controller.getModel().getContributions(),
                        sortByValue)) {
            stringBuffer.append(View.addContributionToTable(cont));
        }
        req.setAttribute("holdingsTable", stringBuffer);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    private List<Contribution> getSortedListByRequest(List<Contribution> contributionList, String sortBy) {
        List<Contribution> sortedList;
        switch (sortBy) {
            case "name":
                sortedList = ContributionUtils.sortByName(contributionList);
                break;
            case "replenishment":
                sortedList = ContributionUtils.sortByPossibilityOfReplenishment(contributionList);
                break;
            case "interestPayment":
                sortedList = ContributionUtils.sortByInsertedPayment(contributionList);
                break;
            case "term":
                sortedList = ContributionUtils.sortByTerm(contributionList);
                break;
            case "annualRate":
                sortedList = ContributionUtils.sortByAnnualRate(contributionList);
                break;
            default:
                sortedList = contributionList;
        }
        return sortedList;
    }


}
