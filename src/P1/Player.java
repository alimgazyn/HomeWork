package P1;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                // TODO заполнить слоты оружием
                new BigGun(),
                new WaterPistol(),
                new Automatic(),
                new Pistol(),
                new Slingshot()
        };
    }

    public int getSlotsCount() {

        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO если значение slot больше значения последнего элемента массива, то
        if (slot > weaponSlots.length-1 || slot < 0) {
            System.out.println("Некорректный слот");
            return;
        }
        // выйти из метода написав об этом в консоль
        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}
