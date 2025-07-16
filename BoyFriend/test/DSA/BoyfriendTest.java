package DSA;

import org.junit.jupiter.api.Test;

public class BoyfriendTest {
    @Test
    public void testCookWithMainLandBabe() {
        Boyfriend Uzor = new Boyfriend(new MainLandBabe());
        Uzor.cook();
    }
    @Test
    public void testCookWithIslandBabe() {
        Boyfriend Uzor = new Boyfriend(new IslandBabe());
        Uzor.cook();
    }

    @Test
    public void testSwitchFromMainLandToIsland() {
        Boyfriend Uzor = new Boyfriend(new MainLandBabe());
        Uzor.cook();
        Uzor.setGirlfriend(new IslandBabe());
        Uzor.cook();
    }
    @Test
    public void testSwitchFromIslandToMainLand() {
        Boyfriend Uzor = new Boyfriend(new IslandBabe());
        Uzor.cook();
        Uzor.setGirlfriend(new MainLandBabe());
        Uzor.cook();
    }
    @Test
    public void testMultipleCooksSameGirlFriend() {
        Boyfriend Uzor = new Boyfriend(new MainLandBabe());
        Uzor.cook();
        Uzor.cook();
        Uzor.cook();
    }
    @Test
    public void testCreateBoyfriendWithNullGirlfriend() {
        Boyfriend uzor = new Boyfriend(null);
    }
    @Test
    public void testSetGirlfriendToNull() {
        Boyfriend uzor = new Boyfriend(new MainLandBabe());
        uzor.setGirlfriend(null);
    }
    @Test
    public void testCookAfterSettingNullGirlfriend() {
        Boyfriend uzor = new Boyfriend(new MainLandBabe());
        uzor.setGirlfriend(null);
        try {
            uzor.cook();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected.");
        }
    }
    @Test
    public void testCookAfterResettingGirlfriend() {
        Boyfriend uzor = new Boyfriend(new IslandBabe());
        uzor.cook();
        uzor.setGirlfriend(new MainLandBabe());
        uzor.cook();
        uzor.setGirlfriend(new IslandBabe());
        uzor.cook();
    }
    @Test
    public void testCookWithNewMainLandBabeInstance() {
        Boyfriend uzor = new Boyfriend(new MainLandBabe());
        uzor.cook();
        uzor.setGirlfriend(new MainLandBabe());
        uzor.cook();
    }
    @Test
    public void testCookWithNewIslandBabeInstance() {
        Boyfriend uzor = new Boyfriend(new IslandBabe());
        uzor.cook();
        uzor.setGirlfriend(new IslandBabe());
        uzor.cook();
    }
    @Test
    public void testCookWithoutChangingGirlfriend() {
        Boyfriend uzor = new Boyfriend(new MainLandBabe());
        for (int count = 0; count < 5; count++) {
            uzor.cook();
        }
    }

}
