package TESTING;

import org.apache.batik.dom.util.HashTable;
import java.util.*;

/**
 * Created by ACfan on 2/10/2016.
 */
public class cards {
    public static void main(String[]args){

        Dictionary dict = new Hashtable();

        Object[] card1 = {
                dict.put("card_id", "1"),
                dict.put("card_name", "rock")

        };

        System.out.println(dict.get("card_id"));
        System.out.println(card1);




        // below is method that can be employed to read card id within actual code
        String strCardID = dict.get("card_id").toString();
        int cardID = Integer.parseInt(strCardID);


        System.out.println(cardID + 1);

//        <dict>
//	<key>cards</key>
//	<array>
//		<dict>
//			<key>fileName</key>
//			<string>Slide01.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide01</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Quartz</string>
//
//			<key>chemistry</key>
//			<string>SiO_2</string>
//
//			<key>classification</key>
//			<string>tectosilicate</string>
//
//			<key>crystal_system</key>
//			<string>hexagonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>7</string>
//
//			<key>specific_gravity</key>
//			<string>2.65</string>
//
//			<key>cleavage</key>
//			<string>poor/none</string>
//
//			<key>crustal_abundance</key>
//			<string>high</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide02.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide02</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Plagioclase</string>
//
//			<key>chemistry</key>
//			<string>Na Al Si_3 O_8 - Ca Al_2 Si_2 O_8</string>
//
//			<key>classification</key>
//			<string>tectosilicate</string>
//
//			<key>crystal_system</key>
//			<string>triclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>6-6.5</string>
//
//			<key>specific_gravity</key>
//			<string>2.6-2.8</string>
//
//			<key>cleavage</key>
//			<string>1 perfect, 1 good</string>
//
//			<key>crustal_abundance</key>
//			<string>very high</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//
//		</dict>
//
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide03.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide03</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Orthoclase</string>
//
//			<key>chemistry</key>
//			<string>K Al Si_3 O_3</string>
//
//			<key>classification</key>
//			<string>tectosilicate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>6-6.5</string>
//
//			<key>specific_gravity</key>
//			<string>2.5-2.6</string>
//
//			<key>cleavage</key>
//			<string>1 perfect, 1 good</string>
//
//			<key>crustal_abundance</key>
//			<string>high</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//
//		</dict>
//
//
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide04.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide04</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Biotite</string>
//
//			<key>chemistry</key>
//			<string>K(Fe, Mg)_3 Al Si_3 O_10 (OH)_2 </string>
//
//			<key>classification</key>
//			<string>phyllosilicate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>2.5-3</string>
//
//			<key>specific_gravity</key>
//			<string>2.7-3.3</string>
//
//			<key>cleavage</key>
//			<string>1 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>moderate</string>
//
//			<key>economic_value</key>
//			<string>low</string>
//
//		</dict>
//
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide05.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide05</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Muscovite</string>
//
//			<key>chemistry</key>
//			<string>K Al_3 Si_3 O_10 (O H)_2</string>
//
//			<key>classification</key>
//			<string>phyllosilicate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>2.5-3</string>
//
//			<key>specific_gravity</key>
//			<string>2.8-2.9</string>
//
//			<key>cleavage</key>
//			<string>1 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>moderate</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//
//		</dict>
//
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide06.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide06</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Hornblende</string>
//
//			<key>chemistry</key>
//			<string>Ca_2 (Mg, Fe)_4 Al_2 Si_7 O_22 (OH)_2</string>
//
//			<key>classification</key>
//			<string>inosilicate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>5-6</string>
//
//			<key>specific_gravity</key>
//			<string>3.0-3.5</string>
//
//			<key>cleavage</key>
//			<string>2 good</string>
//
//			<key>crustal_abundance</key>
//			<string>moderate</string>
//
//			<key>economic_value</key>
//			<string>trivial</string>
//
//		</dict>
//		<dict>
//			<key>fileName</key>
//			<string>Slide07.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide07</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Actinolite</string>
//
//			<key>chemistry</key>
//			<string>Ca_2 (Mg, Fe)_5 Si_8 O_22 (OH)_2</string>
//
//			<key>classification</key>
//			<string>inosilicate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>5-6</string>
//
//			<key>specific_gravity</key>
//			<string>3.0-3.5</string>
//
//			<key>cleavage</key>
//			<string>2 good</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>low</string>
//
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide08.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide08</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Glaucophane</string>
//
//			<key>chemistry</key>
//			<string>Na_2 (Mg, Fe)_3 Al_2 Si_8 O_22 (OH)_2 </string>
//
//			<key>classification</key>
//			<string>inosilicate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>6</string>
//
//			<key>specific_gravity</key>
//			<string>3.0-3.2</string>
//
//			<key>cleavage</key>
//			<string>2 good</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>trivial</string>
//
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide09.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide09</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Olivine</string>
//
//			<key>chemistry</key>
//			<string>(Mg, Fe)_2 Si O_4</string>
//
//			<key>classification</key>
//			<string>nesosilicate</string>
//
//			<key>crystal_system</key>
//			<string>orthorhombic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//				<string>mantle</string>
//			</array>
//
//			<key>hardness</key>
//			<string>6.5-7</string>
//
//			<key>specific_gravity</key>
//			<string>3.2-4.4</string>
//
//			<key>cleavage</key>
//			<string>2 poor</string>
//
//			<key>crustal_abundance</key>
//			<string>high</string>
//
//			<key>economic_value</key>
//			<string>low</string>
//
//		</dict>
//		<dict>
//			<key>fileName</key>
//			<string>Slide10.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide10</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Garnet</string>
//
//			<key>chemistry</key>
//			<string>(Fe, Mg, Ca, Mn)_3 (Al, Fe)_2 Si_3 O_12</string>
//
//			<key>classification</key>
//			<string>nesosilicate</string>
//
//			<key>crystal_system</key>
//			<string>isometric</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//				<string>mantle</string>
//			</array>
//
//			<key>hardness</key>
//			<string>6-7.5</string>
//
//			<key>specific_gravity</key>
//			<string>3.5-4.3</string>
//
//			<key>cleavage</key>
//			<string>none</string>
//
//			<key>crustal_abundance</key>
//			<string>moderate</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide11.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide11</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Titanite</string>
//
//			<key>chemistry</key>
//			<string>Ca Ti Si O_5</string>
//
//			<key>classification</key>
//			<string>nesosilicate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>5-5.5</string>
//
//			<key>specific_gravity</key>
//			<string>3.4-3.6</string>
//
//			<key>cleavage</key>
//			<string>3 good</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>low</string>
//
//		</dict>
//		<dict>
//			<key>fileName</key>
//			<string>Slide12.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide12</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Zircon</string>
//
//			<key>chemistry</key>
//			<string>Zr Si O_4</string>
//
//			<key>classification</key>
//			<string>nesosilicate</string>
//
//			<key>crystal_system</key>
//			<string>tetragonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>7.5</string>
//
//			<key>specific_gravity</key>
//			<string>4.6-4.7</string>
//
//			<key>cleavage</key>
//			<string>2 poor</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//
//		</dict>
//		<dict>
//			<key>fileName</key>
//			<string>Slide13.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide13</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Augite</string>
//
//			<key>chemistry</key>
//			<string>Ca (Mg, Fe) Si_2 O_6 </string>
//
//			<key>classification</key>
//			<string>inosilicate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>5.5-6.5</string>
//
//			<key>specific_gravity</key>
//			<string>3.2-3.6</string>
//
//			<key>cleavage</key>
//			<string>2 good</string>
//
//			<key>crustal_abundance</key>
//			<string>high</string>
//
//			<key>economic_value</key>
//			<string>trivial</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide14.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide14</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Orthopyroxene</string>
//
//			<key>chemistry</key>
//			<string>(Mg, Fe)_2 Si_2 O_6 </string>
//
//			<key>classification</key>
//			<string>inosilicate</string>
//
//			<key>crystal_system</key>
//			<string>orthorhombic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//				<string>mantle</string>
//			</array>
//
//			<key>hardness</key>
//			<string>5-6</string>
//
//			<key>specific_gravity</key>
//			<string>3.2-3.9</string>
//
//			<key>cleavage</key>
//			<string>2 good</string>
//
//			<key>crustal_abundance</key>
//			<string>high</string>
//
//			<key>economic_value</key>
//			<string>trivial</string>
//		</dict>
//		<dict>
//			<key>fileName</key>
//			<string>Slide15.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide15</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Chlorite</string>
//
//			<key>chemistry</key>
//			<string>(Mg, Fe)_5 Al_2 Si_3 O_10 (OH)_8</string>
//
//			<key>classification</key>
//			<string>phyllosilicate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>2-3</string>
//
//			<key>specific_gravity</key>
//			<string>2.6-3.3</string>
//
//			<key>cleavage</key>
//			<string>1 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>moderate</string>
//
//			<key>economic_value</key>
//			<string>low</string>
//		</dict>
//		<dict>
//			<key>fileName</key>
//			<string>Slide16.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide16</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Antigorite</string>
//
//			<key>chemistry</key>
//			<string>(Mg, Fe)_3 Si_2 O_5 (OH)_4</string>
//
//			<key>classification</key>
//			<string>phyllosilicate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//				<string>mantle</string>
//			</array>
//
//			<key>hardness</key>
//			<string>3.5-4</string>
//
//			<key>specific_gravity</key>
//			<string>2.6</string>
//
//			<key>cleavage</key>
//			<string>1 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>low</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide17.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide17</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Talc</string>
//
//			<key>chemistry</key>
//			<string>Mg_3 Si_4 O_10 (OH)_2</string>
//
//			<key>classification</key>
//			<string>phyllosilicate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>1</string>
//
//			<key>specific_gravity</key>
//			<string>2.6-2.8</string>
//
//			<key>cleavage</key>
//			<string>1 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//		<dict>
//			<key>fileName</key>
//			<string>Slide18.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide18</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Kaolinite</string>
//
//			<key>chemistry</key>
//			<string>Al_2 Si_2 O_5 (OH)_4</string>
//
//			<key>classification</key>
//			<string>phyllosilicate</string>
//
//			<key>crystal_system</key>
//			<string>triclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>1.5-2.5</string>
//
//			<key>specific_gravity</key>
//			<string>2.6-2.7</string>
//
//			<key>cleavage</key>
//			<string>1 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>moderate</string>
//
//			<key>economic_value</key>
//			<string>high</string>
//
//		</dict>
//		<dict>
//			<key>fileName</key>
//			<string>Slide19.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide19</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Andalusite</string>
//
//			<key>chemistry</key>
//			<string>Al_2 Si O_5</string>
//
//			<key>classification</key>
//			<string>nesosilicate</string>
//
//			<key>crystal_system</key>
//			<string>orthorhombic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>6.5-7</string>
//
//			<key>specific_gravity</key>
//			<string>3.15</string>
//
//			<key>cleavage</key>
//			<string>2 good</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//		<dict>
//			<key>fileName</key>
//			<string>Slide20.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide20</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Kyanite</string>
//
//			<key>chemistry</key>
//			<string>Al_2 Si O_5</string>
//
//			<key>classification</key>
//			<string>nesosilicate</string>
//
//			<key>crystal_system</key>
//			<string>triclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>5.5-7</string>
//
//			<key>specific_gravity</key>
//			<string>3.5-3.7</string>
//
//			<key>cleavage</key>
//			<string>1 perfect, 1 good</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide21.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide21</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Sillimanite</string>
//
//			<key>chemistry</key>
//			<string>Al_2 Si O_5</string>
//
//			<key>classification</key>
//			<string>nesosilicate</string>
//
//			<key>crystal_system</key>
//			<string>orthorhombic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>6.5-7.5</string>
//
//			<key>specific_gravity</key>
//			<string>3.25</string>
//
//			<key>cleavage</key>
//			<string>1 perfect, 1 good</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>low</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide22.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide22</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Staurolite</string>
//
//			<key>chemistry</key>
//			<string>(Fe, Mg)_2 Al_9 Si_4 O_22 (OH)_2</string>
//
//			<key>classification</key>
//			<string>nesosilicate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>7</string>
//
//			<key>specific_gravity</key>
//			<string>3.7-3.8</string>
//
//			<key>cleavage</key>
//			<string>1 good</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>low</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide23.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide23</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Epidote</string>
//
//			<key>chemistry</key>
//			<string>Ca_2 (Al, Fe)_3 Si_3 O_12 (OH)</string>
//
//			<key>classification</key>
//			<string>sorosilicate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>6 - 6.5</string>
//
//			<key>specific_gravity</key>
//			<string>3.2 - 3.5</string>
//
//			<key>cleavage</key>
//			<string>1 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>moderate</string>
//
//			<key>economic_value</key>
//			<string>trivial</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide24.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide24</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Tourmaline</string>
//
//			<key>chemistry</key>
//			<string>Na (Mg, Fe)_3 Al_6 B_3 Si_6 O_27 (OH)_4</string>
//
//			<key>classification</key>
//			<string>cyclosilicate</string>
//
//			<key>crystal_system</key>
//			<string>hexagonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>7 - 7.5</string>
//
//			<key>specific_gravity</key>
//			<string>3.0 - 3.2</string>
//
//			<key>cleavage</key>
//			<string>2 poor</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide25.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide25</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Topaz</string>
//
//			<key>chemistry</key>
//			<string>Al_2 Si O_4 (F, OH)_2</string>
//
//			<key>classification</key>
//			<string>nesosilicate</string>
//
//			<key>crystal_system</key>
//			<string>orthorhombic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>8</string>
//
//			<key>specific_gravity</key>
//			<string>3.5 - 3.6</string>
//
//			<key>cleavage</key>
//			<string>1 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>ultratrace</string>
//
//			<key>economic_value</key>
//			<string>low</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide26.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide26</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Beryl</string>
//
//			<key>chemistry</key>
//			<string>Be_3 Al_2 Si_6 O_18</string>
//
//			<key>classification</key>
//			<string>cyclosilicate</string>
//
//			<key>crystal_system</key>
//			<string>hexagonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>7.5 - 8</string>
//
//			<key>specific_gravity</key>
//			<string>2.6 - 2.9</string>
//
//			<key>cleavage</key>
//			<string>1 poor</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide27.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide27</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Pyrite</string>
//
//			<key>chemistry</key>
//			<string>Fe S_2</string>
//
//			<key>classification</key>
//			<string>sulfide</string>
//
//			<key>crystal_system</key>
//			<string>isometric</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>6 - 6.5</string>
//
//			<key>specific_gravity</key>
//			<string>5</string>
//
//			<key>cleavage</key>
//			<string>2 poor</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//	<dict>
//			<key>fileName</key>
//			<string>Slide28.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide28</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Pyrrhotite</string>
//
//			<key>chemistry</key>
//			<string>Fe_{1-x} S</string>
//
//			<key>classification</key>
//			<string>sulfide</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>3.5 4.5</string>
//
//			<key>specific_gravity</key>
//			<string>4.6</string>
//
//			<key>cleavage</key>
//			<string>none</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide29.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide29</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Chalcopyrite</string>
//
//			<key>chemistry</key>
//			<string>Cu Fe S_2</string>
//
//			<key>classification</key>
//			<string>sulfide</string>
//
//			<key>crystal_system</key>
//			<string>tetragonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>3.5 - 4</string>
//
//			<key>specific_gravity</key>
//			<string>4.1 - 4.3</string>
//
//			<key>cleavage</key>
//			<string>2 poor</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>very high</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide30.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide30</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Galena</string>
//
//			<key>chemistry</key>
//			<string>Pb S</string>
//
//			<key>classification</key>
//			<string>sulfide</string>
//
//			<key>crystal_system</key>
//			<string>isometric</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>2.5</string>
//
//			<key>specific_gravity</key>
//			<string>7.5 - 7.6</string>
//
//			<key>cleavage</key>
//			<string>3 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>high</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide31.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide31</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Sphalerite</string>
//
//			<key>chemistry</key>
//			<string>(Zn, Fe) S</string>
//
//			<key>classification</key>
//			<string>sulfide</string>
//
//			<key>crystal_system</key>
//			<string>isometric</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>3.5 - 4</string>
//
//			<key>specific_gravity</key>
//			<string>3.9 - 4.1</string>
//
//			<key>cleavage</key>
//			<string>6 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>high</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide32.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide32</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Molybdenite</string>
//
//			<key>chemistry</key>
//			<string>Mo S_2</string>
//
//			<key>classification</key>
//			<string>sulfide</string>
//
//			<key>crystal_system</key>
//			<string>hexagonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>1 - 1.5</string>
//
//			<key>specific_gravity</key>
//			<string>4.7</string>
//
//			<key>cleavage</key>
//			<string>1 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>high</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide33.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide33</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Gold</string>
//
//			<key>chemistry</key>
//			<string>Au</string>
//
//			<key>classification</key>
//			<string>native element</string>
//
//			<key>crystal_system</key>
//			<string>isometric</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>2.5 - 3</string>
//
//			<key>specific_gravity</key>
//			<string>19.3</string>
//
//			<key>cleavage</key>
//			<string>none</string>
//
//			<key>crustal_abundance</key>
//			<string>ultratrace</string>
//
//			<key>economic_value</key>
//			<string>I'm rich!</string>
//                </dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide34.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide34</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Diamond</string>
//
//			<key>chemistry</key>
//			<string>C</string>
//
//			<key>classification</key>
//			<string>native element</string>
//
//			<key>crystal_system</key>
//			<string>isometric</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>10</string>
//
//			<key>specific_gravity</key>
//			<string>3.5</string>
//
//			<key>cleavage</key>
//			<string>4 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>ultratrace</string>
//
//			<key>economic_value</key>
//			<string>I'm rich!</string>
//                </dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide35.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide35</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Graphite</string>
//
//			<key>chemistry</key>
//			<string>C</string>
//
//			<key>classification</key>
//			<string>native element</string>
//
//			<key>crystal_system</key>
//			<string>hexagonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>1 - 2</string>
//
//			<key>specific_gravity</key>
//			<string>2.2</string>
//
//			<key>cleavage</key>
//			<string>1 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//	<dict>
//			<key>fileName</key>
//			<string>Slide36.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide36</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Halite</string>
//
//			<key>chemistry</key>
//			<string>Na Cl</string>
//
//			<key>classification</key>
//			<string>halide</string>
//
//			<key>crystal_system</key>
//			<string>isometric</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>2.5</string>
//
//			<key>specific_gravity</key>
//			<string>2.2</string>
//
//			<key>cleavage</key>
//			<string>3 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide37.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide37</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Fluorite</string>
//
//			<key>chemistry</key>
//			<string>Ca F_2</string>
//
//			<key>classification</key>
//			<string>halide</string>
//
//			<key>crystal_system</key>
//			<string>isometric</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//			</array>
//
//			<key>hardness</key>
//			<string>4</string>
//
//			<key>specific_gravity</key>
//			<string>3.2</string>
//
//			<key>cleavage</key>
//			<string>4 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide38.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide38</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Gypsum</string>
//
//			<key>chemistry</key>
//			<string>Ca S O_4 (H_2 O)_2</string>
//
//			<key>classification</key>
//			<string>sulfate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>2</string>
//
//			<key>specific_gravity</key>
//			<string>2.3</string>
//
//			<key>cleavage</key>
//			<string>1 perfect, 2 good</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>high</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide39.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide39</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Barite</string>
//
//			<key>chemistry</key>
//			<string>Ba S O_4</string>
//
//			<key>classification</key>
//			<string>sulfate</string>
//
//			<key>crystal_system</key>
//			<string>orthorhombic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>3 - 3.5</string>
//
//			<key>specific_gravity</key>
//			<string>4.5</string>
//
//			<key>cleavage</key>
//			<string>2 perfect, 1 good</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide40.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide40</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Apatite</string>
//
//			<key>chemistry</key>
//			<string>Ca_5 (P O_4)_3 (OH, F, Cl)</string>
//
//			<key>classification</key>
//			<string>phosphate</string>
//
//			<key>crystal_system</key>
//			<string>hexagonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>5</string>
//
//			<key>specific_gravity</key>
//			<string>3.1 - 3.2</string>
//
//			<key>cleavage</key>
//			<string>2 poor</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>high</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide41.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide41</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Monazite</string>
//
//			<key>chemistry</key>
//			<string>(La, Ce, Nd) P O_4 </string>
//
//			<key>classification</key>
//			<string>phosphate</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>5</string>
//
//			<key>specific_gravity</key>
//			<string>5.0 - 5.3</string>
//
//			<key>cleavage</key>
//			<string>1 good, 1 poor</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide42.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide42</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Calcite</string>
//
//			<key>chemistry</key>
//			<string>Ca C O_3</string>
//
//			<key>classification</key>
//			<string>carbonate</string>
//
//			<key>crystal_system</key>
//			<string>hexagonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>3</string>
//
//			<key>specific_gravity</key>
//			<string>2.7</string>
//
//			<key>cleavage</key>
//			<string>3 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>moderate</string>
//
//			<key>economic_value</key>
//			<string>high</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide43.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide43</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Dolomite</string>
//
//			<key>chemistry</key>
//			<string>Ca Mg (C O_3)_2</string>
//
//			<key>classification</key>
//			<string>carbonate</string>
//
//			<key>crystal_system</key>
//			<string>hexagonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>3.5 - 4</string>
//
//			<key>specific_gravity</key>
//			<string>2.9</string>
//
//			<key>cleavage</key>
//			<string>3 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>low</string>
//		</dict>
//
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide44.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide44</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Magnesite</string>
//
//			<key>chemistry</key>
//			<string>Mg C O_3</string>
//
//			<key>classification</key>
//			<string>carbonate</string>
//
//			<key>crystal_system</key>
//			<string>hexagonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>4</string>
//
//			<key>specific_gravity</key>
//			<string>3.0</string>
//
//			<key>cleavage</key>
//			<string>3 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide45.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide45</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Siderite</string>
//
//			<key>chemistry</key>
//			<string>Fe C O_3</string>
//
//			<key>classification</key>
//			<string>carbonate</string>
//
//			<key>crystal_system</key>
//			<string>hexagonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>4 - 4.5</string>
//
//			<key>specific_gravity</key>
//			<string>4</string>
//
//			<key>cleavage</key>
//			<string>3 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide46.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide46</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Magnetite</string>
//
//			<key>chemistry</key>
//			<string>Fe_3 O_4</string>
//
//			<key>classification</key>
//			<string>oxide (spinel)</string>
//
//			<key>crystal_system</key>
//			<string>isometric</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>5.5 - 6</string>
//
//			<key>specific_gravity</key>
//			<string>5.2</string>
//
//			<key>cleavage</key>
//			<string>none</string>
//
//			<key>crustal_abundance</key>
//			<string>moderate</string>
//
//			<key>economic_value</key>
//			<string>very high</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide47.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide47</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Hematite</string>
//
//			<key>chemistry</key>
//			<string>Fe_2 O_3</string>
//
//			<key>classification</key>
//			<string>oxide</string>
//
//			<key>crystal_system</key>
//			<string>hexagonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>5 - 6</string>
//
//			<key>specific_gravity</key>
//			<string>5.3</string>
//
//			<key>cleavage</key>
//			<string>none</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>high</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide48.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide48</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Chromite</string>
//
//			<key>chemistry</key>
//			<string>(Fe, Mg) Cr_2 O_4</string>
//
//			<key>classification</key>
//			<string>oxide (spinel)</string>
//
//			<key>crystal_system</key>
//			<string>isometric</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>5.5</string>
//
//			<key>specific_gravity</key>
//			<string>4.5 - 5.1</string>
//
//			<key>cleavage</key>
//			<string>none</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>high</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide49.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide49</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Ilmenite</string>
//
//			<key>chemistry</key>
//			<string>Ti Fe O_3</string>
//
//			<key>classification</key>
//			<string>oxide</string>
//
//			<key>crystal_system</key>
//			<string>hexagonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>5 - 6</string>
//
//			<key>specific_gravity</key>
//			<string>4.7 - 4.8</string>
//
//			<key>cleavage</key>
//			<string>none</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide50.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide50</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Rutile</string>
//
//			<key>chemistry</key>
//			<string>Ti O_2</string>
//
//			<key>classification</key>
//			<string>oxide</string>
//
//			<key>crystal_system</key>
//			<string>tetragonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>6 - 6.5</string>
//
//			<key>specific_gravity</key>
//			<string>4.3</string>
//
//			<key>cleavage</key>
//			<string>2 good</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>high</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide51.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide51</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Corundum</string>
//
//			<key>chemistry</key>
//			<string>Al_2 O_3</string>
//
//			<key>classification</key>
//			<string>oxide</string>
//
//			<key>crystal_system</key>
//			<string>hexagonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>9</string>
//
//			<key>specific_gravity</key>
//			<string>4.0</string>
//
//			<key>cleavage</key>
//			<string>none</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide52.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide52</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Cassiterite</string>
//
//			<key>chemistry</key>
//			<string>Sn O_2</string>
//
//			<key>classification</key>
//			<string>oxide</string>
//
//			<key>crystal_system</key>
//			<string>tetragonal</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>igneous</string>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>6 - 7</string>
//
//			<key>specific_gravity</key>
//			<string>6.9 - 7.1</string>
//
//			<key>cleavage</key>
//			<string>1 good, 1 poor</string>
//
//			<key>crustal_abundance</key>
//			<string>trace</string>
//
//			<key>economic_value</key>
//			<string>high</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide53.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide53</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Gibbsite</string>
//
//			<key>chemistry</key>
//			<string>Al (O H)_3</string>
//
//			<key>classification</key>
//			<string>hydroxide</string>
//
//			<key>crystal_system</key>
//			<string>monoclinic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>metamorphic</string>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>2.5 - 3.5</string>
//
//			<key>specific_gravity</key>
//			<string>2.4</string>
//
//			<key>cleavage</key>
//			<string>1 perfect</string>
//
//			<key>crustal_abundance</key>
//			<string>low</string>
//
//			<key>economic_value</key>
//			<string>high</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide54.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide54</string>
//
//			<key>card_type</key>
//			<key>play</key>
//
//			<key>title</key>
//			<string>Goethite</string>
//
//			<key>chemistry</key>
//			<string>Fe O (OH)</string>
//
//			<key>classification</key>
//			<string>hydroxide</string>
//
//			<key>crystal_system</key>
//			<string>orthorhombic</string>
//
//			<key>occurrence</key>
//			<array>
//				<string>sedimentary</string>
//			</array>
//
//			<key>hardness</key>
//			<string>5 - 5.5</string>
//
//			<key>specific_gravity</key>
//			<string>4.3</string>
//
//			<key>cleavage</key>
//			<string>1 perfect, 1 good</string>
//
//			<key>crustal_abundance</key>
//			<string>moderate</string>
//
//			<key>economic_value</key>
//			<string>moderate</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide55.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide55</string>
//
//			<key>card_type</key>
//			<key>trump</key>
//
//			<key>title</key>
//			<string>The Miner</string>
//
//			<key>subtitle</key>
//			<string>Economic value</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide56.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide56</string>
//
//			<key>card_type</key>
//			<key>trump</key>
//
//			<key>title</key>
//			<string>The Petrologist</string>
//
//			<key>subtitle</key>
//			<string>Crustal abundance</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide57.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide57</string>
//
//			<key>card_type</key>
//			<key>trump</key>
//
//			<key>title</key>
//			<string>The Gemmologist</string>
//
//			<key>subtitle</key>
//			<string>Hardness</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide58.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide58</string>
//
//			<key>card_type</key>
//			<key>trump</key>
//
//			<key>title</key>
//			<string>The Mineralogist</string>
//
//			<key>subtitle</key>
//			<string>Cleavage</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide59.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide59</string>
//
//			<key>card_type</key>
//			<key>trump</key>
//
//			<key>title</key>
//			<string>The Geophysicist</string>
//
//			<key>subtitle</key>
//			<string>Specific gravity</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide60.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide60</string>
//
//			<key>card_type</key>
//			<key>trump</key>
//
//			<key>title</key>
//			<string>The Geologist</string>
//
//			<key>subtitle</key>
//			<string>Change to trumps category of your choice</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide61.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide61</string>
//
//			<key>card_type</key>
//			<key>rule</key>
//
//			<key>title</key>
//			<string>About Mineral Supertrumps</string>
//
//			<key>subtitle</key>
//			<string>How to play: Rules 1 - 2</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide62.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide62</string>
//
//			<key>card_type</key>
//			<key>rule</key>
//
//			<key>title</key>
//			<string>How to play</string>
//
//			<key>subtitle</key>
//			<string>Rules 3 - 7</string>
//		</dict>
//
//		<dict>
//			<key>fileName</key>
//			<string>Slide63.jpg</string>
//
//			<key>imageName</key>
//			<string>Slide63</string>
//
//			<key>card_type</key>
//			<key>rule</key>
//
//			<key>title</key>
//			<string>Trump Categories</string>
//
//			<key>subtitle</key>
//			<string>Strategies</string>
//		</dict>
//	</array>
//</dict
    }
}