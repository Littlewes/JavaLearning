package littlewes;

public class Monster{

    public final String TOMBSTONE = "Here Lies a Dead Monster";

    private double health = 500.0;
    private int attack = 20;
    private int movement = 2;
    private int XPosition = 0;
    private int YPosition = 0;
    private boolean alive = true;

    public String name = "Big Monster";

    public int getAttack()
    {
        return attack;
    }

    public int getMovement()
    {
        return movement;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int decreaseHealth)
    {
        health = health - decreaseHealth;
        if (health < 0)
        {
            alive = false;
        }
    }

    public void setHealth(double decrease){        
        health = health - decrease;
        if (health < 0.0) {
            alive = false;
        }
    }

    public Monster(int newHealth, int newAttack, int newMovement)
    {
        health = newHealth;
        attack = newAttack;
        movement = newMovement;
    }
    // Default Constructor

    public Monster()
    {

    }



}
