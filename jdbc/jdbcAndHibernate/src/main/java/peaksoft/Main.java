package peaksoft;

import peaksoft.dao.UserDao;
import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.model.User;
import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;
import peaksoft.service.UserServiceImplH;

public class Main
{
    public static void main(String[] arg) {
        // реализуйте алгоритм здесь



        //UserDaoHibernateImpl userDaoJdbc = new UserDaoHibernateImpl();
        UserServiceImplH userServiceImplH = new UserServiceImplH();
       // userServiceImplH.createUsersTable();
       // userServiceImplH.dropUsersTable();
       // userServiceImplH.saveUser("Maha","Islamidinov", (byte) 16);
//        userDaoHibernate.saveUser("Maha","Islamidinov",(byte)12 );
//        userDaoHibernate.saveUser("Akyl ","Abdashimov",(byte)2 );
//        userDaoHibernate.saveUser("Kanat ","Subanov",(byte)12 );
//        userDaoHibernate.removeUserById(1);
//        for (User u: userDaoHibernate.getAllUsers()) {
//            System.out.println(u);
//        }


//        userDaoHibernate.cleanUsersTable();
//        userDaoHibernate.createUsersTable();
//         userDaoHibernate.createUsersTable();
//        userDaoHibernate.dropUsersTable();
//        UserDaoJdbcImpl userDaoHibernate = null;
//        userDaoHibernate.saveUser("Kanat","Subanov", (byte) 23);
//        userDaoHibernate.saveUser("Aza","Azamatov", (byte) 13);
//        userDaoHibernate.saveUser("Muhammed","Allanov", (byte) 12);
//        userDaoHibernate.saveUser("Joma","Joma", (byte) 12);
        // userDaoHibernate.dropUsersTable();
//        System.out.println(userDaoHibernate.getAllUsers());
        //  userDaoHibernate.cleanUsersTable();
//        userDaoHibernate.removeUserById(1);
//        UserDaoHibernateImpl userDaoHibernate = null;
//        userDaoHibernate.createUsersTable();
        //   System.out.println(userDaoHibernate.getAllUsers());
//userDaoHibernate.cleanUsersTable();

        // userDaoHibernate.removeUserById(9);
    }
}

