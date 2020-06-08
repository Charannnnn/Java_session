class Pokemon //superclass
{
	//overridden
	void moving()
	{
		System.out.println( "I'm moving...");
	}

}

class Poketype extends Pokemon
{
	//overriding
	void moving()
	{
		System.out.println("Im inside poketype");
	}
}

class Pikachu extends Poketype//subclass
{
	void attacks()
	{
		System.out.println("attacking...");
	}

}

class TestPokemon
{
	public static void main(String[] args) {
		Pokemon obj=new Pokemon();
		obj.moving();
		obj=new Poketype();
		obj.moving();
		// obj.attacks();

	}
}