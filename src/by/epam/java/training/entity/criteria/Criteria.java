package by.epam.java.training.entity.criteria;

public class Criteria {

    private PlaneCriteria planeCriteria;
    private Object startValue;
    private Object finishValue;

    public Criteria() {
    }

    public Criteria(PlaneCriteria planeCriteria, Object value) {
        this.planeCriteria = planeCriteria;
        this.startValue = value;
        this.finishValue = value;
    }

    public Criteria(PlaneCriteria planeCriteria, Object startValue, Object finishValue) {
        this.planeCriteria = planeCriteria;
        this.startValue = startValue;
        this.finishValue = finishValue;
    }

    public PlaneCriteria getPlaneCriteria() {
        return planeCriteria;
    }

    public void setPlaneCriteria(PlaneCriteria planeCriteria) {
        this.planeCriteria = planeCriteria;
    }

    public Object getStartValue() {
        return startValue;
    }

    public void setStartValue(Object startValue) {
        this.startValue = startValue;
    }

    public Object getFinishValue() {
        return finishValue;
    }

    public void setFinishValue(Object finishValue) {
        this.finishValue = finishValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Criteria criteria = (Criteria) obj;
        if (this.planeCriteria != null) {
            if (!this.planeCriteria.equals(criteria.planeCriteria)) return false; }
        else if (criteria.planeCriteria == null) return false;

        if (this.startValue != null) {
            if (!this.startValue.equals(criteria.startValue)) return false; }
        else if (criteria.startValue == null) return false;

        if (this.finishValue != null) {
            if (!this.finishValue.equals(criteria.finishValue)) return false; }
        else if (criteria.finishValue == null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + (planeCriteria != null ? planeCriteria.hashCode() : 0);
        hashCode = prime * hashCode + (startValue != null ? startValue.hashCode() : 0);
        hashCode = prime * hashCode + (finishValue != null ? finishValue.hashCode() : 0);
        return hashCode;
    }
}
