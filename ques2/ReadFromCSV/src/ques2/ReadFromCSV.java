package ques2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.stream.Stream;

public class ReadFromCSV {
	public static void main(String[] args) {
		String txtFileName = "D:\\Chennai Trainnings\\ques2\\pending\\delhi_weather.csv";
		String jdbcURL = "jdbc:mysql://localhost:3306/userdb";
		String username = "root";
		String password = "P@ssw0rd@11443";
		Connection connection = null;
		int i = 1000, j = 0;
		try (Stream<String> stream = Files.lines(Paths.get(txtFileName))) {
			Iterator<String> mydata = stream.iterator();
			mydata.next();
			connection = DriverManager.getConnection(jdbcURL, username, password);
			String sql = "INSERT INTO Weather(id,datetime_utc,conds,dewptm,fog,hail,hum,pressurem,rain,snow,tempm,thunder,tornado,wdire,city) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(sql);
			while (mydata.hasNext()) {
				i++;
				j++;
				String[] data = mydata.next().split(",");
				String date[] = data[0].split("-");
				Date date1 = new SimpleDateFormat("yyyyddmm").parse(date[0]);
				String pattern = "yyyy/dd/mm-hh:ss";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				String ndate = simpleDateFormat.format(date1);
				statement.setInt(1, i);
				statement.setString(2, ndate);
				statement.setString(3, data[1]);
				statement.setString(4, data[2]);
				statement.setString(5, data[3]);
				statement.setString(6, data[4]);
				statement.setString(7, data[5]);
				statement.setString(8, data[6]);
				statement.setString(9, data[7]);
				statement.setString(10, data[8]);
				statement.setString(11, data[9]);
				statement.setString(12, data[10]);
				statement.setString(13, data[11]);
				statement.setString(14, data[12]);
				statement.setString(15, "delhi");
				statement.addBatch();
				if (j % 5000 == 0) {
					System.out.println(i);
					System.out.println(i);
					statement.executeBatch();
				}
			}
			statement.executeBatch();
			connection.close();
			Path temp = Files.move(Paths.get(txtFileName),
					Paths.get("D:\\Chennai Trainnings\\ques2\\done\\delhi_weather.csv"));
			if (temp != null) {
				System.out.println("File  moved successfully");
			} else {
				System.out.println("Failed to move the file");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
