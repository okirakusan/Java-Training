import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class InsertStudent{

  public static void main(String[] args){
  
    final String URL = "jdbc:mysql://127.0.0.1:3306/sampledb";
    final String USER = "root";
    final String PASS = "PASS";
    String sql = "INSERT INTO student VALUES(6,'小林',95)";
    
    Connection con = null;
    Statement stmt = null;

    try{
      //⓵DBに接続
      con = DriverManager.getConnection(URL, USER, PASS);
      //⓶ステートメントを生成
      stmt = con.createStatement();
      //⓷SQLを実行
      int count = stmt.executeUpdate(sql);      
      System.out.println( count + "件更新しました");
    } catch(Exception e){
      e.printStackTrace();
    } finally {
      try{
        //リソースを開放
        if(stmt != null) stmt.close();
        if(con != null) con.close();
      } catch(Exception e){
        e.printStackTrace();
      }
    }
  }
}

