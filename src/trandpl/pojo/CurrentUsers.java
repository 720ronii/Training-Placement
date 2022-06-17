/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.pojo;

public class CurrentUsers {

    public static String getUsersId() {
        return usersId;
    }

    public static void setUserId(String usersId) {
        CurrentUsers.usersId = usersId;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        CurrentUsers.name = name;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        CurrentUsers.id = id;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        CurrentUsers.type = type;
    }
    private static  String usersId;
    private static String name;
    private static String id;
    private static String type;
    
    
}
