package domain;

/**
 * Created by 张瑞 on 2019/3/4.
 */
public abstract class Player {
    private  String name;

    Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void play();
}
