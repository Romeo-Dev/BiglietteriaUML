import java.sql.*;

public class UtenteDto {
	
	static String nomeDto;
	
	public static void setNomeDto(ResultSet myRs) throws SQLException {
		nomeDto = myRs.getString("Nome");
	}
	
	public static String getNomeDto() {
		return nomeDto;
	}
}
