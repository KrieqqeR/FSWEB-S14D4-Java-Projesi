package MonsterForSimpleRPGGame;

public class Main {
    public static void main(String[] args) {
        Warewolf kurtAdam = new Warewolf("Kurt Adam", 100, 20.0);

        // Canavarın özelliklerini yazdırın
        System.out.println("Canavar Adı: " + kurtAdam.getName());
        System.out.println("Canavarın Can Puanı: " + kurtAdam.getHitPoints());
        System.out.println("Canavarın Hasarı: " + kurtAdam.getDamage());

        // Canavarın saldırısını yapın ve sonucu yazdırın
        double saldiriSonucu = kurtAdam.attack();
        System.out.println("Canavarın Saldırı Sonucu: " + saldiriSonucu);
    }
}
