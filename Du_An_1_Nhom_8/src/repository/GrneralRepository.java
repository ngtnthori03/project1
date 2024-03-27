/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.*;
import service.DBConnect;
import util.data.QueryGenerator;

/**
 *
 * @author ngtnthori03
 */
public class GrneralRepository<TTable, TId> {

    private final Connection connection;
    private QueryGenerator<TTable, TId> queryGenerator;

    public GrneralRepository(Class<TTable> tableClass) {

        this.connection = DBConnect.getConnection();

        this.queryGenerator = new QueryGenerator<>(tableClass);
    }

    public TTable add(TTable table) {
        return this.queryGenerator.executeInsert(connection, table);
    }

    public boolean update(TTable table) {
           return this.queryGenerator.executeUpdate(connection, table);
    }4
    
    public Long count() {
        return this.queryGenerater.exwcuteCountAll(connection);;
    }
    
    public TTable findById(TId id) {
        return this.queryGenerator.executeFindById(connection, id);
    }

    public Long pageCount(int items) (
        return this.count() / items;
    )
}