package com.company;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    /*
    Kreirati bazu korisnici i u njoj tabelu:
    create table users (
    id int unsigned auto_increment not null,
    ime varchar(32) not null,
    prezime varchar(32) not null,
    adresa  varchar(100),
    telefon varchar(100),
    godina int,
    primary key (id)
    );
     */
    private java.sql.Connection con = null;
    private String url = "jdbc:mysql://localhost/korisnici";
    private String user = "root";
    private String password = "";

    public static void main(String[] args) {

        new Main();
    }

    public Main() {
        try {
            con = DriverManager.getConnection(url, user, password);
            Statement st = (Statement) con.createStatement();
            st.execute("INSERT INTO users (ime,prezime,adresa,telefon,godina) "
                    + "" + "VALUES ('Vladan','Cupric','Kopaonicka 48','0601531174',37)");
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }
}