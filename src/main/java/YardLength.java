public class YardLength extends Length {
    public YardLength(double value, Unit unit) {
        super(value, unit);
    }

    @Override
    protected double newValueIn(Unit unit) {
        if (unit == Unit.Inch) {
            return this.value * 36;
        }
        if (unit == Unit.Foot) {
            return this.value * 3;
        }
        return this.value;
    }
}
