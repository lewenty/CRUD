package com.company.service;

import com.company.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    DataSource dataSource;


    public CustomerServiceImpl() {
    }


    @Override
    public Customer create(Customer customer) {
        String sql = "INSERT INTO crudcustomer(tckn, adi, soyadi, unvani) VALUES (?,?,?,?)";
        JdbcTemplate insert = new JdbcTemplate(dataSource);
        insert.update(sql
                ,
                new Object[]{customer.getTckn(),
                        customer.getAdi(),
                        customer.getSoyadi(),
                        customer.getUnvani()
                }
        );


        return null;
    }

    @Override
    public Customer delete(Customer customer) {
        String sql = "DELETE FROM crudcustomer WHERE id= ?";
        JdbcTemplate insert = new JdbcTemplate(dataSource);
        insert.update(sql, new Object[]{customer.getId()});
        return null;
    }

    @Override
    public List<Customer> findAll() {

        String sql = "SELECT * FROM crudcustomer";
        List<Customer> cust = new ArrayList<Customer>();
        JdbcTemplate jdbcTemp = new JdbcTemplate(dataSource);
        List<Map<String, Object>> rows = jdbcTemp.queryForList(sql);
        Customer item;

        for (Map<?, ?> row : rows) {

            item = new Customer();
            item.setId((Integer) row.get("id"));
            item.setAdi((String) row.get("adi"));
            item.setSoyadi((String) row.get("soyadi"));
            item.setTckn((String) row.get("tckn"));
            item.setUnvani((String) row.get("unvani"));

            cust.add(item);

        }

        return cust;
    }

    @Override
    public Customer update(Customer customer) {


        String sql = "UPDATE crudcustomer SET tckn= ?, adi= ?, soyadi= ?, unvani=?  WHERE id=?";
        JdbcTemplate insert = new JdbcTemplate(dataSource);
        insert.update(sql, new Object[]{customer.getTckn(), customer.getAdi(), customer.getSoyadi(), customer.getUnvani(), customer.getId()});

        return null;
    }

    @Override
    public List<Customer> findById(Customer customer) {

        String sql = "SELECT *  FROM crudcustomer WHERE id= ?";
        List<Customer> cust = new ArrayList<Customer>();
        JdbcTemplate jdbcTemp = new JdbcTemplate(dataSource);
        //jdbcTemp.update(sql,new Object[]{customer.getId()});
        List<Map<String, Object>> rows = jdbcTemp.queryForList(sql, new Object[]{customer.getId()});

        Customer item;

        for (Map<?, ?> row : rows) {

            item = new Customer();
            item.setId((Integer) row.get("id"));
            item.setAdi((String) row.get("adi"));
            item.setSoyadi((String) row.get("soyadi"));
            item.setTckn((String) row.get("tckn"));
            item.setUnvani((String) row.get("unvani"));

            cust.add(item);

        }

        return cust;

    }

    @Override
    public List<Customer> search(Customer customer) {
        String sql = "SELECT *  FROM crudcustomer WHERE tckn= ? OR adi = ?  OR soyadi=? OR unvani=?  ";
        List<Customer> cust = new ArrayList<Customer>();
        JdbcTemplate jdbcTemp = new JdbcTemplate(dataSource);
        //jdbcTemp.update(sql,new Object[]{customer.getId()});
        List<Map<String, Object>> rows = jdbcTemp.queryForList(sql, new Object[]{
                customer.getTckn(),
                customer.getAdi(),
                customer.getSoyadi(),
                customer.getUnvani()
        });

        System.out.println(customer.getTckn());

        Customer item;

        for (Map<?, ?> row : rows) {

            item = new Customer();
            item.setId((Integer) row.get("id"));
            item.setAdi((String) row.get("adi"));
            item.setSoyadi((String) row.get("soyadi"));
            item.setTckn((String) row.get("tckn"));
            item.setUnvani((String) row.get("unvani"));

            cust.add(item);

        }

        return cust;

    }
}
