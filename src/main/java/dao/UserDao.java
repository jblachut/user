package dao;

import config.Database;
import domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private Database db;

    public UserDao(Database database){
        this.db =database;
    }

    //insert

    public void save(User user) throws SQLException {

        Connection connection = db.getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO user (first_name, last_name, email) " +
                "VALUES (?, ?, ?)");
        ps.setString(1,user.getFirsName());
        ps.setString(2,user.getLastName());
        ps.setString(3,user.getEmail());


        ps.executeUpdate();

    }
//update
    public void update(User user)throws SQLException {
        Connection connection = db.getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE user SET first_name=?, last_name=?, email=? " +
                  " WHERE id = ?");

        ps.setString(1,user.getFirsName());
        ps.setString(2,user.getLastName());
        ps.setString(3,user.getEmail());
        ps.setInt(4,user.getId());



        ps.executeUpdate();


    }

    public void delete (int id) throws  SQLException{
        Connection connection = db.getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE FROM user WHERE id = ?");
        ps.setInt(1,id);
        ps.executeUpdate();

    }
    //findAll
    public List<User> findAll () throws  SQLException{
        Connection connection = db.getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT id, first_name, last_name, email FROM user");
        ResultSet resultSet = ps.executeQuery();

        List<User> users = new ArrayList<User>();

        while (resultSet.next()){

            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String email = resultSet.getString("email");

            User user = new User(id, firstName, lastName, email);
            users.add(user);


        }
        return  users;

    }

    public User findById (int id)throws  SQLException{
        Connection connection = db.getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT id, first_name, last_name, email FROM user WHERE id=?");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();

        if(resultSet.next()){
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String email = resultSet.getString("email");
            User user = new User (id, firstName, lastName, email );
            return  new User(id, firstName, lastName, email);

        }
        return null;

    }




    //findbyId



}
