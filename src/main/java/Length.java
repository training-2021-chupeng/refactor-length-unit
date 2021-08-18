public abstract class Length {
    protected final double value;
    protected final Unit unit;

    protected Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length createLength(double value, Unit unit) {
        switch (unit) {
            case Foot:
                return new FootLength(value, unit);
            case Yard:
                return new YardLength(value, unit);
            case Inch:
                return new InchLength(value, unit);
            default:
                throw new IllegalStateException("Unexpected value: " + unit);
        }
    }

    public Length as(Unit unit) {
        double newValue = newValueIn(unit);
        return createLength(newValue, unit);
    }

    protected abstract double newValueIn(Unit unit);

    public double getValue() {
        return this.value;
    }

    public Unit getUnit() {
        return unit;
    }
}
