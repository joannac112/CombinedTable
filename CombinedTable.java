public class CombinedTable{
    private SingleTable one;
    private SingleTable two;
    public CombinedTable(SingleTable o, SingleTable t){
        one = o;
        two = t;
    }
    public canSeat(int num){
        return one.getNumSeats(one) + two.getNumSeats(two) - 2 >= num;
    }
}