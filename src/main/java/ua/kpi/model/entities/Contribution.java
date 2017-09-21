package ua.kpi.model.entities;

public class Contribution {
    String name;
    boolean possibilityOfReplenishment;
    InterestPayment interestPayment;
    int term;
    double annualRate;

    private Contribution() {
    }

    public Contribution(String name, boolean possibilityOfReplenishment,
                        InterestPayment interestPayment,
                        int term, double annualRate) {
        this.name = name;
        this.possibilityOfReplenishment = possibilityOfReplenishment;
        this.interestPayment = interestPayment;
        term = term;
        this.annualRate = annualRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPossibilityOfReplenishment() {
        return possibilityOfReplenishment;
    }

    public void setPossibilityOfReplenishment(boolean possibilityOfReplenishment) {
        this.possibilityOfReplenishment = possibilityOfReplenishment;
    }

    public InterestPayment getInterestPayment() {
        return interestPayment;
    }

    public void setInterestPayment(InterestPayment interestPayment) {
        this.interestPayment = interestPayment;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }

    public static Builder newBuilder() {
        return new Contribution().new Builder();
    }

    public class Builder {
        private Builder() {
            // private constructor
        }

        public Builder setName(String name) {
            Contribution.this.name = name;
            return this;
        }

        public Builder setPossibilityOfReplenishment(boolean possibilityOfReplenishment) {
            Contribution.this.possibilityOfReplenishment = possibilityOfReplenishment;
            return this;
        }

        public Builder setInterestPayment(InterestPayment interestPayment) {
            Contribution.this.interestPayment = interestPayment;
            return this;
        }

        public Builder setTerm(int term) {
            Contribution.this.term = term;
            return this;
        }

        public Builder setAnnualRate(double annualRate) {
            Contribution.this.annualRate = annualRate;
            return this;
        }

        public Contribution build() {
            return Contribution.this;
        }


    }

    @Override
    public String toString() {
        return "Contribution{" +
                "name='" + name + '\'' +
                ", possibilityOfReplenishment=" + possibilityOfReplenishment +
                ", interestPayment=" + interestPayment +
                ", Term=" + term +
                ", annualRate=" + annualRate +
                '}';
    }
}
