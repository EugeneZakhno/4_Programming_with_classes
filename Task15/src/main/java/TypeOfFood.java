public enum TypeOfFood {
    NOT_INCLUDET,
    BREAKFAST,
    ALL_INCLUSIVE;


    @Override
    public String toString() {
        return super.toString().replace('_', ' ').toLowerCase();
    }
}
