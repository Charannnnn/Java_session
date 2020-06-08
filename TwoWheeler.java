interface Bike
{
	int speed=50;
	public int dist();
}
interface Cycle
{
	int dist=150;
	public int speed();
}
public class TwoWheeler implements Bike,Cycle
{
	int tot_dist;
	int avg_speed;
	public int dist()
	{
		tot_dist=speed*dist;
		return tot_dist;
	}
	public int speed()
	{
		avg_speed=tot_dist/speed;
		return avg_speed;
	}

	public static void main(String[] args) {
		TwoWheeler t=new TwoWheeler();
		System.out.println(t.dist());
		System.out.println(t.speed());
	}
}