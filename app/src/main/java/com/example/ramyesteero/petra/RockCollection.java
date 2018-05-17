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

    public Rock getRockById(String id) {
        return rocksById.get(id);
    }

    public ArrayList<Rock> getRocks() {
        return this.rocks;
    }

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
        granite1.images = new int[]{R.drawable.granite1n1, R.drawable.granite1n2, R.drawable.granite1n3};
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
        tonalite1.images = new int[]{R.drawable.tonalite1n1, R.drawable.tonalite2n1, R.drawable.tonalite3n1};
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
        pegmatite1.images = new int[] {R.drawable.granitepegmatite1n1, R.drawable.granitepegmatite2n1, R.drawable.granitepegmatite3n1};
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
        syenite1.images = new int[] {R.drawable.syenite1, R.drawable.syenite2, R.drawable.syenite3};
        this.rocks.add(syenite1);
        this.rocksById.put(syenite1.id, syenite1);

        Rock tonalite2 = new Rock();
        tonalite2.name = "Tonalite (Trondhjemite) - 2";
        tonalite2.id = "syenite1";
        tonalite2.rockType = "Igneous";
        tonalite2.number = 15;
        tonalite2.lat = -79.66265277777778;
        tonalite2.lon = 43.54869722222222;
        tonalite2.minerals = new String[]{"Plagioclase", "Biotite", "Quartz"};
        tonalite2.texture = "This igneous rock has a massive texture (no layers) and large cyrstals. It also contains mafic (dark, wtih iron-rich minerals) xenoliths, with the largest one on the side of the rock facing the Kaneff Centre. There are striations carved into the top side of the boulder.";
        tonalite2.interpretation = "This igneous rock is a tonalite which are formed by the crystallization of felsic magma within a magma chamber. They are phaneritic, implying that the crystals formed are visible to the unaided eye. The rock also contains xenoliths (small, embedded fragments) of a magic composition (suggestive of its xenolith nature as it does not conform with the composition of the rest of the rock; magic = rich in iron and magnesium, poor in silica). The word \"xenolith\" is made of \"xeno\" meaning foreign and \"lith\" meaning rock.  Xenoliths are ripped off from the wall when the magma moves up through the Earth's crust, and therefore tell us about the make-up of the Earth's deep crust and even mantle. The striations indicate that this rock later became a \"glacial erratic,\" or a rock transported (and scraped up) at the base of a glacier during the last ice age.";
        tonalite2.images = new int[] {R.drawable.tonalite1n2, R.drawable.tonalite2n2, R.drawable.tonalite3n2};
        this.rocks.add(tonalite2);
        this.rocksById.put(tonalite2.id, tonalite2);

        Rock pegmatite2 = new Rock();
        pegmatite2.name = "Granite Pegmatite - 2";
        pegmatite2.id = "pegmatite2";
        pegmatite2.rockType = "Igneous";
        pegmatite2.number = 2;
        pegmatite2.lat = -79.66778333333333;
        pegmatite2.lon = 43.54931666666666;
        pegmatite2.minerals = new String[]{"Quartz", "Feldspar"};
        pegmatite2.texture = "This igneous rock is all of the same composition, but part of the rock is coarse grained and part is extremely coarse grained (pegmatite), with the two parts separated by a \"contact\".";
        pegmatite2.interpretation = "The large crystals of feldspar and quartz indicate that the rock  cooled slowly from a magma chamber deep under the surface of the Earth. The magma was relatively felsic (rich in silica), allowing for the crystallization of quartz and feldspar. In the late stages of cooling, a thin sheet of magma cut across the rock, cooling to form a pegmatite \"dike.\" It cooled slowly, allowing the exceptionally large crystals to grow. Pegmatites are formed during the last stages of cooling of magma, when the few drops of magma that remain form large crystals that are usually silicic (rich in silica). Pegmatites are of economic importance as they typically contain several rare earth elements (REE) such as Cesium. Cesium is used in atomic clocks, photoelectric cells etc.";
        pegmatite2.images = new int[]{R.drawable.granitepegmatite1n2, R.drawable.granitepegmatite2n2, R.drawable.granitepegmatite3n2};
        this.rocks.add(pegmatite2);
        this.rocksById.put(pegmatite2.id, pegmatite2);

        Rock granite2 = new Rock();
        granite2.name = "Granite - 2";
        granite2.id = "granite2";
        granite2.rockType = "Igneous";
        granite2.number = 7;
        granite2.lat = -79.66588333333334;
        granite2.lon = 43.548516666666664;
        granite2.minerals = new String[]{"Quartz", "Biotite", "Feldspar"};
        granite2.texture = "This igneous rock has a massive texture (no layers) and is composed of equal sized crystals. The cleavage in the biotite is particularly visible, identifiable as the flakiness in the black mineral.";
        granite2.interpretation = "This plutonic, igneous rock formed through the slow cooling of a magma chamber, allowing for the growth of large crystals. The abundance of feldspar and biotite mean this rock is \"felsic,\" or high in silica. Because silicic minerals have a lower cooling temperature, this rock likely crystallized during the later stages of cooling of the magma.";
        granite2.images = new int[] {R.drawable.granite2n1, R.drawable.granite2n2, R.drawable.granite2n3};
        this.rocks.add(granite2);
        this.rocksById.put(granite2.id, granite2);

        Rock tonalite3 = new Rock();
        tonalite3.name = "Tonalite (Trondhjemite) - 3";
        tonalite3.id = "tonalite3";
        tonalite3.rockType = "Igneous";
        tonalite3.number = 8;
        tonalite3.lat = -79.6656888888889;
        tonalite3.lon = 43.54864444444444;
        tonalite3.minerals = new String[]{"Plagioclase", "Biotite"};
        tonalite3.minorMinerals = new String[]{"Feldspar", "Quartz"};
        tonalite3.texture = "This igneous rock has a massive texture (no layers) and large cyrstals. There are striations carved into the top side of the boulder, oriented in an east-west direction.";
        tonalite3.interpretation = "This is a Trondhjemite, which is a light-coloured version (leucrocratic - ‘leuco’ - light coloured)  of a Tonalite. The rock is igneous and is formed through the slow cooling of a magma chamber, which allows sufficient time for the crystallization of large crystals visible to the unaided eye. These rocks are dominantly found on Archaen terranes - terranes are crustal material that are formed or broken off one tectonic plate and deposited on another plate. Glacial striations are observed in this rock. The striations carved into the boulder occurred later, when it was embedded in an ice sheet - the rock was scraped along the bedrock at the bottom of the glacier during the last ice age. Boulders such as this, which have been transported long distances by glaciers, are called \"glacial erratics.\"";
        tonalite3.images = new int[] {R.drawable.tonalite1n3, R.drawable.tonalite2n3, R.drawable.tonalite3n3};
        this.rocks.add(tonalite3);
        this.rocksById.put(tonalite3.id, tonalite3);

        Rock gneiss1 = new Rock();
        gneiss1.name = "Gneiss - 1";
        gneiss1.id = "gneiss1";
        gneiss1.rockType = "Metamorphic";
        gneiss1.number = 1;
        gneiss1.lat = -79.66811944444444;
        gneiss1.lon = 43.549616666666665;
        gneiss1.minerals = new String[]{"Biotite", "Feldspar", "Quartz"};
        gneiss1.texture = "This metamorphic rock is \"foliated\" throughout, meaning it has layers. Because the rock is a gneiss, we call the layers \"gneissic foliation.\" Individual minerals are also elongated and lined up, meaning this rock has a \"lineation\" as well.";
        gneiss1.interpretation = "Metamorphic rocks like gneiss form at great depths in the Earth's crust, where temperatures and pressures are high. The gneissic foliation indicates that the rock was being flattened, but the lineation indicates that it was being sheared or stretched at the same time.";
        gneiss1.images = new int[] {R.drawable.gneiss1, R.drawable.gneiss2, R.drawable.gneiss3};
        this.rocks.add(gneiss1);
        this.rocksById.put(gneiss1.id, gneiss1);

        Rock migmatiticGneiss1 = new Rock();
        migmatiticGneiss1.name = "Migmatitic Gneiss - 1";
        migmatiticGneiss1.id = "migmatiticGneiss1";
        migmatiticGneiss1.rockType = "Metamorphic";
        migmatiticGneiss1.number = 12;
        migmatiticGneiss1.lat = -79.66298888888889;
        migmatiticGneiss1.lon = 43.54651388888889;
        migmatiticGneiss1.minerals = new String[]{"Feldspar", "Quartz", "Biotite", "Plagioclase"};
        migmatiticGneiss1.texture = "This metamorphic rock is lineated (crystals are elongated and lined up) and foliated (has layers). The foliation is particularly clear, marked by alternating mafic (dark coloured) and felsic (light coloured) layers.";
        migmatiticGneiss1.interpretation = "The layering in the rock, known as gneissic foliation, originated as the rock was squeezed deep under the earth, but the lineation also indicates the rock was being sheared (or smeared out) at the same time. This rock was metamorphosed at temperatures high enough that it just started to melt, forming the early stages of a \"migmatite,\" or a partially molten metamorphic rock. Migmatites straddle the boundary between igneous and metamorphic rocks.";
        migmatiticGneiss1.images = new int[] {R.drawable.migmatiticgneiss1, R.drawable.migmatiticgneiss2, R.drawable.migmatiticgneiss3};
        this.rocks.add(migmatiticGneiss1);
        this.rocksById.put(migmatiticGneiss1.id, migmatiticGneiss1);

        Rock marble1 = new Rock();
        marble1.name = "Marble";
        marble1.id = "marble1";
        marble1.rockType = "Metamorphic";
        marble1.number = 16;
        marble1.lat = -79.66542777777778;
        marble1.lon = 43.548180555555554;
        marble1.minerals = new String[]{"Tremolite", "Calcite"};
        marble1.texture = "This metamorphic rock has a massive texture. It has been extensively recrystallized during metamorphism, allowing the really large crystals of tremolite to grow. Tremolite crystals are prismatic and have a milky white colour in this rock. Tremolite is rich in magnesium.";
        marble1.interpretation = "Tremolite is magnesium rich, suggesting that fluids circulating through the rock were also rich in magnesium, and therefore the protolith (the rock before it was metamorphosed) was likely dolomite, not limestone, as dolomite is relatively rich in magnesium too. Tremolite is far less common that its sister mineral, actinolite; the two form a solid-solution series, meaning one transitions smoothly into the other as the composition of the mineral moves from more magnesium-rich to more iron-rich.";
        marble1.images = new int[] {R.drawable.marble1, R.drawable.marble2, R.drawable.marble3};
        this.rocks.add(marble1);
        this.rocksById.put(marble1.id, marble1);

        Rock migmatiticGneiss2 = new Rock();
        migmatiticGneiss2.name = "Migmatitic Gneiss - 2";
        migmatiticGneiss2.id = "migmatiticGneiss2";
        migmatiticGneiss2.rockType = "Metamorphic";
        migmatiticGneiss2.number = 17;
        migmatiticGneiss2.lat = -79.66539722222223;
        migmatiticGneiss2.lon = 43.54810555555555;
        migmatiticGneiss2.minerals = new String[]{"Biotite", "Quartz", "Plagioclase"};
        migmatiticGneiss2.texture = "This metamorphic rock has strong \"gneissic foliation,\" or layers, which are folded to make both asymmetrical and symmetrical folds ranging from tight (angles less than 60 degrees) to open (angles between 60 and 120 degrees). The layers sometimes stay the same thickness around the folds (parallel folds), but sometimes the limbs thin and the hinges thicken (similar folds). A white quartz vein runs through the rock. \"Chilled margins\" are identified by the smaller crystal size along the edges and the large crystals along the middle of the vein.";
        migmatiticGneiss2.interpretation = "The alternating light and dark bands formed during metamorphism of this rock at high temperatures and pressures. The chilled margin along the quartz vein indicates that it intruded later, when the rock was cooler - the edges of the vein in contact with the cool surrounding rock cooled quickly, forming small quartz crystals while the center took longer to cool, allowing larger quartz crystals to grow. The folding in the rock indicates shearing during metamorphism.";
        migmatiticGneiss2.images = new int[]{R.drawable.migmatiticgneiss1, R.drawable.migmatiticgneiss2, R.drawable.migmatiticgneiss3};
        this.rocks.add(migmatiticGneiss2);
        this.rocksById.put(migmatiticGneiss2.id, migmatiticGneiss2);

        Rock schist1 = new Rock();
        schist1.name = "Schist - 1";
        schist1.id = "migmatiticGneiss2";
        schist1.rockType = "Metamorphic";
        schist1.number = 19;
        schist1.lat = -79.66355833333334;
        schist1.lon = 43.548030555555556;
        schist1.minerals = new String[]{"Quartz", "Feldspar", "Plagioclase", "Biotite"};
        schist1.texture = "This metamorphic rock is strongly foliated (has layers). Feldspar veins with \"chilled margins\" (finger grain-size along the edges of the veins, coarser grains in the center) are found in the rock.";
        schist1.interpretation = "This is an intermediate grade metamorphic rock, meaning it was subjected to enough heat and pressure to cause large, new minerals to form (the micas in particular), but it was not metamorphosed enough to convert it to gneiss. Within the veins, the fine crystals along the outside of the veins cooled quickly forming small crystals and the centers cooled more slowly, allowing larger crystals to grow. These \"chilled margins\" mean the veins were intruded after the rock had already cooled.";
        schist1.images = new int[]{R.drawable.schist1n1, R.drawable.schist2n1, R.drawable.schist3n1};
        this.rocks.add(schist1);
        this.rocksById.put(schist1.id, schist1);

        Rock mylonite1 = new Rock();
        mylonite1.name = "Mylonite";
        mylonite1.id = "mylonite1";
        mylonite1.rockType = "Metamorphic";
        mylonite1.number = 20;
        mylonite1.lat = -79.66300833333334;
        mylonite1.lon = 43.54795;
        mylonite1.minerals = new String[]{"Feldspar", "Quartz", "Biotite", "Plagioclase"};
        mylonite1.texture ="This metamorphic rock has a very strong foliation (layers) and a lineation (lines on the foliation planes) as well. Pink feldspar crystals are present in this rock that indicate the direction of shear experienced. These are known as \"augen,\" for their similarity in appearance to eyes (augen means eyes in German).";
        mylonite1.interpretation = "Mylonite is formed through \"dynamic\" metamorphism involving shearing between fault blocks, producing a \"shear zone.\" The feldspar augen indicate the direction of shearing - the tops of the minerals are dragged in one direction, and the bottom in the other, giving them a sigmoidal shape. In the present orientation of the rock, the augen indicate the top of the rock was moved towards Kaneff and the bottom was moved towards the bus stop. Augen are usually dominant in the mineral plagioclase.";
        mylonite1.images = new int[]{R.drawable.mylonite1, R.drawable.mylonite2, R.drawable.mylonite3};
        this.rocks.add(mylonite1);
        this.rocksById.put(mylonite1.id, mylonite1);

        Rock gneiss2 = new Rock();
        gneiss2.name = "Gneiss - 2";
        gneiss2.id = "gneiss2";
        gneiss2.rockType = "Metamorphic";
        gneiss2.number = 21;
        gneiss2.lat = -79.66357222222223;
        gneiss2.lon = 43.54884444444444;
        gneiss2.minerals = new String[]{"Feldspar", "Quartz", "Biotite", "Garnet", "Plagioclase"};
        gneiss2.texture = "This metamorphic rock is \"foliated,\" meaning it has layers. The foliation is however not as well-defined as it is in other rocks around campus.";
        gneiss2.interpretation = "This rock formed under high temperatures and pressures, likely near the base of a mountain range. The foliation results from minerals growing under great pressure. The presence of garnet (the red mineral) indicates that the protolith (the rock before it was metamorphosed) for this rock was likely a mudstone, as mudstone contains all of the diverse elements necessary for making garnet during metamorphism. Garnet is the birthstone for the month of January.";
        gneiss2.images = new int[]{R.drawable.gneiss1n2, R.drawable.gneiss2n2, R.drawable.gneiss3n2};
        this.rocks.add(gneiss2);
        this.rocksById.put(gneiss2.id, gneiss2);

    }
}
