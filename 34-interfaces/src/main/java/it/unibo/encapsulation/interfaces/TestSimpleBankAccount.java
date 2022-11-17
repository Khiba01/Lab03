package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        final AccountHolder a = new AccountHolder("Andrea", "Rossi", 1);

        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        final AccountHolder b = new AccountHolder("Alex", "Bianchi", 2);

        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount A = new SimpleBankAccount(1, 800);
        SimpleBankAccount B = new SimpleBankAccount(2, 9000);
        // 4) Effettuare una serie di depositi e prelievi
        A.deposit(1, 98);
        B.withdraw(1, 69);
        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println(A.getBalance());
        System.out.println(B.getBalance());
        // 6) Provare a prelevare fornendo un id utente sbagliato
        A.withdraw(9, 900000);
        // 7) Controllare nuovamente l'ammontare
        System.out.println(A.getBalance());
        System.out.println(B.getBalance());
        System.out.println("YOOOOOOO");
    }
}
