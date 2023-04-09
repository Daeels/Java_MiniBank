package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Damso implements Initializable {

	@FXML
	private TextField op;
	@FXML
	private Label ob;

	@FXML
	private Label num;

	@FXML
	private Label pas;

	@FXML
	private Label ma;

	@FXML
	private Label pipi;

	@FXML
	private Label solde;

	@FXML
	private Label nom;

	@FXML
	private Label popo;

	@FXML
	private Label no;

	@FXML
	private Label su;

	@FXML
	private Label is;

	@FXML
	private TextField lil;

	@FXML
	private Label dop;

	@FXML
	private Label no2;

	@FXML
	private Label li;

	@FXML
	private Label em;

	@FXML
	private TextField cl;

	@FXML
	private TextField ck;

	@FXML
	private Label no1;

	@FXML
	private Label em1;

	@FXML
	private Label kl;

	@FXML
	private Label ko;

	@FXML
	private Label aff;

	@FXML
	private Label koko;

	@FXML
	private Label hi;

	@FXML
	private Label zh;

	static String blabla = "";
	static String bibi = "";
	static float BB = (float) 0.0;
	static float sos = (float) 0.0;
	static float weed = (float) 0.0;
	static float prane = (float) 0.0;

	public void list() throws Exception {

		Connection cnx;
		cnx = DB_connector.getConnection();
		PreparedStatement stat = null;
		ResultSet rs = null;
		String sql = "select * from compte_courant WHERE num_compte = ?";
		try {
			stat = cnx.prepareStatement(sql);
			stat.setString(1, op.getText().toString());
			rs = stat.executeQuery();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (op.getText().isEmpty()) {

			ob.setOpacity(1);
			pas.setOpacity(0);
		} else if (!rs.next()) {
			pas.setOpacity(1);
			ob.setOpacity(0);

		} else {
			blabla = rs.getString("num_compte");
			bibi = rs.getString("nom");
			Parent root = FXMLLoader.load(getClass().getResource("dodo.fxml"));
			Scene scene = new Scene(root);
			Image image = new Image("/icons/maes.png");
			Stage primaryStage = new Stage();
			primaryStage.getIcons().add(image);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Compte Courant.Daeels");
			primaryStage.show();
			ob.setOpacity(0);
			pas.setOpacity(0);
		}

	}

	public void cr() throws Exception {

		Connection cnx;
		cnx = DB_connector.getConnection();
		PreparedStatement stat = null;
		ResultSet rs = null;
		String sql = "select * from compte_remunere WHERE num = ?";
		try {
			stat = cnx.prepareStatement(sql);
			stat.setString(1, op.getText().toString());
			rs = stat.executeQuery();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (op.getText().isEmpty()) {

			ob.setOpacity(1);
			pas.setOpacity(0);
		} else if (!rs.next()) {
			pas.setOpacity(1);
			ob.setOpacity(0);

		} else {
			blabla = rs.getString("num");
			bibi = rs.getString("nom");
			Parent root = FXMLLoader.load(getClass().getResource("dada.fxml"));
			Scene scene = new Scene(root);
			Image image = new Image("/icons/maes.png");
			Stage primaryStage = new Stage();
			primaryStage.getIcons().add(image);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Compte remunere.Daeels");
			primaryStage.show();
			ob.setOpacity(0);
			pas.setOpacity(0);
		}
	}

	public void infos() throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("infos.fxml"));
		Scene scene = new Scene(root);
		Image image = new Image("/icons/maes.png");
		Stage primaryStage = new Stage();
		primaryStage.getIcons().add(image);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Infos.Daeels");
		primaryStage.show();

	}

	public void aff() throws Exception {
		Connection cnx;
		cnx = DB_connector.getConnection();
		PreparedStatement stat = null;
		ResultSet rs = null;
		String sql = "select * from compte_courant WHERE num_compte = ?";

		try {
			stat = cnx.prepareStatement(sql);
			stat.setString(1, blabla);
			rs = stat.executeQuery();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (rs.next()) {
			num.setText(blabla);
			nom.setText("Propriétaire: " + bibi);
			solde.setText(rs.getString("solde") + " DH");

		}

	}

	public void debit() throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("debit.fxml"));
		Scene scene = new Scene(root);
		Image image = new Image("/icons/maes.png");
		Stage primaryStage = new Stage();
		primaryStage.getIcons().add(image);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Debit.Daeels");
		primaryStage.show();

	}

	public void solde() throws SQLException {
		Connection cnx;
		cnx = DB_connector.getConnection();
		PreparedStatement stat = null;
		ResultSet rs = null;
		String sql = "select * from compte_courant WHERE num_compte = ?";

		try {
			stat = cnx.prepareStatement(sql);
			stat.setString(1, blabla);
			rs = stat.executeQuery();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (rs.next()) {
			popo.setText(rs.getString("solde") + " DH");

		}

	}

	public void deb() throws SQLException {
		Connection cnx;
		cnx = DB_connector.getConnection();
		PreparedStatement stat = null;
		ResultSet rs = null;
		String sql = "select * from compte_courant WHERE num_compte = ?";

		try {
			stat = cnx.prepareStatement(sql);
			stat.setString(1, blabla);
			rs = stat.executeQuery();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (rs.next()) {
			float solde = rs.getFloat("solde");
			if (!lil.getText().isEmpty()) {
				String tt = lil.getText().toString();
				float montant = Float.parseFloat(tt);
				if (solde - montant > 0) {
					try {
						Connection co;
						co = DB_connector.getConnection();
						PreparedStatement st = null;
						int res = 0;
						String sqli = "UPDATE compte_courant SET solde = ? WHERE num_compte = ?";

						st = co.prepareStatement(sqli);
						st.setFloat(1, solde - montant);
						st.setString(2, blabla);
						res = st.executeUpdate();
						if (res != 0) {
							su.setOpacity(1);
							is.setOpacity(0);
							no.setOpacity(0);
						} else {
							System.out.println("Erreur");
						}

					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					is.setOpacity(1);
					su.setOpacity(0);
					no.setOpacity(0);
				}
			} else {
				no.setOpacity(1);
				is.setOpacity(0);
				su.setOpacity(0);

			}

		}
	}

	public void credit() throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("credit.fxml"));
		Scene scene = new Scene(root);
		Image image = new Image("/icons/maes.png");
		Stage primaryStage = new Stage();
		primaryStage.getIcons().add(image);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Credit.Daeels");
		primaryStage.show();

	}

	public void soldi() throws SQLException {
		Connection cnx;
		cnx = DB_connector.getConnection();
		PreparedStatement stat = null;
		ResultSet rs = null;
		String sql = "select * from compte_courant WHERE num_compte = ?";

		try {
			stat = cnx.prepareStatement(sql);
			stat.setString(1, blabla);
			rs = stat.executeQuery();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (rs.next()) {
			dop.setText(rs.getString("solde") + " DH");

		}

	}

	public void cred() throws SQLException {
		if (ck.getText().isEmpty() || cl.getText().isEmpty()) {
			no2.setOpacity(1);
			no1.setOpacity(1);

		} else {
			Connection cnx;
			cnx = DB_connector.getConnection();
			PreparedStatement stat = null;
			ResultSet rs = null;
			String sql = "select * from compte_courant WHERE num_compte = ?";

			try {
				stat = cnx.prepareStatement(sql);
				stat.setString(1, blabla);
				rs = stat.executeQuery();

			} catch (Exception e) {
				System.out.println(e);
			}
			if (rs.next()) {
				BB = rs.getFloat("solde");

			}
			no2.setOpacity(0);
			no1.setOpacity(0);
			Connection conx;
			conx = DB_connector.getConnection();
			PreparedStatement stati = null;
			ResultSet rsi = null;
			String sqlu = "select * from compte_courant WHERE num_compte = ?";
			String num = ck.getText().toString();
			String tt = cl.getText().toString();
			float montant = Float.parseFloat(tt);
			try {
				stati = conx.prepareStatement(sqlu);
				stati.setString(1, num);
				rsi = stati.executeQuery();

			} catch (Exception e) {
				System.out.println(e);
			}
			if (rsi.next()) {
				float solde2 = rsi.getFloat("solde");
				if (BB - montant > 0) {
					try {
						Connection co;
						co = DB_connector.getConnection();
						PreparedStatement st = null;
						int res = 0;
						String sqli = "UPDATE compte_courant SET solde = ? WHERE num_compte = ?";

						st = co.prepareStatement(sqli);
						st.setFloat(1, solde2 + montant);
						st.setString(2, num);
						res = st.executeUpdate();
						if (res != 0) {
							li.setOpacity(1);
							no1.setOpacity(0);
							no2.setOpacity(0);
							em1.setOpacity(0);
							em.setOpacity(0);
							try {
								Connection coe;
								coe = DB_connector.getConnection();
								PreparedStatement ste = null;
								int rese = 0;
								String sqlie = "UPDATE compte_courant SET solde = ? WHERE num_compte = ?";

								ste = coe.prepareStatement(sqlie);
								ste.setFloat(1, BB - montant);
								ste.setString(2, blabla);
								rese = ste.executeUpdate();
								if (rese != 0) {
									li.setOpacity(1);
									no1.setOpacity(0);
									no2.setOpacity(0);
									em1.setOpacity(0);
									em.setOpacity(0);
								}
							} catch (Exception e) {
								e.printStackTrace();
							}

						} else {
							System.out.println("Erreur");
						}

					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					em.setOpacity(1);
				}
			} else {
				em1.setOpacity(1);
			}

		}
	}

	public void infos1() throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("infos 1.fxml"));
		Scene scene = new Scene(root);
		Image image = new Image("/icons/maes.png");
		Stage primaryStage = new Stage();
		primaryStage.getIcons().add(image);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Infos.Daeels");
		primaryStage.show();

	}

	public void aff1() throws Exception {
		Connection cnx;
		cnx = DB_connector.getConnection();
		PreparedStatement stat = null;
		ResultSet rs = null;
		String sql = "select * from compte_remunere WHERE num = ?";

		try {
			stat = cnx.prepareStatement(sql);
			stat.setString(1, blabla);
			rs = stat.executeQuery();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (rs.next()) {
			num.setText(blabla);
			nom.setText("Propriétaire: " + bibi);
			solde.setText(rs.getString("solde") + " DH");

		}

	}

	public void debit1() throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("debit1.fxml"));
		Scene scene = new Scene(root);
		Image image = new Image("/icons/maes.png");
		Stage primaryStage = new Stage();
		primaryStage.getIcons().add(image);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Debit.Daeels");
		primaryStage.show();

	}

	public void solde1() throws SQLException {
		Connection cnx;
		cnx = DB_connector.getConnection();
		PreparedStatement stat = null;
		ResultSet rs = null;
		String sql = "select * from compte_remunere WHERE num = ?";

		try {
			stat = cnx.prepareStatement(sql);
			stat.setString(1, blabla);
			rs = stat.executeQuery();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (rs.next()) {
			popo.setText(rs.getString("solde") + " DH");

		}

	}

	public void deb1() throws SQLException {
		Connection cnx;
		cnx = DB_connector.getConnection();
		PreparedStatement stat = null;
		ResultSet rs = null;
		String sql = "select * from compte_remunere WHERE num = ?";

		try {
			stat = cnx.prepareStatement(sql);
			stat.setString(1, blabla);
			rs = stat.executeQuery();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (rs.next()) {
			float solde = rs.getFloat("solde");
			if (!lil.getText().isEmpty()) {
				String tt = lil.getText().toString();
				float montant = Float.parseFloat(tt);
				if (solde - montant > 0) {
					try {
						Connection co;
						co = DB_connector.getConnection();
						PreparedStatement st = null;
						int res = 0;
						String sqli = "UPDATE compte_remunere SET solde = ? WHERE num= ?";

						st = co.prepareStatement(sqli);
						st.setFloat(1, solde - montant);
						st.setString(2, blabla);
						res = st.executeUpdate();
						if (res != 0) {
							su.setOpacity(1);
							is.setOpacity(0);
							no.setOpacity(0);
						} else {
							System.out.println("Erreur");
						}

					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					is.setOpacity(1);
					su.setOpacity(0);
					no.setOpacity(0);
				}
			} else {
				no.setOpacity(1);
				is.setOpacity(0);
				su.setOpacity(0);

			}

		}
	}

	public void credit1() throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("credit1.fxml"));
		Scene scene = new Scene(root);
		Image image = new Image("/icons/maes.png");
		Stage primaryStage = new Stage();
		primaryStage.getIcons().add(image);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Credit.Daeels");
		primaryStage.show();

	}

	public void soldi1() throws SQLException {
		Connection cnx;
		cnx = DB_connector.getConnection();
		PreparedStatement stat = null;
		ResultSet rs = null;
		String sql = "select * from compte_remunere WHERE num = ?";

		try {
			stat = cnx.prepareStatement(sql);
			stat.setString(1, blabla);
			rs = stat.executeQuery();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (rs.next()) {
			dop.setText(rs.getString("solde") + " DH");

		}

	}

	public void cred1() throws SQLException {
		if (ck.getText().isEmpty() || cl.getText().isEmpty()) {
			no2.setOpacity(1);
			no1.setOpacity(1);

		} else {
			Connection cnx;
			cnx = DB_connector.getConnection();
			PreparedStatement stat = null;
			ResultSet rs = null;
			String sql = "select * from compte_remunere WHERE num = ?";

			try {
				stat = cnx.prepareStatement(sql);
				stat.setString(1, blabla);
				rs = stat.executeQuery();

			} catch (Exception e) {
				System.out.println(e);
			}
			if (rs.next()) {
				BB = rs.getFloat("solde");

			}
			no2.setOpacity(0);
			no1.setOpacity(0);
			Connection conx;
			conx = DB_connector.getConnection();
			PreparedStatement stati = null;
			ResultSet rsi = null;
			String sqlu = "select * from compte_remunere WHERE num = ?";
			String num = ck.getText().toString();
			String tt = cl.getText().toString();
			float montant = Float.parseFloat(tt);
			try {
				stati = conx.prepareStatement(sqlu);
				stati.setString(1, num);
				rsi = stati.executeQuery();

			} catch (Exception e) {
				System.out.println(e);
			}
			if (rsi.next()) {
				float solde2 = rsi.getFloat("solde");
				if (BB - montant > 0) {
					try {
						Connection co;
						co = DB_connector.getConnection();
						PreparedStatement st = null;
						int res = 0;
						String sqli = "UPDATE compte_remunere SET solde = ? WHERE num = ?";

						st = co.prepareStatement(sqli);
						st.setFloat(1, solde2 + montant);
						st.setString(2, num);
						res = st.executeUpdate();
						if (res != 0) {
							li.setOpacity(1);
							no1.setOpacity(0);
							no2.setOpacity(0);
							em1.setOpacity(0);
							em.setOpacity(0);
							try {
								Connection coe;
								coe = DB_connector.getConnection();
								PreparedStatement ste = null;
								int rese = 0;
								String sqlie = "UPDATE compte_remunere SET solde = ? WHERE num = ?";

								ste = coe.prepareStatement(sqlie);
								ste.setFloat(1, BB - montant);
								ste.setString(2, blabla);
								rese = ste.executeUpdate();
								if (rese != 0) {
									li.setOpacity(1);
									no1.setOpacity(0);
									no2.setOpacity(0);
									em1.setOpacity(0);
									em.setOpacity(0);
								}
							} catch (Exception e) {
								e.printStackTrace();
							}

						} else {
							System.out.println("Erreur");
						}

					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					em.setOpacity(1);
				}
			} else {
				em1.setOpacity(1);
			}

		}
	}

	public void calcu() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("ci.fxml"));
		Scene scene = new Scene(root);
		Image image = new Image("/icons/maes.png");
		Stage primaryStage = new Stage();
		primaryStage.getIcons().add(image);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculer.Daeels");
		primaryStage.show();
	}

	public void kouz() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("kouz1.fxml"));
		Scene scene = new Scene(root);
		Image image = new Image("/icons/maes.png");
		Stage primaryStage = new Stage();
		primaryStage.getIcons().add(image);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Verser_interet.Daeels");
		primaryStage.show();
	}

	public void cia() throws SQLException {
		Connection cnx;
		cnx = DB_connector.getConnection();
		PreparedStatement stat = null;
		ResultSet rs = null;
		String sql = "select * from compte_remunere WHERE num = ?";

		try {
			stat = cnx.prepareStatement(sql);
			stat.setString(1, blabla);
			rs = stat.executeQuery();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (rs.next()) {
			kl.setText(rs.getString("solde") + " DH");
			sos = rs.getFloat("solde");

		}
	}

	public void cio() {
		if (0 < sos || sos < 1000) {
			float solde = (float) (sos * 0.05);
			weed = solde;
			String ss = String.valueOf(solde);
			ko.setText(ss);
		} else if (1000 < sos || sos < 3000) {
			float solde = (float) (sos * 0.1);
			weed = solde;
			String ss = String.valueOf(solde);
			ko.setText(ss);
		} else {
			float solde = (float) (sos * 0.2);
			weed = solde;
			String ss = String.valueOf(solde);
			ko.setText(ss);
		}

	}

	public void omg() {
		if (weed == 0) {
			hi.setOpacity(1);

		} else {
			String dd = String.valueOf(weed);
			aff.setText(dd);

		}

	}

	public void verser() {
		prane = sos + weed;
	}

	public void mifa() {
		if (prane == 0) {
			zh.setOpacity(1);

		} else {
			String dd = String.valueOf(prane);
			koko.setText(dd);
			try {
				Connection co;
				co = DB_connector.getConnection();
				PreparedStatement st = null;
				int res = 0;
				String sqli = "UPDATE compte_remunere SET solde = ? WHERE num = ?";

				st = co.prepareStatement(sqli);
				st.setFloat(1, prane);
				st.setString(2, blabla);
				res = st.executeUpdate();
				if (res != 0) {
					System.out.println("Done");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}
