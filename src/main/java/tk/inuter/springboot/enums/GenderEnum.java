package tk.inuter.springboot.enums;

public enum GenderEnum {
    MALE(1),
    FEMALE(2);
    
    private int id;

    GenderEnum(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static GenderEnum getEnumById(int id) {
        for (GenderEnum gender : GenderEnum.values()) {
            if (gender.getId() == id) {
                return gender;
            }
        }
        return null;
    }

    public static GenderEnum getEnumByName(String name) {
        try {
            GenderEnum gender = GenderEnum.valueOf(name);
            return gender;
        } catch (Exception e) {
            return null;
        }
    }
}
