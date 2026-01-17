package com.harshit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TruckServices {
    public void addTruck(Truck truck){
        String query = "insert into truck (company, model, T_num, driver) values (?, ?, ?, ?)";
        try{
            Connection connection = ConnectionDetail.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, truck.getCompany());
            preparedStatement.setString(2, truck.getModel());
            preparedStatement.setInt(3, truck.getTNumber());
            preparedStatement.setString(4, truck.getDriver());
            int update = preparedStatement.executeUpdate();
            if(update>0){
                System.out.println("Successfully added");
            }else{
                System.out.println("Error occurs!! while adding");
            }
            System.out.println("Total adding updates: "+ update);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Truck getTruck(int id){
        String query = "select * from truck where id = ?";
        Truck truck = new Truck();
        try{
            Connection connection = ConnectionDetail.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                truck.setId(resultSet.getInt("id"));
                truck.setCompany(resultSet.getString("company"));
                truck.setModel(resultSet.getString("model"));
                truck.setTNumber(resultSet.getInt("T_num"));
                truck.setDriver(resultSet.getString("driver"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return truck;
    }

    public void updateTruck(Truck truck){
        String query = "update truck set company = ?, model = ?, T_num = ?, driver = ? where id = ?";
        try{
            Connection connection = ConnectionDetail.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, truck.getCompany());
            preparedStatement.setString(2, truck.getModel());
            preparedStatement.setInt(3, truck.getTNumber());
            preparedStatement.setString(4, truck.getDriver());
            preparedStatement.setInt(5, truck.getId());
            int update = preparedStatement.executeUpdate();
            if(update>0){
                System.out.println("Successfully updated");
            }else{
                System.out.println("Error occurs!!");
            }
            System.out.println("Total updates: "+ update);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Truck> getAllTruck(){
        List<Truck> list = new ArrayList<>();
        String query = "select * from truck";
        try {
            Connection connection = ConnectionDetail.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Truck truck = new Truck();
                truck.setId(resultSet.getInt("id"));
                truck.setCompany(resultSet.getString("company"));
                truck.setModel(resultSet.getString("model"));
                truck.setTNumber(resultSet.getInt("T_num"));
                truck.setDriver(resultSet.getString("driver"));
                list.add(truck);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void deleteTruck(int id){
        String query = "delete from truck where id = ?";
        try {
            Connection connection = ConnectionDetail.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            int i = preparedStatement.executeUpdate();
            System.out.println("Row Deleted: " + i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
