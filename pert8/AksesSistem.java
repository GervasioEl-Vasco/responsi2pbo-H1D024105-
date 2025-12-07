package pert8;

public interface AksesSistem {

    // ==========================================================
    // METHOD ABSTRAK (WAJIB DIIMPLEMENTASIKAN DI CLASS ProgramerMagang)
    // ==========================================================

    // DEKLARASI METHOD 1: login
    void login(String pin);

    // DEKLARASI METHOD 2: logout
    void logout();

    // ==========================================================
    // DEFAULT METHOD (OPSIONAL DI-OVERRIDE)
    // ==========================================================

    // DEKLARASI DEFAULT METHOD: getRoleAkses
    default String getRoleAkses() {
        return "Staff Biasa";
    }
}