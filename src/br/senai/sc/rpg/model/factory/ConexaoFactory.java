package br.senai.sc.rpg.model.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {

    private final String URL = "jdbc:mysql://localhost:3306/rpgeditor";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";

    public Connection conectaDB() {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException("Erro na Conexão!");
        }
    }
}
