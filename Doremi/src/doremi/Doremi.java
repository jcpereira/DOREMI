package doremi;

import doremi.view.FTelaInicial;

/**
 *
 * @author João Carlos Luis Pereira
 *
 *
 * CREATE TABLE genero( id bigserial PRIMARY KEY, nome text );
 *
 * CREATE TABLE cantor( id bigserial PRIMARY KEY, nome text );
 *
 * CREATE TABLE musica( id bigserial PRIMARY KEY, cantor_fk bigint, genero_fk
 * bigint, musica text,letra text );
 *
 * ALTER TABLE musica add constraint musica_genero_id foreign key (genero_fk)
 * references genero (id);
 *
 * ALTER TABLE musica add constraint musica_cantor_id foreign key (cantor_fk)
 * references cantor (id);
 *
 */
public class Doremi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FTelaInicial ini = new FTelaInicial();
        ini.setLocationRelativeTo(null);
        ini.show();
    }

}
