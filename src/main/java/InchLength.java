public class InchLength extends Length {
    public InchLength(double value, Unit unit) {
        super(value, unit);
    }

    @Override
    protected double newValueIn(Unit unit) {
        if (unit == Unit.Foot) {
            return this.value / 12;
        }
        if (unit == Unit.Yard) {
            return this.value / 36;
        }
        return this.value;
    }
}
