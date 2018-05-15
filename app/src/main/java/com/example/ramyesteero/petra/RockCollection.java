package com.example.ramyesteero.petra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mitch on 5/14/18.
 */

public class RockCollection {
    private static final RockCollection _instance = new RockCollection();

    public static RockCollection getInstance() {
        return _instance;
    }

    private ArrayList<Rock> rocks = new ArrayList<>();
    private Map<String, Rock> rocksById = new HashMap<>();

    private RockCollection() {
        Rock granite1 = new Rock();
        granite1.name = "Granite - 1";
        granite1.id = "granite1";
        granite1.rockType = "Igneous";
        granite1.number = 10;
        granite1.lat = -79.6633388888889;
        granite1.lon = 43.54595;
        granite1.minerals = new String[]{"Biotite", "Quartz", "Feldspar", "Plagioclase"};
        granite1.texture = "This igneous rock is composed of equal sized crystals. The cleavage " +
                "in the biotite is particularly visible, identifiable as the flakiness in the " +
                "black mineral.";
        granite1.interpretation = "This plutonic rock formed through the slow cooling of a magma " +
                "chamber, providing the minerals sufficient time to form large crystals. The " +
                "composition is \"felsic,\" meaning it is rich in silica. These minerals must " +
                "have formed during the latter stages of cooling of magma as the rock is rich in " +
                "silicic minerals that crystallize later as they require a lower temperature for " +
                "crystallizing out of the magma.";
        granite1.pics = new String[]{"p1", "p2", "p3", "p4"};
        this.rocks.add(granite1);
        this.rocksById.put(granite1.id, granite1);

        Rock tonalite1 = new Rock();
        tonalite1.name = "Tonalite (Trondhjemite) - 1";
        tonalite1.id = "tonalite1";
        tonalite1.rockType = "Igneous";
        tonalite1.number = 11;
        tonalite1.lat = -79.66330555555557;
        tonalite1.lon = 43.54593333333333;
        tonalite1.minerals = new String[]{"Biotite", "Plagioclase", "Quartz"};
        tonalite1.texture = "This igneous rock is composed of equal sized crystals of the flaky, " +
                "black mineral biotite and the white mineral plagioclase.  The rock is deeply " +
                "pitted by weathering, and the brown spots indicate oxidation (rusting) of iron " +
                "minerals).";
        tonalite1.interpretation = "This igneous rock is a Trondhjemite, which is a " +
                "light-coloured" +
                " version (leucrocratic - ‘leuco’ - light coloured) of a Tonalite. The rock is " +
                "igneous and is formed through the slow cooling of a magma chamber, which allows " +
                "sufficient time for the crystallization of large crystals visible to the unaided" +
                " eye. The brown spots on the rocks' surface are evidence of \"oxidation,d\" in " +
                "which oxygen in the atmosphere and iron-rich minerals such as biotite react, " +
                "essentially causing the rock to rust. This, along with the deep pitting, suggest" +
                " that this boulder has been weathering on the surface of the Earth for a long " +
                "period of time.";
        tonalite1.pics = new String[]{"p1", "p2", "p3", "p4"};
        this.rocks.add(tonalite1);
        this.rocksById.put(tonalite1.id, tonalite1);

        Rock pegmatite1 = new Rock();
        pegmatite1.name = "Granite Pegmatite - 1";
        pegmatite1.id = "pegmatite1";
        pegmatite1.rockType = "Igneous";
        pegmatite1.number = 13;
        pegmatite1.lat = -79.66213611111111;
        pegmatite1.lon = 43.548513888888884;
        pegmatite1.minerals = new String[]{"Feldspar", "Quartz", "Pyroxene", "Biotite"};
        pegmatite1.texture = "This igneous rock is composed of equal sized crystals. The cleavage" +
                " " +
                "in the biotite is particularly visible, identifiable as the flakiness in the " +
                "black mineral. The extremely large crystals (up to several centimetres long) " +
                "mean that this rock is a \"pegmatite\".";
        pegmatite1.interpretation = "This plutonic, igneous rock is known as " +
                "pegmatite, and is characterized by extremely large crystals. Pegmatites are " +
                "formed during the last stages of cooling of magma, when the few drops of magma " +
                "that remain form large crystals that are usually silicic (rich in silica). " +
                "Pegmatites are of economic importance as they typically contain several rare " +
                "earth elements (REE) such as Cesium. Cesium is used in atomic clocks, " +
                "photoelectric cells etc. Gemstones such as topaz, tourmaline, and aquamarine are" +
                " also often found in pegmatite and are used to make jewellery.";
        pegmatite1.pics = new String[]{"p1", "p2", "p3", "p4"};
        this.rocks.add(pegmatite1);
        this.rocksById.put(pegmatite1.id, pegmatite1);

        Rock syenite1 = new Rock();
        syenite1.name = "Syenite";
        syenite1.id = "syenite1";
        syenite1.rockType = "Igneous";
        syenite1.number = 14;
        syenite1.lat = -79.6626138888889;
        syenite1.lon = 43.54870833333333;
        syenite1.minerals = new String[]{"Feldspar", "Quartz"};
        syenite1.texture = "This igneous rock has a massive texture (no layers). It is composed" +
                " of crystals of similar sizes, in the range of 1-3 mm.";
        syenite1.interpretation = "This plutonic, igneous rock cooled slowly from a magma " +
                "chamber, allowing for the formation of visible crystals of biotite and quartz.";
        syenite1.pics = new String[]{"p1", "p2", "p3", "p4"};
        this.rocks.add(syenite1);
        this.rocksById.put(syenite1.id, syenite1);

    }
}
