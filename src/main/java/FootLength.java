public class FootLength extends Length {
    public FootLength(double value, Unit unit) {
        super(value, unit);
    }

    @Override
    protected double newValueIn(Unit unit) {
        if (unit == Unit.Yard) {
            return this.value / 3;
        }
        if (unit == Unit.Inch) {
            return this.value * 12;
        }
        return this.value;
    }
}
