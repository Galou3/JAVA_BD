package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.sql.PreparedStatement;
import java.sql.SQLException;
public class EntityManagerImplTest {

/*    public static void main(String[] args) {
        EntityManagerImpl em = new EntityManagerImpl();
        try {
            for (long i = 0; i < 4; i++) {

                Club BIBI = new Club(i, (int) (i * i + i + 3), "Evan", 5.95);
                System.out.println("Galou : Test de vérification");
                PreparedStatement ajax = em.connection.prepareStatement("INSERT INTO Club (id, fabricant, poids) VALUES (?, ?, ?)");
                ajax.setLong(1, BIBI.getId());
                ajax.setString(2, BIBI.getFabricant());
                ajax.setDouble(3,BIBI.getPoids());
                ajax.executeUpdate();
                Club trouve = em.find(Club.class, BIBI.getId());
                Club club = new Club();
                club.setFabricant("GAGOU");
                club.setPoids(10.3);

                em.persist(club);

                System.out.println(trouve.toString());


            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
*/
    @Test
    public void testPersistence() {
        Club club = new Club();
        club.setFabricant("GAGOU");
        club.setPoids(10.3);
        EntityManagerImpl em = new EntityManagerImpl();
        em.persist(club);
    }

    @Test
    public void testFind() throws SQLException {
        Club club = new Club();
        club.setFabricant("GAGOU");
        club.setPoids(10.3);
        EntityManagerImpl em = new EntityManagerImpl();
        em.persist(club);
        Long id = club.getId();

        Club trouve = em.find(Club.class, id);
        Assert.assertEquals(club.getFabricant(), trouve.getFabricant());
        Assert.assertEquals(club.getPoids(), trouve.getPoids(), 0.0);
    }

}