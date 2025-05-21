package org.scoula.jdbc_ex.dao;

import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.*;

public class SushiDaoImpl implements SushiDao{
    private Connection conn = JDBCUtil.getConnection();

    //고객 등록 기능
    public int insertCustomer(String id, String name) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement("insert into customer values(?,?)")) {
            stmt.setString(1, id);
            stmt.setString(2, name);
            return stmt.executeUpdate();
        }
    }

    //접시 기록 기능
    public int insertSushiLog(String customerId, String palteColor) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement("insert into sushi_log (customer_id, plate_color) values(?,?)")) {
            stmt.setString(1, customerId);
            stmt.setString(2, palteColor);
            return stmt.executeUpdate();
        }
    }

    @Override
    public void printSushiLogByCustomer(String customerId) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement("select * from sushi_log order by eaten_at desc")) {
            try (ResultSet rs = )
        }
    }
}
