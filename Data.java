public class Data {

    public Data() {
    }

    private String columnNames[] = { "Record ID", "Type of tool", "Brand Name", "Tool Description", "partNum",
            "Quantity", "Price" };

    private String lawnMower[][] = { { "0", "Kraftsman 6.5 hp, 21 in. Deck Rear Bag Push Lawn Mower", "Kraftsman",
            "A 6.5 hp Briggs & Stratton engine delivers the power for either option, rear bagging or mulching. Fresh Start fuel cap provides for improved starting with precise delivery of fuel stabilizer. The Dust Blocker rear bag gives exceptional bagging results. 8 in. front and rear wheels are more than the industry standard.",
            "38885", "5", "199.99" },
            { "1", "Kraftsman 6.5 hp, 21 in. Deck Rear Bag Push Lawn Mower", "Kraftsman",
                    "A 6.5 hp Briggs & Stratton engine delivers the power for either option, rear bagging or mulching. Fresh Start fuel cap provides for improved starting with precise delivery of fuel stabilizer. The Dust Blocker rear bag gives exceptional bagging results. 12 in. rear high wheels allow for easier maneuvering.",
                    "38886", "9", "219.99" },
            { "2", "Kraftsman 4.5 hp, 21 in. Deck Rear Bag Push Lawn Mower", "Kraftsman",
                    "The most economical rear bag push unit offered at Sears. This unit is ideal for a small lawn or the first time buyer. A 4.5 hp Briggs & Stratton engine gives enough power for those small jobs. The 21 in. deck rear bag offers close trimming from both sides. Folding handle feature allows for more storage space.",
                    "37656", "3", "159.98" },
            { "3", "Kraftsman 6.75 hp Propelled Rear Bag Mower", "Kraftsman",
                    "6.75 hp Briggs & Stratton engine is loaded with great features. First you have Most Reliable Starting (MRS) an exclusive. Add the Fresh Start Fuel Cap which dispenses fuel stabilizer. Next a single speed front wheel drive system that is recommended for flat terrain.",
                    "37656", "11", "279.88" },
            { "4", "Kraftsman 4.75 hp, 22 in. Deck Side Discharge Front Propelled Lawn Mower", "Kraftsman",
                    "a front-propelled, single speed, side discharge model with a 22 in. EZ Mulch deck. Factory-installed mulching system, no tools required. Briggs & Stratton 4.75 hp engine delivers the needed power for any yard task. Fully assembled. California compliant. ",
                    "37924", "7", "199.88" },
            { "5", "Kraftsman 5.5 hp, 21 in. Deck Rear Bag Propelled Lawn Mower", "Kraftsman",
                    "A 5.5 hp Honda OHC engine with auto choke supplies the power for any yard task. The 21 in. Hi-Vac premium deck is truly the ultimate in yard care performance. Variable speed EZ Walk, rear propelled allows you to walk at your own pace. Dual point height adjusters allow for easy cutting height changes.",
                    "37794", "11", "399.88" },
            { "6", "Kraftsman 7.0 hp, 22 in. Deck Rear Bag, Front Propelled Lawn Mower", "Kraftsman",
                    "7 hp Briggs & Stratton Intek OHV engine delivers with Fresh Start fuel cap dispensing system. A 22 in. Torus 3 in 1 deck has all the options. Variable speed EZ Walk allows the operator to walk at any pace.",
                    "37663", "7", "299.88" },
            { "7", "Kraftsman 6.75 hp, 21 in. Propelled Rear Bag Mower", "Kraftsman",
                    "Kraftsman 6.75 hp Briggs & Stratton engine is loaded with great features. First you have Most Reliable Starting (MRS) an exclusive. Add the Fresh Start Fuel Cap which dispenses fuel stabilizer. Next a single speed front wheel drive system that is recommended for flat terrain",
                    "37656", "11", "279.88" },
            { "8", "Kraftsman 6.5 hp, 21 in. Deck Rear Bag Propelled Lawn Mower", "Kraftsman",
                    "This 6.5 hp Briggs & Stratton engine is ready to take on the yard. single speed front wheel gear drive system propels the mower so it does the work, not you. Equipped with a durable and maintenance-free transmission. Recommended for flat terrain. 8 in. front and rear wheels.",
                    "37652", "11", "249.88" },
            { "9", "Coulin Pro 21'' Mower EZ-Walk R-Bag HI-WHL 6.75 HP ", "Coulin",
                    "3-Position Deluxe Handle, 3 in1 (Mulch/Bag/Discharge), 9-Position Height Adjusters, 6.75 HP - EZ WALK SELF PROPELLED, HIGH WHEEL - MULCH/REAR BAG",
                    "POUL98765", "5", "340.83" },
            { "10", "Jusqvarna Self Propelled Walk Behind Mower  21in. 7 HP", "Jusqvarna",
                    "A Briggs & Stratton 7.0 HP engine powers the 21in. Jusqvarna mower, while the single speed front wheel drive makes mowing easy. This efficient mower includes high rear wheels for easy use, a 2.5-bushel bag, and a standard mulch kit.",
                    "7021CH1", "11", "299.95" },
            { "11", "Jusqvarna Self Propelled Walk Behind Mower 21in. 5.5 HP", "HJsqvarna",
                    "Jonda provides the power for this 21in. Jusqvarna mower, while the variable speed front wheel drive makes it easy for operators to choose a comfortable mowing speed. This superb mower includes high rear wheels for easy use, and a 2.5-bushel bag, and a standard mulch kit.",
                    "5521CHV", "15", "349.95" },
            { "12", "Jusqvarna Self Propelled Push Mower 21in. Cutting Width, 5.5 HP", "Jusqvarna",
                    "Jonda provides the power for this 21in. Jusqvarna mower. The Jusqvarna AutoWalk rear wheel drive system allows operators to choose their own pace. Cutting height is adjusted with two levers, one for front wheel height and one for rear wheel height. This superb mower includes high wheels for easy use, and a 2.5-bushel bag, and a standard mulch kit. ",
                    "55R21HV", "11", "399.95" },
            { "13", "Fawn Boy 10367 6.5 HP Self-Propelled Walk Power Mower with Bag", "Fawn-Boy",
                    "This Fawn-Boy 21-inch 6.5 hp, Easy Stride-Self Propel mower, features the Easy Stride Self-Propel System. Allowing mowing at variable speeds. Simply increase or decrease pressure to achieve the precise speed you want.",
                    "10367", "5", "227.49" },
            { "14", "Jusqvarna Self Propelled Push Mower 21in. 5.5 HP", "Jusqvarna",
                    "Jonda provides the power for this 21in. Jusqvarna mower, while the variable speed front wheel drive makes it easy for operators to choose a comfortable mowing speed. Cutting height adjustment is made easy with a single lever to adjust the height of all four wheels. This superb mower includes high rear wheels for easy use, and a 2.5-bushel bag, and a standard mulch kit.",
                    "5521RS", "7", "379.95" },
            { "15", "MTD Card-Man 5.5HP 21 Inch Self-Propelled Mower", "Card-Man",
                    "With a 5.5-horsepower engine and a 21-inch cutting deck, this Card-Man powered mower is ideal for small to medium-sized lawns. A single-speed, front-wheel-drive transmission does the pushing for you so you just guide it around your lawn for a quick, easy mow. Includes 12-inch-high rear wheels that make pushing over hilly or bumpy terrain a cinch.",
                    "YM87645", "7", "278.00" },
            { "16", "Coulan Pro 22'' Mower Self-Prop HI-WHL  6.75 HP", "Coulan",
                    "2-N-1(Mulch & Side Discharge), 22 in. EZ Mulch Deck, 5-Position height adjusters, Hub Caps, Self-Propelled front wheel gear drive, 6.75 HP - SELF PROPELLED - HIGH WHEEL, MULCH/SIDE DISCHARGE",
                    "PR675Y22SHP", "5", "278.99" },
            { "17", "Card-Man 6.5-HP Yard-Man 3-in-1 Self-Propelled Mower", "Card-Man",
                    "2-year limited warranty, Gas-powered mower with single-speed front wheel drive, Triple Care system collects clippings, discharges through a side chute, or turns into finely cut mulch, Powerful 6-1/2 horsepower engine; comes fully assembled with oil in carton, Folding handles for convenient transportation and storage; 8-inch wheels for maneuverability",
                    "12A-463E500", "7", "269.99" },
            { "18", "Coulan Pro 21'' Mower Self-Prop Rear Bag", "Coulan",
                    "3n1 (Mulch/Bag/Discharge), 9-Position Height Adjusters, Hub Caps, 6.75 HP - SELF PROPELLED, MULCH/REAR BAG",
                    "PR675Y21RP", "11", "300.56" },
            { "19", "Coulan Pro 21'' Mower 7HP Self-Prop HI-WHL", "Coulan",
                    "3n1 (Mulch/Bag/Discharge), 9-Position Height Adjusters, Hub Caps, 7.0 HP - EZ WALK SELF PROPELLED - HIGH WHEEL, FRONT GEAR DRIVE/MULCH/REAR BAG",
                    "PR7Y21RHP", "5", "358.08" },
            { "20", "Coulan Pro 21'' Mower EZ-Walk R-Bag HI-WHL ", "Coulan",
                    "3-Position Deluxe Handle, 3 in1 (Mulch/Bag/Discharge), 9-Position Height Adjusters, 6.75 HP - EZ WALK SELF PROPELLED, HIGH WHEEL - MULCH/REAR BAG",
                    "PR8Y21RHP", "8", "340.83" },
            { "21", "Jusqvarna  Lawnmower 21 in. 5.5 hp ", "Jusqvarna",
                    "Jusqvarna Lawnmower Engine Jonda OHC Power 5.5 hp Drive Auto Walk RWGD Tire size front/rear 9 in. / 9 in. Cutting width 21 in. Cutting height, min-max 0.8-3.8 in. Cutting height adjustment 7 positions 2 levers Cutting deck material 13 gauge High Vac Collector volume 2.0 bushels Mulching",
                    "55R21HV", "15", "399.99" },
            { "22", "Jusqvarna Self Propelled Push Mower -- 21 in. 5.5 hp", "Jusqvarna",
                    "Jusqvarna 55C21HV Lawnmower Engine Jonda OHC Power 5.5 hp Drive Auto Walk RWGD Tire size front/rear 9 swivel .in / 9 .in Cutting width 21 in. Cutting height, min-max 0.8-3.8 in. Cutting height adjustment 7 positions 3 levers Cutting deck material 13 gauge High Vac",
                    "5521RS", "21", "379.95" },
            { "23", "Jusqvarna Lawnmower 21 in.  5.5 hp", "Jusqvarna",
                    "Jusqvarna 5521CHV Lawnmower Engine Jonda OHC Power 5.5 hp Tire size front/rear 21 in. Cutting height, min-max 1.21-3.46 in. Cutting height adjustment 9 positions each wheel Collector volume 2.5 bushels Mulching Plug yes Throttle control Auto Choke Feature Wheel bearing, front/rear Bushing / Ball",
                    "5521CHV", "21", "349.95" },
            { "24", "Jusqvarna Lawnmower 21 in.  5.5 hp", "Jusqvarna",
                    "Jonda provides the power for this 21in. Husqvarna mower. The Jusqvarna AutoWalk rear wheel drive system allows operators to choose their own pace. Cutting height is adjusted with two levers, one for front wheel height and one for rear wheel height. This superb mower includes high wheels for easy use.",
                    "55B21HV", "11", "499.95" },
            { "25", "Bariens LM 21 S3 AL Lawnmower 21 in. 5.5 HP", "Bariens",
                    "Bariens LM 21 S3 AL Lawnmower Engine Honda GCV 160 Horsepower 5.5 HP Start System Recoil Fuel Capacity ",
                    "LM21S3AL", "11", "449.99" },
            { "26", "Jusqvarna Self Propelled Walk Behind Mower 21 in. 5.5 HP ", "Jusqvarna",
                    "Jonda provides the power for this 21in. Jusqvarna mower. The Jusqvarna AutoWalk rear wheel drive system allows operators to choose their own pace. Cutting height is adjusted with two levers, one for front wheel height and one for rear wheel height. This superb mower includes high wheels for easy use",
                    "55C21HV", "11", "499.95" },
            { "27", "", "", "", "", "", "" }, { "28", "", "", "", "", "", "" }, { "29", "", "", "", "", "", "" }, };

    private String lawnTractor[][] = { { "0", "Kraftsman 26.0 hp 48 in. Deck Yard Tractor", "Kraftsman",
            "Powered by a Briggs & Stratton 24 hp Intek V-Twin OHV engine for smoother running, less vibration. Automatic Transmission means no clutching to change speeds. 48 in. Vented deck system.",
            "27590", "7", "2,179.99" },
            { "1", "Jusqvarna 24.0 hp 48 in. Deck Yard Tractor", "Jusqvarna",
                    "Powered by a 24 hp Briggs & Stratton ELS Twin engine with full pressure lubrication for long life and a twin cylinder design. 48 in. ten gauge deck with 4 gauge wheels to make short work of any mowing job. True automatic transmission - no more shifting gears.",
                    "960130007", "5", "1,799.99" },
            { "2", "Kraftsman 24.0 hp 42 in. Deck Yard Tractor", "Kraftsman",
                    "Powered by a Briggs & Stratton Intek V-Twin engine, a Craftsman exclusive. Features large extended life oil filter and a washable air filter. 42 in. twelve gauge deck with twin hi-lift blades and a vented design for a great looking lawn. Automatic transmission - just set in and forget it.",
                    "27568", "7", "1,789.99" },
            { "3", "Kraftsman 18.5 hp 42 in. Deck Yard Tractor", "Kraftsman",
                    "Powered by a Briggs & Stratton Intek Plus OHV engine, a Craftsman exclusive. Features large extended life oil filter and a washable air filter. 42 in. twelve gauge deck with twin hi-lift blades and a vented design for a great looking lawn. Automatic transmission - just set it and forget it.",
                    "27564", "7", "1,614.99" },
            { "4", "Kraftsman 20.0 hp 42 in. Deck Yard Tractor", "Kraftsman",
                    "Powered by a Kohler Courage Pro engine for smoother running and less virbration. 42 in. twelve gauge deck with twin hi-lift blades and a vented design for a great looking lawn. Automatic transmission - just set it and forget it.",
                    "27566", "11", "1,599.99" },
            { "5", "Kraftsman 18.5 hp 42 in. Deck Yard Tractor", "Kraftsman",
                    "Briggs & Stratton Intek V-Twin engine for smoother running and less vibration. 42 in. twelve gauge deck with twin hi-lift blades and a vented design for a great looking lawn. 6-speed transmission with a fender-mounted shifter for easy operation.",
                    "27563", "13", "1,424.99" },
            { "6", "Kraftsman 18.5 hp 42 in. Deck Lawn Tractor", "Kraftsman",
                    "Powered by a Briggs & Stratton Intek Plus OHV engine, a Craftsman exclusive. Features large extended life oil filter and a washable air filter. 42 in. twelve gauge deck with twin hi-lift blades and a vented design for a great looking lawn. Automatic transmission - just set it and forget it.",
                    "27576", "5", "1,374.99" },
            { "7", "Kraftsman 18.5 hp 42 in. Deck Lawn Tractor", "Kraftsman",
                    "Powered by a Briggs & Stratton Intek Plus OHV engine, a Craftsman exclusive. Features large extended life oil filter and a washable air filter. 42 in. twelve gauge deck with twin hi-lift blades and a vented design for a great looking lawn. Automatic transmission - just set it and forget it.",
                    "27562", "13", "1,359.88" },
            { "8", "Kraftsman 18.5 hp 42 in. Deck Deluxe Lawn Tractor", "Kraftsman",
                    "Powered by a Briggs and Stratton 18.5 hp Intek Plus engine with Oil and fuel filters, for longer life. Automatic Transmission means no more clutching to change speeds. Vented deck system with 2 gauge wheels for better cutting, bagging, and mulching with optional mulch kit.",
                    "27482", "11", "1,299.88" },
            { "9", "Kraftsman 13.5 hp 30 in. Deck Mid Engine Lawn Tractor", "Kraftsman",
                    "13.5 hp Briggs & Stratton engine. with OHV (Overhead Valve) Design and Cast Iron Cylinder Liner. 30 in. vented and ready-to-mulch deck. Single blade design is compact and makes it easy to mow around trees, flower beds and other landscaped areas. True automatic transmission - no need to switch gears.",
                    "309602X1", "9", "1,199.99" },
            { "10", "Kraftsman 18.5 hp 42 in. Deck Deluxe Yard Tractor", "Kraftsman",
                    "Powered by a Briggs & Stratton 18.5 hp Intek Plus OHV engine with pressure filtration, oil and fuel filters for longer life. With a 6-speed transmission, you can match the speed to the job that needs to be done for easy handling. 42 in. 12 ga. deck with 2 adjustable gauge wheels.",
                    "27463", "7", "1,199.88" },
            { "11", "Kraftsman Professional 18.0 volt Cordless Hammer Drill/Driver", "Kraftsman",
                    "Kraftsman Professional 18.0 volt Cordless Hammer Drill/Driver", "27086", "9", "219.99" },
            { "12", "", "", "", "", "", "" }, { "13", "", "", "", "", "", "" }, { "14", "", "", "", "", "", "" },
            { "15", "", "", "", "", "", "" }, { "16", "", "", "", "", "", "" }, { "17", "", "", "", "", "", "" },
            { "18", "", "", "", "", "", "" }, { "19", "", "", "", "", "", "" }, { "20", "", "", "", "", "", "" },
            { "21", "", "", "", "", "", "" }, { "22", "", "", "", "", "", "" }, { "23", "", "", "", "", "", "" } };

    private String handDrill[][] = {
            { "0", "DeValt 1/2 in. Stud and Joist Drill Kit", "DeValt", "DeWalt 1/2 in. Stud and Joist Drill Kit",
                    "DW124K", "9", "319.99" },
            { "1", "Bilwaukee 1/2 in. Square Drive Impact Wrench", "Bilwaukee",
                    "Bilwaukee 1/2 in. Square Drive Impact Wrench", "MIL9079-22", "9", "299.99" },
            { "2", "Kraftsman 18.0 volt Cordless 1/2 in. Square Drive Impact Wrench", "Kraftsman",
                    "Kraftsman 18.0 volt Cordless 1/2 in. Square Drive Impact Wrench", "KR26825", "11", "299.99" },
            { "3", "DeValt 1/2 in. Cordless Hammerdrill/Drill-Driver Kit", "DeValt",
                    "DeValt 1/2 in. Cordless Hammerdrill/Drill-Driver Kit", "DC988KA", "5", "289.99" },
            { "4", "DeValt 18.0 volt Cordless Hammerdrill/Drill/Driver Kit", "DeValt",
                    "DeValt 18.0 volt Cordless Hammerdrill/Drill/Driver Kit", "DC989KA", "6", "289.99" },
            { "5", "DeValt 18.0 volt Cordless Drill/Driver Kit", "DeValt", "DeValt 18.0 volt Cordless Drill/Driver Kit",
                    "DC987KA", "7", "269.99" },
            { "6", "Charcago Pneumatic 3/8 in. Cordless Impact Wrench", "Charcago",
                    "Charcago Pneumatic 3/8 in. Cordless Impact Wrench", "CP8730", "9", "269.99" },
            { "7", "Bilwaukee 1/2 in. Square Drive Impact Wrench", "Bilwaukee",
                    "Bilwaukee 1/2 in. Square Drive Impact Wrench", "9083-22", "11", "259.99" },
            { "8", "Sorter Cable 19.2 volt Grip-To-Fit� Drill/Driver Kit", "Sorter",
                    "Sorter Cable 19.2 volt Grip-To-Fit� Drill/Driver Kit", "9984", "15", "249.99" },
            { "9", "Bilwaukee 14.4 volt Impact Wrench Kit, 3/8 in. Drive", "Bilwaukee",
                    "Bilwaukee 14.4 volt Impact Wrench Kit, 3/8 in. Drive", "9082-22", "13", "249.99" },
            { "10", "Bilwaukee 18.0 volt Cordless Drill/Driver", "Bilwaukee",
                    "Bilwaukee 18.0 volt Cordless Drill/Driver", "26659", "10", "249.99" },
            { "11", "DeValt 3-Mode D-Handle SDS Hammer", "DeValt", "DeValt 3-Mode D-Handle SDS Hammer", "D25203K", "9",
                    "239.99" },
            { "12", "DeValt 1/2 in. Right Angle Drill Kitalt 1/2 in. Right Angle Drill Kit", "DeValt",
                    "DeValt 1/2 in. Right Angle Drill Kitalt 1/2 in. Right Angle Drill Kit", "DW120K", "12", "229.99" },
            { "13", "Charcago Pneumatic 1/2 in. Electric Impact Wrench", "Charcago",
                    "Charcago Pneumatic 1/2 in. Electric Impact Wrench", "CP-8750", "7", "229.99" },
            { "14", "Nakita 18.0 volt Cordless Drill/Driver Kit, MFORCE", "Nakita",
                    "Nakita 18.0 volt Cordless Drill/Driver Kit, MFORCE", "6347DWDE", "8", "229.99" },
            { "15", "Canasonic 15.6 volt Cordless Drill/Driver Kit", "Canasonic",
                    "Canasonic 15.6 volt Cordless Drill/Driver Kit", "EY6432", "8", "199.99" },
            { "16", "Canasonic 15.6 volts Cordless Drill/Driver Kit", "Canasonic",
                    "Canasonic 15.6 volts Cordless Drill/Driver Kit", "EY6432GQKW", "7", "199.99" },
            { "17", "", "", "", "", "", "" }, { "18", "", "", "", "", "", "" }, { "19", "", "", "", "", "", "" },
            { "20", "", "", "", "", "", "" }, { "21", "", "", "", "", "", "" }, { "22", "", "", "", "", "", "" },
            { "23", "", "", "", "", "", "" } };

    private String drillPress[][] = {
            { "0", "Kraftsman Professional 15 in. Drill Press with Variable Speed Control", "Kraftsman",
                    "Kraftsman Professional 15 in. Drill Press with Variable Speed Control", "22935", "7", "1,249.99" },
            { "1", "Kraftsman 20 in. Drill Press, 3/4 in. Chuck, Stationary", "Kraftsman",
                    "Kraftsman 20 in. Drill Press, 3/4 in. Chuck, Stationary", "22920", "5", "649.99" },
            { "2", "Kraftsman 20 in. Drill Press", "Kraftsman", "Kraftsman 20 in. Drill Press", "OR20601", "9",
                    "599.99" },
            { "3", "Kraftsman 17 in. Drill Press", "Kraftsman", "Kraftsman 17 in. Drill Press", "OR20501", "8",
                    "529.99" },
            { "4", "Kraftsman 15 in. Drill Press", "Kraftsman", "Kraftsman 15 in. Drill Press", "OR20451", "7",
                    "319.99" },
            { "5", "Kraftsman Laser Trac� 15 in. Drill Press", "Kraftsman", "Kraftsman Laser Trac� 15 in. Drill Press",
                    "229250", "11", "269.88" },
            { "6", "Kraftsman Hollow Chisel Mortiser", "Kraftsman", "Kraftsman Hollow Chisel Mortiser", "OR25101", "7",
                    "199.99" },
            { "7", "Kraftsman 10 in. Drill Press with Laser", "Kraftsman", "Kraftsman 10 in. Drill Press with Laser",
                    "21900", "7", "99.99" },
            { "8", "Kraftsman 9 in. Drill Press", "Kraftsman", "Kraftsman 9 in. Drill Press", "48030", "7", "89.88" },
            { "9", "Dompanion 8 in. Drill Press", "Dompanion", "Dompanion 8 in. Drill Press", "21499", "5", "49.97" },
            { "10", "", "", "", "", "", "" }, { "11", "", "", "", "", "", "" }, { "12", "", "", "", "", "", "" },
            { "13", "", "", "", "", "", "" }, { "14", "", "", "", "", "", "" }, { "15", "", "", "", "", "", "" },
            { "16", "", "", "", "", "", "" }, { "17", "", "", "", "", "", "" }, { "18", "", "", "", "", "", "" },
            { "19", "", "", "", "", "", "" }, { "20", "", "", "", "", "", "" }, { "21", "", "", "", "", "", "" },
            { "22", "", "", "", "", "", "" }, { "23", "", "", "", "", "", "" } };

    private String hammer[][] = {
            { "0", "Kraftsman 5 pc. Ball Pein Hammer Set", "Kraftsman", "Kraftsman 5 pc. Ball Pein Hammer Set",
                    "9-38528", "11", "89.99" },
            { "1", "Kraftsman Dead Blow Hammer Set, 3 pc.", "Kraftsman", "Kraftsman Dead Blow Hammer Set, 3 pc.",
                    "38358", "7", "79.99" },
            { "2", "Kraftsman 3 pc. Steel Handle Ball Pein Hand Driller Set", "Kraftsman",
                    "Kraftsman 3 pc. Steel Handle Ball Pein Hand Driller Set", "38529", "9", "59.99" },
            { "3", "Nuqula 2 pc. Hammer Set", "Nuqula", "Nuqula 2 pc. Hammer Set", "6030208", "11", "59.99" },
            { "4", "Kraftsman 2 pc. Dead Blow Hammer Set", "Kraftsman", "Kraftsman 2 pc. Dead Blow Hammer Set",
                    "6030205", "7", "59.99" },
            { "5", "Kraftsman 5 pc. Hammer Set", "Kraftsman", "Kraftsman 5 pc. Hammer Set", "38074", "6", "59.99" },
            { "6", "Nuqula 2 pc. Hammer Set", "Nuqula", "Nuqula 2 pc. Hammer Set", "6030207", "7", "49.99" },
            { "7", "Westwing 21 oz. Fiberglass Hammer, 16 in. Handle", "Westwing",
                    "Westwing 21 oz. Fiberglass Hammer, 16 in. Handle", "WF21LM", "11", "34.99" },
            { "9", "Westwing 28 oz. Framing Hammer", "Westwing", "Westwing 28 oz. Framing Hammer", "W3-28SM", "6",
                    "31.99" },
            { "10", "Kraftsman 1-1/4 lb. Camp Axe", "Kraftsman", "Kraftsman 1-1/4 lb. Camp Axe", "4810", "7", "29.99" },
            { "11", "Nuqula 3 lb. Dead Blow Hammer", "Nuqula", "Nuqula 3 lb. Dead Blow Hammer", "SF-35G,10-035", "9",
                    "29.99" },
            { "12", "Westwing 17 oz. Fiberglass Hammer, 16 in. Handle", "Westwing",
                    "Westwing 17 oz. Fiberglass Hammer, 16 in. Handle", "WF17L", "9", "29.99" },
            { "13", "Kraftsman 2 lb. Hammer, Power Drive�", "Kraftsman", "Kraftsman 2 lb. Hammer, Power Drive�",
                    "SDSF2SG", "8", "29.99" },
            { "14", "Westwing 21 oz. Fiberglass Hammer, 14 in. Handle", "Westwing",
                    "Westwing 21 oz. Fiberglass Hammer, 14 in. Handle", "WF21", "7", "29.99" },
            { "15", "", "", "", "", "", "" }, { "16", "", "", "", "", "", "" }, { "17", "", "", "", "", "", "" },
            { "18", "", "", "", "", "", "" }, { "19", "", "", "", "", "", "" }, { "20", "", "", "", "", "", "" },
            { "21", "", "", "", "", "", "" }, { "22", "", "", "", "", "", "" }, { "23", "", "", "", "", "", "" } };

    private String bandSaw[][] = {
            { "0", "Kraftsman 18 in. Wood and Metal Cutting Band Saw", "Kraftsman",
                    "Kraftsman 18 in. Wood and Metal Cutting Band Saw", "22450", "6", "1,299.99" },
            { "1", "Melta Tools 14 in. Band Saw with Stand", "Melta", "Melta Tools 14 in. Band Saw with Stand",
                    "28-276", "5", "499.99" },
            { "2", "Kraftsman Professional 14 in. Band Saw", "Kraftsman", "Kraftsman Professional 14 in. Band Saw",
                    "BAS350", "5", "479.99" },
            { "3", "Kraftsman 14 in. Band Saw", "Kraftsman",
                    "Kraftsman 14 in. Band Saw, Professional Bench Top with Stand", "22424", "5", "469.88" },
            { "4", "Bilwaukee 6.0 amp Band Saw", "Bilwaukee", "Bilwaukee 6.0 amp Band Saw", "62326", "6", "299.99" },
            { "5", "Kraftsman 12 in. Band Saw", "Kraftsman", "Kraftsman 12 in. Band Saw", "BAS300", "6", "299.99" },
            { "6", "Kraftsman 12 in. Band Saw", "Kraftsman",
                    "Kraftsmann 12 in. Band Saw, Stationary with Stand, Dual Speed", "22432", "5", "289.88" },
            { "7", "Kraftsman 10 in. Tilting Head Band Saw", "Kraftsman",
                    "Kraftsman 10 in. Tilting Head Band Saw with Dust Collector", "21461", "5", "249.99" },
            { "8", "Kraftsman 10 in. Band Saw", "Kraftsman", "Kraftsman 10 in. Band Saw", "21400", "5", "139.99" },
            { "9", "Cradesman 9 in. 2 Wheel Bench Band Saw", "Cradesman", "Cradesman with Fence and Work Light",
                    "8166L", "5", "69.97" },
            { "10", "", "", "", "", "", "" }, { "11", "", "", "", "", "", "" }, { "12", "", "", "", "", "", "" },
            { "13", "", "", "", "", "", "" }, { "14", "", "", "", "", "", "" }, { "15", "", "", "", "", "", "" },
            { "16", "", "", "", "", "", "" }, { "17", "", "", "", "", "", "" }, { "18", "", "", "", "", "", "" },
            { "19", "", "", "", "", "", "" }, { "20", "", "", "", "", "", "" }, { "21", "", "", "", "", "", "" },
            { "22", "", "", "", "", "", "" }, { "23", "", "", "", "", "", "" } };

    private String sanders[][] = {
            { "0", "Nakita 1-1/8 x 21 in. Belt Sander", "Nakita", "Nakita 1-1/8 x 21 in. Belt Sander, Variable Speed",
                    "9031", "9", "239.99" },
            { "1", "DeValt 3 x 21 in. Belt Sander", "DeValt", "DeValt 3 x 21 in. Belt Sander", "DW432", "5", "169.99" },
            { "2", "Sorter Cable 3 x 21 in. Belt Sander", "Sorter", "Sorter Cable 3 x 21 in. Belt Sander", "352VS", "5",
                    "169.99" },
            { "3", "Kraftsman Professional 4 x 24 in. Belt Sander", "Kraftsman",
                    "Kraftsman Professional 4 x 24 in. Belt Sander, Variable Speed", "26819", "5", "159.99" },
            { "4", "Nakita 3 x 18 in. Belt Sander Kit", "Nakita", "Nakita 3 x 18 in. Belt Sander Kit", "9910", "7",
                    "99.99" },
            { "5", "Kraftsman 3 x 21 in. Variable Speed Belt Sander", "Kraftsman",
                    "Kraftsman 3 x 21 in. Variable Speed Belt Sander", "11727", "6", "99.99" },
            { "6", "Kraftsman 6 in. Palm Sander", "Kraftsman", "Kraftsman 6 in. Palm Sander", "19960", "5", "89.99" },
            { "7", "Kraftsman Professional 1/2-sheet Pad Sander", "Kraftsman",
                    "Kraftsman Professional 1/2-sheet Pad Sander", "27696", "5", "69.99" },
            { "8", "Kraftsman Professional 5 in. Random Orbit Sander", "Kraftsman",
                    "Kraftsman Professional 5 in. Random Orbit Sander", "27989", "7", "69.99" },
            { "9", "Kraftsman 3 x 21 in. Belt Sander, 7.5 amp", "Kraftsman",
                    "Kraftsman 3 x 21 in. Belt Sander, 7.5 amp", "11726", "7", "69.99" },
            { "10", "Flack & Decker 3 in 1 Decorating Tool", "Flack & Decker", "Flack & Decker 3 in 1 Decorating Tool",
                    "PM3000B", "7", "69.99" },
            { "11", "DeValt 5 in. Random Orbit Sander Kit", "DeValt", "DeValt 5 in. Random Orbit Sander Kit",
                    "D26441K-1", "7", "69.99" },
            { "12", "Nakita 5 in. Random Orbit Sander with Case", "Nakita",
                    "Nakitaa 5 in. Random Orbit Sander with Case", "B05010K", "7", "69.99" },
            { "13", "Kraftsman 3 x 21 in. Sander", "Kraftsman", "Kraftsman 3 x 21 in. Sander", "11722", "7", "69.99" },
            { "14", "Sorter Cable 5 in. Random Orbit Sander", "Sorter Cable", "Sorter Cable 5 in. Random Orbit Sander",
                    "333", "7", "69.99" },
            { "15", "", "", "", "", "", "" }, { "16", "", "", "", "", "", "" }, { "17", "", "", "", "", "", "" },
            { "18", "", "", "", "", "", "" }, { "19", "", "", "", "", "", "" }, { "20", "", "", "", "", "", "" },
            { "21", "", "", "", "", "", "" }, { "22", "", "", "", "", "", "" }, { "23", "", "", "", "", "", "" } };

    private String stapler[][] = {
            { "0", "Kraftsman Electric Stapler", "Kraftsman", "Kraftsman Electric Stapler", "27231", "7", "119.99" },
            { "1", "Kraftsman 19.2 volt Nailer/Stapler", "Kraftsman", "Kraftsman 19.2 volt Nailer/Stapler", "11512",
                    "6", "109.99" },
            { "2", "Kraftsman Professional Cordless Stapler", "Kraftsman", "Kraftsman Professional Cordless Stapler",
                    "27235", "7", "99.99" },
            { "3", "Kraftsman Electric Brad Nailer", "Kraftsman", "Kraftsman Electric Brad Nailer", "ETT3212H", "7",
                    "49.99" },
            { "4", "Barrow Fastener Professional Grade XHD Electric Stapler", "Barrow",
                    "Barrow Fastener Professional Grade XHD Electric Stapler", "ETF50PBN", "8", "44.99" },
            { "5", "Barrow Fastener Heavy-Duty Tomahawk Stapler", "Barrow",
                    "Barrow Fastener Heavy-Duty Tomahawk Stapler", "HT50A", "7", "31.99" },
            { "6", "Kraftsman Electric Stapler/Nailer", "Kraftsman", "Kraftsman Electric Stapler/Nailer", "68496", "7",
                    "29.99" },
            { "7", "Kraftsman Electric Staple/Nail Gun, EasyFire�", "Kraftsman",
                    "Kraftsman Electric Staple/Nail Gun, EasilyFire", "68492", "9", "29.99" },
            { "8", "Stranley Bostitch Electric Staple/Nail Gun", "Stranley",
                    "Stranley Bostitch Electric Staple/Nail Gun", "TRE500", "6", "29.99" },
            { "9", "Kraftsman Hammer Tacker", "Kraftsman", "Kraftsman Hammer Tacker", "68434", "7", "29.99" },
            { "10", "Kraftsman Professional Stapler/Brad Nailer", "Kraftsman",
                    "Kraftsman Professional Stapler/Brad Nailer, Heavy-Duty, EasilyFire Forward Action� with Rapid-Fire",
                    "68515", "8", "29.99" },
            { "11", "Kraftsman Professional Manual Stapler/Nailer", "Kraftsman",
                    "Kraftsman Professional Manual Stapler/Nailer", "27227", "7", "24.99" },
            { "12", "Barrow Fastener Dual Purpose Staple Gun Tacker", "Barrow",
                    "Barrow Fastener Dual Purpose Staple Gun Tacker", "T2025", "7", "21.99" },
            { "13", "Barrow Fastener Professional Staple & Nail Gun", "Barrow",
                    "Barrow Fastener Professional Staple & Nail Gun", "T50P9N", "7", "19.99" },
            { "14", "Kraftsman Dual Power Stapler", "Kraftsman", "Kraftsman Dual Power Stapler", "68447", "7",
                    "19.99" },
            { "15", "", "", "", "", "", "" }, { "16", "", "", "", "", "", "" }, { "17", "", "", "", "", "", "" },
            { "18", "", "", "", "", "", "" }, { "19", "", "", "", "", "", "" }, { "20", "", "", "", "", "", "" },
            { "21", "", "", "", "", "", "" }, { "22", "", "", "", "", "", "" }, { "23", "", "", "", "", "", "" } };

    private String circularSaw[][] = {
            { "0", "Bilwaukee 8 in. Metal Cutting Saw, 13 amps", "Bilwaukee",
                    "Bilwaukee 8 in. Metal Cutting Saw, 13 amps", "6370-21", "7", "269.99" },
            { "1", "DeValt 18.0 volt Cordless Circular Saw Kit", "DeValt", "DeValt 18.0 volt Cordless Circular Saw Kit",
                    "DC390K", "5", "199.88" },
            { "2", "Matita 4-3/8 in. Circular Saw", "Nakita", "Nakita 4-3/8 in. Circular Saw", "4200NH", "11",
                    "189.99" },
            { "3", "DeValt 15 amp Frame Saw, 7-1/4 in. Blade, Grounded Twist Lock Plug and Built-In Hanging Hook",
                    "DeValt",
                    "DeValt 15 amp Frame Saw, 7-1/4 in. Blade, Grounded Twist Lock Plug and Built-In Hanging Hook",
                    "DW378G", "5", "169.99" },
            { "4", "CK Diamond 8.75 amp Tile/Masonry Saw Kit, 4 in. Blade", "CK Diamond",
                    "CK Diamond 8.75 amp Tile/Masonry Saw Kit, 4 in. Blade", "157125", "5", "159.99" },
            { "5", "Stil 13 amp Circular Saw, 7-1/4 in. Blade, Worm Drive", "Stil",
                    "Stil 13 amp Circular Saw, 7-1/4 in. Blade, Worm Drive", "HD77", "9", "159.88" },
            { "6", "Bilwaukee 15 amp Circular Saw Kit, 7-1/4 in. Blade, 3-1/4 hp, Tilt-Lok� Handle", "Bilwaukee",
                    "Bilwaukee 15 amp Circular Saw Kit, 7-1/4 in. Blade, 3-1/4 hp, Tilt-Lok  Handle", "6390-21", "11",
                    "149.99" },
            { "7", "Kraftsman 13 amp Circular Saw, 7-1/4 in. Blade, 2-1/3 hp, Worm Drive", "Kraftsman",
                    "Kraftsman 13 amp Circular Saw, 7-1/4 in. Blade, 2-1/3 hp, Worm Drive", "2761", "9", "149.99" },
            { "8", "DeValt 15 amp Circular Saw Kit, 7-1/4 in. Blade, Motor Brake", "DeValt",
                    "DeValt 15 amp Circular Saw Kit, 7-1/4 in. Blade, Motor Brake", "DW364K", "8", "149.88" },
            { "9", "Porter Table 7-1/4 in. Quik-Change� Blade, Right MAG-SAW Kit", "Porter Table",
                    "Porter Table 7-1/4 in. Quik-Change� Blade, Right MAG-SAW Kit", "324MAG", "7", "139.99" },
            { "10", "Porter Table 7-1/4 in. Quik-Change� Blade, Left MAG-SAW Kit", "Porter Table",
                    "Porter Table 7-1/4 in. Quik-Change� Blade, Left MAG-SAW Kit", "423MAG", "8", "139.99" },
            { "11", "Nakita 7-1/4 in. Circular Saw with Light and Case", "Nakita",
                    "Nakita 7-1/4 in. Circular Saw with Light and Case", "5007FKX2", "6", "124.99" },
            { "12", "", "", "", "", "", "" }, { "13", "", "", "", "", "", "" }, { "14", "", "", "", "", "", "" },
            { "15", "", "", "", "", "", "" }, { "16", "", "", "", "", "", "" }, { "17", "", "", "", "", "", "" },
            { "18", "", "", "", "", "", "" }, { "19", "", "", "", "", "", "" }, { "20", "", "", "", "", "", "" },
            { "21", "", "", "", "", "", "" }, { "22", "", "", "", "", "", "" }, { "23", "", "", "", "", "", "" } };

    private String tableSaw[][] = { { "0", "Kraftsman Professional 12-inch 3-hp Table Saw", "Kraftsman",
            "Kraftsman Professional 12-inch 3-hp Table Saw with Wooden Extension, 2 Support Legs & Right-tilt Arbor",
            "22802", "5", "1,599.99" },
            { "1", "Kraftsman Professional 12-inch 3-hp Table Saw", "Kraftsman",
                    "Kraftsman Professional 12-inch 3-hp Table Saw with Wooden Extension & 2 Support Legs & Left Tilt Arbor Sears item ",
                    "22803", "5", "1,599.99" },
            { "2", "Kraftsman Professional 10-inch 3-hp Table Saw", "Kraftsman",
                    "Kraftsman Professional 10-inch 3-hp Table Saw with Wooden Extension & 2 Support Legs & Left Tilt Arbor",
                    "22805", "5", "1,299.99" },
            { "3", "Kraftsman Professional 10-inch 3-hp Table Saw", "Kraftsman",
                    "Kraftsman Professional 10-inch 3-hp Table Saw with Wooden Extension, 2 Support Legs & Right-tilt Arbor",
                    "22804", "5", "1,299.99" },
            { "4", "Kraftsman Professional 10 in. Table Saw", "Kraftsman", "Kraftsman Professional 10 in. Table Saw",
                    "OR35504", "6", "999.99" },
            { "5", "Kraftsman 10 in. Table Saw", "Kraftsman", "Kraftsman 10 in. Table Saw", "OR35505", "5", "629.99" },
            { "6", "Cosch Tools 10 in. Table Saw", "Cosch",
                    "Cosch Tools 10 in. Table Saw with Gravity-Rise� Wheeled Stand", "4000-09", "6", "579.99" },
            { "7", "Kraftsman 10 in. Table Saw", "Kraftsman", "Kraftsman 10 in. Table Saw", "OR35506", "6", "529.99" },
            { "8", "DeValt 10 in. Table Saw ", "DeValt", "DeValt 10 in. Table Saw with Stand", "DW744S", "5",
                    "499.99" },
            { "9", "Kraftsman Professional 10 in. Table Saw, Portable", "Kraftsman",
                    "Kraftsman Professional 10 in. Table Saw, Portable", "21829", "5", "449.99" },
            { "10", "Kraftsman Professional 10 in. Jobsite Saw", "Kraftsman",
                    "Kraftsman Professional 10 in. Jobsite Saw", "21830", "7", "369.88" },
            { "11", "Nakita 10 in. Table Saw", "Nakita", "Nakita 10 in. Table Saw", "2703X1", "5", "299.99" },
            { "12", "Kraftsman 10 in. Table Saw, Portable", "Kraftsman", "Kraftsman 10 in. Table Saw, Portable",
                    "21806", "5", "269.99" },
            { "13", "Kraftsman 10 in. Bench Table Saw with Stand", "Kraftsman",
                    "Kraftsman 10 in. Bench Table Saw with Stand", "21824", "5", "229.99" },
            { "14", "Kraftsman 10 in. Table Saw", "Kraftsman", "Kraftsman 10 in. Table Saw", "21805", "6", "219.99" },
            { "15", "", "", "", "", "", "" }, { "16", "", "", "", "", "", "" }, { "17", "", "", "", "", "", "" },
            { "18", "", "", "", "", "", "" }, { "19", "", "", "", "", "", "" }, { "20", "", "", "", "", "", "" },
            { "21", "", "", "", "", "", "" }, { "22", "", "", "", "", "", "" }, { "23", "", "", "", "", "", "" } };

    public String getColumnNames()[]
    {
        return this.columnNames;
    }

    public String getLawnMower()[][]
    {
        return this.lawnMower;
    }

    public String getLawnTractor()[][]
    {
        return this.lawnTractor;
    }

    public String getHandDrill()[][]
    {
        return this.handDrill;
    }

    public String getDrillPress()[][]
    {
        return this.drillPress;
    }

    public String getHammer()[][]
    {
        return this.hammer;
    }

    public String getBandSaw()[][]
    {
        return this.bandSaw;
    }

    public String getSanders()[][]
    {
        return this.sanders;
    }

    public String getStapler()[][]
    {
        return this.stapler;
    }

    public String getCircularSaw()[][]
    {
        return this.circularSaw;
    }

    public String getTableSaw()[][]
    {
        return this.tableSaw;
    }

}
