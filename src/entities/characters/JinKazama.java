package entities.characters;


public class JinKazama extends Fighters{


    private String name = "Jin Kazama";
    private Integer hp = 2300;
    private Integer power = 4300;
    private Integer magic = 290;
    private Integer damageSpecial = 5000;
    private Integer overral = 95;

    public JinKazama() {

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
        return "The prodige : " + name + '\'' +
                ", hp: " + hp +
                ", power: " + power +
                ", magic: " + magic +
                ", damageSpecial: " + damageSpecial +
                ", overral: " + overral;
    }
}
