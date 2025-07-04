package DSA;

import org.junit.jupiter.api.Test;

public class GeoPoliticalZonesTest {

    @Test
    public void GeoPoliticalZonesTest(){
        GeoPoliticalZones geoPoliticalZones = GeoPoliticalZones.NORTHCENTRAL;
    }

    @Test
    public void GeoPoliticalZonesTest2(){
        GeoPoliticalZones geoPoliticalZones = GeoPoliticalZones.NORTHCENTRAL;
        for(GeoPoliticalZones food: GeoPoliticalZones.values()){
            if(food.equals(GeoPoliticalZones.NORTHCENTRAL)){
                System.out.println(food.getPoliticalZones());

            }
        }

    }


}
