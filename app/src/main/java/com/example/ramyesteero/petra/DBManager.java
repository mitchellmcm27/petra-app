package com.example.ramyesteero.petra;

/**
 * Created by Ramy Esteero on 9/27/2017.
 */

/*
SCHEMA

collection (name)
rocks (name, type, long, lat, location, details, pics)

 */

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;
import android.os.Environment;
import android.provider.*;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

public class DBManager extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 16;
    private static final String DATABASE_NAME = "rocks.db";

    //collection (name)
    public static final String TABLE_COLLECTION = "collection";
    public static final String collection_id = "_id";
    public static final String collection_name = "name";

    //rocks (name, type, long, lat, location, details, pics)
    public static final String TABLE_ROCKS = "rocks";
    public static final String rocks_id = "_id";
    public static final String rocks_name = "name";
    public static final String rocks_number = "number";
    public static final String rocks_type = "type";
    public static final String rocks_long = "long";
    public static final String rocks_lat = "lat";
    public static final String rocks_location = "location";
    public static final String rocks_details = "details";
    public static final String rocks_pics = "pics";


    public DBManager(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_COLLECTION + "(" +
                collection_id + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                collection_name + " TEXT " +
                ");";
        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_ROCKS + "(" +
                rocks_id + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                rocks_name + " TEXT, " +
                rocks_number + " TEXT, " +
                rocks_type + " TEXT, " +
                rocks_long + " REAL, " +
                rocks_lat + " REAL, " +
                rocks_location + " TEXT, " +
                rocks_details + " TEXT, " +
                rocks_pics + " TEXT " +
                ");";
        db.execSQL(query);


        //Add all the exercises
        ContentValues values = new ContentValues();
        values.put(rocks_number,"10");
        values.put(rocks_name,"Granite - 1");
        values.put(rocks_type,"Igneous");
        values.put(rocks_lat,-79.6633388888889);
        values.put(rocks_long,43.54595);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nBiotite, Quartz, Feldspar and Plagioclase\n\nTexture: \n\nThis igneous rock is composed of equal sized crystals. The cleavage in the biotite is particularly visible, identifiable as the flakiness in the black mineral.\n\nInterpretation: \n\nThis plutonic rock formed through the slow cooling of a magma chamber, providing the minerals sufficient time to form large crystals. The composition is \"felsic,\" meaning it is rich in silica.These minerals must have formed during the latter stages of cooling of magma as the rock is rich in silicic minerals that crystallize later as they require a lower temperature for crystallizing out of the magma.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"11");
        values.put(rocks_name,"Tonalite (Trondhjemite) - 1");
        values.put(rocks_type,"Igneous");
        values.put(rocks_lat,-79.66330555555557);
        values.put(rocks_long,43.54593333333333);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nBiotite, Plagioclase and Quartz\n\nTexture: \nThis igneous rock is composed of equal sized crystals of the flaky, black mineral biotite and the white mineral plagioclase.  The rock is deeply pitted by weathering, and the brown spots indicate oxidation (rusting) of iron minerals).\n\nInterpretation: \nThis igneous rock is a Trondhjemite, which is a light-coloured version (leucrocratic - ???leuco??? - light coloured)  of a Tonalite. The rock is igneous and is formed through the slow cooling of a magma chamber, which allows sufficient time for the crystallization of large crystals visible to the unaided eye. The brown spots on the rocks' surface are evidence of \"oxidation,\" in which oxygen in the atmosphere and iron-rich minerals such as biotite react, essentially causing the rock to rust. This, along with the deep pitting, suggest that this boulder has been weathering on the surface of the Earth for a long period of time.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"13");
        values.put(rocks_name,"Granite Pegmatite - 1");
        values.put(rocks_type,"Igneous");
        values.put(rocks_lat,-79.66213611111111);
        values.put(rocks_long,43.548513888888884);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nFeldspar, Quartz and Pyroxene and Biotite\n\nTexture: \nThis igneous rock is composed of equal sized crystals. The cleavage in the biotite is particularly visible, identifiable as the flakiness in the black mineral. The extremely large crystals (up to several centimetres long) mean that this rock is a \"pegmatite\".\n\nInterpretation: \nThis plutonic, igneous rock is known as pegmatite, and is characterized by extremely large crystals. Pegmatites are formed during the last stages of cooling of magma, when the few drops of magma that remain form large crystals that are usually silicic (rich in silica). Pegmatites are of economic importance as they typically contain several rare earth elements (REE) such as Cesium. Cesium is used in atomic clocks, photoelectric cells etc. Gemstones such as topaz, tourmaline, and aquamarine are also often found in pegmatite and are used to make jewellery.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"14");
        values.put(rocks_name,"Syenite");
        values.put(rocks_type,"Igneous");
        values.put(rocks_lat,-79.6626138888889);
        values.put(rocks_long,43.54870833333333);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nFeldspar and Quartz\n\nTexture: \nThis igneous rock has a massive texture (no layers). It is composed of crystals of similar sizes, in the range of 1-3mm.\n\nInterpretation: \nThis plutonic, igneous rock cooled slowly from a magma chamber, allowing for the formation of visible crystals of biotite and quartz.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"15");
        values.put(rocks_name,"Tonalite (Trondhjemite) - 2");
        values.put(rocks_type,"Igneous");
        values.put(rocks_lat,-79.66265277777778);
        values.put(rocks_long,43.54869722222222);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nPlagioclase, Biotite, and Quartz\n\nTexture: \nThis igneous rock has a massive texture (no layers) and large cyrstals. It also contains mafic (dark, wtih iron-rich minerals) xenoliths, with the largest one on the side of the rock facing the Kaneff Centre. There are striations carved into the top side of the boulder.\n\nInterpretation: \nThis igneous rock is a tonalite which are formed by the crystallization of felsic magma within a magma chamber. They are phaneritic, implying that the crystals formed are visible to the unaided eye. The rock also contains xenoliths (small, embedded fragments) of a magic composition (suggestive of its xenolith nature as it does not conform with the composition of the rest of the rock; magic = rich in iron and magnesium, poor in silica). The word \"xenolith\" is made of \"xeno\" meaning foreign and \"lith\" meaning rock.?? Xenoliths are ripped off from the wall when the magma moves up through the Earth's crust, and therefore tell us about the make-up of the Earth's deep crust and even mantle. The striations indicate that this rock later became a \"glacial erratic,\" or a rock transported (and scraped up) at the base of a glacier during the last ice age.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();

        values.put(rocks_number,"2");
        values.put(rocks_name,"Granite Pegmatite - 2");
        values.put(rocks_type,"Igneous");
        values.put(rocks_lat,-79.66778333333333);
        values.put(rocks_long,43.54931666666666);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nQuartz and Feldspar\n\nTexture: \nThis igneous rock is all of the same composition, but part of the rock is coarse grained and part is extremely coarse grained (pegmatite), with the two parts separated by a \"contact\".\n\nInterpretation: \nThe large crystals of feldspar and quartz indicate that the rock  cooled slowly from a magma chamber deep under the surface of the Earth. The magma was relatively felsic (rich in silica), allowing for the crystallization of quartz and feldspar. In the late stages of cooling, a thin sheet of magma cut across the rock, cooling to form a pegmatite \"dyke.\" It cooled slowly, allowing the exceptionally large crystals to grow. Pegmatites are formed during the last stages of cooling of magma, when the few drops of magma that remain form large crystals that are usually silicic (rich in silica). Pegmatites are of economic importance as they typically contain several rare earth elements (REE) such as Cesium. Cesium is used in atomic clocks, photoelectric cells etc.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"7");
        values.put(rocks_name,"Granite - 2");
        values.put(rocks_type,"Igneous");
        values.put(rocks_lat,-79.66588333333334);
        values.put(rocks_long,43.548516666666664);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nQuartz, Biotite and Feldspar\n\nTexture: \nThis igneous rock has a massive texture (no layers) and is composed of equal sized crystals. The cleavage in the biotite is particularly visible, identifiable as the flakiness in the black mineral.\n\nInterpretation: \nThis plutonic, igneous rock formed through the slow cooling of a magma chamber, allowing for the growth of large crystals. The abundance of feldspar and biotite mean this rock is \"felsic,\" or high in silica. Because silicic minerals have a lower cooling temperature, this rock likely crystallized during the later stages of cooling of the magma.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"8");
        values.put(rocks_name,"Tonalite (Trondhjemite) - 3");
        values.put(rocks_type,"Igneous");
        values.put(rocks_lat,-79.6656888888889);
        values.put(rocks_long,43.54864444444444);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nPlagioclase and Bioite with minor Feldspar and Quartz\n\nTexture: \nThis igneous rock has a massive texture (no layers) and large cyrstals. There are striations carved into the top side of the boulder, oriented in an east-west direction.\n\nInterpretation: \nThis is a Trondhjemite, which is a light-coloured version (leucrocratic - ???leuco??? - light coloured)  of a Tonalite. The rock is igneous and is formed through the slow cooling of a magma chamber, which allows sufficient time for the crystallization of large crystals visible to the unaided eye. These rocks are dominantly found on Archaen terranes - terranes are crustal material that are formed or broken off one tectonic plate and deposited on another plate. Glacial striations are observed in this rock. The striations carved into the boulder occurred later, when it was embedded in an ice sheet - the rock was scraped along the bedrock at the bottom of the glacier during the last ice age. Boulders such as this, which have been transported long distances by glaciers, are called \"glacial erratics.\"");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"1");
        values.put(rocks_name,"Gneiss - 1");
        values.put(rocks_type,"Metamorphic");
        values.put(rocks_lat,-79.66811944444444);
        values.put(rocks_long,43.549616666666665);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nBiotite, Feldspar, and Quartz\n\nTexture: \nThis metamorphic rock is \"foliated\" throughout, meaning it has layers. Because the rock is a gneiss, we call the layers \"gneissic foliation.\" Individual minerals are also elongated and lined up, meaning this rock has a \"lineation\" as well.\n\nInterpretation: \nMetamorphic rocks like gneiss form at great depths in the Earth's crust, where temperatures and pressures are high. The gneissic foliation indicates that the rock was being flattened, but the lineation indicates that it was being sheared or stretched at the same time.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"12");
        values.put(rocks_name,"Migmatitic Gneiss - 1");
        values.put(rocks_type,"Metamorphic");
        values.put(rocks_lat,-79.66298888888889);
        values.put(rocks_long,43.54651388888889);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nFeldspar, Quartz, Biotite and Plagioclase\n\nTexture: \nThis metamorphic rock is lineated (crystals are elongated and lined up) and foliated (has layers). The foliation is particularly clear, marked by alternating mafic (dark coloured) and felsic (light coloured) layers.\n\nInterpretation: \nThe layering in the rock, known as gneissic foliation, originated as the rock was squeezed deep under the earth, but the lineation also indicates the rock was being sheared (or smeared out) at the same time. This rock was metamorphosed at temperatures high enough that it just started to melt, forming the early stages of a \"migmatite,\" or a partially molten metamorphic rock. Migmatites straddle the boundary between igneous and metamorphic rocks.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"16");
        values.put(rocks_name,"Marble");
        values.put(rocks_type,"Metamorphic");
        values.put(rocks_lat,-79.66542777777778);
        values.put(rocks_long,43.548180555555554);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nTremolite and Calcite\n\nTexture: \nThis metamorphic rock has a massive texture. It has been extensively recrystallized during metamorphism, allowing the really large crystals of tremolite to grow. Tremolite crystals are prismatic and have a milky white colour in this rock. Tremolite is rich in magnesium.\n\nInterpretation: \nTremolite is magnesium rich, suggesting that fluids circulating through the rock were also rich in magnesium, and therefore the protolith (the rock before it was metamorphosed) was likely dolomite, not limestone, as dolomite is relatively rich in magnesium too. Tremolite is far less common that its sister mineral, actinolite; the two form a solid-solution series, meaning one transitions smoothly into the other as the composition of the mineral moves from more magnesium-rich to more iron-rich.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"17");
        values.put(rocks_name,"Migmatitic Gneiss - 2");
        values.put(rocks_type,"Metamorphic");
        values.put(rocks_lat,-79.66539722222223);
        values.put(rocks_long,43.54810555555555);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nBiotite, Quartz, and Plagioclase\n\nTexture: \nThis metamorphic rock has strong \"gneissic foliation,\" or layers, which are folded to make both asymmetrical and symmetrical folds ranging from tight (angles less than 60 degrees) to open (angles between 60 and 120 degrees). The layers sometimes stay the same thickness around the folds (parallel folds), but sometimes the limbs thin and the hinges thicken (similar folds). A white quartz vein runs through the rock. \"Chilled margins\" are identified by the smaller crystal size along the edges and the large crystals along the middle of the vein.\n\nInterpretation: \nThe alternating light and dark bands formed during metamorphism of this rock at high temperatures and pressures. The chilled margin along the quartz vein indicates that it intruded later, when the rock was cooler - the edges of the vein in contact with the cool surrounding rock cooled quickly, forming small quartz crystals while the center took longer to cool, allowing larger quartz crystals to grow. The folding in the rock indicates shearing during metamorphism.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"19");
        values.put(rocks_name,"Schist - 1");
        values.put(rocks_type,"Metamorphic");
        values.put(rocks_lat,-79.66355833333334);
        values.put(rocks_long,43.548030555555556);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nQuartz, Feldspar, Plagioclase and Biotite\n\nTexture: \nThis metamorphic rock is strongly foliated (has layers). Feldspar veins with \"chilled margins\" (finger grain-size along the edges of the veins, coarser grains in the center) are found in the rock.\n\nInterpretation: \nThis is an intermediate grade metamorphic rock, meaning it was subjected to enough heat and pressure to cause large, new minerals to form (the micas in particular), but it was not metamorphosed enough to convert it to gneiss. Within the veins, the fine crystals along the outside of the veins cooled quickly forming small crystals and the centers cooled more slowly, allowing larger crystals to grow. These \"chilled margins\" mean the veins were intruded after the rock had already cooled.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"20");
        values.put(rocks_name,"Mylonite");
        values.put(rocks_type,"Metamorphic");
        values.put(rocks_lat,-79.66300833333334);
        values.put(rocks_long,43.54795);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nFeldspar, Quartz, Biotite and Plagioclase\n\nTexture: \nThis metamorphic rock has a very strong foliation (layers) and a lineation (lines on the foliation planes) as well. Pink feldspar crystals are present in this rock that indicate the direction of shear experienced. These are known as \"augen,\" for their similarity in appearance to eyes (augen means eyes in German).\n\nInterpretation: \nMylonite is formed through \"dynamic\" metamorphism involving shearing between fault blocks, producing a \"shear zone.\" The feldspar augen indicate the direction of shearing - the tops of the minerals are dragged in one direction, and the bottom in the other, giving them a sigmoidal shape. In the present orientation of the rock, the augen indicate the top of the rock was moved towards Kaneff and the bottom was moved towards the bus stop. Augen are usually dominant in the mineral plagioclase.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"21");
        values.put(rocks_name,"Gneiss - 2");
        values.put(rocks_type,"Metamorphic");
        values.put(rocks_lat,-79.66357222222223);
        values.put(rocks_long,43.54884444444444);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nFeldspar, Quartz , Biotite, Garnet and Plagioclase\n\nTexture: \nThis metamorphic rock is \"foliated,\" meaning it has layers. The foliation is however not as well-defined as it is in other rocks around campus.\n\nInterpretation: \nThis rock formed under high temperatures and pressures, likely near the base of a mountain range. The foliation results from minerals growing under great pressure. The presence of garnet (the red mineral) indicates that the protolith (the rock before it was metamorphosed) for this rock was likely a mudstone, as mudstone contains all of the diverse elements necessary for making garnet during metamorphism. Garnet is the birthstone for the month of January.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"3");
        values.put(rocks_name,"Schist - 2");
        values.put(rocks_type,"Metamorphic");
        values.put(rocks_lat,-79.66783611111111);
        values.put(rocks_long,43.54929166666666);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nFeldspar, Quartz and Biotite\n\nTexture: \nThis metamorphic rock is foliated, meaning it has layers. The foliation is defined by to the parallel arrangement of biotite mica -  the black, flaky mineral.\n\nInterpretation: \nThis rock formed relatively deep in the Earth's crust, where temperatures and pressures were high. The original rock would have been a mudstone - during metamorphism it transformed from mudstone to slate to phyllite and eventually to schist. If metamorphism continued this rock would become a gneiss. The foliation indicates the rock was being squeezed durings it formation, likely by the rocks above it in the Earth's crust, or by compression along a plate boundary.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"32");
        values.put(rocks_name,"Schist - 3");
        values.put(rocks_type,"Metamorphic");
        values.put(rocks_lat,-79.66335833333333);
        values.put(rocks_long,43.548899999999996);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nFeldspar, Quartz, Biotite and Plagioclase\n\nTexture: \nThis metamorphic rock is very well foliated, meaning it has strong layering formed by micas (the flaky, black mineral). The rock is cut by small veins of feldspar.\n\nInterpretation: \nThe strong layering in this intermediate grade metamorphic rock results from the growth of minerals, particularly biotite (the black, flaky mineral) in alignment with the direction the rock was being squeezed during metamorphism. The foliation (layering) is cut by small dikes containing feldspar, which would have formed from the circulation of felspar-rich fluids in the rock. There are no chilled margins, indicating the veins formed when the rock was still warm from metamorphism.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"33");
        values.put(rocks_name,"Migmatitic Gneiss - 3");
        values.put(rocks_type,"Metamorphic");
        values.put(rocks_lat,-79.66655);
        values.put(rocks_long,43.54846111111111);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nGarnet, Quartz and Biotite\n\nTexture: \nThis metamorphic rock has strong gneissic foliation (layers), but the layers have been deformed into tight, asymmetrical folds.\n\nInterpretation: \nThe rock has been metamorphosed at high pressures and temperatures. The folds indicate that the rock was squeezed perpendicular to its layering, or it was sheared during its formation. The protolith for this rock could have possibly been a mudstone as it contains the ingredients necessary for crystallization of garnet under the right temperature and pressure conditions. Garnet is a common gemstone found on rings and other jewelry.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"5");
        values.put(rocks_name,"Amphibolite");
        values.put(rocks_type,"Metamorphic");
        values.put(rocks_lat,-79.66607777777779);
        values.put(rocks_long,43.54837777777777);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nHornblende and Plagioclase, with quartz veining\n\nTexture: \nThis metamorphic rock has a very weak foliation (layering) formed by alignment of hornblende crystals. The rock also has small quartz veins running through it, which formed after metamorphism because they cut across the foliation.\n\nInterpretation: \nThis metamorphic rock is derived from a mafic source, or \"protolith,\" like basalt. The foliation (or layers) indicate the minerals grew under pressure during metamorphism. The quartz veins would have formed as fluids rich in silica circulated through the rock, then crystalized in cracks. Gold is sometimes founds in veins like these, although not in this rock, unfortunately!");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"A");
        values.put(rocks_name,"Migmatitic Amphibolite");
        values.put(rocks_type,"Metamorphic");
        values.put(rocks_lat,-79.66803611111112);
        values.put(rocks_long,43.54911666666666);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nPlagioclase and Hornblende\n\nTexture: \nThis rock is a migmatite, which falls on the boundary between igneous and metamorphic. The upper face of the rock best shows the migmatitic texture. Migmatites are characterized by partial melting due to high temperatures.\n\nInterpretation: \nMigmatites form at the highest temperatures and pressures of any metamorphic rocks - the light-colored bands are  produced because the rock starts to melt, and turn back into a magma. Migmatization most often happens at the roots of mountain ranges.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"26");
        values.put(rocks_name,"Limestone - 1");
        values.put(rocks_type,"Sedimentary");
        values.put(rocks_lat,-79.66187222222223);
        values.put(rocks_long,43.54841111111111);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nFossils made of calcite and/or aragonite\n\nTexture: \nThis sedimentary limestone is massive (meaning there are no visible layers). The rock contains dominantly crinoid fossils. They consist for a base (or holdfast), a long stem made of rings, and fronds at the end for capturing food. The rings disaggregate when the organisms dies - this is what you see in the rock. The rock also has a pitted texture.\n\nInterpretation: \nThe rock was formed when Canada was located along the equator during the Ordovician-Silurian (500 to 410 million years ago). The warm and shallow waters that covered much of North America were filled with organisms such as crinoids and bryozoans, made of calcite. When they died and accumulated along with microfossils, they formed limestone, also known as biomicrite. Fossils of crinoids are abundant in this rock. The broken nature of the fossils suggest that these rocks were probably on the flanks of a reef system and were broken during storms and/or due to the high energy of the waves. Therefore, the type of organisms and its taphonomic condition (whether the organism is broken up and how well the organism is preserved) can help geologists infer on the type and region of a reef system the limestone is associated with.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"27");
        values.put(rocks_name,"Limestone - 2");
        values.put(rocks_type,"Sedimentary");
        values.put(rocks_lat,-79.66187222222223);
        values.put(rocks_long,43.54841111111111);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nFossils made of calcite and/or aragonite\n\nTexture: \nThis sedimentary limestone is massive (meaning there are no visible layers). The rock contains dominantly crinoid fossils. They consist for a base (or holdfast), a long stem made of rings, and fronds at the end for capturing food. The rings disaggregate when the organisms dies - this is what you see in the rock. The rock also has a pitted texture.\n\nInterpretation: \nThe rock was formed when Canada was located along the equator during the Ordovician-Silurian (500 to 410 million years ago). The warm and shallow waters that covered much of North America were filled with organisms such as crinoids and bryozoans, made of calcite. When they died and accumulated along with microfossils, they formed limestone, also known as biomicrite. Fossils of crinoids are abundant in this rock. Crinoids are related to starfish and sea urchins as they belong to the same phlylum - Echinodermata. They have an exoskeleton made of calcite (CaCO3) but it may sometimes also be aragonite (another mineral with the same composition as calcite, more durable under rough ocean conditions). Crinoids exist till this very day in both shallow and deep ocean settings (up to 9000 m depth).");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"28");
        values.put(rocks_name,"Limestone - 3");
        values.put(rocks_type,"Sedimentary");
        values.put(rocks_lat,-79.66187222222223);
        values.put(rocks_long,43.54841111111111);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nFossils made of calcite and/or aragonite\n\nTexture: \nThis sedimentary limestone is massive (meaning there are no visible layers). The rock contains dominantly crinoid fossils. They consist for a base (or holdfast), a long stem made of rings, and fronds at the end for capturing food. The rings disaggregate when the organisms dies - this is what you see in the rock. The rock also has a pitted texture.\n\nInterpretation: \nThe rock was formed when Canada was located along the equator during the Ordovician-Silurian (500 to 410 million years ago). The warm and shallow waters that covered much of North America were filled with organisms such as crinoids and bryozoans, made of calcite. When they died and accumulated along with microfossils, they formed limestone, , also known as biomicrite. Fossils of crinoids are abundant in this rock. The limestone has a very pitted texture to it. As an observer, the pitted texture of the rock should shed light on the declining health of our coral reefs due to global warming. Global warming causes carbon dioxide to enter the oceans, making it acidic, which is capable of destroying reef systems, which are made of the same mineral (calcite) as this limestone rock.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"29");
        values.put(rocks_name,"Limestone - 4");
        values.put(rocks_type,"Sedimentary");
        values.put(rocks_lat,-79.66293611111112);
        values.put(rocks_long,43.54796111111111);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nFossils made of calcite and/or aragonite\n\nTexture: \nThis sedimentary limestone is massive (meaning there are no visible layers). The rock contains dominantly crinoid fossils. They consist for a base (or holdfast), a long stem made of rings, and fronds at the end for capturing food. The rings disaggregate when the organisms dies - this is what you see in the rock. The rock also has a pitted texture.\n\nInterpretation: \nThe rock was formed when Canada was located along the equator during the Ordovician-Silurian (500 to 410 million years ago). The warm and shallow waters that covered much of North America were filled with organisms such as crinoids and bryozoans, made of calcite. When they died and accumulated along with microfossils, they formed limestone, , also known as biomicrite. Fossils of crinoids are abundant in this rock. The limestone has a very pitted texture to it. As an observer, the pitted texture of the rock should shed light on the declining health of our coral reefs due to global warming. Global warming causes carbon dioxide to enter the oceans, making it acidic, which is capable of destroying reef systems, which are made of the same mineral (calcite) as this limestone rock.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"30");
        values.put(rocks_name,"Limestone - 5");
        values.put(rocks_type,"Sedimentary");
        values.put(rocks_lat,-79.66296944444446);
        values.put(rocks_long,43.547958333333334);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nFossils made of calcite and/or aragonite\n\nTexture: \nThis sedimentary limestone is massive (meaning there are no visible layers). The rock contains dominantly crinoid fossils. They consist for a base (or holdfast), a long stem made of rings, and fronds at the end for capturing food. The rings disaggregate when the organisms dies - this is what you see in the rock. The rock also has a pitted texture.\n\nInterpretation: \nThe rock was formed when Canada was located along the equator during the Ordovician-Silurian (500 to 410 million years ago). The warm and shallow waters that covered much of North America were filled with organisms such as crinoids and bryozoans, made of calcite. When they died and accumulated along with microfossils, they formed limestone,, also known as biomicrite. Fossils of crinoids are abundant in this rock. These fossils are made of calcite or aragonite (a more durable, biogenically produce version of calcite). This depends on the abundance of the mineral in the oceans when the organism is formed. Studying fossils have allowed geologists to confirm that there has been switches between aragonite-rich and calcite-rich seas in the past. Aragonite-rich seas favour an aragonite exoskeleton for the organisms while calcite-rich seas favour a calcite exoskeleton. Although it is generally considered aragonite and calcite are both calcium carbonates, aragonite specifically has a higher Magnesium(Mg):Calcium(Ca) ratio while calcite has a lower Mg:Ca ratio.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"31");
        values.put(rocks_name,"Limestone - 6");
        values.put(rocks_type,"Sedimentary");
        values.put(rocks_lat,-79.66367777777778);
        values.put(rocks_long,43.5486);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nFossils made of calcite and/or aragonite\n\nTexture: \nThis sedimentary limestone is massive (meaning there are no visible layers). The rock contains dominantly crinoid fossils. They consist for a base (or holdfast), a long stem made of rings, and fronds at the end for capturing food. The rings disaggregate when the organisms dies - this is what you see in the rock. The rock also has a pitted texture.\n\nInterpretation: \nThe rock was formed when Canada was located along the equator during the Ordovician-Silurian (500 to 410 million years ago). The warm and shallow waters that covered much of North America were filled with organisms such as crinoids and bryozoans, made of calcite. When they died and accumulated along with microfossils, they formed limestone, also known as biomicrite. Fossils of crinoids are abundant in this rock. These fossils are made of calcite or aragonite (a more durable, biogenically produced version of calcite). This depends on the abundance of the mineral in the oceans when the organism is formed. Studying fossils have allowed geologists to confirm that there has been switches between aragonite-rich and calcite-rich seas in the past. Aragonite-rich seas favour an aragonite exoskeleton for the organisms while calcite-rich seas favour a calcite exoskeleton. Although it is generally considered aragonite and calcite are both calcium carbonates, aragonite specifically has a higher Magnesium(Mg):Calcium(Ca) ratio while calcite has a lower Mg:Ca ratio.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"35");
        values.put(rocks_name,"Sandstone");
        values.put(rocks_type,"Sedimentary");
        values.put(rocks_lat,-79.66353611111111);
        values.put(rocks_long,43.54885);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nQuartz\n\nTexture: \nThis sedimentary sandstone is composed of sand-sized grains of quartz. Although it is difficult to discern beds in this sedimentary rock, cross-beds (ripples in cross-section) are visible on the side of the rock facing the CCT building.\n\nInterpretation: \nThis sandstone was likely formed by running water, which created the ripples and cross-bedding. A possible depositional environment could have been a river or a beach.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"4");
        values.put(rocks_name,"Talus Breccia");
        values.put(rocks_type,"Sedimentary");
        values.put(rocks_lat,-79.66800555555557);
        values.put(rocks_long,43.549125);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nGravel-sized clasts of felsic igneous rock\n\nTexture: \nThis sedimentary rock is called a breccia because it is composed of angular clasts. In this case, the breccia is clast-supported, meaning that the clasts touch each other, and are filled in with mud. The clasts are composed of granite (found on the side of the rock facing Mississauga Road) and mudstone (found on the side of the rock facing the parking lot).\n\nInterpretation: \nBefore it was lithified (turned in to rock), this rock consisted of talus, which is the term for rock debris that accumulates at the bottom of a slope due to gravity. Talus clasts are angular and can be made of different compositions, consistent with the different types of unsorted (jumbled), angular clasts found in this rock. The talus pile was later covered by mud, then buried deeply enough to \"lithify\" it, turning it into solid rock.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"6");
        values.put(rocks_name,"Limestone - 7");
        values.put(rocks_type,"Sedimentary");
        values.put(rocks_lat,-79.66606666666667);
        values.put(rocks_long,43.54839166666667);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nMicrofossils made of calcite\n\nTexture: \nThis sedimentary limestone has a massive texture and with no visible bedding. This rock is composed of fossils too small to be seen without the aid of a microscope, and therefore it is called a \"micrite\".\n\nInterpretation: \nThis rock formed through the slow accumulation of tiny organisms with calcite shells in a lagoon setting. The massive texture (lack of bedding) could be because of \"bioturbation,\" with organisms burrowing through the original layers looking for food, destroying the layers in the process.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"9");
        values.put(rocks_name,"Limestone - 8");
        values.put(rocks_type,"Sedimentary");
        values.put(rocks_lat,-79.66274444444446);
        values.put(rocks_long,43.546613888888885);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nFossils made of calcite and/or aragonite\n\nTexture: \nThis sedimentary limestone is massive (meaning there are no visible layers). The rock contains dominantly crinoid fossils. They consist for a base (or holdfast), a long stem made of rings, and fronds at the end for capturing food. The rings disaggregate when the organisms dies - this is what you see in the rock.\n\nInterpretation: \nThe rock was formed when Canada was located along the equator during the Ordovician-Silurian (500 to 410 million years ago). The warm and shallow waters that covered much of North America were filled with organisms such as crinoids and bryozoans, made of calcite. When they died and accumulated along with microfossils, they formed limestone, also known as biomicrite. Fossils of crinoids are abundant in this rock. The broken nature of the fossils suggest that these rocks were probably on the flanks of a reef system and were broken during storms and/or due to the high energy of the waves. Therefore, the type of organisms and its taphonomic condition (whether the organism is broken up and how well the organism is preserved) can help geologists infer on the type and region of a reef system the limestone is associated with.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();


        values.put(rocks_number,"B");
        values.put(rocks_name,"Solution breccia");
        values.put(rocks_type,"Sedimentary");
        values.put(rocks_lat,-79.66796111111111);
        values.put(rocks_long,43.54943333333333);
        values.put(rocks_location, "dummy");
        values.put(rocks_details,"Mineral Composition: \nLimestone and Quartz\n\nTexture: \nThis sedimentary rock is a breccia, composed of angular clasts of limestone, with quartz filling in between.\n\nInterpretation: \nThis rock is known as a solution breccia. These typically form in sink holes, or in caves that collapse. The debris from this collapse is later cemented together when fluids rich in calcite or silica (silica, in this case due to the crystallized quartz), circulate through the debris, precipitate, and cement the angular blocks together.");
        values.put(rocks_pics,"p1,p2,p3,p4");
        db.insert(TABLE_ROCKS, null, values);
        values.clear();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COLLECTION);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ROCKS);
        onCreate(db);
    }

    public ArrayList<String> getRockInformation(String name) {
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_ROCKS + " WHERE "
                + rocks_name + "= \"" + name + "\" ;";
        Cursor c = db.rawQuery(query, null);
        c.moveToFirst();

        ArrayList<String> toReturn = new ArrayList<String>();
        toReturn.add(c.getString(c.getColumnIndex(rocks_type)));
        toReturn.add(c.getString(c.getColumnIndex(rocks_long)));
        toReturn.add(c.getString(c.getColumnIndex(rocks_lat)));
        toReturn.add(c.getString(c.getColumnIndex(rocks_location)));
        toReturn.add(c.getString(c.getColumnIndex(rocks_details)));
        toReturn.add(c.getString(c.getColumnIndex(rocks_pics)));

        return toReturn;
    }

    public ArrayList<ArrayList<String>> getRockList() {
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT " + rocks_name + "," + rocks_long + "," + rocks_lat +
                " FROM " + TABLE_ROCKS + ";";
        Cursor c = db.rawQuery(query, null);
        c.moveToFirst();

        ArrayList<ArrayList<String>> toReturn = new ArrayList<ArrayList<String>>();

        toReturn.add(new ArrayList<String>());
        toReturn.add(new ArrayList<String>());
        toReturn.add(new ArrayList<String>());

        while (!c.isAfterLast()) {
            toReturn.get(0).add(c.getString(c.getColumnIndex(rocks_long)));
            toReturn.get(1).add(c.getString(c.getColumnIndex(rocks_lat)));
            toReturn.get(2).add(c.getString(c.getColumnIndex(rocks_name)));

            c.moveToNext();
        }
        return toReturn;
    }



    public JSONArray toJson(Context context)
    {

        SQLiteDatabase myDatabase = getWritableDatabase();

        String searchQuery = "SELECT  * FROM " + TABLE_ROCKS;
        Cursor cursor = myDatabase.rawQuery(searchQuery, null );

        JSONArray resultSet  = new JSONArray();

        cursor.moveToFirst();
        while (cursor.isAfterLast() == false) {

            int totalColumn = cursor.getColumnCount();
            JSONObject rowObject = new JSONObject();

            for( int i=0 ;  i< totalColumn ; i++ )
            {
                if( cursor.getColumnName(i) != null )
                {
                    try
                    {
                        if( cursor.getString(i) != null )
                        {
                            Log.d("TAG_NAME", cursor.getString(i) );
                            rowObject.put(cursor.getColumnName(i) ,  cursor.getString(i) );
                        }
                        else
                        {
                            rowObject.put( cursor.getColumnName(i) ,  "" );
                        }
                    }
                    catch( Exception e )
                    {
                        Log.d("TAG_NAME", e.getMessage()  );
                    }
                }
            }
            resultSet.put(rowObject);
            cursor.moveToNext();
        }
        cursor.close();

        Log.d("TAG_NAME", resultSet.toString() );

        Log.d("TAG_NAME", "write to file");

        try {
            Writer output = null;
            File root = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "rocks");
            if (!root.mkdirs()) {
                Log.e("TAG_NAME", "Directory not created");
            }
            File file = new File(root, "rocks.json");
            output = new BufferedWriter(new FileWriter(file));
            output.write(resultSet.toString(2));
            output.close();
            Log.d("TAG_NAME","success");
            Log.d ("TAG_NAME", file.getAbsolutePath());
        } catch (Exception e) {
            Log.e("TAG_NAME", e.getMessage());

        }
        return resultSet;
    }
}