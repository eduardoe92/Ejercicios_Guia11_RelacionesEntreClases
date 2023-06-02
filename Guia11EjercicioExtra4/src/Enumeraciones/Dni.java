package Enumeraciones;

public enum Dni {

    DNI_1(52345678, 0), DNI_2(98765432, 1), DNI_3(54321678, 2), DNI_4(87654321, 3), DNI_5(13579246, 4),
    DNI_6(86420974, 5), DNI_7(25874196, 6), DNI_8(96385274, 7), DNI_9(74185296, 8), DNI_10(36985214, 9),
    DNI_11(58274963, 10), DNI_12(10293847, 11), DNI_13(65472918, 12), DNI_14(38291746, 13), DNI_15(49278163, 14),
    DNI_16(83746592, 15), DNI_17(51627384, 16), DNI_18(29384756, 17), DNI_19(74619283, 18), DNI_20(62173849, 19),
    DNI_21(48593627, 20), DNI_22(17928364, 21), DNI_23(46382917, 22), DNI_24(72638194, 23), DNI_25(91827364, 24),
    DNI_26(63749218, 25), DNI_27(38472636, 26), DNI_28(72639481, 27), DNI_29(93847562, 28), DNI_30(57283946, 29);

    private Integer dni;
    private Integer posicion;

    private Dni(Integer dni, Integer posicion) {
        this.dni = dni;
        this.posicion = posicion;
    }

    public Integer getDni() {
        return dni;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }
}
