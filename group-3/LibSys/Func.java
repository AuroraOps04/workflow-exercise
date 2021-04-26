package LibSys;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class Func implements Funct {
    Conn conn = new Conn();
    Connection connection = conn.getConnection();
	@Override
    public void add(String id, String name) {
    }

    @Override
    public void delete(String id) {
    }

    @Override
    public void update(String id, String name) {
    }

    @Override
    public void select() {
    }

    @Override
    public void recommend() {
    }
}
