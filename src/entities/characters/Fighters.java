package entities.characters;

public abstract class Fighters{

    private String name;
    private Integer hp ;
    private Integer power;
    private Integer magic;
    private Integer damageSpecial;
    private Integer overral;

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

    public Integer getOverral() {
        return overral;
    }

    public void setOverral(Integer overral) {
        this.overral = overral;
    }
}
