package entities.characters;

public class Heihachi {
    private String name = "Heihachi";
    private Integer hp = 2800;
    private Integer power = 4300;
    private Integer magic = 3200;
    private Integer damageSpecial = 2900;

    private Integer overral = 94;

    public Heihachi() {
    }

    public Integer getOverral() {
        return overral;
    }

    public void setOverral(Integer overral) {
        this.overral = overral;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getMagic() {
        return magic;
    }

    public void setMagic(Integer magic) {
        this.magic = magic;
    }

    public Integer getDamageSpecial() {
        return damageSpecial;
    }

    public void setDamageSpecial(Integer damageSpecial) {
        this.damageSpecial = damageSpecial;
    }


    @Override
    public String toString() {
        return "name: " + name + '\'' +
                ", hp: " + hp +
                ", power: " + power +
                ", magic: " + magic +
                ", damageSpecial: " + damageSpecial +
                ", overral: " + overral;
    }
}

