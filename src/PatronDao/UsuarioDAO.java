package PatronDao;

import java.sql.Connection;

public class UsuarioDAO {
    private Connection con;

    public UsuarioDAO(Connection con) {
        this.con= con;
    }
}
