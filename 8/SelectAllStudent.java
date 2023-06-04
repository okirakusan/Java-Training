import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class SelectAllStudent{

  public static void main(String[] args){
  
    final String URL = "jdbc:mysql://127.0.0.1:3306/sampledb";
    final String USER = "root";
    final String PASS = "PASS";
    String sql = "SELECT * FROM student";
    
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try{
      //⓵DBに接続
      con = DriverManager.getConnection(URL, USER, PASS);
      //⓶ステートメントを生成
      stmt = con.createStatement();
      //⓷SQLを実行
      rs = stmt.executeQuery(sql);
      //⓸検索結果の処理
      System.out.println("+-------+-------+-------+");
      System.out.println("| no    | name  | score |");
      System.out.println("+-------+-------+-------+");
      while(rs.next()){
        System.out.print("| " + rs.getInt("no") + "\t");
        System.out.print("| " + rs.getString("name") + "\t");
        System.out.println("| " + rs.getInt("score") + "\t|");
      }
      System.out.println("+-------+-------+-------+");
    } catch(Exception e){
      e.printStackTrace();
    } finally {
      try{
        //⓹リソースを開放
        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
        if(con != null) con.close();
      } catch(Exception e){
        e.printStackTrace();
      }
    }
  }
}
