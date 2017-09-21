package ua.kpi.model;


import ua.kpi.model.entities.Contribution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eugene on 17.08.17.
 */
public class Model {
    private List<Contribution> contributions = new ArrayList<Contribution>();

    public void add(Contribution contribution) {
        contributions.add(contribution);
    }

    public List<Contribution> getContributions() {
        return contributions;
    }


}
