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
}
