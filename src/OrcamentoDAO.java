

import java.sql.*;

public class OrcamentoDAO {
    private Connection connection;

    public OrcamentoDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvar(Orcamento orcamento) throws SQLException {
        try (PreparedStatement preparedStatement = connection
                .prepareStatement("INSERT INTO orcamentos (profissional_nome, total_horas, custo_final) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setString(1, orcamento.getProfissional());
            preparedStatement.setDouble(2, orcamento.getTotalHoras());
            preparedStatement.setDouble(3, orcamento.getCustoFinal());

            preparedStatement.execute();

            try (ResultSet resultSet = preparedStatement.getGeneratedKeys()){
                while (resultSet.next()) {
                    orcamento.setId(resultSet.getInt(1));
                }
            }
        }
    }
}
