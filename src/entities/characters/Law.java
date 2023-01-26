package entities.characters;

public class Law {


    private String name = "Law";
    private Integer hp = 3200;
    private Integer power = 4300;
    private Integer magic = 300;
    private Integer damageSpecial = 4800;

    private Integer overral = 92;


    public Law() {

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
