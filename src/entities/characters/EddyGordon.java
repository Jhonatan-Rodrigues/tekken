package entities.characters;

public class EddyGordon {

    private String name = "Eddy gordon";
    private Integer hp = 2000;
    private Integer power = 2800;
    private Integer magic = 180;
    private Integer damageSpecial = 2700;
    private int overral = 93;

    public EddyGordon() {

    }

    public int getOverral() {
        return overral;
    }

    public void setOverral(int overral) {
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
