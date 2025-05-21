package org.scoula.jdbc_ex.dao;

import org.junit.jupiter.api.*;
import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SushiDaoImplTest {
    SushiDao dao;

    @BeforeEach
    void setUp() throws SQLException {
        dao = new SushiDaoImpl();

        Connection conn = JDBCUtil.getConnection();
        conn.createStatement().executeUpdate("DELETE FROM sushi_log");
        conn.createStatement().executeUpdate("DELETE FROM customer");
        dao.insertCustomer("cust01", "김초밥");
    }

    @Test
    @DisplayName("고객 등록 성공 테스트")
    @Order(1)
    void insertCustomer() throws SQLException{
        dao.insertCustomer("cust02", "이연어");
        int result = dao.insertCustomer("cust02", "이연어");
        assertEquals(1, result);
    }

    @Test
    void insertSushiLog() throws SQLException{
        dao.insertCustomer("cust02", "red");
        int result = dao.insertSushiLog("cust02", "red");
        assertEquals(1, result);
    }
}